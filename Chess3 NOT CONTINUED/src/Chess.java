
import java.util.ArrayList;
import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        //boolean gameIsRunning = true;
        int counter = 0;
        String turn = "w";
        ArrayList<String> board = new ArrayList<>();
        for (int i = 0; i < 64; i++) {
            String piece = whichPiece(i);
            board.add(piece);
        }
        while (counter < 20) {
            board = moveAnalyzer(board, turn);
            if (turn.equals("w")) {
                turn = "b";
            } else {
                turn = "w";
            }
            //gameIsRunning = false;
            renderer(board);
            counter++;
        }
    }
    public static String whichPiece(int index) {
        String piece = "--";
        switch (index) {
            case 0, 7, 56, 63 -> piece = "r";
            case 1, 6, 57, 62 -> piece = "n";
            case 2, 5, 58, 61 -> piece = "b";
            case 3, 59 -> piece = "q";
            case 4, 60 -> piece = "k";
            case 8, 9, 10, 11, 12, 13, 14, 15, 48, 49, 50, 51, 52, 53, 54, 55 -> piece = "p";
        }
        switch (index) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 -> piece += "w";
            case 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48 -> piece += "b";
        }
        return piece;
    }

    public static ArrayList<String> interchangeTwo(ArrayList<String> board,int x,int y) {
        String xPos = board.get(x);
        String yPos = board.get(y);
        board.set(y,xPos);
        board.set(x,yPos);
        return board;
    }

    public static ArrayList<String> capturePiece(ArrayList<String> board,int x,int y) {
        String xPos = board.get(x);
        board.set(y,xPos);
        board.set(x,"--");
        return board;
    }

    public static ArrayList<String> moveAnalyzer(ArrayList<String> board, String turn) {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("PICK ONE LOCATION!");
        int firstPiece = scan.nextInt();
        System.out.println("PICK ANOTHER LOCATION!");
        int secondPiece = scan.nextInt();
        if ((turn.equals("w") && board.get(firstPiece).charAt(1) == 119) || (turn.equals("b") && board.get(firstPiece).charAt(1) == 98)) {
            if(board.get(secondPiece).equals("--")) {
                board = interchangeTwo(board,firstPiece,secondPiece);
            } else if (board.get(firstPiece).charAt(1) != board.get(secondPiece).charAt(1)) {
                board = capturePiece(board,firstPiece,secondPiece);
            }
        } else {
            System.out.println("NOT POSSIBLE");
        }
        return board;
    }

    public static boolean checkPawnMove(ArrayList<String> board, String turn, int firstPos, int lastPos) {
        boolean flag = false;
        if (turn.equals("w") && lastPos - firstPos == 16) {
            if (firstPos/8 == 1 && (board.get(firstPos + 8).charAt(1) == 45 && board.get(lastPos).charAt(1) == 45)) {
                flag = true;
            }
        } else if (turn.equals("w") && lastPos - firstPos == 8) {
            if (board.get(lastPos).charAt(1) == 45) {
                flag = true;
            }
        } else if (turn.equals("w") && (lastPos - firstPos == 7 || lastPos-firstPos == 9)) {
            if (board.get(lastPos-firstPos).charAt(1) == 98) {
                flag = true;
            }
        } else if (turn.equals("b") && (lastPos - firstPos == -16)) {
            if (firstPos/8 == 6 && (board.get(firstPos - 8).charAt(1) == 45 && board.get(lastPos).charAt(1) == 45)) {
                flag = true;
            }
        } else if (turn.equals("b") && (lastPos - firstPos == -8)) {
            if (board.get(lastPos).charAt(1) == 45) {
                flag = true;
            }
        } else if (turn.equals("b") && (lastPos - firstPos == -7 || lastPos-firstPos == -9)) {
            if (board.get(lastPos-firstPos).charAt(1) == 98) {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean checkKnightMove(ArrayList<String> board, String turn, int firstPos, int lastPos) {
        boolean flag = false;
        switch (Math.abs(firstPos-lastPos)) {
            case 17, 15, 10, 6 -> {if ((board.get(lastPos).charAt(1) == 119 && turn.equals("b")) || (board.get(lastPos).charAt(1) == 98 && turn.equals("w"))) {
                flag = true;
            }
            }
        }
        return flag;
    }

    public static boolean checkBishopMove(ArrayList<String> board, String turn, int firstPos, int lastPos) {
        boolean flag = false;
        if (Math.abs(firstPos-lastPos) % 9 == 0 || Math.abs(firstPos-lastPos) % 7 == 0) {
            flag = isBetweenClearDiagonally(board,turn,firstPos,lastPos);
        }
        return flag;
    }

    public static boolean isBetweenClearDiagonally(ArrayList<String> board, String turn, int firstPos, int lastPos) {
        boolean flag = true;
        if (lastPos > firstPos) {
            if (lastPos - firstPos % 9 == 0) {
                int currentPlace = firstPos + 9;
                int increment = 9;
                while (currentPlace <= lastPos) {
                    if ((turn.equals("w") && board.get(currentPlace).charAt(1) == 119) || (turn.equals("b") && board.get(currentPlace).charAt(1) == 98)) {
                        flag = false;
                    } else if ((turn.equals("w") && board.get(currentPlace).charAt(1) == 98) || (turn.equals("b") && board.get(currentPlace).charAt(1) == 119)) {
                        flag = false;
                    }
                    currentPlace += increment;
                }
            } else if (lastPos - firstPos % 7 == 0) {
                int currentPlace = firstPos + 7;
                int increment = 7;
                while (currentPlace <= lastPos) {
                    if ((turn.equals("w") && board.get(currentPlace).charAt(1) == 119) || (turn.equals("b") && board.get(currentPlace).charAt(1) == 98)) {
                        flag = false;
                    } else if ((turn.equals("w") && board.get(currentPlace).charAt(1) == 98) || (turn.equals("b") && board.get(currentPlace).charAt(1) == 119)) {
                        flag = false;
                    }
                    currentPlace += increment;
                }
            }
        } else {
            if (firstPos - lastPos % 9 == 0) {
                int currentPlace = firstPos - 9;
                int increment = -9;
                while (currentPlace <= lastPos) {
                    if ((turn.equals("w") && board.get(currentPlace).charAt(1) == 119) || (turn.equals("b") && board.get(currentPlace).charAt(1) == 98)) {
                        flag = false;
                    } else if ((turn.equals("w") && board.get(currentPlace).charAt(1) == 98) || (turn.equals("b") && board.get(currentPlace).charAt(1) == 119)) {
                        flag = false;
                    }
                    currentPlace += increment;
                }
            } else if (lastPos - firstPos % 7 == 0) {
                int currentPlace = firstPos -7;
                int increment = -7;
                while (currentPlace <= lastPos) {
                    if ((turn.equals("w") && board.get(currentPlace).charAt(1) == 119) || (turn.equals("b") && board.get(currentPlace).charAt(1) == 98)) {
                        flag = false;
                    } else if ((turn.equals("w") && board.get(currentPlace).charAt(1) == 98) || (turn.equals("b") && board.get(currentPlace).charAt(1) == 119)) {
                        flag = false;
                    }
                    currentPlace += increment;
                }
            }
        }
        return flag;
    }
    public static void renderer(ArrayList<String> board) {
        for(int i = 7; i >= 0; i--) {
            ArrayList<String> currentRow = new ArrayList<>();
            for (int j = 0; j < 8; j++) {
                currentRow.add(board.get(8*i + j));
            }
            System.out.println(currentRow);

        }

    }
}
