package connections;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Connection {
	private String[][] groups;
	private String[] groupNames;
	private String name;
	private int difficulty;
	
	//TODO: Figure out how to denote colors that need printing
	
	//Constructor
	public Connection(String[][] groups, String[] groupNames, String name, int diff) {
		this.groups = groups;
		this.groupNames = groupNames;
		this.name = name;
		this.difficulty = diff;
	}
	
	//Check a guess
	public String guess(String[] guess) {
		String answer = "";
		for  (String i : guess) {
			boolean caught = false;
			
			for (int j = 0; j < groups.length; j++) { //loop for groups
				for (int k = 0; k < groups[0].length; k++) { //loop within groups
					if (i.equals(groups[j][k])) {
						//add which group to the string, then break
						answer += j;
						break;
					}
				}
				if (caught) break; //don't keep going if we already know the group
			}
		}
		//Returns a string of all numbers, each number being the index of the group one of the guesses was in
		//If it all matches, it's a correct guess. If it doesn't, sort and print the colors
		return answer; 
	}
	
	//return the members of a group
	public String[] getGroup(int group) {
		return this.groups[group];
	}
	
	//return the name of a group
	public String getGroupName(int group) {
		return this.groupNames[group];
	}
	
	//return the Connection name
	public String getName() {
		return name;
	}
	
	public int getDifficulty() {
		return difficulty;
	}
	
	//TODO: Export Connection as string to be saved in file
	public void export() {
		try {
			//Make the file writer
			FileWriter fw = new FileWriter("C:\\Users\\" + System.getProperty("user.name")+"\\Desktop\\"+this.name+".cxn");
			BufferedWriter writer = new BufferedWriter(fw);
			
			//Write the file
			//TODO: Add encryption
			writer.write(this.groupNames[0]);
			writer.newLine();
			writer.write(this.groups[0][0]+"/"+this.groups[0][1]+"/"+this.groups[0][2]+"/"+this.groups[0][3]);
			writer.newLine();
			writer.write(this.groupNames[1]);
			writer.newLine();
			writer.write(this.groups[1][0]+"/"+this.groups[1][1]+"/"+this.groups[1][2]+"/"+this.groups[1][3]);
			writer.newLine();
			writer.write(this.groupNames[2]);
			writer.newLine();
			writer.write(this.groups[2][0]+"/"+this.groups[2][1]+"/"+this.groups[2][2]+"/"+this.groups[2][3]);
			writer.newLine();
			writer.write(this.groupNames[3]);
			writer.newLine();
			writer.write(this.groups[3][0]+"/"+this.groups[3][1]+"/"+this.groups[3][2]+"/"+this.groups[3][3]);
			
			//Finish writing
			writer.close();
			
		} catch (Exception ex) {ex.printStackTrace();}
	}
}
