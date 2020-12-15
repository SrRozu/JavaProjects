package avl_tree;

import java.util.Scanner;

/*
 * @author Roberto Ruiz Sánchez
 */
public class menu {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Creación 
        AVLTree avlt = new AVLTree();

        char ch;

        do {
            System.out.println("\nAVLTree\n");
            System.out.println("1. Insertar");
            System.out.println("2. Buscar");
            System.out.println("3. Contar nodos");
            System.out.println("4. Imprimir In Order");
            System.out.println("5. Imprimir Post Order");
            System.out.println("6. Imprimir Pre Order");

            int opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Inotroduce un entero a insertar");
                    avlt.addElement(scan.nextInt());
                    System.out.print("\nPost order : ");
                    avlt.postorder();
                    System.out.print("\nPre order : ");
                    avlt.preorder();
                    System.out.print("\nIn order : ");
                    avlt.inorder();
                    break;
                case 2:
                    System.out.println("Inotroduce un entero a buscar");
                    System.out.println("Search result : " + avlt.find(scan.nextInt()));
                    System.out.print("\nPost order : ");
                    avlt.postorder();
                    System.out.print("\nPre order : ");
                    avlt.preorder();
                    System.out.print("\nIn order : ");
                    avlt.inorder();
                    break;
                case 3:
                    System.out.println("Nodos = " + avlt.countNodes());
                    break;
                case 4:
                    System.out.print("\nIn order : ");
                    avlt.inorder();
                    break;
                case 5:
                    System.out.print("\nPost order : ");
                    avlt.postorder();
                    break;
                case 6:
                    System.out.print("\nPre order : ");
                    avlt.preorder();
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            System.out.println("\n¿Quiere continuar?(Si/No)\n");
            ch = scan.next().charAt(0);
        } while (ch == 'S' || ch == 's');
    }
}
