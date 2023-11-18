package ModelEliments;

import Stuff.Angle3D;
import Stuff.Point3D;

public class Camera {
    public Point3D location;
    public Angle3D angle;

    public Camera(){
        location = new Point3D();
        angle = new Angle3D();
    }

    public void rotate(Angle3D anyAngle){

    }

    public void move(Point3D anyLocation){
        
    }
}
