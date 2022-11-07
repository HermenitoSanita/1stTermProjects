import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        boolean flag = true;
        while (flag) {
            ArrayList<ArrayList<Integer>> grid = createGrid(15);
            flag = false;
            System.out.println("******************************");
            for (int i = 0; i < 9; i++) {
                System.out.println(grid.get(i));  
            }
            System.out.println("******************************");
            }
        }

        public static ArrayList<ArrayList<Integer>> createGrid(int n) {
            Random rn = new Random();
            ArrayList<ArrayList<Integer>> grid = new ArrayList<>();
            while (grid.size() < n) {
                boolean gridFlag = true;
                ArrayList<Integer> row = new ArrayList<>();
                while (row.size() < n) {
                    int randInt = rn.nextInt(n) + 1;
                    boolean rowFlag = true;
                    for (int j = 0; j < row.size(); j++) {
                        if (row.get(j) == randInt) {
                            rowFlag = false;
                        }
                    }
                    if (rowFlag) {
                        row.add(randInt);
                    }
                                }
                for (int i = 0; i < grid.size(); i++) {
                    for (int j = 0; j < n; j++) {
                        if (row.get(j) == grid.get(i).get(j)) {
                            gridFlag = false;
                        }
                    }
                }
                if (gridFlag) {
                    grid.add(row);
                    for (int i = 0; i < grid.size(); i++) {
                        System.out.println(grid.get(i));
                    }
                    System.out.println("--------------------------------------");
                }
            }
            
            return grid;
        }
    }

