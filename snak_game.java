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
private  void move(){
        for (int z=dot; z>0;z--){
            x[z]=x[z-1];
            y[z]=y[z-1];

        }
        if (left){
            x[0]-=dot_size;
        }
        if(right){
            x[0]+=dot_size;
        }
        if(up){
            x[0]-=dot_size;
        }
        if (down){
            x[0]+=dot_size;
        }
}
private void checkapple(){
        if(x[0]==apple_x&&y[0]==apple_y){
            dot++;
            locateapple();
        }

} private void check_collaps(){
        for (int z=dot; z>0; z++){
            if((z>3) && (x[0]==x[z]) && (y[0]==y[z])){
ingame=false;
            }
            if(y[0]>hight){
                ingame=false;
            }
            if (y[0]<0){
                ingame=false;
            }
            if(x[0]>wid){
                ingame=false;
            }
            if (x[0]<0){
                ingame=false;
            }
            if(!ingame){
                timer.stop();
            }

        }
    }
private void locateapple(){
        int r=(int)(Math.random()*rand_pos);
        apple_x=(r*dot_size);
        r=(int)(Math.random()*rand_pos);
        apple_y=(r*dot_size);
}
@override
public void paint1(Graphics g){
        super.paintComponents(g);
        paint(g);

}
    private void paint(Graphics g){
if(ingame){
    g.drawImage(app,apple_x,apple_y,this);
    for (int z=0; z<dot; z++){
        if (z==0){
        g.drawImage(head,x[z],y[z],this);}
        else {
            g.drawImage(ball,x[z],y[z],this);
        }
    }
    Toolkit.getDefaultToolkit().sync();
}else {
    gameOver(g);
}
    }
}
