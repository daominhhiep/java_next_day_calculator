public class NextDayCalculator {
    public static int[] findNextDay (int day, int month, int year){
        int resultDay;
        int resultMonth;
        int resultYear;
        if (day < 28){
            resultDay = day + 1;
            resultMonth = month;
        } else {
            resultDay = 1;
            resultMonth = month + 1;
        }
        if (month < 12){
            resultYear = year;
        } else {
            resultMonth = 1;
            resultYear = year + 1;
        }
        return new int[]{resultDay, resultMonth, resultYear};
    }
}