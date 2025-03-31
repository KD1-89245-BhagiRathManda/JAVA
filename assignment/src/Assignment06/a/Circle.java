package assignment06.a;

/*
Build a new Circle class with the following basic features:
Attributes:
o Center point - Build instance variables for the circle’s center point
(myX and myY represented as double values).
o Diameter - Build an instance variable for the circle’s diameter (myDiameter also
represented as a double value).
Behaviors
o Default constructor - Build a default constructor that initializes the circle’s center
point to (0, 0) and its diameter to 100.
o Accessor methods - Build accessor methods for the two center coordinates and the
diameter.
Invariant
o The circle’s diameter should always be non-negative. maintain the integrity of each
circle object by ensuring that the class invariant (that the diameter should be non-negative) is true at all times.
If the diameter is negative then throw user defined exception.
 */

public class Circle {
    private double myX;
    private double myY;
    private double myDiameter;

    public Circle(){
        this.myX = 0;
        this.myY = 0;
        myDiameter = 100.0;
    }

    public Circle(double myX, double myY) {
        this.myX = myX;
        this.myY = myY;
        myDiameter = 100.0;
    }

    public double getMyX() {
        return myX;
    }

    public void setMyX(double myX) {
        this.myX = myX;
    }

    public double getMyY() {
        return myY;
    }

    public void setMyY(double myY) {
        this.myY = myY;
    }

    public double getMyDiameter() {
        return myDiameter;
    }

    public void setMyDiameter(double myDiameter) {
        this.myDiameter = myDiameter;
    }

    public double calculatedDiameter() throws NegativeDiameterException {
        myDiameter = (Math.sqrt(Math.pow(myX,2) + Math.pow(myY,2))) * 2;
        if(myDiameter < 0){
            throw new NegativeDiameterException();
        }else{
            return myDiameter;
        }
    }
}
