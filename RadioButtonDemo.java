import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    JRadioButton bird, cat, dog, rabbit, pig;
    JLabel imageLabel;
    ButtonGroup group;

    public RadioButtonDemo() {
        setTitle("RadioButton Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
           // Create radio buttons
        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        // Group radio buttons
        group = new ButtonGroup();
        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);
   // Add listeners
        bird.addActionListener(this);
        cat.addActionListener(this);
        dog.addActionListener(this);
        rabbit.addActionListener(this);
        pig.addActionListener(this);

        // Left panel
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(5, 1));
        leftPanel.add(bird);
        leftPanel.add(cat);
        leftPanel.add(dog);
        leftPanel.add(rabbit);
        leftPanel.add(pig);
          // Image label
        imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(250, 250));

        add(leftPanel);
        add(imageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String pet = "";
        String image = "";

        if (bird.isSelected()) {
            pet = "Bird";
            image = "bird.jpeg";
        } else if (cat.isSelected()) {
            pet = "Cat";
            image = "cat.jpeg";
        } else if (dog.isSelected()) {
            pet = "Dog";
            image = "dog.jpeg";
        } else if (rabbit.isSelected()) {
            pet = "Rabbit";
             image = "rabbit.jpeg";
        } else if (pig.isSelected()) {
            pet = "Pig";
            image = "pig.jpeg";
        }

        imageLabel.setIcon(new ImageIcon(image));

        JOptionPane.showMessageDialog(this,
                "You selected: " + pet,
                "Pet Selected",
                JOptionPane.INFORMATION_MESSAGE);
    }
 public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
