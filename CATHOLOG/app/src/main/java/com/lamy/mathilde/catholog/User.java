package com.lamy.mathilde.catholog;

/**
 * Created by Mathilde on 21/02/2018.
 */

public class User {

    /* attributs de la classe user */
    private String mail ;
    private String password ;
    private boolean admin ;

    /* getter() et setter() de la classe User */
    public String getMail() {return mail;}
    public void setMail(String mail) {this.mail = mail;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public boolean isAdmin() {return admin;}
    public void setAdmin(boolean admin) {this.admin = admin;}

    /*constructeur de la classe User */
    public User(String mail,String password,boolean admin) {
        this.mail=mail;
        this.password=password;
        this.admin=admin;
    }


}
