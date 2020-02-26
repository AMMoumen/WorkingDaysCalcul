import java.time.LocalDate;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

public class CalculateWorkDays {

    public CalculateWorkDays() {
        super();
    }

    public static int calculateWorkingDays(LocalDate startDate, LocalDate endDate) {

        int workDays = 0;

        // Return 0 if start and end are the same
        while (!startDate.isEqual(endDate)) {
            if (startDate.getDayOfWeek() != SATURDAY && startDate.getDayOfWeek() != SUNDAY) {
                ++workDays;
            }
            startDate = startDate.plusDays(1);
        }
            /* You can also loop with For :
            for (LocalDate date = startDate ; date.isBefore(endDate); date = date.plusDays(1)){
                if (date.getDayOfWeek() != SATURDAY && date.getDayOfWeek() != SUNDAY ) {
                    ++workDays;
                }
            }*/

        return workDays;
    }

}
