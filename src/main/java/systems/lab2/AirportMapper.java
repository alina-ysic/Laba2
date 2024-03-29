package systems.lab2;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportMapper extends Mapper<LongWritable, Text, AirportIdWritableComparable, Text> {

    private static final int INDICATOR = 0;
    private static final String DELIMITER_COMMA = ",";
    private static final String DELIMITER_QUOTE = "\"";
    private static final int CODE_POS = 0;
    private static final int DESCRIPTION_POS = 1;
    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, AirportIdWritableComparable, Text>.Context context) throws IOException, InterruptedException {
        String[] airportInfo = value.toString().replace(DELIMITER_QUOTE, "").split(DELIMITER_COMMA);
        if (key.get() != 0) {
            int airportId = Integer.parseInt(airportInfo[CODE_POS]);
            String airportName = airportInfo[DESCRIPTION_POS];
            context.write(new AirportIdWritableComparable(airportId, INDICATOR), new Text(airportName));
        }
    }
}
