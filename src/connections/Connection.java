package connections;

public class Connection {
	private String[][] groups;
	private String[] groupNames;
	
	//TODO: Figure out how to denote colors that need printing
	
	//Constructor
	public Connection(String[][] groups, String[] groupNames) {
		this.groups = groups;
		this.groupNames = groupNames;
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
	
	//TODO: Export Connection as string to be saved in file
	public void export() {
		
	}
}
