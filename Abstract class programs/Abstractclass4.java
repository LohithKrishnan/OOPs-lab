abstract class Editor {
    abstract void openFile();
    abstract void saveFile();
}

class TextEditor extends Editor {
    void openFile() {
        System.out.println("Opening text file...");
    }
    void saveFile() {
        System.out.println("Saving text file.");
    }
}

class CodeEditor extends Editor {
    void openFile() {
        System.out.println("Opening source code file...");
    }
    void saveFile() {
        System.out.println("Saving source code file.");
    }
}

public class Abstractclass4 {
    public static void main(String[] args) {
        Editor e1 = new TextEditor();
        e1.openFile();
        e1.saveFile();

        Editor e2 = new CodeEditor();
        e2.openFile();
        e2.saveFile();
    }
}
