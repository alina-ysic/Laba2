package systems.lab2;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportIdWritableComparable extends WritableComparable<> {

    private int airportId;
    private int indicator;

    public AirportIdWritableComparable(int airportId, int indicator) {
        this.airportId = airportId;
        this.indicator = indicator;
    }

    @Override
    public int compareTo(Object o) {
        if (this.getClass() != o.getClass()) return 0;
        return (this.airportId == o.airportId && this.indicator == o.indicator);
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {

    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {

    }
}
