import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class teste {
   public static void main(String[] args) {

     int width = 500;
     int height = 800;
      JFrame frame = new JFrame("Dio Bank");


      JLabel label = new JLabel();
      label.setIcon(new ImageIcon("TITULO3.png"));
      Dimension size = label.getPreferredSize();
      label.setBounds(15, 20, size.width, size.height);

      Color color1 = new Color(57, 141, 202);
	  Color color2 = new Color(233, 77, 95);

      JPanel painel_main = new JPanel() {
        @Override
        protected void paintComponent(Graphics grphcs) {
            super.paintComponent(grphcs);
            Graphics2D g2d = (Graphics2D) grphcs;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, getWidth(), getHeight()); 

        }

    };

    JPanel painel_entrar = new JPanel() {
        @Override
        protected void paintComponent(Graphics grphcs) {
            super.paintComponent(grphcs);
            Graphics2D g2d = (Graphics2D) grphcs;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, getWidth(), getHeight()); 

        }

    };

    JPanel painel_cadastrar = new JPanel() {
        @Override
        protected void paintComponent(Graphics grphcs) {
            super.paintComponent(grphcs);
            Graphics2D g2d = (Graphics2D) grphcs;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, getWidth(), getHeight()); 

        }

    };


    painel_entrar.setVisible(false);
    painel_cadastrar.setVisible(false);
    painel_main.setVisible(true);

    // JButton btn_entrar = new JButton("Entrar") {
    //     @Override
    //     protected void paintComponent(Graphics grphcs) {
    //         super.paintComponent(grphcs);
    //         Graphics2D g2d = (Graphics2D) grphcs;
    //         g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    //         GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
    //         g2d.setPaint(gp);
    //         g2d.fillRect(0, 0, getWidth(), getHeight()); 

    //     }

    // };

    // JButton btn_cadastrar = new JButton("Entrar") {
    //     @Override
    //     protected void paintComponent(Graphics grphcs) {
    //         super.paintComponent(grphcs);
    //         Graphics2D g2d = (Graphics2D) grphcs;
    //         g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    //         GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
    //         g2d.setPaint(gp);
    //         g2d.fillRect(0, 0, getWidth(), getHeight()); 

    //     }

    // };

    int witdh_btn = 100;
    int height_btn = 20;

    
    JButton btn_entrar = new JButton("Entrar");
    btn_entrar.setForeground(Color.black);
    btn_entrar.setText("Entrar");
    btn_entrar.setBounds((width-witdh_btn)/2, 400, witdh_btn, height_btn);
    painel_main.add(btn_entrar);

    btn_entrar.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("oiadad");
        painel_main.setVisible(false);
        painel_entrar.setVisible(true);
        frame.remove(painel_main);
        frame.add(painel_entrar);
    }
    });

    

    JButton btn_cadastrar = new JButton("Cadastrar");
    btn_cadastrar.setForeground(Color.black);
    btn_cadastrar.setText("Cadastrar");
    btn_cadastrar.setBounds((width-witdh_btn)/2, 430, witdh_btn, height_btn);
    painel_main.add(btn_cadastrar);

    btn_cadastrar.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("oiadad");
            painel_main.setVisible(false);
            painel_cadastrar.setVisible(true);
            frame.remove(painel_main);
            frame.add(painel_cadastrar);
        }
        });



    painel_main.setLayout(null);
    painel_main.add(label);

    painel_main.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    frame.add(painel_main);
    // frame.add(pane2);

    frame.setSize(width, height);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);


   }
}