package com.enderaura.skywars.data;

import com.enderaura.skywars.objects.GameTeam;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by matth on 22/08/2017.
 */
public class TeamData {
    private static TeamData ourInstance = new TeamData();

    public static TeamData getInstance() {
        return ourInstance;
    }

    private TeamData() {
    }

    private Map<Integer, GameTeam> data = new HashMap<>();

    public Map<Integer, GameTeam> getData() {
        return data;
    }

    public void addTeam(int id, GameTeam gameTeam){
        data.putIfAbsent(id, gameTeam);
    }

    public void removeTeam(int player){
        if(data.get(player) != null) data.remove(player);
    }
}
