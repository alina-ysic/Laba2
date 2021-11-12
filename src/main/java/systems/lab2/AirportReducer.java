package systems.lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AirportReducer extends Reducer{

    @Override
    protected void reduce(Object key, Iterable values, Context context) throws IOException, InterruptedException {
        System.out.println(key);
        Iterator<Text> iterator = values.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
