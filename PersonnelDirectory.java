import java.util.Scanner;

public class PersonnelDirectory {

	public static void main(String[] args) {
		PersonnelFactory factory = new PersonnelFactory();
		Personnel per = new Personnel();
		//totalObjects total = new totalObjects();
		totalObjects total = totalObjects.getInstance();
		Scanner scan = new Scanner(System.in);
		String firstN, lastN, middleN;
		int empID;
		double salary;
		int choice = -1;
		String personnelType;

		do {

			System.out.println("Welcome to the Personnel Directory Management System");
			System.out.println("====================================================");

			System.out.println("\n\n\t 1. Add Personel");
			System.out.println("\n\t 2. Find Personel");
			System.out.println("\n\t 3. Print Names");
			System.out.println("\n\t 4. Number of Entries in the Directory");

			System.out.println("\n\t Select one of the options above (1, 2, 3, 4)");
			choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {
				case 1:
					System.out.println("Enter first name: ");
					firstN = scan.nextLine();
					System.out.println("Enter last name: ");
					lastN = scan.nextLine();
					System.out.println("Enter middle name: ");
					middleN = scan.nextLine();

					System.out.println("Enter employe id : ");
					empID = scan.nextInt();
					System.out.println("Enter base salary");
					salary = scan.nextDouble();
					scan.nextLine();

					System.out.println("Enter personnel type (employee/executives/security/volunteers) :");
					personnelType = scan.nextLine();

					//Employee e1 = new Employee(lastN, firstN, middleN, empID, salary);
					Person p0 = factory.createPersonnel(personnelType, lastN, firstN, middleN, empID, salary);
					per.addPersonnel(p0);
					total.objectAdded();

					break;

				case 2:

					System.out.println("Enter first name : ");
					firstN = scan.nextLine();

					System.out.println("Enter last name : ");
					lastN = scan.nextLine();

					boolean found = false;
					int loc = -1;
					for (int i = 0; i < per.getPersonListSize(); i++) {
						if (per.getPersonList().get(i).getFirst().equals(firstN) && per.getPersonList().get(i).getLast().equals(lastN)) {
							found = true;
							loc = i;
						}
					}

					if (found) {
						System.out.println("Found");
						per.getPersonList().get(loc).printFirstMiddleLast();

					} else {
						System.out.println("not found");
						//Person p1 = new Person(lastN, firstN, " ");
						Person p1 = factory.createPersonnel("person", lastN, firstN, " ", 0, 0); 
						per.addPersonnel(p1);
						total.objectAdded();
					}

					break;

				case 3:

					System.out.println(
							"Enter the order 0: first, middle,  last, 1: first, last, middle, 2: last, first , middle ");
					int order = scan.nextInt();
					for (int i = 0; i < per.getPersonListSize(); i++) {

						switch (order) {
							case 0: 
								per.getPersonList().get(i).printFirstMiddleLast();
								break;
							case 1: 
								per.getPersonList().get(i).printLastMiddleFirst();
								break;
							case 2: 
								per.getPersonList().get(i).printLastFirstMiddle();
								break;
						}
					}

					break;

				case 4:
					System.out.println("Total Entries : " + total.getTotalObjects());

					break;

			}

		} while (true);

	}

}