package systems.lab2;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;

public class FlightMapper extends Mapper<LongWritable, Text, , Text> {
}
