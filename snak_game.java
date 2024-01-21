import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public abstract  class snak_game extends JFrame implements ActionListener,KeyListener {
    private final int wid=300;
    private  final int hight=300;
    private final int dot_size=10;
    private final int all_dot=900;
    private final int rand_pos=29;
    private final int delay=140;

    private final int x[]=new int[all_dot];
    private final int y[]=new int [all_dot];

    private boolean left=false;
    private boolean right=true;
    private boolean up=false;
    private boolean down=false;
    private boolean ingame=true;

    private int dot;
    private int apple_x;
    private int apple_y;

    private Timer timer;
    private Image app;
    private Image ball;
    private Image head;

    public snak_game(){
        ingame();
    }
    public void ingame(){
        addKeyListener(this);
        setBackground(color.black);
        setFocusable(true);

        setPreferredSize(new Dimension(wid,hight));
        loadimage();
        game_var();
        timer=new Timer(delay,this);
        timer.start();
    }
    private void loadimage(){
        ImageIcon iid=new ImageIcon("C:\\Users\\DELL\\Downloads\\apple.png");
        app=iid.getImage();
        ImageIcon iia=new ImageIcon("C:\\Users\\DELL\\Downloads\\snake.png");
        ball=iia.getImage();
        ImageIcon iib=new ImageIcon("C:\\Users\\DELL\\Downloads\\snake-head.png");
        head=iib.getImage();
    }
    private void game_var(){
        dot=3;
        for (int z=0; z<dot; z++){
            x[z]=50-z*10;
            x[z]=50;

        }
        locateapple();
    }


}
