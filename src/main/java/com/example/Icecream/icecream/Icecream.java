package com.example.Icecream.icecream;

public class Icecream {

    private int id;
    private String flavour;
    private String place;

    public Icecream(){

    }

    public Icecream(String flavour, String place){

        this.flavour = flavour;
        this.place = place;

    }

    public Icecream(int id, String flavour, String place) {

        this.id = id;
        this.flavour = flavour;
        this.place = place;

    }

    public void set_id(Byte id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setFlavour(String flavour){
        this.flavour = flavour;
    }

    public String getFlavour(){
        return flavour;
    }

    public void setPlace(String place){
        this.place = place;
    }

    public String getPlace(){
        return place;
    }

    @Override
    public String toString() {
        return "Icecream{" +
                "id=" + id +
                ", flavour='" + flavour + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
