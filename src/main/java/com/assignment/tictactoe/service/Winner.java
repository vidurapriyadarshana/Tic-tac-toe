package com.assignment.tictactoe.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Winner {
    private Piece winningPiece;

    private int col1,col2,col3,row1,row2,row3;

    public Winner(Piece winningPiece) {
        this.winningPiece = winningPiece;
    }
}
