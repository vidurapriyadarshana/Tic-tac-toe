package com.assignment.tictactoe.service;

abstract class Player {
    BoardImpl board;

    abstract void move(int row, int col);
}
