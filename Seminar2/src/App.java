import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.ApartmentGenerator;
import Fabric.CandiesGenerator;
import Fabric.CarGenerator;
import Fabric.ChickenGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.IPhoneGenerator;
import Fabric.ItemGenerator;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");

       List<ItemGenerator> generators = new ArrayList<>();

       generators.add(new GoldGenerator());
       generators.add(new GemGenerator());
       generators.add(new ApartmentGenerator());
       generators.add(new CandiesGenerator());
       generators.add(new CarGenerator());
       generators.add(new ChickenGenerator());
       generators.add(new IPhoneGenerator());

       Random random = ThreadLocalRandom.current();
       for (int i = 0; i < 10; i++) {
            int index = random.nextInt(generators.size());
            generators.get(index).openReward();
       }

    }
}
