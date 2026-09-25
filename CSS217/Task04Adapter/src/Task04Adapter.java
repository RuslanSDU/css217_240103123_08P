import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;

public class Task04Adapter implements IModernCalendar {

    private final LegacyClock clock;
    public Task04Adapter(LegacyClock clock) {
        this.clock = clock;
    }

    public LocalDate getCurrentDate() {
        long epochSeconds = clock.getEpochSeconds();

        return Instant.ofEpochSecond(epochSeconds)
                .atZone(ZoneOffset.UTC)
                .toLocalDate();
    }
}