package systems.lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportPartitioner extends Partitioner<AirportIdWritableComparable, Text> {
    @Override
    public int getPartition(AirportIdWritableComparable airportIdWritableComparable, Text text, int numTask) {
        //System.out.println("PART EEE");
        return airportIdWritableComparable.getAirportId() % numTask;
    }
}
