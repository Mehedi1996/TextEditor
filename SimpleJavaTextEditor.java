

package simplejavatexteditor;

import javax.swing.JTextPane;

public class SimpleJavaTextEditor extends JTextPane {

    private static final long serialVersionUID = 1L;
    public final static String AUTHOR_EMAIL = "Mehedi@gmail.com";
    public final static String NAME = "JavaNode";
        public final static String EDITOR_EMAIL = "Mehedieditor@gmail.com";
    public final static double VERSION = 5.00;

   
    public static void main(String[] args) {
        new UI().setVisible(true);
    }

}
