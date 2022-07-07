package com.insertign.pineapple.player;

import org.json.JSONObject;

public class Player {

    private JSONObject JSONPlayerObject;
    
    private String username;
    private String uuid;

    public Player(JSONObject JSONPlayerObject) {
        this.JSONPlayerObject = JSONPlayerObject;
    }


}
