package Main.Ejercicio_02_invert;
import Main.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertTree(Node root){
        //en caso de que sea nulo retorna la raiz
        if(root == null){
           return null;
       }
       Node left = invertTree(root.getLeft());
       Node right = invertTree(root.getRight());
       left = right;
       right = left;

       return root;
    }
}
