package BridgeImplementation.src;

import java.awt.*;
import java.awt.event.TextEvent;

public abstract class AbstractMakeTea {

    protected ITea itea;
    protected TeaType teaType;
    protected String sweetener;

    public AbstractMakeTea(ITea itea, TeaType teaType, String sweetener){
        this.teaType = teaType;
        this.sweetener = sweetener;
        this.itea = itea;
    }
    public void setTeaType(TeaType teaType){
        this.teaType = teaType;
    }
    public void setSweetener(String sweetener){
        this.sweetener = sweetener;
    }
    public TeaType getTeaType(){
        return teaType;
    }
    public String show(){
        return teaType + " " + sweetener;
    }
    public abstract void create();
}
