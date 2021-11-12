package systems.lab2;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, AirportIdWritableComparable, Text> {

    private static final int INDICATOR = 1;
    private static final String DELIMITER_COMMA = ",";
    private static final String DELIMITER_QUOTE = "\"";
    private static final int CODE_POS = 14;
    private static final int DELAY_POS = 18;
    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, AirportIdWritableComparable, Text>.Context context) throws IOException, InterruptedException {
        //super.map(key, value, context);
        System.out.println(value);
        String[] flightInfo = value.toString().replace(DELIMITER_QUOTE, "").split(DELIMITER_COMMA);
        int airportId = Integer.parse(flightInfo[CODE_POS]);
        String delay = flightInfo[DELAY_POS];
        if (Float.parseFloat(delay) == 0) return;
        context.write(new AirportIdWritableComparable(airportId, INDICATOR), new Text(delay));
    }
}
