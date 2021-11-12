package systems.lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AirportReducer extends Reducer{

    @Override
    protected void reduce(Object key, Iterable values, Context context) throws IOException, InterruptedException {
        System.out.println(key);

        for (Text value : (Iterable<Text>) values) {
            System.out.println(value);
        }
    }
}
