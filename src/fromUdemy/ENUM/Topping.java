package fromUdemy.ENUM;

public enum Topping {
    CHEDDAR,
    BACON,
    TOMATO,
    PRICKLES;

    public double getPrice() {
        return switch (this) {
            case BACON -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };
    }
}
