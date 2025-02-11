
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void advance() {
        if (day == 30) {
            day = 1;
            month += 1;
            if (month > 12) {
                year += 1;
                month = 1;
            }
        } else {
            day += 1;
        }
    }
    
    public void advance(int howManyDays) {
        day += howManyDays;
        while (day > 30) {   
            int remainder = day - 30;
            month += 1;
            if (month > 12) {
                year += 1;
                month = 1;
            }
            day = remainder;
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        
        newDate.advance(days);
        
        return newDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
