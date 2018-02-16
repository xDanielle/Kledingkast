package com.capgemini;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Wardrobe!");
        Wardrobe wardrobe1 = new Wardrobe(EState.CLOSED, EMaterial.WOOD, 20);
        Protagonist protagonist1 = new Protagonist("Elizabeth", 1);

//        try {
//            protagonist1.kickWardrobe(wardrobe1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //protagonist1.openWardrobe(wardrobe1);
        protagonist1.hideInWardrobe(wardrobe1);
        System.out.println(protagonist1);

        //protagonist1.talkToAslan();


    }
}
