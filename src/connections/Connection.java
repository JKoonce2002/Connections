package connections;

public class Connection {
	private String[][] groups;
	private String[] groupNames;
	
	public Connection(String[][] groups, String[] groupNames) {
		this.groups = groups;
		this.groupNames = groupNames;
	}
	
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
		return answer;
	}
	
	public String[] getGroup(int group) {
		return this.groups[group];
	}
	
	public String getGroupName(int group) {
		return this.groupNames[group];
	}
	
	public void export() {
		
	}
}
