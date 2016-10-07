import java.util.Map;

public class Formation {
	public String id;
	public Map<String,Integer> lMat;
	
	
	
	public void ajouter(String m, int n){
		lMat.put(m,n);
		
	}
	
	public void retirer(String m){
		lMat.remove(m);
	}
	
	public int Coef(int n){
		if(lMat.containsKey(n)){
		 System.out.println(lMat.get(n));
		 }
		else{
			System.out.println("La matière ne contient pas de coefficient");
		}
		return n;
		 }

}
