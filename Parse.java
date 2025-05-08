public class Parse implements InterfaceData {

    private String data;
    private String tablauxString[];

    public Parse() {
        
        this.data = " abcd "+" , "+" efgh ";
    }

    
    public void setData(String item) {
        this.data = item;
    }

    
    public String getData() {
        return this.data;
    }

    
    public void parse() {
        this.tablauxString = this.data.split(",");
    }

    
    public void clean() {
    
        
        for ( String res : this.tablauxString) {
            // Utiliser une boucle avec index pour pouvoir modifier les éléments du tableau
            for (int i = 0; i < this.tablauxString.length; i++) {
                this.tablauxString[i] = this.tablauxString[i].trim();
            }
  
        }
    }

    
    public void afficher() {
        

        for (String res : this.tablauxString) {
            System.out.println(res);
        }
    }
    public static void main(String[] args) {
        Parse parse = new Parse();
        
        parse.parse();
        parse.afficher();
        parse.clean();
        parse.afficher();
    }      
    
}
