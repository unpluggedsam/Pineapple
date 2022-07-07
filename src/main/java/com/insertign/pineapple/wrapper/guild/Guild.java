package com.insertign.pineapple.wrapper.guild;

import com.insertign.pineapple.wrapper.player.Player;
import org.json.JSONObject;

import java.util.List;

public class Guild {

    private JSONObject JSONGuildObject;

    public Guild(JSONObject JSONGuildObject) {
        this.JSONGuildObject = JSONGuildObject;
    }

    private String getName() {
        return null;
    }

    private List<Player> getGuildMembers() {
        return null;
    }

    private double getLevel() {
        return 0;
    }

    private String getDescription() {
        return null;
    }

    private String getTag() {
        return null;
    }

    private int getLeaderboardPosition() {
        return 0;
    }

    private Player getOwner() {
        return null;
    }

    private int getExperienceKings() {
        return 0;
    }

    private double getEXP() {
        return 0;
    }

}
