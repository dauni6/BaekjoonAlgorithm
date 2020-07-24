package bronze5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Problem15890 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    /*    SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");*/
        Date today = new Date();
        String year = String.valueOf(today.getYear());
        String month = String.valueOf(today.getMonth() + 1);
        String day = String.valueOf(today.getDay());

        if (month.length() < 2) {
            month = "0" + month;
        }

        if (day.length() < 2) {
            day = "0" + day;
        }

       bw.write(year + month + day);
       bw.flush();


    }
}
