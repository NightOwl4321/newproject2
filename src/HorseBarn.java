
public class HorseBarn {
	private static Horse[] spaces;

	public static void main(String[] args) {
		HorseBarn hb = new HorseBarn();
		hb.createHorseBarn();
	}

	public void createHorseBarn() {
		spaces = new Horse[7];
		spaces[0] = new horseimpl("Trigger", 1340);
		spaces[1] = null;
		spaces[2] = new horseimpl("Silver", 1210);
		spaces[3] = new horseimpl("Lady", 1575);
		spaces[4] = null;
		spaces[5] = new horseimpl("Patches", 1350);
		spaces[6] = new horseimpl("Duke", 1410);
	}

	public int findHorseSpace(String name) {
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] != null) {
				if (spaces[i].getName() == name) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public void consolidate() {
		int numHorses = 0;
		for(int i = 0; i < spaces.length; i++) {
			if(spaces[i] != null) {
				numHorses++;
			}
		}
		Horse[] consolidated = new Horse[numHorses];
		int horsesAdded = 0;
		
		for(int j = 0; j < spaces.length; j++) {
			if(spaces[j] != null) {
				consolidated[horsesAdded] = spaces[j];
			}
		}
		
		spaces = consolidated;
		
	}

	public Horse[] getSpaces() {
		return spaces;
	}

}


