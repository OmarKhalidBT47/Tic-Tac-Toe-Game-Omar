package com.example.xogame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainController {
    private boolean gameEnded = false;
    private char currentPlayerMove = 'X';
    InputStream stream = new FileInputStream("Empty.png");
    Image empty = new Image(stream);
    InputStream stream1 = new FileInputStream("X.png");
    Image X = new Image(stream1);
    InputStream stream2 = new FileInputStream("O.png");
    Image O = new Image(stream2);
    int field[][] = new int[3][3];


    @FXML
    private ImageView field11;

    @FXML
    private ImageView field12;

    @FXML
    private ImageView field13;

    @FXML
    private ImageView field21;

    @FXML
    private ImageView field22;

    @FXML
    private ImageView field23;

    @FXML
    private ImageView field31;

    @FXML
    private ImageView field32;

    @FXML
    private ImageView field33;

    @FXML
    private Button resetButton;

    @FXML
    private Text status;



    public MainController() throws FileNotFoundException {
    }

    //1 == X 2==O

    public void stopTheGame() {
        gameEnded=true;
    }

    public void checkIsGameWon() {
        boolean winnerFound = false;
        status.setText(currentPlayerMove + " Player Turn");
        for (int i = 0; i < 3; i++) {
            int winner = field[i][0];
            for (int j = 0; j < 3; j++) {
                if (field[i][j] != winner) {
                    winner = -1;
                    break;
                }
            }
            if (winner == 1) {
                status.setText("X Player wins");
                stopTheGame();
                winnerFound=true;
            } else if (winner == 2) {
                status.setText("O Player wins");
                stopTheGame();
                winnerFound=true;
            }
        }

        for (int i = 0; i < 3; i++) {
            int winner = field[0][i];
            for (int j = 0; j < 3; j++) {
                if (field[j][i] != winner) {
                    winner = -1;
                    break;
                }
            }
            if (winner == 1) {
                status.setText("X Player wins");
                stopTheGame();
                winnerFound=true;
            } else if (winner == 2) {
                status.setText("O Player wins");
                stopTheGame();
                winnerFound=true;
            }
        }
        int winner1 = field[0][0];
        for (int i = 0; i < 3; i++) {
            if (field[i][i] != winner1) {
                winner1 = -1;
                break;
            }
        }
        if (winner1 == 1) {
            status.setText("X Player wins");
            stopTheGame();
            winnerFound=true;
        } else if (winner1 == 2) {
            status.setText("O Player wins");
            stopTheGame();
            winnerFound=true;
        }
        int winner2 = field[0][2];
        for (int i = 0; i < 3; i++) {
            if (field[i][2 - i] != winner2) {
                winner2 = -1;
                break;
            }
        }
        if (winner2 == 1) {
            status.setText("X Player wins");
            stopTheGame();
            winnerFound=true;
        } else if (winner2 == 2) {
            status.setText("O Player wins");
            stopTheGame();
            winnerFound=true;
        }

        boolean isEmpty = true;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if(field[i][j]==0) {
                    isEmpty = false;
                    break;
                }
            }
        }
        if(isEmpty && !winnerFound) {
            status.setText("No Winner");
            stopTheGame();

        }
    }

    @FXML
    void field11Listener(MouseEvent event) {
        if(!gameEnded) {
            if (field[0][0] == 0) {
                if (currentPlayerMove == 'X') {
                    field11.setImage(X);
                    field[0][0] = 1;
                    currentPlayerMove = 'O';
                } else {
                    field11.setImage(O);
                    field[0][0] = 2;
                    currentPlayerMove = 'X';
                }
            }
            checkIsGameWon();
        }
    }

    @FXML
    void field12Listener(MouseEvent event) {
        if(!gameEnded) {
            if (field[0][1] == 0) {
                if (currentPlayerMove == 'X') {
                    field12.setImage(X);
                    field[0][1] = 1;
                    currentPlayerMove = 'O';
                } else {
                    field12.setImage(O);
                    field[0][1] = 2;
                    currentPlayerMove = 'X';
                }
            }
            checkIsGameWon();
        }
    }

    @FXML
    void field13Listener(MouseEvent event) {
        if(!gameEnded) {
            if (field[0][2] == 0) {
                if (currentPlayerMove == 'X') {
                    field13.setImage(X);
                    field[0][2] = 1;
                    currentPlayerMove = 'O';
                } else {
                    field13.setImage(O);
                    field[0][2] = 2;
                    currentPlayerMove = 'X';
                }
            }
            checkIsGameWon();
        }
    }

    @FXML
    void field21Listener(MouseEvent event) {
        if(!gameEnded) {
            if (field[1][0] == 0) {
                if (currentPlayerMove == 'X') {
                    field21.setImage(X);
                    field[1][0] = 1;
                    currentPlayerMove = 'O';
                } else {
                    field21.setImage(O);
                    field[1][0] = 2;
                    currentPlayerMove = 'X';
                }
            }
            checkIsGameWon();
        }
    }

    @FXML
    void field22Listener(MouseEvent event) {
        if(!gameEnded) {
            if (field[1][1] == 0) {
                if (currentPlayerMove == 'X') {
                    field22.setImage(X);
                    field[1][1] = 1;
                    currentPlayerMove = 'O';
                } else {
                    field22.setImage(O);
                    field[1][1] = 2;
                    currentPlayerMove = 'X';
                }
            }
            checkIsGameWon();
        }
    }

    @FXML
    void field23Listener(MouseEvent event) {
        if(!gameEnded) {
            if (field[1][2] == 0) {
                if (currentPlayerMove == 'X') {
                    field23.setImage(X);
                    field[1][2] = 1;
                    currentPlayerMove = 'O';
                } else {
                    field23.setImage(O);
                    field[1][2] = 2;
                    currentPlayerMove = 'X';
                }
            }
            checkIsGameWon();
        }
    }

    @FXML
    void field31Listener(MouseEvent event) {
        if(!gameEnded) {
            if (field[2][0] == 0) {
                if (currentPlayerMove == 'X') {
                    field31.setImage(X);
                    field[2][0] = 1;
                    currentPlayerMove = 'O';
                } else {
                    field31.setImage(O);
                    field[2][0] = 2;
                    currentPlayerMove = 'X';
                }
            }
            checkIsGameWon();
        }
    }

    @FXML
    void field32Listener(MouseEvent event) {
        if(!gameEnded) {
            if (field[2][1] == 0) {
                if (currentPlayerMove == 'X') {
                    field32.setImage(X);
                    field[2][1] = 1;
                    currentPlayerMove = 'O';
                } else {
                    field32.setImage(O);
                    field[2][1] = 2;
                    currentPlayerMove = 'X';
                }
            }
            checkIsGameWon();
        }
    }

    @FXML
    void field33Listener(MouseEvent event) {
        if(!gameEnded) {
            if (field[2][2] == 0) {
                if (currentPlayerMove == 'X') {
                    field33.setImage(X);
                    field[2][2] = 1;
                    currentPlayerMove = 'O';
                } else {
                    field33.setImage(O);
                    field[2][2] = 2;
                    currentPlayerMove = 'X';
                }
            }
            checkIsGameWon();
        }
    }

    @FXML
    void resetButtonHandler(ActionEvent event) {
        initialize();
    }


    @FXML
    void initialize() {

        field11.setImage(empty);
        field12.setImage(empty);
        field13.setImage(empty);
        field21.setImage(empty);
        field22.setImage(empty);
        field23.setImage(empty);
        field31.setImage(empty);
        field32.setImage(empty);
        field33.setImage(empty);
        this.currentPlayerMove = 'X';
        status.setText(currentPlayerMove + " Player Turn");
        field = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        gameEnded = false;
    }


}
