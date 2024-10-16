package com.assignment.tictactoe.service;

public class HumanPlayer extends Player {

    HumanPlayer(Board board) {
        super(board);
    }

    @Override
    public void move(int row, int col) {
        board.updateMove(row, col, Piece.X);
    }
}
