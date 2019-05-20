package java.morpion.model;

public class Model {

    private Element[][] morpionArray;
    private boolean[][] isAvailable;

    public boolean[][] getIsAvailable() {
        return this.isAvailable;
    }

    public boolean getIsAvailbleXY(int x, int y) {
        return this.isAvailable[x][y];
    }

    public Element[][] getMorpionArray() {
        return this.morpionArray;
    }

    public Element getMorpionArrayXY(int x, int y) {
        return this.morpionArray[x][y];
    }

    public void setIsAvailableXY(boolean bool, int x, int y) {
        this.isAvailable[x][y] = bool;
    }

    public void setMorpionArrayXY(Element element, int x, int y) {
        if (this.getIsAvailbleXY(x, y)) {
            this.morpionArray[x][y] = element;
            this.setIsAvailableXY(false, x, y);
        }
    }

}
