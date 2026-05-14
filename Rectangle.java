/** Represents a rectangle that is drawm using the turtle class
 * Has a width from Rectangle class and height inherited from Shape class (size)
 * @author Emma Tenenbaum
 * 
 */


public class Rectangle extends Shape{

    private int width;
    
    /**
     * Creates a rectanlge with a default color and height
     * sets the width to 100
     */
    public Rectangle() {
        super();
        this.width = 100;
     
    }
    /**
     * Creates a rectangle with custom color, width, and height
     * @param color the color of the rectangle
     * @param width the width of the rectangle > 0
     * @param height the height of the rectangle from shape class
     */
    public Rectangle(String color, int width, int height){
        super(color, height);
        
        if(width <= 0){
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }
    

    /**
     * Draws the rectangle using Turtle class
     */
    @Override
    public void draw() {
        colorShape();

        for (int i = 0; i<2; i++) {
            turtle.forward(width);
            turtle.right(90);
            turtle.forward(getSize());
            turtle.right(90);
        }

    
    }
    

    /**
     * Compares the rectangle to another object
     * @param object the object to compare
     * @return true if they are equal, false otherwise
     */
    @Override
    public boolean equals(Object object) {
        if(this == object){
            return true;
        }
        if (!(object instanceof Rectangle)){
            return false;
        }

        Rectangle other = (Rectangle) object;

        return this.getColor().equals(other.getColor()) &&
        this.getSize() == other.getSize() &&
        this.width == other.width;

    }
    /**
     * Returns a string representing the rectangle
     * @return string describing the rectangle
     */
    @Override
    public String toString(){
        return "Rectangle: color = " + getColor() +
               ", height = " + getSize() +
               ", width = " + width;   
            }
    
    /**
     * Gets the width of the rectangle
     * @return width an integer
     */
    public int getWidth(){
        return width;
    }  
    
    /**
     * Gets the height from the shape class (size)
     * @return hieght an integer
     */
    public int getHeight() {
        return getSize();
    }

    /**Sets the width of the rectangle
     * @param width an integer > 0
     */
    public void setWidth(int width) {
        if(width <= 0){
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    /**
     * Sets the height of the rectangle
     * Updates the size in shape class
     * @param height ann integer > 0
     */
    public void setHeight(int height){
        if(height <= 0){
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        setSize(height);
    }


}