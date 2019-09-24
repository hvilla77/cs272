package cs272;

import java.io.*;
import java.util.*;

public class EmployeeFileOp {
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//calls the read function
		ArrayList<String> dataset = new ArrayList<>();
		String csvfile = "/home/hvilla77/Documents/core_dataset.csv";
		
		//calls the write function
		dataset = readFunc(dataset,csvfile);
		write(dataset,"young_employee.csv");
	}
	
	//start of the read function
	public static ArrayList<String> readFunc(ArrayList<String> dataset, String filename) {
		String line = "";
		int count = 0;
		//reads csv file
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			while((line = br.readLine()) != null) {
				String [] fileline = line.split(",");
				if(fileline.length > 5) {
					if(count == 0) {
						line = fileline[0] + "," + fileline[1] + "," + fileline[2] + "," + 									fileline[3] + "," + fileline[4] + "," + fileline[5] + "," + 								fileline[6];
						dataset.add(line);
					} else {
						line = fileline[0] + "," + fileline[1] + "," + fileline[2] + "," + 									fileline[3] + "," + fileline[4] + "," + fileline[5] + "," 									+ fileline[6] + "," + fileline[7];
						dataset.add(line);
					}
				}
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dataset;	
	 
	}//end of read function
	
	//start of the write function
	public static void write(ArrayList<String> dataset, String filename) {
		int count = 0;
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
			for(String s: dataset) {
				String [] line = s.split(",");
				if(count == 0) {
					bw.write(s + "\n");
					count++;
				} else {
					if(Integer.parseInt(line[6]) <= 30) {
						bw.write(s + "\n");
					} 
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//end of write function
	
} //End Class
		
