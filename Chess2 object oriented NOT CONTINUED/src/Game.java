import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        String tileID = "";
        ArrayList<Tile> board = new ArrayList<>();
        boolean isTheGameRunning = true;
        for (int i = 0; i < 64; i ++) {
            Tile tile = new Tile();
            switch (i) {
                case 0, 1, 2, 3, 4, 5, 6, 7 -> {tileID = "A"; switch (i) {
                    case 0, 7 -> tile.setWhatIsOnThisTile("WR");
                    case 1, 6 -> tile.setWhatIsOnThisTile("WN");
                    case 2, 5 -> tile.setWhatIsOnThisTile("WB");
                    case 3 -> tile.setWhatIsOnThisTile("WQ");
                    case 4 -> tile.setWhatIsOnThisTile("WK");
                }}
                case 8, 9, 10, 11, 12, 13, 14, 15 -> {tileID = "B"; tile.setIsAPawnSpawn(true); tile.setWhatIsOnThisTile("WP");}
                case 16, 17, 18, 19, 20, 21, 22, 23 -> tileID = "C";
                case 24, 25, 26, 27, 28, 29, 30, 31 -> tileID = "D";
                case 32, 33, 34, 35, 36, 37, 38, 39 -> tileID = "E";
                case 40, 41, 42, 43, 44, 45, 46, 47 -> tileID = "F";
                case 48, 49, 50, 51, 52, 53, 54, 55 -> {tileID = "G"; tile.setIsAPawnSpawn(true); tile.setWhatIsOnThisTile("BP");}
                case 56, 57, 58, 59, 60, 61, 62, 63 -> {tileID = "H"; switch (i) {
                    case 56, 63 -> tile.setWhatIsOnThisTile("BR");
                    case 57, 62 -> tile.setWhatIsOnThisTile("BN");
                    case 58, 61 -> tile.setWhatIsOnThisTile("BB");
                    case 59 -> tile.setWhatIsOnThisTile("BQ");
                    case 60 -> tile.setWhatIsOnThisTile("BK");
                }}
            }
            tileID += (i % 8) + 1;
            tile.setID(tileID);
            if (i % 2 == 0) {
                tile.setTileColor(0);
            } else {
                tile.setTileColor(1);
            }
            System.out.println("----------------");
            System.out.println(tile.tileID);
            System.out.println(tile.tileColor);
            System.out.println(tile.isAPawnSpawn);
            System.out.println(tile.whatIsOnThisTile);
            board.add(tile);
        }
        System.out.println(board);
        while (isTheGameRunning) {

        }
    }

}



