package com.assignment.tictactoe.controller;

import com.assignment.tictactoe.service.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class BoardController implements BoardUi {


    private BoardImpl board;
    private AiPlayer ai;
    private HumanPlayer human;

    private int aiWinCount = 0;
    private int humanWinCount = 0;


    @FXML
    private GridPane MainGrid;

    @FXML
    private Label humanScore;

    @FXML
    private Label aiScore;

    public BoardController() {
        board = new BoardImpl();
        ai = new AiPlayer(board);
        human = new HumanPlayer(board);
    }

    @FXML
    void handleButtonAction(ActionEvent event) {
        Button button = (Button) event.getSource();
        int row = Integer.parseInt(button.getId().substring(2, 3));
        int col = Integer.parseInt(button.getId().substring(3, 4));

        human.move(row, col);
        updateUi();

        if (board.checkWinner() != null) {
            NotifyWinner(board.checkWinner().getWinningPiece());
        } else if (board.isBoardFull()) {
            showAlert("Tie");
        } else {
            ai.findBestMove();
            updateUi();
            if (board.checkWinner() != null) {
                NotifyWinner(board.checkWinner().getWinningPiece());
            } else if (board.isBoardFull()) {
                showAlert("Tie");
            }
        }
    }

    public void updateUi() {
        for (int row = 0; row < board.getPieces().length; row++) {
            for (int col = 0; col < board.getPieces()[row].length; col++) {
                update(row, col, board.getPieces()[row][col]);
            }
        }
    }

    @Override
    public void update(int row, int col, Piece piece) {
        String buttonId = "#bt" + row + col;
        Button button = (Button) MainGrid.lookup(buttonId);
        if (button != null) {
            if (piece == Piece.X) {
                button.setText("X");
            } else if (piece == Piece.O) {
                button.setText("O");
            } else {
                button.setText("");
            }
        }
    }

    @Override
    public void NotifyWinner(Piece winner) {
        if (winner == Piece.X) {
            humanWinCount++;
            System.out.println(humanWinCount);
            humanScore.setText(String.valueOf(humanWinCount));
            showAlert("X wins");
        } else if (winner == Piece.O) {
            aiWinCount++;
            System.out.println(aiWinCount);
            aiScore.setText(String.valueOf(aiWinCount));
            showAlert("O wins");
        }
    }


    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, message);
        alert.setOnCloseRequest(event -> {
            board.initializeBoard();
            updateUi();
        });
        alert.showAndWait();
    }
}