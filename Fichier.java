import java.io.*;

public class Fichier {

    public Fichier() {
        
    }

    public void lire() {
        try{
        InputStream inSTream = new FileInputStream ("donnee.txt");
        InputStreamReader streamReader = new InputStreamReader(inSTream);
        BufferedReader reader = new BufferedReader(streamReader);
        String ligne = null;
        while ((ligne = reader.readLine()) != null) {
            System.out.println(ligne);
        }
        reader.close();
        }catch( Exception x){
            System.out.println("Erreur d'ouverture du fichier : " + x.getMessage());
        }
}

    public void ecrire(){
        try{
        OutputStream outStream = new FileOutputStream("donnee.txt", true);
        OutputStreamWriter streamWriter = new OutputStreamWriter(outStream);
        String donee = "Data , newdata\n";
        streamWriter.write(donee);
        streamWriter.close();
        }catch(Exception x){
            System.out.println("Erreur d'ouverture du fichier : " + x.getMessage());
        }
    }

    public String lireFichier(){
        String result="";
        try{
            InputStream inSTream = new FileInputStream ("donnee.txt");
            InputStreamReader streamReader = new InputStreamReader(inSTream);
            BufferedReader reader = new BufferedReader(streamReader);
            String ligne = null;
            while ((ligne = reader.readLine()) != null) {
                result += ligne +"\n";
            }
            reader.close();
            
            }catch( Exception x){
                System.out.println("Erreur d'ouverture du fichier : " + x.getMessage());
            }
        
        return result;
    }

    public void sauvgarder(){
        Hachage hachage = new Hachage();
        hachage.personnage();
        if (hachage.ajoutAcolyte("Data , newdata")){
            this.ecrire();
            System.out.println("Acolyte ajouté avec succès !");
        }else{
            System.out.println("Acolyte déjà existant !");
        }
    }
public static void main(String[] args) {
    Fichier fichier = new Fichier();
    fichier.sauvgarder();

}   

}
