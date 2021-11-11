package systems.lab2;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportIdWritableComparable implements WritableComparable<AirportIdWritableComparable> {

    private int airportId;
    private int indicator;

    public AirportIdWritableComparable(int airportId, int indicator) {
        this.airportId = airportId;
        this.indicator = indicator;
    }

    public int getAirportId() {
        return airportId;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {

    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {

    }

    @Override
    public int compareTo(AirportIdWritableComparable o) {
        return Integer.compare(this.airportId, o.airportId);
    }
}
