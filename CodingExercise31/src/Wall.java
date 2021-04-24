public class Wall {
    private double height;
    private double width;

    public Wall() {
        this(0.0,0.0);
    }

    public Wall(double width, double height) {
        if(height < 0.0){
            height = 0.0;
        }
        if(width < 0.0){
            width = 0.0;
        }
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if(height < 0.0){
            height = 0.0;
        }
        this.height = height;
    }

    public void setWidth(double width) {
        if(width < 0.0){
            width = 0.0;
        }
        this.width = width;
    }

    public double getArea(){
        return height * width;
    }
}
