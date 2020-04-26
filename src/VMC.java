import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VMC extends JFrame {
    private  static String n;
    private  static int h1=0;
    private  static int c1=0;
    private  static int p1=0;
    private  static int sum=0;
    private  static int a=0;
    VMC(){

        setTitle("Vending Machine");
        setSize(1000,600);
        final Container[] c = {getContentPane()};
        c[0].setLayout(null);

        ImageIcon BUG = new ImageIcon("burger.PNG"); // 햄버거 버튼
        ImageIcon Coke = new ImageIcon("coke.PNG"); // 콜라 버튼
        ImageIcon pizza = new ImageIcon("Pizza.PNG"); // 피자 버튼

        JLabel bug = new JLabel("Hamburger : 5,000 won");
        bug.setLocation(100, 220);
        bug.setSize(300,200);
        JLabel cok = new JLabel("Coke : 1,000 won");
        cok.setLocation(400, 220);
        cok.setSize(300,200);
        JLabel piz = new JLabel("Pizza : 3,000 won");
        piz.setLocation(700, 220);
        piz.setSize(300,200);

        JLabel cash = new JLabel("총 금액");
        cash.setFont(new Font("Serif",Font.BOLD, 20));
        JTextField cash1 = new JTextField(20);
        cash.setBounds(100, 400, 150, 20);
        cash1.setBounds(200, 400, 550, 25);

        JLabel cash2 = new JLabel("낸 금액");
        cash2.setFont(new Font("Serif",Font.BOLD, 20));
        JTextField cash3 = new JTextField(20);
        cash2.setBounds(100, 425, 150, 20);
        cash3.setBounds(200, 425, 550, 25);

        JLabel chan = new JLabel("거스름돈");
        chan.setFont(new Font("Serif",Font.BOLD, 20));
        JTextField chan1 = new JTextField(20);
        chan.setBounds(100, 450, 150, 20);
        chan1.setBounds(200, 450, 550, 25);

        JButton b1 = new JButton(BUG);
        b1.setBounds(100,100,200, 200);
        JButton b2 = new JButton(Coke);
        b2.setBounds(400,100, 200, 200);
        JButton b3 = new JButton(pizza);
        b3.setBounds(700,100, 200, 200);
        JButton b4 = new JButton("계산하기");
        b4.setLocation(800,400);
        b4.setSize(100, 50);



        c[0].add(bug);
        c[0].add(cok);
        c[0].add(piz);
        c[0].add(b1);
        c[0].add(b2);
        c[0].add(b3);
        c[0].add(b4);
        c[0].add(cash);
        c[0].add(cash1);
        c[0].add(cash2);
        c[0].add(cash3);
        c[0].add(chan);
        c[0].add(chan1);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum=sum+5000;
                h1++;
                cash1.setText(String.valueOf(sum));
            }

        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum=sum+1000;
                c1++;
                cash1.setText(String.valueOf(sum));
            }

        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum=sum+3000;
                p1++;
                cash1.setText(String.valueOf(sum));
            }

        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n=cash3.getText();
                a=Integer.valueOf(n);

                int change=a-sum;

                int c1=(int)(change/10000);
                int c2=(change%10000)/5000;
                int c3=(change%5000)/1000;
                int c4=(change%1000)/500;
                int c5=(change%500)/100;
                int c6=(change%100)/50;
                int c7=(change%50)/10;


                chan1.setText("거스름돈은"+String.valueOf(change)+"원 입니다."+
                        " 만원"+String.valueOf(c1)+"개"+
                        " 오천원"+String.valueOf(c2)+"개"+
                        " 천원"+String.valueOf(c3)+"개"+
                        " 오백원"+String.valueOf(c4)+"개"+
                        " 백원"+String.valueOf(c5)+"개"+
                        " 오십원"+String.valueOf(c6)+"개"+
                        " 십원"+String.valueOf(c7)+"개");
            }

        });


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {

        new VMC();
    }
}