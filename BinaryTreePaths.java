import java.util.*;

public class BinaryTreePaths {
    
    static class Node {
        String data; // could be integer as string or a 6-letter name
        Node left, right;

        Node(String data) {
            this.data = data;
            left = right = null;
        }
    }

    public List<String> getPaths(Node root) {
        List<String> paths = new ArrayList<>();
        if (root == null) return paths;
        buildPaths(root, "", paths);
        return paths;
    }

    private void buildPaths(Node node, String path, List<String> paths) {
        if (node == null) return;

        if (path.length() > 0) {
            path += "->";
        }
        path += node.data;

        if (node.left == null && node.right == null) {
            paths.add(path);
        } else {
            buildPaths(node.left, path, paths);
            buildPaths(node.right, path, paths);
        }
    }
    public static void main(String[] args) {
        BinaryTreePaths tree = new BinaryTreePaths();

        Node root = new Node("1");
        root.left = new Node("2");
        root.right = new Node("3");
        root.left.right = new Node("5");
        
        List<String> result = tree.getPaths(root);
        System.out.println("All root-to-leaf paths: " + result);
    }
}
