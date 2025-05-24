package mainpackage;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> root;

    public BinarySearchTree() {
    }

    public void insert(T value) {
        root = insertHelper(root, value);
    }

    private Node<T> insertHelper(Node<T> root, T value) {
        if(root == null) return new Node<T>(value);
        else if(root.getValue().compareTo(value) < 0)root.setLeft(insertHelper(root.getLeft(), value));
        else root.setRight(insertHelper(root.getRight(), value));
        
        return root;
    }
    
    public String inorder(){
        return inorderHelper(root);
    }
    private String order = "";
    private String inorderHelper(Node<T> root){
        if(root == null) return "";
        
        return inorderHelper(root.getLeft()) + root.getValue().toString() +"\n"+ inorderHelper(root.getRight());
    }
    
    public T getRoot(){
        return root.getValue();
    }
}
