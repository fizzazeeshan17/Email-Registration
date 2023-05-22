package sample.model;

public class DataStorage {

    //Model class to store emails using get set


    private static DataStorage myStorage;
     private String email;

    private DataStorage() { }

    public static DataStorage getInstance() {
        if (myStorage == null) {
            myStorage = new DataStorage(); }

        return myStorage; }

    public String getEmail() {
     return email; }

     public void setEmail(String email) {
    this.email = email; }

    }






