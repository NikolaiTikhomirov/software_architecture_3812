import java.util.List;

public class BusRoute {
    private int id;
    private String remark;
    private int capacity;
    private List<BusStop> busStop;

    public BusRoute(int id, String remark, int capacity, List<BusStop> busStop) {
        this.id = id;
        this.remark = remark;
        this.capacity = capacity;
        this.busStop = busStop;
    }
    
}
