package chapterThree;

public class ThreePointFourteen {
    private int month;
    private int day;
    private int year;
    private String date;

    public ThreePointFourteen(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int theMonth){
        month = theMonth;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int theDay){
        day = theDay;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int theYear){
        year = theYear;
    }


    public String getDate() {
        return date;
    }

    public String todayDate(String date) {
        String toStringItem = (month + "\t\t\t" + day + "\t\t\t" + year);
        return toStringItem;
    }
}
