package java.morpion.model;

public class Model {

    private int[][]     morpionArray;
    private boolean[][] isAvailable;
    private int[]       morpionSolve;

    public Model() {
        this.initMorpionArray();
    }

    public void fillMorpionSolve() {
        this.morpionSolve[0] = this.morpionArray[0][0] + this.morpionArray[1][0] + this.morpionArray[2][0];
        this.morpionSolve[1] = this.morpionArray[0][1] + this.morpionArray[1][1] + this.morpionArray[2][1];
        this.morpionSolve[2] = this.morpionArray[0][2] + this.morpionArray[1][2] + this.morpionArray[2][2];

        this.morpionSolve[3] = this.morpionArray[0][0] + this.morpionArray[0][1] + this.morpionArray[0][2];
        this.morpionSolve[4] = this.morpionArray[1][0] + this.morpionArray[1][1] + this.morpionArray[1][2];
        this.morpionSolve[5] = this.morpionArray[2][0] + this.morpionArray[2][1] + this.morpionArray[2][2];

        this.morpionSolve[7] = this.morpionArray[0][2] + this.morpionArray[1][1] + this.morpionArray[2][0];
        this.morpionSolve[8] = this.morpionArray[0][0] + this.morpionArray[1][1] + this.morpionArray[2][2];
    }

    public boolean[][] getIsAvailable() {
        return this.isAvailable;
    }

    public boolean getIsAvailbleXY(int x, int y) {
        return this.isAvailable[x][y];
    }

    public int[][] getMorpionArray() {
        return this.morpionArray;
    }

    public int getMorpionArrayXY(int x, int y) {
        return this.morpionArray[x][y];
    }

    public int getMorpionSolve(int x) {
        return this.morpionSolve[x];
    }

    private void initMorpionArray() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                this.setMorpionArrayXY(69, x, y);
            }
        }
    }

    public void setIsAvailableXY(boolean bool, int x, int y) {
        this.isAvailable[x][y] = bool;
    }

    public void setMorpionArrayXY(int solve, int x, int y) {
        if (this.getIsAvailbleXY(x, y)) {
            this.morpionArray[x][y] = solve;
            this.fillMorpionSolve();
            this.setIsAvailableXY(false, x, y);

        }
    }

}
