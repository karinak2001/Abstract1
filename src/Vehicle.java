public abstract class Vehicle {
    private String color;
    private int speed;
    private String yearOfManufacture;

    public void accelerate(int fasterSpeed){
        this.speed = fasterSpeed;
    }

    public void slowDown(int slowSpeed){
        this.speed = slowSpeed;
    }

    public abstract String goToBase();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
