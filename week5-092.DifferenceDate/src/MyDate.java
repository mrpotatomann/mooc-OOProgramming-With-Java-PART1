public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate){
       MyDate newmydate = new MyDate(comparedDate.day,comparedDate.month,comparedDate.year);
       int compared = newmydate.day + (newmydate.month-1)*30 + newmydate.year*360;
       int mydate = this.day + (this.month-1)*30 + this.year*360;
       int differenceInYears = (mydate - compared)/360;
       return Math.abs(differenceInYears);
        
     
    }


}
