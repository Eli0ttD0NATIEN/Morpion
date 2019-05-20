package java.morpion.model;

public interface IModel {

    void fillMorpionSolve();

    boolean[][] getIsAvailable();

    boolean getIsAvailbleXY(int x, int y);

    int[][] getMorpionArray();

    int getMorpionArrayXY(int x, int y);

    int[] getMorpionSolve();

    int getMorpionSolvePos(int pos);

    void setIsAvailableXY(boolean bool, int x, int y);

    void setMorpionArrayXY(int solve, int x, int y);

}