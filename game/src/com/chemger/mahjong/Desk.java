package com.chemger.mahjong;


import java.util.List;

public class Desk {

    private List<Tiles> TILES_LIST;

    public Desk() throws NullPointerException{
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {

            }
        }
    }

    public static void main(String[] args) {

        System.out.println(new Desk().TILES_LIST);

    }
}
