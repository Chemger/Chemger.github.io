package com.chemger.minesweeper;

import java.util.Arrays;
import java.util.Random;

public class Board {
    private int row;
    private int column;
    private boolean[][] mineVector;
    private boolean[][] fogVector;
    private int[][] numberVector;
    private int mines;


    public Board(int row, int column, int mines) {
        this.row = row;
        this.column = column;
        this.mines = mines;
        mineVector = new boolean[row][column];
        for (boolean[] booleans : mineVector) {
            Arrays.fill(booleans, false);
        }
        fogVector = new boolean[row][column];
        for (boolean[] booleans : fogVector) {
            Arrays.fill(booleans,true);
        }
        numberVector = new int[row][column];

    }

    /**
     * 判断这个坐标是否为雷
     * @param x,y 为坐标
     * @return 返回判断结果
     */
    public boolean isMine(int x, int y){
        return mineVector[x][y];
    }

    private void setMine(int mines){
        for (int i = 0; i < mines; i++) {
            int x = new Random().nextInt(4);
            int y = new Random().nextInt(6);
            if(isMine(x,y)){
                setMine(1);
            }else {
                mineVector[x][y] = true;
            }
        }
    }


    /**
     * 点开当前格子
     * @param x .
     * @param y .
     */
    public void show(int x, int y){

    }

    public static void main(String[] args) {
        Board board = new Board(4,6,12);
        System.out.println(Arrays.deepToString(board.mineVector));
        System.out.println(Arrays.deepToString(board.fogVector));
    }

}
