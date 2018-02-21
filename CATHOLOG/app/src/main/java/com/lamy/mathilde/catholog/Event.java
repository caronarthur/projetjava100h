package com.lamy.mathilde.catholog;

import java.util.Date;

/**
 * Created by Mathilde on 21/02/2018.
 */

public class Event {

    /* attributs de la classe Event */
    private int idEvent ;
    private Date dateStart ;
    private Date dateEnd ;
    private int prix ;
    private int nbParticip ;
    private String name ;
    private double latitude ;
    private double longitude ;
    private boolean visible ;
    private boolean prive ;

    /* getter() et setter() de chaque attribut de la classe Event */
    public int getIdEvent() {return idEvent;}
    public void setIdEvent(int idEvent) {this.idEvent = idEvent;}

    public Date getDateStart() {return dateStart;}
    public void setDateStart(Date dateStart) {this.dateStart = dateStart;}

    public Date getDateEnd() {return dateEnd;}
    public void setDateEnd(Date dateEnd) {this.dateEnd = dateEnd;}

    public int getPrix() {return prix;}
    public void setPrix(int prix) {this.prix = prix;}

    public int getNbParticip() {return nbParticip;}
    public void setNbParticip(int nbParticip) {this.nbParticip = nbParticip;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getLatitude() {return latitude;}
    public void setLatitude(double latitude) {this.latitude = latitude;}

    public double getLongitude() {return longitude;}
    public void setLongitude(double longitude) {this.longitude = longitude;}

    public boolean isPrive() {return prive;}
    public void setPrive(boolean prive) {this.prive = prive;}

    public boolean isVisible() {return visible;}

    public void setVisible(boolean visible) {this.visible = visible;}

    /* constructeur de la classe Event */
    public Event(Date dateStart,Date dateEnd,int prix,int nbParticip,String name,double latitude,double longitude,boolean prive,boolean visible) {
        this.dateEnd=dateEnd;
        this.dateStart=dateStart;
        this.prix=prix;
        this.nbParticip=nbParticip;
        this.name=name;
        this.latitude=latitude;
        this.longitude=longitude;
        this.prive=prive;
        this.visible=visible;
    }




}
