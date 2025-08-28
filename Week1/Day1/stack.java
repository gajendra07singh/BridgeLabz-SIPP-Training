import java.util.Stack;

class TextEditor {
    String text;              
    Stack<String> undoStack; 

    TextEditor() {
        this.text = "";
        this.undoStack = new Stack<>();
    }
    void add(String newText) {
        undoStack.push(text);   
        text = text + newText;  
    }

   
    void undo() {
        if (!undoStack.isEmpty()) {
            text = undoStack.pop();  
        } else {
            System.out.println("Nothing to undo.");
        }
    }
    void display() {
        System.out.println("Current Text: " + text);
    }
}
