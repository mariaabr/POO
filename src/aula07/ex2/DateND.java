// package aula07.ex2;

// import java.time.LocalDate;
// import java.time.temporal.ChronoUnit;

// public class DateND extends Date{
//     int day, month, year;
//     int datenow;
//     long datend;

//     public DateND(int year, int month, int day) {
//         LocalDate setdate = LocalDate.of(2000, 1, 1);
//         LocalDate datenow = LocalDate.of(year, month, day);
//         long datend = ChronoUnit.DAYS.between(setdate, datenow);
//         this.datend = datend;
//     }

//     @Override
//     public String toString() {
//         return " " + Math.abs(datend) + " days";
//     }

//     public void Increment(int increment) {
//         datend = datend + increment;
//     }

//     public void Decrement(int decrement) {
//         datend = datend - decrement;
//     }
// }
