package com.chemger.mahjong;

public class Tiles {

    private static final String TAG = "Tiles";
    //牌的种类
    private TileType type;
    //牌的id
    private int id;

    public Tiles(TileType type, int id) {
        this.type = type;
        this.id = id;
    }

    public TileType getType() {
        return type;
    }

    public void setType(TileType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tiles{" +
                "type='" + type + '\'' +
                ", id=" + id +
                '}';
    }
}

enum TileType{
    Feng,
    Jian,
    Wan,
    Tong,
    Tiao,

}
