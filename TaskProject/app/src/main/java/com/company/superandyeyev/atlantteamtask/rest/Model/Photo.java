package com.company.superandyeyev.atlantteamtask.rest.Model;

import io.realm.RealmObject;

/**
 * Created by DIMON on 10.10.2017.
 */

public class Photo extends RealmObject {

    String thumbnailUrl;

    public String getUrl() {
        return thumbnailUrl;
    }
}
