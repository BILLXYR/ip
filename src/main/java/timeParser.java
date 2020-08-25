
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class timeParser {

    private String inputTime;

    /**
     * Contructor for a time parser object.
     * @param inputTime input time from the user.
     */
    public timeParser(String inputTime) {
        this.inputTime = inputTime;
    }

    /**
     * Return the converted time form of the task.
     */
    public String timeConverter() {
        LocalDateTime localDateTime = LocalDateTime.parse(inputTime,DateTimeFormatter.ofPattern("dd/MM/yyyy HHmm"));
        return localDateTime.format(DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm a"));
    }
}
