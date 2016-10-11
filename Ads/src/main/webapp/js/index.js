/**
 * Created by ChenCheng on 10/11/2016.
 */
function init() {
    window.init();
}

function runQuery() {
    var queryString = document.getElementById("query_field").value;

}
function enableButtons() {
    btn = document.getElementById("query_button");
    btn.onclick=function () {
        runQuery();
    }
}
function loadCallback() {
    enableButtons();
}