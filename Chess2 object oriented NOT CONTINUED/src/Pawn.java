public class Pawn {
    String color = "";
    boolean hasMoved = false;
    int[] position = {0,0};

    public void setColor(int val) {
        if (val == 0) {
            this.color = "W";
        } else {
            this.color = "B";
        }
    }
    public void setHasMoved(boolean flag) {
        this.hasMoved = flag;
    }
    public void setPosition(int x, int y) {
        this.position[0] = x;
        this.position[1] = y;
    }
}
