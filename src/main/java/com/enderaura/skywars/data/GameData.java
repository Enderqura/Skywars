package com.enderaura.skywars.data;

/**
 * Created by matth on 22/08/2017.
 */
public class GameData {
    private static GameData ourInstance = new GameData();

    public static GameData getInstance() {
        return ourInstance;
    }

    private GameData() {
    }
}
