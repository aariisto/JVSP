import java.util.HashMap;
import java.util.Set;

public class Hachage {
    private String contenu;
    private Fichier fichier;
    private HashMap acolyte;

    public Hachage() {
        this.fichier = new Fichier();
        this.contenu =this.fichier.lireFichier();
        this.acolyte = new HashMap<String, String>();
    }

    public void personnage(){
        String donee[] = this.contenu.split("\n");
        for (String res : donee) {
            String[] item = res.split(",");
            String nom = item[0].trim();
            String nom2 = item[1].trim();
            this.acolyte.put(nom, nom2);
            }
   
    }
    public void lireAcolyte(){
        Set<String> set = this.acolyte.keySet();
        for (String cle : set){
            System.out.println("Nom : " + cle + " , " + "Acolyte : " + this.acolyte.get(cle));
        }
    }
    public boolean ajoutAcolyte (String n){
        String[] test1= n.split(",");
        Set<String> set = this.acolyte.keySet();
        for (String cle : set){
            if( cle.equals(test1[0].trim()) || this.acolyte.get(cle).equals(test1[1].trim())){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Hachage hachage = new Hachage();
        hachage.personnage();
        hachage.lireAcolyte();
        System.out.println(hachage.ajoutAcolyte("Data , newdata"));
        
    }
  
}
