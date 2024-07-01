package Main.Materia.Controllers;
import java.util.ArrayList;
import java.util.List;

import Main.Materia.Models.NodeGraph;
public class Graph {
    List <NodeGraph> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public NodeGraph addNode (int value){
        NodeGraph newNode = new NodeGraph(value);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge ( NodeGraph src, NodeGraph dest){
        src.addNeighbors(dest);
        dest.addNeighbors(src);
    }

    public void printGraph(){
        for(NodeGraph node : nodes){
            System.out.println("Vertex  " + node.getValue() + ": ");
            for(NodeGraph neighbors : node.getNeighbors()){
                System.out.println( " -> " + neighbors.getValue());
            }
        }

    }
    public void getDFS(NodeGraph startNode){

    }
    public void getDFSUtil(NodeGraph node, boolean [] visited){

    }
    public void getBFS (NodeGraph startNode){

    }
    public int[][] getAdyacencyMatrix(){
        return getAdyacencyMatrix();
    }

    public void printAdyacencyMatrix(){

    }


     

    
}
