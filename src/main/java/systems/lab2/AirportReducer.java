package systems.lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AirportReducer extends Reducer<AirportIdWritableComparable, Text, Text, Text> {

    @Override
    protected void reduce(AirportIdWritableComparable key, Iterable<Text> values, Reducer<AirportIdWritableComparable, Text, Text, Text>.Context context) throws IOException, InterruptedException {
        Iterator<Text> iterator = values.iterator();
        Text airportName = iterator.next();

        float min = Float.MAX_VALUE;
        float max = 0;
        float sum = 0;
        int counter = 0;

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            float delay = Float.parseFloat(iterator.next().toString());
            if (delay < min) min = delay;
            if (delay > max) max = delay;
            sum += delay;
            counter++;
        }
    }
}
