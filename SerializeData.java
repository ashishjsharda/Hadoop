import org.apache.hadoop.io.IntWritable;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Serialize Data in Hadoop
 * @author ashish
 */
public class SerializeData {

    public byte[] serialize(int num) throws IOException {
        IntWritable intWritable=new IntWritable(num);
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        DataOutputStream dataOutputStream=new DataOutputStream(byteArrayOutputStream);
        intWritable.write(dataOutputStream);
        byte []byteArray=byteArrayOutputStream.toByteArray();
        if(dataOutputStream!=null) {
            dataOutputStream.close();
        }
        return byteArray;
    }
    public static void main(String[] args) throws IOException {
        SerializeData serializeData=new SerializeData();
        System.out.println(serializeData.serialize(20));


    }
}
