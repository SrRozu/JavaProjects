package avl_tree;

/*
 * @author Roberto Ruiz Sánchez
 */
public class AVLTree {

    private AVLNode root;

    // Constructor 
    public AVLTree() {
        root = null;
    }
    // Función para ver si está vacío el árbol

    public boolean isEmpty() {

        return root == null;
    }

    // Funcion para añadir un elemento 
    public void addElement(int data) {

        root = addElement(data, root);
    }

    // Funcion para deolver la altura de un nodo
    private int height(AVLNode t) {
        int devolver;
        if (t == null) {
            devolver = -1;
        } else {
            devolver = t.height;
        }
        return devolver;
        //return t == null ? -1 : t.height;
    }
    // Funcción para calcular el máximo de dos nodos hijos

    private int max(int lhs, int rhs) {
        int mayor;
        if (lhs > rhs) {
            mayor = lhs;
        } else {
            mayor = rhs;
        }
        return mayor;
    }
    // Función para añadir un elemento recursivamente

    private AVLNode addElement(int x, AVLNode t) {
        if (t == null) {
            t = new AVLNode(x);
        } else if (x < t.data) {
            t.left = addElement(x, t.left);
            if (height(t.left) - height(t.right) == 2) {
                if (x < t.left.data) {
                    t = rotateWithLeftChild(t);
                } else {
                    t = doubleWithLeftChild(t);
                }
            }
        } else if (x > t.data) {
            t.right = addElement(x, t.right);
            if (height(t.right) - height(t.left) == 2) {
                if (x > t.right.data) {
                    t = rotateWithRightChild(t);
                } else {
                    t = doubleWithRightChild(t);
                }
            }
        } else
           ;  // No hace nada
        t.height = max(height(t.left), height(t.right)) + 1;
        return t;
    }
    // Rotar un nodo con su hijo izquierdo     

    private AVLNode rotateWithLeftChild(AVLNode node) {
        AVLNode node2 = node.left;
        node.left = node2.right;
        node2.right = node;
        node.height = max(height(node.left), height(node.right)) + 1;
        node2.height = max(height(node2.left), node.height) + 1;
        return node2;
    }

    // Rotar un nodo con su hijo derecho     
    private AVLNode rotateWithRightChild(AVLNode node) {
        AVLNode node2 = node.right;
        node.right = node2.left;
        node2.left = node;
        node.height = max(height(node.left), height(node.right)) + 1;
        node2.height = max(height(node2.right), node.height) + 1;
        return node2;
    }

    // Doble rotación de un nodo: primero el hijo izquierdo
    // con su hijo derecho; luego, el nodo con su hijo izquierdo
    private AVLNode doubleWithLeftChild(AVLNode node) {
        node.left = rotateWithRightChild(node.left);
        return rotateWithLeftChild(node);
    }

    // Doble rotación de un nodo: primero el hijo derecho
    // con su hijo izquierdo; luego, el nodo con su hijo derecho
    private AVLNode doubleWithRightChild(AVLNode node) {
        node.right = rotateWithLeftChild(node.right);
        return rotateWithRightChild(node);
    }

    // Función para contar el número de nodos
    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(AVLNode node) {
        if (node == null) {
            return 0;
        } else {
            int l = 1;
            l += countNodes(node.left);
            l += countNodes(node.right);
            return l;
        }
    }

    // Función para buscar un elemento
    public boolean find(int data) {
        return find(this.root, data);
    }

    private boolean find(AVLNode node, int data) {
        boolean found = false;
        while ((node != null) && !found) {
            int valor = node.data;
            if (data < valor) {
                node = node.left;
            } else if (data > valor) {
                node = node.right;
            } else {
                found = true;
                break;
            }
            found = find(node, data);
        }
        return found;
    }

    // Funcion para inorder transversal
    public void inorder() {
        inorder(root);
    }

    private void inorder(AVLNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    // Funcion para preorder transversal
    public void preorder() {
        preorder(root);
    }

    private void preorder(AVLNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // Funcion para postorder transversal
    public void postorder() {
        postorder(root);
    }

    private void postorder(AVLNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}