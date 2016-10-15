package View;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.Serializable;

/**
 * Created by Igor on 15.10.2016.
 */
public class ImageMy extends Image implements Serializable {
    @Override
    public int getWidth(ImageObserver observer) {
        return 0;
    }

    @Override
    public int getHeight(ImageObserver observer) {
        return 0;
    }

    @Override
    public ImageProducer getSource() {
        return null;
    }

    @Override
    public Graphics getGraphics() {
        return null;
    }

    @Override
    public Object getProperty(String name, ImageObserver observer) {
        return null;
    }
}
