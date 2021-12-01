package datastructure.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

// This will represent graph node similar to below
/*
         T
      /    \
     B      C
   /   \      \
  A     R      Q
      / | \
     L  P  M
 */
public class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
        this.name = name;
    }

    // the method allows chaining calls: graph.addChild("a").addChild("b")...etc
    public Node addChild(String name){
        Node child = new Node(name);
        this.children.add(child);
        return this;
    }

    public String getName() {
        return name;
    }

    public List<Node> getChildren() {
        return children;
    }

    // grapth.orderList(OrderByObject);
    // output -> List<Node>;? or List<String>?
    public List<String> orderList(INodeOrder orderBy){
        return orderBy.orderBy(this);
    }

    // lets test this thing out...
    /*
        T
      /    \
     B      C
   /   \      \
  A     R      Q
      / | \
     L  P  M
 */
    public static void main(String[] args) {
        Node graphOne = new Node("T");
        graphOne.addChild("B").addChild("C");
        // T(0) = B, T(1) = C
        graphOne.getChildren().get(0).addChild("A").addChild("R"); // B -> A, R
        graphOne.getChildren().get(1).addChild("Q"); // C -> Q
        // Now lets work on R -> L, P, M
        // R = graph.getChildren().get(0).getChildren().get(1);
        graphOne.getChildren().get(0).getChildren().get(1).addChild("L").addChild("P").addChild("M");
        // R -> L, P, M

        depthFirstSearch DFS = new depthFirstSearch();
        List<String> output = graphOne.orderList(DFS);
        System.out.println(output.toString());
        //; [T, B, A, R, L, P, M, C, Q]
    }
}

//
class depthFirstSearch implements INodeOrder {

    @Override
    public List<String> orderBy(Node obj) {
        ArrayList<String> list = new ArrayList<>();
        depthFirstSearchHelper(obj, list);
        return list;
    }

    public void depthFirstSearchHelper(Node children, List<String> list){
        if (children == null)
            return;

        list.add(children.name); // add the child to the list
        for (int i=0; i<children.getChildren().size(); i++) {
            depthFirstSearchHelper(children.children.get(i), list);
        }
    }
}
