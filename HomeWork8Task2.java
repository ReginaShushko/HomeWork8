package homeWork8;

import java.util.Arrays;
import java.util.Comparator;

public class HomeWork8Task2 {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        Rose rose = new Rose();
        Tulip tulip = new Tulip();
        Camomile camomile = new Camomile();

        Flower[] flowers = {rose, tulip, camomile};
        bouquet.printBouquet(flowers);
        bouquet.getBouquetPrice(flowers);
        bouquet.printBouquetColour(flowers);
        bouquet.getBouquetLifetime(flowers);
    }
}

class Flower {
    private int price;
    private String name;
    private String colour;
    private int lifetime;

    public Flower(int price, String name, String colour, int lifetime) {
        this.price = price;
        this.name = name;
        this.colour = colour;
        this.lifetime = lifetime;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getLifetime() {
        return lifetime;
    }
}

class Rose extends Flower {

    public Rose() {
        super(5, "Rose", "White", 10);
    }
}

class Clove extends Flower {

    public Clove() {
        super(2, "Clove", "Red", 9);
    }
}

class Tulip extends Flower {

    public Tulip() {
        super(3, "Tulip", "Purple", 4);
    }
}

class Lily extends Flower {

    public Lily() {
        super(5, "Lily", "Orange", 14);
    }
}

class Camomile extends Flower {

    public Camomile() {
        super(4, "Camomile", "Yellow", 7);
    }
}

class Bouquet {

//    private int[] flowers;
//
//    public int[] getFlowers() {
//        return flowers;
//    }
//
//    public void setFlowers(int[] flowers) {
//        this.flowers = flowers;
//    }

    public void getBouquetPrice(Flower[] flowers) {
        int sum = 0;
        for (Flower flower : flowers) {
            sum += flower.getPrice();
        }
        System.out.println("Total bouquet price: " + sum);
    }

    public void getBouquetLifetime(Flower[] flowers) {
        System.out.print("Bouquet lifetime: ");
        Arrays.sort(flowers, Comparator.comparing(Flower::getLifetime));
        int lastIndex = flowers.length - 1;
        for (Flower flower : flowers) {
            System.out.println(flowers[lastIndex].getLifetime());
            break;
        }
    }


    public void printBouquet(Flower[] flowers) {
        StringBuilder stringBuilder = new StringBuilder(flowers.length);
        stringBuilder.append("Chosen flowers: ");
        for (Flower flower : flowers) {
            stringBuilder.append(flower.getName());
            stringBuilder.append(" ");
        }
        stringBuilder.append(" ");
        System.out.println(stringBuilder.toString());
    }

    public void printBouquetColour(Flower[] flowers) {
        StringBuilder stringBuilder = new StringBuilder(flowers.length);
        stringBuilder.append("Colours of bouquet flowers: ");
        for (Flower flower : flowers) {
            stringBuilder.append(flower.getColour());
            stringBuilder.append(" ");
        }
        stringBuilder.append(" ");
        System.out.println(stringBuilder.toString());
    }
}

