package com.insertign.pineapple.player;

import org.json.JSONObject;

import java.util.List;

public class Player {

    private JSONObject JSONPlayerObject;

    public Player(JSONObject JSONPlayerObject) {
        this.JSONPlayerObject = JSONPlayerObject;
    }

    public String getUsername() {
        return null;
    }

    public String getUuid() {
        return null;
    }
    public double getLevel() {
        return 0;
    }

    public int getAchievementPoints() {
        return 0;
    }

    public int getKarma() {
        return 0;
    }

    public int getQuestsCompleted() {
        return 0;
    }

    public List<Player> getFriendsList() {
        return null;
    }

    public boolean isActive() {
        return false;
    }

}
