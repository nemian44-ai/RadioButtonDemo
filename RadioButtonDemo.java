import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    JRadioButton bird, cat, dog, rabbit, pig;
    JLabel imageLabel;
      public RadioButtonDemo() {

        setTitle("RadioButton Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        ButtonGroup group = new ButtonGroup();
        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

        bird.addActionListener(this);
        cat.addActionListener(this);
        dog.addActionListener(this);
        rabbit.addActionListener(this);
        pig.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1));
  panel.add(bird);
        panel.add(cat);
        panel.add(dog);
        panel.add(rabbit);
        panel.add(pig);

        imageLabel = new JLabel();

        add(panel);
        add(imageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String pet = "";

        if (bird.isSelected()) {
            pet = "Bird";
            imageLabel.setIcon(new ImageIcon("images/bird.jpg"));
        }
    if (cat.isSelected()) {
            pet = "Cat";
            imageLabel.setIcon(new ImageIcon("images/cat.jpg"));
        }

        if (dog.isSelected()) {
            pet = "Dog";
            imageLabel.setIcon(new ImageIcon("images/dog.jpg"));
        }

        if (rabbit.isSelected()) {
            pet = "Rabbit";
            imageLabel.setIcon(new ImageIcon("images/rabbit.jpg"));
        }

        if (pig.isSelected()) {
            pet = "Pig";
            imageLabel.setIcon(new ImageIcon("images/pig.jpg"));
        }

        JOptionPane.showMessageDialog(this, "You selected: " + pet);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}