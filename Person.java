public class Person{
	private String last;
	private String first;
	private String middle;


	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;

	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	public String getMiddle() {
		return middle;
	}

	public void setFirst(String newFirst) {
		this.first = newFirst;
	}

	public void setLast(String newLast) {
		this.last = newLast;
	}

	public void setMiddle(String newMiddle) {
		this.middle = newMiddle;
	}

	// refactored from printName(0)
	public void printFirstMiddleLast() { 
		System.out.println(first + "  " + middle + "  " + last);
	}

	// refactored from printName(1)
	public void printLastMiddleFirst() {
		System.out.println(last + " ," + middle + " " + first);
	}

	// refactored from printName(2)
	public void printLastFirstMiddle() {
		System.out.println(last + " ," + first + " " + middle);
	}


}