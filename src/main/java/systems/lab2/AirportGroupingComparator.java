package systems.lab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AirportGroupingComparator extends WritableComparator {

    public AirportGroupingComparator() {
        super(AirportIdWritableComparable.class, true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        System.out.println("COMP EEE");
        int airportId1 = ((AirportIdWritableComparable) a).getAirportId();
        int airportId2 = ((AirportIdWritableComparable) b).getAirportId();
        return Integer.compare(airportId1, airportId2);
    }
}
