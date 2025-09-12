class Node {
    String url;
    Node prev;
    Node next;

    public Node(String url) {
        this.url = url;
    }
}

class BrowserHistory {
    private Node current;

    public void visit(String url) {
        Node newNode = new Node(url);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
        System.out.println("Visited: " + url);
    }

    public void goBack() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Went back to: " + current.url);
        } else {
            System.out.println("No previous page.");
        }
    }

    public void goForward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Went forward to: " + current.url);
        } else {
            System.out.println("No next page.");
        }
    }

    public void currentPage() {
        if (current != null) {
            System.out.println("Current page: " + current.url);
        } else {
            System.out.println("No pages visited yet.");
        }
    }
}

public class BrowserNavigationApp {
    public static void main(String[] args) {
        BrowserHistory h1 = new BrowserHistory();

        h1.visit("google.com");
        h1.visit("youtube.com");
        h1.visit("github.com");
        h1.visit("instagram.com");
        h1.visit("facebook.com");
        h1.goBack();        
        h1.goBack();      
        h1.goForward();   
        h1.currentPage();   
    }
}
