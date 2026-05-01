 /**
  * Circle class that extends the shape class
  * The class draws a circle using the Turtle class
  */

public class Circle extends Shape {

    /**
     * Creates circle
     */
    public Circle(){
        super();
    }

    /**
     * Create circle with a specific color and size
     * @param color the shape color
     * @param size the shape size
     */
    public Circle(String color, int size){
        super(color, size);
    }

    /**
     * Draw the circle using turtle
     */
    @Override
    public void draw(){
        colorShape();

        for (int i = 0; i < 36; i++){
            turtle.forward( getSize() / 6.0);
            turtle.right(10);
        }
    }

    /**
     * Returns a string representation of the circle 
     * @return the string of the circle information
     */
    @Override
    public String toString(){
        return "Circle[color=" + getColor() + ", size=" + getSize() + "]";
    }

    /**
     * compares Circle to another object
     * @param obj the object to compare to
     * @return true if both circles have the same size and color
     */
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Circle){
            Circle other = (Circle) obj;
            return getColor().equals(other.getColor())
                && getSize() == other.getSize();
        }
        return false;
    }
}
