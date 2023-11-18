package ModelEliments;

import Stuff.Angle3D;
import Stuff.Point3D;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public java.awt.Color color;
    public float power;

    public Flash(){
        location = new Point3D();
        angle = new Angle3D();
        color  = new java.awt.Color(255, 255, 255);
        power = 10;
    }

    public void rotate(Angle3D anyAngle){

    }

    public void move(Point3D anyLocation){
        
    }
    
}
