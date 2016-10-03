package io.bittiger.ads.api;




import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.core.StopAnalyzer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;


import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QueryProcessor {

    private static QueryProcessor instance = null;

    protected QueryProcessor(){}

    public static QueryProcessor getInstance(){
        if (instance == null){
            instance = new QueryProcessor();
        }

        return instance;
    }

    public String[] passQuery(String query){

        Reader r = new StringReader(query);

        List<String> words = new ArrayList<>();

        TokenStream stream = new StopAnalyzer().tokenStream("", r);

        try {
            stream.reset();

            CharTermAttribute term_Attr = stream.getAttribute(CharTermAttribute.class);

            while(stream.incrementToken()){
                words.add(term_Attr.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return deduplicate(words);
    }

    private String[] deduplicate(List<String> words) {

        Set<String> hs = new HashSet<>();

        List<String> deduplicateWords = new ArrayList<>();

        for (String str : words){
            if (hs.add(str)){
                deduplicateWords.add(str);
            }
        }

        return deduplicateWords.toArray(new String[deduplicateWords.size()]);
    }
}
