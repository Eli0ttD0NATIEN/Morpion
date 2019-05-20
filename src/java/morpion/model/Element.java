package java.morpion.model;

public class Element {
    char sprite;

    public Element(char sprite) {
        this.setSprite(sprite);
    }

    public char getSprite() {
        return this.sprite;
    }

    public void setSprite(char sprite) {
        this.sprite = sprite;
    }
}
