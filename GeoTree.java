import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person p1, Person p2, Relationship r1, Relationship r2) {
        tree.add(new Node(p1, r1, p2));
        tree.add(new Node(p2, r2, p1));
    }
//    public void appendG(Person grandparents, Person grandchildren) {
//        tree.add(new Node(grandparents, Relationship.grandparents, grandchildren));
//        tree.add(new Node(grandchildren, Relationship.grandchildren, grandparents));
//    }
//
//    public void addendBS(Person brother, Person sister) {
//        tree.add(new Node(brother, Relationship.brother, sister));
//        tree.add(new Node(sister, Relationship.sister, brother));
//    }
}
