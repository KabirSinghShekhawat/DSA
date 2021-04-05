import StringManipulation.Anagram;
import LinkedList.SingleLink;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        anagram(scanner);
        SingleLinkList();
//        scanner.close();
    }

    private static void anagram(Scanner scanner) {
        System.out.print("Enter String 1: ");
        String string1 = scanner.next();

        System.out.print("Enter String 2: ");
        String string2 = scanner.next();

        if(Anagram.isAnagram(string1, string2))
            System.out.println(string1 + " and " + string2 + " are Anagrams");
        else
            System.out.println("Not Anagrams");
    }

    private static void SingleLinkList() {
        SingleLink ll = new SingleLink();
        ll.head = new SingleLink.Node(1);
        SingleLink.Node n2 = new SingleLink.Node(2);
        SingleLink.Node n3 = new SingleLink.Node(3);
        ll.head.setNext(n2);
        n2.setNext(n3);
        ll.displayList(ll.head);
    }
}
