String tab[] = s.split(" "); java.lang.String

Tb classique : tb[]
Tb partculiers : Liste ( Arraylist) // Vecteure
Ensemble Interface : treeSet , HashSet
Disctionnaire interface Map : HashMap , TreeMap

Tb classique :

- int tab1[] // int [] tab2
- tab1 = new int[4] // tab1 = new int[] {4, 2}; // int tab1[] = {5,5}

tb particulier LIST : Vector, ArrayList // java.util.Vector, java.util.ArrayList

- ArrayList <String> liste = new ArrayList<String>() // ArrayList liste = new ArrayList()
- .remove(0) // .size() // .add(0, "a") // .get(0) // .set(0, "a") //

tb Interface: java.util // java.util

- HashSet <String> liste = new HashSet<String>() // TreeSet
- .add("a") // .remove("a") // .contains("a") // .size() //

- HashMap <String, String> liste = new HashMap<String, String>() // TreeMap
- .put("a", "b") // .remove("a") // .get("a") // .containsKey("a") // .keySet()

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

=================================================

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
