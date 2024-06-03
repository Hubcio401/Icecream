package com.example.Icecream.icecream;

import jakarta.persistence.*;

@Entity
@Table
public class Icecream {

    @Id
    @SequenceGenerator(
            name = "icecream_sequence",
            sequenceName = "icecream_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "icecream_sequence"
    )

    private int id;
    private String flavour;
    private String place;
    /*
    @Transient
    private int age;
    "in getAge --> "
    return Period.between(this.dob, LocalDate.now()).getYears();
    "dob = date of birth"
     */


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
