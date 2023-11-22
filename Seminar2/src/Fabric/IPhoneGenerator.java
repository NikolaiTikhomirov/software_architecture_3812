package Fabric;

import Interface.iGameItem;
import Product.IPhone;

public class IPhoneGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new IPhone();
    }
    
}
