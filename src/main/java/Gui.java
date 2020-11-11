import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    //private final JLabel departure = new JLabel("Откуда");
    //private final JLabel arrival = new JLabel("Откуда");
    public Gui (){
        super("Расписание поездов");
       // this.setBounds(100,100,300,150);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int sizeWidth = 800;
        int sizeHeight = 600;
        int locationX = (screenSize.width - sizeWidth) / 2;
        int locationY = (screenSize.height - sizeHeight) / 2;
        this.setBounds(locationX, locationY, sizeWidth, sizeHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,3,2,2));
        JLabel nameOfFirstString = new JLabel("Укажите маршрут поездки");
        container.add(nameOfFirstString);
        JTextField departureName = new JTextField("Откуда");
        container.add(departureName);
        JTextField arrivalName = new JTextField("Куда");
        container.add(arrivalName);
        JButton buildRoute = new JButton("Узнать расписание");
        container.add(buildRoute);
        this.setVisible(true);
    }











}
