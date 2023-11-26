import java.math.BigDecimal;
import java.util.Date;

public class Ticket {
    private BigDecimal price;
    private Date date;
    private int startZone;
    private int finishZone;
    private boolean isLuggage;
    private int place;
    private int readNumber;
    
    public Ticket(BigDecimal price, Date date, int startZone, int finishZone, boolean isLuggage, int place,
            int readNumber) {
        this.price = price;
        this.date = date;
        this.startZone = startZone;
        this.finishZone = finishZone;
        this.isLuggage = isLuggage;
        this.place = place;
        this.readNumber = readNumber;
    }

}
