//package logGen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class learn {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		
		Date currentTime = new Date();
		DateFormat logFileFormatter = new SimpleDateFormat("yyyy-MM-dd_HH");
		String startFileTime = logFileFormatter.format(currentTime);
		
		String fileName = "logs" + startFileTime + ".log";
		PrintStream p = new PrintStream(new File("C:\\Users\\syafiq\\Documents\\test\\" + fileName));
		
		System.setOut(p);
		int min = 1;
		int max = 10;
		
		// what's part of the log
		String randomStr1 = "";
	
		
		boolean stop = false;
		
		while (!stop) {
			Date currentDate = new Date();
			long difference = currentDate.getTime() - currentTime.getTime();
			
			// log rotation
			if (difference > 3600000) {
				String newTimeStr = logFileFormatter.format(currentDate);
				fileName = "logs" + newTimeStr + ".log";
				p = new PrintStream(new File("C:\\Users\\syafiq\\Documents\\test\\" + fileName));
				System.setOut(p);
				currentTime = currentDate;
			}
			
			
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			String currentDateStr = df.format(currentDate);
			int randomTime1 = ThreadLocalRandom.current().nextInt(min, max + 1);
		
			
			randomStr1 = currentDateStr + " Number of flight delays " + randomTime1 ;
			
			System.out.println(randomStr1);

			Thread.sleep((long)(Math.random() * 50000));
		}
	}

}