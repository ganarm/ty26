
class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}


class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) throws InvalidDateException {
        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid date");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private boolean isValidDate(int day, int month, int year) {
        if (year < 0) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > getMaxDaysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    private int getMaxDaysInMonth(int month, int year) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };


        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month - 1];
    }
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public void displayDate() {
        System.out.printf("%02d %02d %04d%n", day, month, year);
    }
    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                System.out.println("Usage: java MyDate <day> <month> <year>");
                return;
            }

            int day = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            int year = Integer.parseInt(args[2]);

            MyDate date = new MyDate(day, month, year);

            System.out.println("Valid date:");
            date.displayDate();
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter integers for day, month, and year.");
        } catch (InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

