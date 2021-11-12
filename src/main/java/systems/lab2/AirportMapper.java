package systems.lab2;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportMapper extends Mapper<LongWritable, Text, AirportIdWritableComparable, Text> {

    private static final int INDICATOR = 0;
    private static final String DELIMITER = "\",\"";
    private static final 
    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, AirportIdWritableComparable, Text>.Context context) throws IOException, InterruptedException {
        //super.map(key, value, context);
        //System.out.println("v " + value);
        String[] airportInfo = value.toString().split(DELIMITER);


    }
}
