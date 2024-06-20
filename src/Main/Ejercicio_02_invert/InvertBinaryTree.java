package main.Ejercicio_02_invert;
import main.Materia.Models.*;

public class InvertBinaryTree {
    public Node invertTree(Node root){
         //en caso de que sea nulo retorna la raiz
         if(root == null){
            return null;
        }
        Node aux = root.getLeft;
        root.getLeft = root.getRight;
        root.getRight = aux;
        invertTree(root.getLeft);
        invertTree(root.getRight);
        return root;
    }
    
}
