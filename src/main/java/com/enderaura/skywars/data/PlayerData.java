package com.enderaura.skywars.data;

import com.enderaura.skywars.objects.GamePlayer;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by matth on 22/08/2017.
 */
public class PlayerData {

    private static PlayerData ourInstance = new PlayerData();

    public static PlayerData getInstance() {
        return ourInstance;
    }

    private PlayerData() {
    }

    private Map<Player, GamePlayer> data = new HashMap<>();

    public Map<Player, GamePlayer> getData() {
        return data;
    }

    public void addPlayer(Player player, GamePlayer gamePlayer){
        data.putIfAbsent(player, gamePlayer);
    }

    public void removePlayer(Player player){
        if(data.get(player) != null) data.remove(player);
    }
}
