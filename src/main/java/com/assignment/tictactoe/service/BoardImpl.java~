package com.assignment.tictactoe.service;

import lombok.Getter;

public class BoardImpl implements Board {

    private Piece[][] board = new Piece[3][3];

    @Getter
    private BoardUi boardUi;

    BoardImpl(){

    }

    BoardImpl(BoardUi boardUi){
        this.boardUi = boardUi;
    }

    public void initializeBoard(){
        // initialize the array/board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Piece.EMPTY;
            }
        }
    }

    public boolean isLegalMove(int row, int col){
        // check the move is legal
        if(row < 0 || row >= 3 || col < 0 || col >= 3){
            return false;
        }

        if(board[row][col] == null || board[row][col] == Piece.EMPTY){
            return true;
        }

        return false;
    }

    public void updateMove(int row, int col, Piece piece){
        // assign the piece
        board[row][col] = piece;
    }

    public Winner checkWinner(){

        for (int i = 0; i < board.length; i++) {
            // check rows for winner
            if(board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != Piece.EMPTY){
                return new Winner(board[i][0]);
            }
            // check columns for winner
            if(board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != Piece.EMPTY){
                return new Winner(board[0][i]);
            }
        }

        // check diagonals
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != Piece.EMPTY){
            return new Winner(board[0][0]);
        }

        if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != Piece.EMPTY){
            return new Winner(board[0][2]);
        }

        return null;
    }

    public void printBoard(){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] = Piece.EMPTY);
            }
            System.out.println();
        }
    }

}