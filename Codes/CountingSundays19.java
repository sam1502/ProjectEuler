//1 Jan 1900 was a Monday.
//Thirty days has September,April, June and November.
//All the rest have thirty-one,
//Saving February alone,Which has twenty-eight, rain or shine.
//And on leap years, twenty-nine.
//A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
//How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?



import java.util.Calendar;
import java.util.Date;

class CountingSundays19{

public static void main(String args[]) {

	Date startDate = new Date(1901, Calendar.JANUARY, 01);
	Date endDate = new Date(2000, Calendar.DECEMBER, 31);

    checkSundays(startDate, endDate);
}

private static void checkSundays(Date start, Date end) {
    int dayNum;

    Calendar startDate = Calendar.getInstance();
    startDate.setTime(start);
    System.out.println(startDate.getTime());

    Calendar endDate = Calendar.getInstance();
    endDate.setTime(end);
    System.out.println(endDate.getTime());
    int count = 0;

    while (startDate.before(endDate)) {
        for (int i = 1; i < 13; i++) {
            dayNum = startDate.get(Calendar.DAY_OF_WEEK);
            if (dayNum == 1) {
                count++;
            }

            System.out.println(startDate.getTime());
            startDate.add(Calendar.MONTH, 1);

        }
            System.out.println("Count " + count);

    }
}
}