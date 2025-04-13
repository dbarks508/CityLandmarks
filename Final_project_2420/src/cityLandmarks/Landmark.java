package cityLandmarks;

public class Landmark {

	private int id;
	private int connection;
	
	public Landmark(int id, int connection) {
		this.id = id;
		this.connection = connection;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getConnection() {
		return this.connection;
	}
}
