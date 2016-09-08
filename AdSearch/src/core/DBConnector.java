package core;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by lieyongzou on 9/8/16.
 * A class to connect with local MongoDB
 */
public class DBConnector {

    private static final String SERVERADDR = "localhost";
    private static final int PORTNUMBER = 27017;

    // The connection to the ads collection
    private MongoCollection<Document> adCollection;
    private MongoCollection<Document> compaignCollection;

    public DBConnector() {

        // Connect to the local mongodb server,
        MongoClient mongoClient = new MongoClient(SERVERADDR, PORTNUMBER);

        // Connect to the database
        MongoDatabase mongoDatabase = mongoClient.getDatabase("local");

        // Connect to the collection
        adCollection = mongoDatabase.getCollection("ads");
        compaignCollection = mongoDatabase.getCollection("compaigns");

    }

    /**
     * A public method to create a new compaign
     * @param username the username
     * @param compaignName the name of compaign
     * @param budget the expected budget
     */
    public void createCompaign(String username, String compaignName, int budget) {

        //Create the document contains all the informations
        Document doc = new Document();
        doc.append("username", username);
        doc.append("compaignName", compaignName);
        doc.append("budget", budget);

        // insert to the db
        compaignCollection.insertOne(doc);
        System.out.println("Create compaign " + compaignName + " by " + username + " with budget " + budget);

    }

    public static void main(String[] args) {
        DBConnector dbConnector = new DBConnector();

        dbConnector.createCompaign("lieyongz", "Nike shoes", 10000);
    }
}
