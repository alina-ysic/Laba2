package systems.lab2;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, AirportIdWritableComparable, Text> {

    private static final int INDICATOR = 1;
    private static final String DELIMITER_COMMA = ",";
    private static final String DELIMITER = "\"";
    private static final int CODE_POS = 14;
    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, AirportIdWritableComparable, Text>.Context context) throws IOException, InterruptedException {
        //super.map(key, value, context);
        System.out.println(value);
    }
}
