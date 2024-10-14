package com.assignment.tictactoe.service;

abstract class Player {
    protected Board board;

    Player(Board board) {
        this.board = board;
    }

    abstract void move(int row, int col);
}
