package application;

public class Map {
	
	private String[][] lab = { {" "," "," "," ","t","X"," "," "," ","X"," "," "," ","X"," ","X","X"," "," "," ","X"," "," "," "," "," "," ","X"},
			{" ","X","X","X","X","X"," ","X"," ","X"," ","X"," ","X"," "," ","X"," ","X"," ","X"," ","X","X","X","X"," ","X"},
			{" "," "," "," "," "," "," ","X"," "," "," ","X"," ","X","X"," ","X"," ","X","X","X"," ","X","X"," ","X"," "," "},
			{"X","X"," ","X","X","X","X","X"," ","X","X","X"," "," ","X"," "," "," ","X"," "," "," "," ","X"," ","X","X"," "},
			{" ","X"," ","X"," "," "," ","X"," "," "," ","X","X","X","X"," ","X"," "," "," ","X","X"," ","X"," "," "," "," "},
			{" "," "," "," "," ","X","X","X","X","X"," "," "," "," ","X"," ","X","X","X","X","X"," "," "," "," ","X","X"," "},
			{" ","X","X","X"," ","X"," "," "," ","X","X"," ","X"," ","X","X","X"," ","X"," "," "," ","X","X","X","X"," "," "},
			{" ","X","P"," "," ","X"," ","X"," "," "," "," ","X"," "," "," "," "," "," "," ","X","X","X"," "," "," "," ","X"},
			{" ","X","X","X","X","X"," ","X","X","X","X","X","X","X","X","X","X","X","X"," "," "," "," "," ","X"," ","X","X"},
			{" "," "," "," "," "," "," ","X"," "," ","X"," ","X"," "," "," ","X"," ","X","X","X"," ","X","X","X"," ","X","E"},
			{"X","X","X"," ","X","X","X","X"," ","X","X"," ","X","X","X"," ","X"," "," "," ","X"," "," "," "," "," ","X"," "},
			{" "," ","X"," ","X"," "," "," "," "," "," "," "," "," ","X"," ","X"," ","X"," ","X","X","X","X"," ","X","X"," "},
			{" ","X","X"," ","X"," ","X","X","X"," ","X","X","X"," ","X"," "," "," ","X","X","X"," "," ","X"," ","T","X"," "},
			{" "," ","X"," ","X"," ","X"," "," "," ","X"," "," "," ","X"," ","X"," "," "," "," "," "," ","X","X","X","X"," "},
			{" "," "," "," "," "," ","X"," ","X","X","X","X","X","X","X"," ","X","X","X","X","X","X"," ","X"," "," "," "," "},
			{" ","X"," "," ","X"," ","X"," "," "," "," "," ","X"," "," "," "," "," ","X"," "," "," "," ","X"," "," ","X"," "},
			{" ","X","X","X","X"," ","X"," ","X","X","X"," ","X"," ","X","X","X"," ","X","X","X"," ","X","X","X","X","X"," "},
			{" "," "," "," ","X"," "," "," ","X"," "," "," "," "," ","X"," "," "," "," "," ","X"," "," "," "," "," "," "," "}};
	
	private String[][] lab2 = { {" "," "," "," "," "," "," ","X"," "," "," "," "," ","X"," "," "," "," "," ","X"," "," "," ","X"," "," "," "," "},   						
			{" ","X","X","X","X","X"," ","X","X","X"," ","X","X","X"," ","X"," ","X","X","X"," ","X"," ","X","X","X","X"," "},    						
			{" ","X"," "," ","X"," "," "," "," ","X"," "," "," "," "," ","X"," "," "," "," "," ","X"," ","X"," "," ","X"," "},    						
			{" "," "," "," ","X"," ","X","X","X","X","X","X"," ","X","X","X","X","X","X","X"," ","X"," "," "," "," "," "," "},    						
			{" ","X","X","X","X"," "," "," "," "," "," ","X"," ","X"," "," "," ","X"," "," "," ","X"," ","X"," ","X"," "," "},    						
			{" ","X","V"," ","X"," "," ","X","X","X"," "," "," ","X"," ","X","X","X"," ","X","X","X"," ","X"," ","X","X"," "},    						
			{" ","X","X"," ","X","X","X","X"," ","X"," ","X"," ","X"," "," "," "," "," "," "," "," "," ","X"," ","X"," "," "},    						
			{" ","X"," "," "," "," "," ","X"," "," "," ","X"," ","X","X","X"," ","X","X"," ","X","X","X","X"," ","X","X","X"},    						
			{" "," "," ","X","X","X"," ","X","X","X"," ","X"," "," "," ","X"," ","X"," "," ","X"," "," "," "," "," "," "," "},    						
			{"X","X"," ","X"," "," "," "," "," ","X"," ","X","X","X","X","X","X","X","X","X","X"," ","X","X","X","X","X"," "},    						
			{"X"," "," "," "," ","X","X","X"," ","X"," "," "," "," "," ","X"," "," "," "," ","X"," ","X"," "," ","P","X"," "},    						
			{" "," ","X","X","X","X"," "," "," ","X"," ","X","X","X"," ","X"," ","X","X"," "," "," ","X"," ","X","X","X"," "},    						
			{" ","X","X"," "," "," "," ","X","X","X","X","X"," ","X"," "," "," "," ","X","X","X","X","X"," "," "," "," "," "},    						
			{" "," "," "," ","X"," ","X","X"," "," "," ","X"," ","X","X","X","X"," "," "," ","X"," "," "," ","X"," ","X"," "},   						
			{" ","X","X"," ","X"," "," "," "," ","X"," "," "," ","X"," "," ","X","X","X"," ","X","X","X","X","X"," ","X","X"},  						
			{" "," ","X"," ","X","X"," ","X","X","X"," ","X"," ","X","X"," ","X"," "," "," ","X"," "," "," "," "," "," "," "},    						
			{"X"," ","X","X","X","X"," ","X"," ","X"," ","X"," "," ","X"," ","X"," ","X"," ","X"," ","X","X","X","X","X"," "},    						
			{"X"," "," "," "," "," "," ","X"," "," "," ","X","X"," ","X"," "," "," ","X"," "," "," ","X"," "," "," "," "," "}, };
	
	public Map() {}
	
	public String[][] getLab(){
		return this.lab;
	}
	
	public String[][] getLab2(){
		return this.lab2;
	}
}