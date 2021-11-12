package systems.lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AirportReducer extends Reducer<AirportIdWritableComparable, Text, Text, Text> {

    @Override
    protected void reduce(AirportIdWritableComparable key, Iterable<Text> values, Reducer<AirportIdWritableComparable, Text, Text, Text>.Context context) throws IOException, InterruptedException {
        int airportId = key.getAirportId();
        Iterator<Text> iterator = values.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
