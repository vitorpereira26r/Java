package entities;

public class Comments {

    private String text;

    public Comments(String text) {
        this.text = text;
    }

    public Comments() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
