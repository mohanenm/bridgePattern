package BridgeImplementation.src;

import BridgeImplementation.src.AbstractMakeTea;
import BridgeImplementation.src.ITea;

public class MakeTea extends AbstractMakeTea {

    public MakeTea(TeaType teaType, ITea itea, String sweetener){
        super(itea, teaType, sweetener);
    }

    public void create() {
        itea.create();

    }
}
