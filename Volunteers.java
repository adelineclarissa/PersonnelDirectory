public class Volunteers extends Person {

    private String type = "volunteers";
    private int id;
    
    public Volunteers(String last, String first, String middle, int id) {
		super(last, first, middle);
        this.id = id;
	}

}
