package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet myPet = new VirtualPet(17, 8, 10, 3);

		System.out.println("Please name your virtual pet.");

		String petName = input.nextLine();

		System.out.println("\n" + petName + " feels the following:\n");
		System.out.println("Malaise: " + myPet.getMalaise());
		System.out.println("Poop: " + myPet.getPoop());
		System.out.println("Hunger: " + myPet.getHunger());
		System.out.println("Optimism: " + myPet.getOptimism());

		while (true) {

			System.out.println("\nPlease choose one of the following: ");

			System.out.println("1. Talk Therapy");
			System.out.println("2. Poop and/or Pee");
			System.out.println("3. Feed");
			System.out.println("4. Attend Pet Mingle");
			System.out.println("5. Quit");

			String enteredAction = input.nextLine();

			if (enteredAction.trim().contains("1")) {
				myPet.petTherapy();
				System.out.println("\n" + petName + " had a life affirming talk with Dr. Katz.\n");
				System.out.println("Malaise down one.");
				System.out.println("Optimism up one.");
				myPet.printStats();
			}

			if (enteredAction.trim().contains("2")) {
				myPet.petPoop();
				System.out.println("\n" + petName + " relieved itself in private.\n");
				System.out.println("Poop down one.");
				System.out.println("Hunger up one.");
				myPet.printStats();
			}

			if (enteredAction.trim().contains("3")) {
				myPet.petEat();
				System.out.println("\n" + petName + " consumed food in public.\n");
				System.out.println("Hunger down one.");
				System.out.println("Poop up one.");
				myPet.printStats();
			}

			if (enteredAction.trim().contains("4")) {
				myPet.petMingle();
				System.out.println("\n" + petName + " attended Columbus pet mingle.\n");
				System.out.println("Malaise up one.");
				System.out.println("Optimism down one.");
				myPet.printStats();
			}

			if (enteredAction.trim().contains("5")) {
				System.out.println("\nPet abandoned.\nToday " + petName + " learned the true meaning of love.");
				System.exit(0);
			}

			myPet.tick();
		}
	}
}
