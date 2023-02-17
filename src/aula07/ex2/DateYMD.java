// package aula07.ex2;

// public class DateYMD extends Date {
//     public int day, month, year;

//     public void setDate(int year, int month, int day ) {
//         this.year = year;
//         this.month = month;
//         this.day = day;
//     }

//     @Override
//     public String toString() {
//         return getYear() + "-" + getMonth() + "-" + getDay();
//     }

//     public void Increment(int increment) {
//         for (int count = 1; count <= increment; count++) {
//             if (getDay() + 1 > monthDays(getMonth(), getYear()) && getMonth() == 12) {
//                 this.year = getYear()+1;
//                 this.month = 1;
//                 this.day = 1;
//                 count++;
//             } else if (getMonth() != 12 && getDay() + 1 > monthDays(getMonth(), getYear())) {
//                 this.day = 1;
//                 this.month = getMonth()+1;
//                 count++;
//             } else
//                 this.day = getDay()+1;
//         }
//     }

//     public void Decrement(int decrement) {
//         for (int count = 1; count <= decrement; count++) {
//             if (getDay() - 1 <= 0 && getMonth() == 1) {
//                 this.year = getYear()-1;
//                 this.month = 12;
//                 this.day = monthDays(getMonth(), getYear());
//                 count++;
//             } else if (getMonth() != 1 && getDay() - 1 <= 0) {
//                 this.day = monthDays(getMonth() - 1, getYear());
//                 this.month = getMonth()-1;
//                 count++;
//             } else
//             this.day = getDay()-1;
//         }
//     }
// }
