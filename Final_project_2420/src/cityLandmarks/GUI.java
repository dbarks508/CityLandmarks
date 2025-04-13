package cityLandmarks;

import edu.princeton.cs.algs4.ST;

public class GUI {

	public static void main(String[] args) {
		Landmark landmark1 = new Landmark(0, 1);
		Landmark landmark2 = new Landmark(1, 2);
		Landmark landmark3 = new Landmark(2, 0);
		
		ST<Integer, Integer> st = new ST<Integer, Integer>();
		st.put(landmark1.getId(), landmark1.getConnection());
		st.put(landmark2.getId(), landmark2.getConnection());
		st.put(landmark3.getId(), landmark3.getConnection());
		
		Map map = new Map(st);
		
		System.out.println("verticies * 2: " + map.getVs() * 2);

	}

}
