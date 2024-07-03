package Main.Materia.Controllers;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Comparator;

public class Sets {

    public Sets (){
        construirHashSet();
        construirLinkedHashSet();
        construirTreeSet();
        constuirTreetConComparador();

    }
    public void construirHashSet(){
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("HarryPotter");
        conjunto.add("Jamon");
        conjunto.add("iphone");
        conjunto.add("Dios");
        conjunto.add("Calor");
        conjunto.add("Cerro");
        System.out.println("HashSet: " + conjunto);
        //eliminar un elemento
        conjunto.remove("Jamon");
        System.out.println("HashSet después de eliminar un elemento:  " + conjunto);
        //Verificar si un elemento existe
        boolean contieneDios = conjunto.contains("Dios");
        System.out.println("¿HashSets contiene a Dios? " + contieneDios);
        //Obtener el tamaño del conjunto
        int tamaño = conjunto.size();
        System.out.println("Tamaño del HashSet: " + tamaño);

    }

    public void construirLinkedHashSet(){
        LinkedHashSet <String> conjunto = new LinkedHashSet<>();
        conjunto.add("HarryPotter");
        conjunto.add("Jamon");
        conjunto.add("iphone");
        conjunto.add("Dios");
        conjunto.add("Calor");
        conjunto.add("Cerro");
        System.out.println("LinkedHashSet: " + conjunto);
       

    }
    public void construirTreeSet(){
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("HarryPotter");
        conjunto.add("Jamon");
        conjunto.add("iphone");
        conjunto.add("Dios");
        conjunto.add("Calor");
        conjunto.add("Cerro");
        System.out.println("TreeSet: " + conjunto);
    }
    

    public void constuirTreetConComparador(){
        //Comparador personalizado que ordena las cadenas en...
        Comparator<String> comparadorOrdenInverso = new Comparator<String>(){
            @Override
            public int compare (String s1, String s2){
                return s2.compareTo(s1);
        }
    };
        TreeSet<String> conjunto = new TreeSet<>(comparadorOrdenInverso);
        conjunto.add("HarryPotter");
        conjunto.add("Jamon");
        conjunto.add("iphone");
        conjunto.add("Dios");
        conjunto.add("Calor");
        conjunto.add("Cerro");
        System.out.println("TreeSet: " + conjunto);
        
    
    }
    
}
