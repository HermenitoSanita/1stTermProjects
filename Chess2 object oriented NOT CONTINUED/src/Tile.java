public class Tile {
    String tileID;
    int tileColor;
    String whatIsOnThisTile = "--";
    boolean isAPawnSpawn = false;

    public void setID(String id) {
        this.tileID = id;
    }
    public void setTileColor(int color) {
        this.tileColor = color;
    }
    public void setWhatIsOnThisTile(String pieceCode) {
        this.whatIsOnThisTile = pieceCode;
    }
    public void setIsAPawnSpawn(boolean flag) {
        this.isAPawnSpawn = flag;
    }
}
