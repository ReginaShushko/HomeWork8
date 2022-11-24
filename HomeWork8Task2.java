package homeWork8;

public class HomeWork8Task2 {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        Rose rose = new Rose();
        Tulip tulip = new Tulip();
        Camomile camomile = new Camomile();

        Flower[] flowers = {rose, tulip, camomile};
        bouquet.addFlower(flowers);
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

    private Flower[] flowers;

    public Bouquet(Flower... flowers) {
        this.flowers = flowers;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public void addFlower(Flower[] flowers) {
        int countFlowers = flowers.length + 1;
        Flower[] addFlowers = new Flower[countFlowers];
        for (int i = 0; i < countFlowers - 1; i++) {
            addFlowers[i] = flowers[i];
            System.out.println(flowers[i].getName());
        }
    }

    public void getBouquetPrice(Flower[] flowers) {
        int sum = 0;
        for (Flower flower : flowers) {
            sum += flower.getPrice();
        }
        System.out.println("Total bouquet price: " + sum);
    }

    public Flower[] getBouquetLifetime(Flower[] flowers) {
        Flower[] bouquetLifetime = new Flower[flowers.length];
        int maxIndex = 0;
        int max = flowers[0].getLifetime();
        for (int index = 0; index < flowers.length; index++) {
            if (flowers[index].getLifetime() > max) {
                max = flowers[index].getLifetime();
                maxIndex = index;
            }
        }
        System.out.println("Bouquet lifetime: " + flowers[maxIndex].getLifetime());
        return bouquetLifetime;
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




