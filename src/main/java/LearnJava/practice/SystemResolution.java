package LearnJava.practice;

import java.awt.*;

public class SystemResolution {
    static void main(String[] ignoredArgs) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.print("A resolução do seu monitor é: " + d.width + " x " + d.height);
    }
}
