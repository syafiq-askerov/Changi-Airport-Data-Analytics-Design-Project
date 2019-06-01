import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class datageneration {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		
		Date currentTime = new Date();
		DateFormat logFileFormatter = new SimpleDateFormat("yyyy-MM-dd_HH");
		String startFileTime = logFileFormatter.format(currentTime);
		
		String fileName = "logs" + startFileTime + ".log";
		PrintStream p = new PrintStream(new File("C:\\Users\\syafiq\\Documents\\test\\" + fileName));
		
		System.setOut(p);
		int min = 1;
		int max = 4;
		int Passengermin =100;
		int Passengermax =10000;


		// what's part of the log
		String randomStr1 = "";
		String randomStr2 = "";
		String randomStr3 = "";
		
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
			//amount of flight delays
			int randomTime1 = ThreadLocalRandom.current().nextInt(min, max + 1);
			//terminal 1 passenger amount
			int randomTime2 = ThreadLocalRandom.current().nextInt(Passengermin, Passengermax + 1);
			//terminal 2 passenger amount
			int randomTime3 = ThreadLocalRandom.current().nextInt(Passengermin, Passengermax + 1);
			//terminal 3 passenger amount
			int randomTime4 = ThreadLocalRandom.current().nextInt(Passengermin, Passengermax + 1);
			//terminal 4 passenger amount
			int randomTime5 = ThreadLocalRandom.current().nextInt(Passengermin, Passengermax + 1);
	
			randomStr1 = currentDateStr + "| Delay type: Security Delay" + "| Number of flight delays: " + randomTime1 + "| Passenger Population Terminal 1: " + randomTime2 +
			"| Passenger Population Terminal 2: " + randomTime3 + "| Passenger Population Terminal 3: " + randomTime4 + "| Passenger Population Terminal 4: " + randomTime5 ;
			randomStr2 = currentDateStr + "| Delay type: Weather Delay" + "| Number of flight delays: " + randomTime1 + "| Passenger Population Terminal 1: " + randomTime2 +
			"| Passenger Population Terminal 2: " + randomTime3 + "| Passenger Population Terminal 3: " + randomTime4 + "| Passenger Population Terminal 4: " + randomTime5 ;
			randomStr3 = currentDateStr + "| Delay type: Cargo Delay" + "| Number of flight delays: " + randomTime1 + "| Passenger Population Terminal 1: " + randomTime2 +
			"| Passenger Population Terminal 2: " + randomTime3 + "| Passenger Population Terminal 3: " + randomTime4 + "| Passenger Population Terminal 4: " + randomTime5 ;;
			System.out.println(randomStr1);
			System.out.println(randomStr2);
			System.out.println(randomStr3);

			Thread.sleep((long)(Math.random() * 5000));
		}
	}

}
