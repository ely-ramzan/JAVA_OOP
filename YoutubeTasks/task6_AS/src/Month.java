public enum Month {
    JANUARY(31),FEBRUARY(28),MARCH(31),APRIL(30),MAY(31),JUNE(30),JULY(31),AUGUST(31),SEPTEMBER(30),OCTOBER(31),NOVEMBER(30),DECEMBER(31);
    private int no_of_days;
    Month(int no_of_days){
        this.no_of_days = no_of_days;
    }

    public int getNo_of_days() {
        return no_of_days;
    }
}
