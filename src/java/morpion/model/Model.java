package java.morpion.model;

public class Model implements IModel {

    private int[][]     morpionArray;
    private boolean[][] isAvailable;
    private int[]       morpionSolve;
    private String      currentPlayer;

    public Model() {
        this.initMorpionArray();
    }

    @Override
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

    public String getCurrentPLayer() {
        return this.currentPlayer;
    }

    @Override
    public boolean[][] getIsAvailable() {
        return this.isAvailable;
    }

    @Override
    public boolean getIsAvailbleXY(int x, int y) {
        return this.isAvailable[x][y];
    }

    @Override
    public int[][] getMorpionArray() {
        return this.morpionArray;
    }

    @Override
    public int getMorpionArrayXY(int x, int y) {
        return this.morpionArray[x][y];
    }

    @Override
    public int[] getMorpionSolve() {
        return this.morpionSolve;
    }

    @Override
    public int getMorpionSolvePos(int pos) {
        return this.morpionSolve[pos];
    }

    private void initMorpionArray() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                this.setMorpionArrayXY(69, x, y);
            }
        }
    }

    public void setCurrentPlayer(String player) {
        this.currentPlayer = player;
    }

    @Override
    public void setIsAvailableXY(boolean bool, int x, int y) {
        this.isAvailable[x][y] = bool;
    }

    @Override
    public void setMorpionArrayXY(int solve, int x, int y) {
        if (this.getIsAvailbleXY(x, y)) {
            this.morpionArray[x][y] = solve;
            this.fillMorpionSolve();
            this.setIsAvailableXY(false, x, y);

        }
    }

}
