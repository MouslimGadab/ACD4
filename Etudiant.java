package notesEleves;

import java.util.Map;
import java.util.List;
import java.util.Scanner;


public class Etudiant {
	
	private Map<String,List<Float>> lNotes;
	private Identite id;
	private Formation f;
	
	public Etudiant(Identite id, Formation f, Map<String,List<Float>> lNotes ){
		id = this.id;
		f = this.f;
		lNotes = this.lNotes;
	}
	
	
	
	
	/*public void addNote(Etudiant ed){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir une note à ajouter :");
		float note = sc.nextFloat();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Veuillez saisir la matiere correspondante :");
		String mat = sc2.nextLine();
		System.out.println("Vous avez ajouté un " + note + " en " + mat);
		
		}*/
}
