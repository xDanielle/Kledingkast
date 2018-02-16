package com.capgemini;

public class Wardrobe implements IWardrobe {


    private EMaterial material;

    private EState doorState;

    private boolean isBroken;

    private int amountOfClothes;

    private int personsHiding;


    public Wardrobe(EState doorState, EMaterial material, int amountOfClothes) {
        this.doorState = doorState;
        this.material = material;
        this.amountOfClothes = amountOfClothes;
    }


    public void addItemToWardrobe() {
        this.amountOfClothes += 1;
        System.out.println("Your wardrobe now contains: " + this.amountOfClothes + " items of clothing.");
    }

    public void removeItemFromWardrobe() {
        this.amountOfClothes -= 1;
        System.out.println("Your wardrobe now contains: " + this.amountOfClothes + " items of clothing.");
    }


    public void checkInsideOfWardrobe() {
        System.out.println("The amount of clothes in the wardrobe is: " + this.amountOfClothes);
    }

    public void personGoesOut() {

    }




    // Getters & setters
    public EMaterial getMaterial() {
        return material;
    }

    public void setMaterial(EMaterial material) {
        this.material = material;
    }

    public EState getDoorState(EState closed) {
        return doorState;
    }

    public void setDoorState(EState doorState) {
        this.doorState = doorState;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public int getAmountOfClothes() {
        return amountOfClothes;
    }

    public void setAmountOfClothes(int amountOfClothes) {
        this.amountOfClothes = amountOfClothes;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "material=" + material +
                ", doorState=" + doorState +
                ", isBroken=" + isBroken +
                ", amountOfClothes=" + amountOfClothes +
                '}';
    }
}


