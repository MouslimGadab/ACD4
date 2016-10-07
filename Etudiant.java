package notesEleves;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Etudiant {
	
	private Map<String,List<Float>> lNotes;
	private Identite id;
	private Formation f;
	
	public Etudiant(Identite id, Map<String,List<Float>> lNotes ){
		this.id = id;
		this.lNotes = new HashMap<String,List<Float>>();
	}
	public void addNote (String id, float n)
	{
		if(n<20 || n> 0)
		{
			if(!lNotes.containsKey(id)){lNotes.put(id, new ArrayList<Float>());
			lNotes.get(id).add(n);
			}
			
		}
	}
	
	public void moyenne(){
		float tot = 0;
		float moy = 0;
	
		if(!lNotes.containsKey(this))
			System.out.println("Cette matière n'existe pas");
		else
			for(int i=0; i<lNotes.get(this).size();i++){
				tot = tot + lNotes.get(this).get(i);
			}
	
		moy = tot / lNotes.get(this).size();	
	}
	
	public double getMoyene()
    {
        double somme = 0.;
        int coefficient = 0;
        for (String matiere : f.getMatieres().keySet())
        {
            somme += getMoyenne(matiere) * f.getCoefficient(matiere);
            coefficient += f.getCoefficient(matiere);
        }
        return somme / coefficient;
    }
		
	
	public Formation getFormation()
    {
        return f;
    }

    public void setFormation(Formation formation)
    {
        this.f = formation;
    }

    public Identite getIdentite()
    {
        return id;
    }

    public void setIdentite(Identite identite)
    {
        this.id = identite;
    }

    public Map<String, List<Float>> getResultats()
    {
        return lNotes;
    }

    public void setResultats(HashMap<String, ArrayList<Integer>> resultats)
    {
        this.lNotes = lNotes;
    }
}
