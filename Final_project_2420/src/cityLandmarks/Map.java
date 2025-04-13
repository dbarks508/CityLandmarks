package cityLandmarks;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.ST;

public class Map {
	
	private ST<Integer, Integer> st;
	private Graph graph;
	
	public Map(ST<Integer, Integer> st) {
		this.setSt(st);
		
		makeGraph(st);
	}
	
	private void makeGraph(ST<Integer, Integer> st) {
		graph = new Graph(st.size());
		
		for (Integer key : st.keys()) {
			// add edges to graph 
			graph.addEdge(key, st.get(key));
		}
	}
	
	public int getVs() {
		return graph.V();
	}

	public ST<Integer, Integer> getSt() {
		return st;
	}

	public void setSt(ST<Integer, Integer> st) {
		this.st = st;
	}

}
