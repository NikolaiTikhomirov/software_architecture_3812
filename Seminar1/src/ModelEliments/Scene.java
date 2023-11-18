package ModelEliments;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if (models.size() > 0) {
            this.models = models;
        } 
        else {
            throw new Exception("Список моделей не должен быть пустым");
        }

        this.flashes = flashes;

        if (cameras.size() > 0) {
            this.cameras = cameras;
        } 
        else {
            throw new Exception("Список камер не должен быть пустым");
        }
    }

    public Type method1(Type something){
        return something;

    }
    
    public Type method2(Type something, Type somethingElse){
        return somethingElse;

    }
}
