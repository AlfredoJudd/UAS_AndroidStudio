/*
 * GymClass.java
 * This class represents a gym class and extends RealmObject for Realm database functionality.
 */

package com.example.realmapp.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class GymClass extends RealmObject {
    @PrimaryKey
    private String id; // Unique identifier for the gym class
    private String title; // Title of the gym class
    private String description; // Description of the gym class
    private String time; // Time of the gym class
    private int imageResourceId; // Resource ID of the image associated with the gym class

    // Getters and setters for the GymClass fields

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
