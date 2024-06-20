package main;

import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Models.Node;


public class App {
    public static void main(String[] args) throws Exception {
        
        // ArbolBinario arbolBinario = new ArbolBinario();
        // Node nodeRaiz = new Node(1);
        // nodeRaiz.setLeft(new Node(2));
        // nodeRaiz.setRight(new Node(3));
        // //Instanciar los hijos del Numero 2
        // nodeRaiz.getLeft().setLeft(new Node(4));
        // nodeRaiz.getLeft().setRight(new Node(5));
        // //Instanciar los hijo del 3
        // nodeRaiz.getRight().setRight(new Node(6));
        // //Instanciar el hijo del 4
        // nodeRaiz.getLeft().getLeft().setLeft(new Node(7));
        // //Instanciar el hijo del 5
        // nodeRaiz.getLeft().getRight().setLeft(new Node(8));

        // System.out.println("Pre order loop");
        // arbolBinario.preOrderLoop(nodeRaiz);

        // System.out.println();
        // System.out.println("Pre order recursivo");
        // arbolBinario.preOrderRecursivo(nodeRaiz);

        // System.out.println();
        // System.out.println("Post order loop");
        // arbolBinario.postOrderLoop(nodeRaiz);

        // System.out.println();
        // System.out.println("Post order Recursivo");
        // arbolBinario.postOrderRecursivo(nodeRaiz);

        // System.out.println();
        // System.out.println("IN order Recursivo");
        // arbolBinario.InOrderRecursivo(nodeRaiz);

        InvertBinaryTree invertido = new InvertBinaryTree();
        Node nodeRaiz2 = new Node(4);
        nodeRaiz2.setLeft(new Node(2));
        nodeRaiz2.setRight(new Node(7));
        nodeRaiz2.getLeft().setLeft(new Node(1));
        nodeRaiz2.getLeft().setRight(new Node(3));
        nodeRaiz2.getRight().setLeft(new Node(6));
        nodeRaiz2.getRight().setRight(new Node(9));
        
        System.out.println();
        System.out.print(invertido.invertTree(nodeRaiz2));

    }
}
