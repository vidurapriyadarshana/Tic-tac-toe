package com.assignment.tictactoe.service;

public interface BoardUi {
    void updateMove(int row, int col,boolean isHuman);
    void notifyWinner();
}
