package com.example.student1.crimeintent;

import java.util.UUID;

/**
 * Created by student1 on 12.12.16.
 */

public class Crime {
    private UUID id;
    private String title;
    private Boolean isSolved;

    public Boolean getSolved() {
        return isSolved;
    }

    public void setSolved(Boolean solved) {
        isSolved = solved;
    }

    public Crime(String title) {
        this.title = title;
    }

    public Crime(UUID id, String title) {
        this.id = id;
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
