public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle() {
        super();
        this.width = 100;
        this.height = 50;
     
    }

    public Rectangle(String color, int size, int width, int height){
        super(color, size);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        colorShape();

        for (int i = 0; i<2; i++) {
            turtle.forward(width);
            turtle.right(90);
            turtle.forward(height);
            turtle.right(90);
        }

    
    }

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
        this.width == other.width &&
        this.height == other.height;

    }

    @Override
    public String toString(){
        return "Rectangle: color = " + getColor() +
               ", size = " + getSize() +
               ", width = " + width +
               ", height = " + height;   
            }

    public int getWidth(){
        return width;
    }  
    
    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }
}