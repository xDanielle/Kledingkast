package com.capgemini;

import java.util.Random;

public class Protagonist {

    private String name;

    private int power;

    private boolean inNarnia;


    public Protagonist(String name, int power) {
        this.name = name;
        this.power = power;
    }

    // Protagonist schopt 1:3 kans dat mis gaat
    public void kickWardrobe(Wardrobe wardrobe) throws InterruptedException {
        // probability of 1/3 that wardrobe breaks
        boolean wardrobeDestroyer = new Random().nextInt(3) == 0;
        boolean getCaught = new Random().nextInt(5) == 0;
        if (wardrobeDestroyer) {
            System.out.println("You broke your wardrobe");
            wardrobe.setBroken(true);
        } else {
            System.out.println("Try again, you are not kicking hard enough, or just unlucky...");
        }
        if (getCaught) {
            System.out.println("Shit, you've been caught by the housekeeper, wait 10 seconds..");
            Thread.sleep(10000);
        } else {
            System.out.println("Yay, you didn't get caught");
        }
    }

    // Protagonist opent deur van de kast
    public void openWardrobe(Wardrobe wardrobe) {

        if (wardrobe.isBroken()) {
            System.out.println("You can't open a broken wardrobe! Try to fix it first...");
        } else if (wardrobe.getDoorState(EState.CLOSED) == EState.OPEN) {
            System.out.println("Your wardrobe is already open! :)");
        } else {
            wardrobe.setDoorState(EState.OPEN);
            System.out.println("You opened your wardrobe");
        }
    }

    public void fixWardrobe(Wardrobe wardrobe) {
        wardrobe.setBroken(false);
        System.out.println("you fixed your wardrobe!");
    }

    // Protagonist hides in closet and maybe transports to Narnia
    public void hideInWardrobe(Wardrobe wardrobe) {
        System.out.println("You hid in the wardrobe");
        boolean teleportToNarnia = new Random().nextInt(10) == 0;
        // 1 : 10 chance that the person goes to Narnia OMG
        if (teleportToNarnia) {
            System.out.println("*VAVAM* You magically transported to Narnia ");
            attackWitch(wardrobe);
        } else {
            hideInWardrobe(wardrobe);
        }
    }

    public void attackWitch(Wardrobe wardrobe){
        System.out.println("Oh no! The witch is coming at you! Attack now or die!");
        int strength = (100 / this.power);
        boolean defeatWitch = new Random().nextInt( strength) == 0;
        if (!defeatWitch) {
            this.power++;
            System.out.println("Ah no, you've been defeated!");
            hideInWardrobe(wardrobe);

        } else {
            System.out.println("Congratulations you've defeated the witch! You can now talk to Aslan");
            talkToAslan();
        }
    }




    // Protagonist talks to Aslan (if witch is defeated)
    public void talkToAslan() {
        System.out.println(
                "  \u001B[31m[41m.u:o. -c:o.  ex::u.    .czeez* .edB$ e@$$eu\n" +
                "  e$MMMMMNu^$MMMb.#BMMM$c $MMM8P.d$RM$F4RMMMMMMRb\n" +
                "A$MMMMMMMMRb^$MMMMb^$MMMP MMMMF4$MMM8\"dRMMMMMMMMMN\n" +
                "zMM8M***M$8M$.#8MMM$.$8M&J$M$%$RMM8*.$R8$#\"\"\"\"\"BMM\n" +
                "$$\".e@Rmu.\033[0m\033[1;95m \"*M\"    '    ^^             .o$$RMM$c'$\n" +
                "$.$RMMMMMM$$$$ dRRRRRRRRRR$$MMMMMMRL'$$RMMMMMMMM$.\n" +
                ".$MMMMMMMMM$\" $RMMMMMMMMMMMMMMMMMMMMb ^4$MMMMMMMM$\n" +
                "JMMMM$$**\" ..$MMMMMMMMMMMMMMMMMMMMMMM$.:c  \"***$MM\n" +
                "$M\"..oenR$\".$MMMMMMMMMMMMMMMMMMMMMMMMM$.*$$MMMRc.*\n" +
                "* d$MMMM$\033[0m\033[1;96m \"u$MMMMMMMMMMMMMMMMMMMMMMMMM8MRc\"$MMMMM$b\n" +
                ".$RMMM$# J$MF       \"MMMMMMMMM   .....4M$b \"$MMMM$\n" +
                "dMM8P\"  dMMM$ $M8P4 4MMMMMMMMM 'L\"$M$ JMMMF  \"*88M\n" +
                "$$P\\d$$ $MMMM$L..d$r4MMMMMMMMM <$$u.e$RMMMF $M$c\"$\n" +
                "$ zRMM& \033[1;91m^8MMMMMMMMMF'MMMMMMMMM 4MMMMMMMMMG  $MMM$r\n" +
                " $RMMMF$f)MMMMMMMMMF'MMMMMMMMM 4MMMMMMMMMF.$'$MMMM\n" +
                "'MMM$FJR$ $MMMMMMMMF4MMMMMMMMM 4MMMMMMMM$ $Rh^$MMM\n" +
                "AMM8\\dRMMF RMMMMMMM 4MMMMMMMMM  MMMMMMM$\".MMMRb$MM\n" +
                "AM$.$MMMMF.3MMMM$P*-'*********- \"*NMMMM*..RMMMM$'$\n" +
                "AP.\033[1;95m$RMMM$:$ $M$\".oM$.'$RRRRR$\".d$5u'*M$ $$?RMMMM$'\n" +
                "$ $MMMM$\\$Rb'P eMMMMM$c\"$M8# dRMMMMRc\"F4MMb^$MMMMb\n" +
                " $RMMMPzRMM!  eRMMMMMMR$c\" dRMMMMMMMR  'MMMR.?$MM$\n" +
                " $M8$ $MMMM\"x $MMMMMMMMMM ?MMMMMMMMM$ 3'$MMM$b'$MM\n" +
                "ARM$.$RMMMP $$'BMMMMMMMMM 4MMMMMMMM8P4$$ $MMMM$.$M\n" +
                "A$F4RMMMMf $RM  *88MMM88M J8MM888$$\\ @MMMr5MMMM$.$\n" +
                " \033[1;91m$ $RMM8P.$MMMF?b.                z$F$MMMMc3BMMM$'\n" +
                "  4MMMM$-$RMM8F4MM$ '8MMMMMMMM$ dRMM$#8MMM$r#8MMM.\n" +
                "  4MMM$.$MMMM$ RMMM$ 3MMMM$ 8MMM\n" +
                "   $MM$'MMMMP zRMMM$ .'**4P*\".$ $MMMM$'$MMMM $MM$\n" +
                "   4MMC'MMMM$:$MMMMPoM$b   .@$M$$MMMMRL^$MMMF$M8\n" +
                "    \"$$'MMM$\\$MMMM$ MMMM$.4RMMM$r$MMMMRr*MMMN$$\"\n" +
                "     'N'$MM$4$MMMMF$MMMMM$$RMMMM$4$MMMM$$MMM @\n" +
                "        #$MN4MMMMMF$MMMMM$#MMMMMM RMMMM$$M$F\n" +
                "         ?$$.$MMMMF$MMMMMF RMMMMM $MMMM\\$MP\n" +
                "           *$'$MMMb3MMMMM  RMMMMNJRMMNFJ*\n" +
                " KonFucius     #88$L#8MMMr RMMM$z$M8$\"\n" +
                "                 ^*$P/*B8$$R8M\"zP*\"\n");
    }

    public void closeWardrobe(Wardrobe wardrobe) {
        wardrobe.getDoorState(EState.CLOSED);
        System.out.println("You closed your wardrobe");
    }

    @Override
    public String toString() {
        return "Protagonist{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}

