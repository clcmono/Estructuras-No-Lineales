package Main;

import Main.Materia.Controllers.ArbolBinario;
/*
 *               1 
 *          2            3
 *       4     5             6 
 *   7        8  
 */
import Main.Materia.Models.Node;


public class App {
    public static void main(String[] args) throws Exception {
        
        ArbolBinario arbolBinario = new ArbolBinario();
        Node nodeRaiz = new Node(1);
        nodeRaiz.setLeft(new Node(2));
        nodeRaiz.setRight(new Node(3));
        //Instanciar los hijos del Numero 2
        nodeRaiz.getLeft().setLeft(new Node(4));
        nodeRaiz.getLeft().setRight(new Node(5));
        //Instanciar los hijo del 3
        nodeRaiz.getRight().setRight(new Node(6));
        //Instanciar el hijo del 4
        nodeRaiz.getLeft().getLeft().setLeft(new Node(7));
        //Instanciar el hijo del 5
        nodeRaiz.getLeft().getRight().setLeft(new Node(8));

        System.out.println("Pre order loop");
        arbolBinario.preOrderLoop(nodeRaiz);

        System.out.println();
        System.out.println("Pre order recursivo");
        arbolBinario.preOrderRecursivo(nodeRaiz);

        System.out.println();
        System.out.println("Post order loop");
        arbolBinario.postOrderLoop(nodeRaiz);

        System.out.println();
        System.out.println("Post order Recursivo");
        arbolBinario.postOrderRecursivo(nodeRaiz);

        System.out.println();
        System.out.println("IN order Recursivo");
        arbolBinario.InOrderRecursivo(nodeRaiz);


    }
}
