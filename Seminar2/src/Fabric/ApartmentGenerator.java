package Fabric;

import Interface.iGameItem;
import Product.Apartment;

public class ApartmentGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Apartment();
    }
    
}
