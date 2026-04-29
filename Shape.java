/**
 * Abstract class representing a drawable shape
 * Uses the turtle class for each shape to draw itself
 */
public abstract class Shape {

    private String color;
    private int size;
    protected Turtle turtle;

    /**
     * creates a default shape
     */
    public Shape(){
        color = "black";
        size = 50;
        turtle = new Turtle();
    }

    /**
     * Creates shape with custom values
     */
    public Shape(String color, int size){
        this.color = color;
        this.size = size;
        turtle = new Turtle();
    }

    /**
     * Draws the shape 
     */
    public abstract void draw();

    /** 
     * applies the color of shape to the turtle
     */
    public void colorShape(){
        turtle.penColor(color);
        turtle.width(1);
    }

    /**
     * Establish the position of the turtle
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public void position(double x, double y){
        turtle.up();
        turtle.setPosition(x, y);
        turtle.down();
    }

    public String getColor(){
        return color;
    }

    public int getSize(){
        return size;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setSize(int size){
        this.size = size;
    }
}
    

