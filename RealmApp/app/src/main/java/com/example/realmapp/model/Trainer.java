/*
 * Trainer.java
 * This class represents a trainer and extends RealmObject for Realm database functionality.
 */

package com.example.realmapp.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Trainer extends RealmObject {
    @PrimaryKey
    private String id; // Unique identifier for the trainer
    private String name; // Name of the trainer
    private String description; // Description of the trainer
    private int imageResourceId; // Resource ID of the image associated with the trainer

    // Getters and setters for the Trainer fields

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

}
