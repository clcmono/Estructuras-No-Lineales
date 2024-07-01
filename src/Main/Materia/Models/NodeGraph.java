package Main.Materia.Models;
import java.util.LinkedList;
import java.util.List;
public class NodeGraph {
    int value;
    List<NodeGraph> neighbors;


    public NodeGraph(int value){
        this.value= value;
        this.neighbors = new LinkedList<>();
    }


    public int getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }


    public List<NodeGraph> getNeighbors() {
        return neighbors;
    }


    public void setNeighbors(List<NodeGraph> neighbors) {
        this.neighbors = neighbors;
    }

   public void addNeighbors(NodeGraph neighbor) {
    neighbors.add(neighbor);
     
   }




}
