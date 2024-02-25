package com.polonnaruwa.scooty.entity;

import javax.persistence.*;

@Entity
@Table(name = "car_details")
public class CarDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "colour")
    private String colour;
    @Column(name = "model")
    private int model;

    public CarDetails() {
    }

    public CarDetails(int id, String name, String colour, int model) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getModel() {
        return model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", model=" + model +
                '}';
    }
}
