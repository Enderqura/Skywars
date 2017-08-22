package com.enderaura.skywars.data;

import com.enderaura.skywars.objects.Arena;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by matth on 22/08/2017.
 */
public class ArenaData {
    private static ArenaData ourInstance = new ArenaData();

    public static ArenaData getInstance() {
        return ourInstance;
    }

    private ArenaData() {
    }

    private Map<Integer, Arena> data = new HashMap<>();

    public Map<Integer, Arena> getData() {
        return data;
    }

    public void addPlayer(int id, Arena arena){
        data.putIfAbsent(id, arena);
    }

    public void removePlayer(int id){
        if(data.get(id) != null) data.remove(id);
    }

}
