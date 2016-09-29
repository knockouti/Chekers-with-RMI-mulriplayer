package View;

import Controller.Controller;
import Model.Cell;

import javax.imageio.ImageIO;
import javax.naming.ldap.Control;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.GraphicAttribute;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Igor on 19.09.2016.
 */
public class ChekersView extends JPanel {

    BufferedImage image;
    BufferedImage imageRedCheker;
    JLabel labelImage;




    public ChekersView(Color color)  {
        super();

        try {
            if(color == Color.red) {
                image= ImageIO.read(new File("src\\Image\\redd.png"));
            }
            if(color == Color.white){
                image = ImageIO.read(new File("src\\Image\\whitee.png"));
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
