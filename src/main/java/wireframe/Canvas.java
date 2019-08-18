package wireframe;

import java.awt.Color;

import wireframe.hsa2.GraphicsConsole;

public class Canvas extends GraphicsConsole {
    private static final long serialVersionUID = 5124270765519989313L;

    public Canvas(String name, int width, int height) {
        super(width, height, name);
    }

    public void centre() {
        this.setLocationRelativeTo(null);
    }

    public void autoConfig(Color bg) {
        this.setAntiAlias(true);
        this.enableMouse();
        centre();
        this.setBackgroundColor(bg);
        this.clear();
    }

}