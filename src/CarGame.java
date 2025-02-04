import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Random;

public class CarGame extends JFrame {
        private int xpos=300; //x position of the car
        private int ypos=700;//y position of the car
        private ImageIcon car,car1,car2,car3; //car image

        Random random = new Random();// random number  generator

        private int num1=400;    //xposition of the obstracles
        private int tree1ypos=400;
        private int tree2ypos=200;
        private int tree3ypos=500;
        private int tree4ypos=100;
        private int tree5ypos=600;
        private int tree6ypos=300;

        private int roadMove=0; // yposition of the road

        private int carxpos[]={100,200,300,400,500,600};
        private int carypos[]={-240,-480,-720,-960,-1200};

        private int cxpos1=0;
        private int cxpos2=2;
        private int cxpos3=4;

        private int  cypos1=random.nextInt(5);
        private int  cypos2=random.nextInt(5);
        private int  cypos3=random.nextInt(5);

        int y1pos=carypos[cypos1];
        int y2pos=carypos[cypos2];
        int y3pos=carypos[cypos3]; //actual y positionas of car

        private ImageIcon tree1,tree2,tree3;

        int score=10;
        int delay=100;
        int speed=90;

        private boolean gameOver=false;
        private boolean paint=false;

        public CarGame(String title)  {
                super(title);
                setBounds(300,10,700,700);
                setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(null);//set the layout null
                setFocusable(true); //set the focus on null
                setResizable(false); //set not resize able

        }
        public void paint(Graphics gfx){
                gfx.setColor(Color.GREEN);
                gfx.fillRect(0,0,700,700);
                gfx.setColor(Color.gray);
                gfx.fillRect(90,0,10,700);
                gfx.fillRect(600,0,10,700);
                gfx.fillRect(100,0,10,700);

                if(roadMove==0){
                        for(int i=0;i<=700;i++){
                                gfx.setColor(Color.WHITE);
                                gfx.fillRect(350,i,10,70);
                        }
                        roadMove=1;
                }
                else if(roadMove==1){
                        for(int i=0;i<=700;i++){
                                gfx.setColor(Color.WHITE);
                                gfx.fillRect(350,i,10,70);
                        }
                        roadMove=0;
                }
                try{
                        tree1=new ImageIcon(ImageIO.read(getClass()
                                .getClassLoader()
                                .getResourceAsStream("images/tree.jpg")));
                        tree2=new ImageIcon(ImageIO.read(getClass()
                                .getClassLoader()
                                .getResourceAsStream("images/tree.jpg")));
                        tree3=new ImageIcon(ImageIO.read(getClass()
                                .getClassLoader()
                                .getResourceAsStream("images/tree.jpg")));
                }catch(IOException e){
                        e.printStackTrace();
                }
                tree1.paintIcon(this,gfx,0,tree1ypos);
                num1=random.nextInt(500);
                tree1ypos+=50;
                tree2.paintIcon(this,gfx,0,tree2ypos);
                tree2ypos+=50;
                tree3.paintIcon(this,gfx,0,tree3ypos);
                tree3ypos+=50;
        }

}
