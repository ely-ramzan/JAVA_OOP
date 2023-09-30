public class Date {
    private int year;
    private int month;
    private int day;

    Date (int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public String toString(){
        String date = String.format("%d/%d/%d",day,month,year);
        return date;
    }
    public  Date checkRecent (Date obj1,Date obj2){
        if(obj1.getMonth() > obj2.getMonth())
            return obj1;
        else
            return obj2;
    } 
}
