package Files;

/**
 * Created by Ibrahim on 2017-09-29.
 */
import java.util.*;
import java.io.*;
//Read from text log file and extract line containing string failed and sent to calculate fail percentage
public class TripReport
{
    public static void main(String args[])
    {
        File file =new File("/Users/vanhawks/Downloads/Tripdata.txt");
        Scanner in = null;
        float failedCount = 0, sentCount = 0, lineCount = 0;
        try {
            in = new Scanner(file);
            while(in.hasNext())
            {
                String line=in.nextLine();
                if(line.contains("failed")) {
                    failedCount++;
                }
                if(line.contains("sent")) {
                    sentCount++;
                }
                lineCount++;
            }
            try{
                System.out.println("Total Sent: "+sentCount);
                System.out.println("Total Failed: "+failedCount);
                System.out.println("Fail percentage: "+((failedCount/sentCount)*100)+"%");
            }catch(Exception e){
                System.out.println("Division by zero error");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }}

