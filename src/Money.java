

///I use this enum class to store the values of the amounts
//of money that can be put into the machine

public enum Money {
    ONE_P(1), TWO_P(2), THREE_P(3), FOUR_P(4), FIVE_P(5);

    private int value;

    Money(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
