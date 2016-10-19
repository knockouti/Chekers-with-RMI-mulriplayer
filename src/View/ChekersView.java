package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

/**
 * Created by Igor on 19.09.2016.
 */
public class ChekersView extends JPanel implements Serializable {

    private BufferedImage image;
    JLabel labelImage;

    public ChekersView(Color color)  {
        super();

        try {
            if(color == Color.red) {
                image= ImageIO.read(new File("src\\images\\redd.png"));
            }
            if(color == Color.white){
                image = ImageIO.read(new File("src\\images\\whitee.png"));
            }
        }
        catch (IOException ex){
            System.out.printf("File hasn't been");
        }

    }


    public void setColorChker(){
        labelImage = new JLabel(new ImageIcon(image));
        Dimension size = new Dimension(image.getWidth(null), image.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
        this.add(labelImage);
    }

    public void paintComponent(Graphics g) {

        g.drawImage(image, 0, 0, null);

    }

}
