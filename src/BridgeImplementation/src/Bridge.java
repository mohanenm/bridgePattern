package BridgeImplementation.src;

import java.awt.*;
import BridgeImplementation.src.making.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Bridge {


    public static void main(String[] args) {
        int choice = 1;


        if(choice == 1)
        {
            AbstractMakeTea AbstractMakeTea= new MakeTea(TeaType.Chamomile
                    , new Making(), "stevia");

            AbstractMakeTea.create();
            System.out.println(AbstractMakeTea.show());
        }
        else
        {
            AbstractMakeTea abstractMakeTea = new MakeTea(TeaType.error
                    , new Making(), "Error");

            abstractMakeTea.create();
            System.out.println(abstractMakeTea.show());
        }

    }

    }
