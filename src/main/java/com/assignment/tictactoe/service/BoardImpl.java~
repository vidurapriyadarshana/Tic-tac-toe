package com.assignment.tictactoe.service;

public class BoardImpl implements Board {

    private Piece[][] board = new Piece[3][3];

    private BoardUi boardUi;

    BoardImpl(){

    }

    BoardImpl(BoardUi boardUi){
        this.boardUi = boardUi;
    }

    public void initializeBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Piece.EMPTY;
            }
        }
    }

    public boolean isLegalMove(int row, int col){
        if(row < 0 || row >= 3 || col < 0 || col >= 3){
            return false;
        }

        if(board[row][col] == null || board[row][col] == Piece.EMPTY){
            return true;
        }

        return false;
    }

    public void updateMove(int row, int col, Piece piece){

    }

    public Winner checkWinner(){
        return null;
    }

    public void printBoard(){

    }

    public BoardUi getBoardUi(){
        return null;
    }
}
