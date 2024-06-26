package Main.Ejercicio_04_depth;
import Main.Materia.Models.*;

public class Depth {
    public int maxDepth(Node root){
        if(root == null){
            return 0;
        }
        int depthLeft = maxDepth(root.getLeft());
        int depthRight = maxDepth(root.getRight());
        return Math.max(depthLeft,depthRight)+1;
    }
    
}
