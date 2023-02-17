package Miniteste;

class DateYMD extends Date{
    
    public DateYMD(int day, int month, int year){
        super(day, month, year);
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void set(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;     
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void increment() {
        if(valid(day+1, month, year)){
            set(day+1, month, year);
        }
        else if(valid(1, month+1, year)){
            set(1, month+1, year);
        }
        else{
            set(1, 1, year+1);
        }
    }

    public void decrement() {
        if(valid(day-1, month, year)){
            set(day-1, month, year);
        }
        else if(valid(monthDays(month-1, year), month-1, year)){
            set(monthDays(month-1, year), month-1, year);
        }
        else{
            set(31, 12, year-1);
        }
    }

    

    @Override
    public String toString() {
        return this.year + "-" + this.month + "-" + this.day;
    }
}
