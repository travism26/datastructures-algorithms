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
}
