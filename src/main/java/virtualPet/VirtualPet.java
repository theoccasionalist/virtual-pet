package virtualPet;

public class VirtualPet {
	private int malaise;
	private int poop;
	private int hunger;
	private int optimism;

	public VirtualPet(int malaise, int poop, int hunger, int optimism) {
		this.malaise = malaise;
		this.poop = poop;
		this.hunger = hunger;
		this.optimism = optimism;
	}

	public int getMalaise() {
		return malaise;
	}

	public int getPoop() {
		return poop;
	}

	public int getHunger() {
		return hunger;
	}

	public int getOptimism() {
		return optimism;
	}

	public void petTherapy() {
		malaise--;
		optimism++;
	}

	public void petPoop() {
		poop--;
		hunger++;
	}

	public void petEat() {
		poop++;
		hunger--;
	}

	public void petMingle() {
		malaise++;
		optimism--;
	}

	public void printStats() {
		System.out.println("\nTime has passed. Stats are now:" + "\n\nMalaise: " + malaise + "\nPoop: " + poop
				+ "\nHunger: " + hunger + "\nOptimism: " + optimism + "\n");
	}

	public void tick() {
		malaise = malaise + 2;
		poop = poop + 2;
		hunger = hunger + 2;
		optimism = optimism - 2;
	}
}
