package com.dialectric.models;

// model for Researcher, Caregiver, Therapist, or Developer tables in DB
public class User {

    private int id;
    private String usertype;
    private String fname;
    private String lname;
    private String username;
    private String password;

    // initialize
    public User() {
        this.usertype = "";
        this.fname = "";
        this.lname = "";
        this.username = "";
        this.password = "";
    }

    public void setId(int id) { this.id = id; }
    public int getId() { return id; }

    public void setUsertype(String usertype) { this.usertype = usertype; }
    public String getUsertype() { return usertype; }

    public void setFname(String fname) { this.fname = fname; }
    public String getFname() { return fname; }

    public void setLname(String lname) { this.lname = lname; }
    public String getLname() { return lname; }

    public void setUsername(String username) { this.username = username; }
    public String getUsername() { return username; }

    public void setpassword(String password) { this.password = password; }
    public String getpassword() { return password; }
}
