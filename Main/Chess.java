public class Chess {
    private char[][]location;
    private String colour;//black/white
    private int step;

    public Chess(String colour){
        this.colour = colour;
    }

    public char[][] getLocation() {
        return location;
    }

    public void setLocation(char[][] location) {
        this.location = location;
    }

    public String getColour() {
        return colour;
    }

    public int getStep(){
        return step;
    }
}
