

///i use this enum class to define by products to that will be in the machine

public enum Products {
    CANDY(1,10), SODA(2,15), WATER(3,5), MEALDEAL(4,20);

    private int id;
    private int price;

    Products(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}
