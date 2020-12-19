import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {
	
JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, add, sub,
      div, mult, equalto, exit, point, reset;
  JTextField textField;
  String s = "", ope = "";
  int flag = 0;
  double total1;
  double first, second;

  void total(double first, double second, String ope) {
    String total;
    if (ope.equalsIgnoreCase("+")) {
      total1 = first + second;
      total = Double.toString(total1);
      textField.setText(total);
    } else if (ope.equalsIgnoreCase("-")) {
      total1 = first - second;
      total = Double.toString(total1);
      textField.setText(total);
    } else if (ope.equalsIgnoreCase("*")) {
      total1 = first * second;
      total = Double.toString(total1);
      textField.setText(total);
    } else if (ope.equalsIgnoreCase("/")) {
      total1 = first / second;
      total = Double.toString(total1);
      textField.setText(total);
    }
    clearfields();
  }

  public Calculadora() {
    Container content = getContentPane();
    content.setLayout(new FlowLayout());
    JLabel jl = new JLabel("Calculadora");
    textField = new JTextField(15);
    num1 = new JButton(" 1 ");
    num2 = new JButton(" 2 ");
    num3 = new JButton(" 3 ");
    num4 = new JButton(" 4 ");
    num5 = new JButton(" 5 ");
    num6 = new JButton(" 6 ");
    num7 = new JButton(" 7 ");
    num8 = new JButton(" 8 ");
    num9 = new JButton(" 9 ");
    num0 = new JButton(" 0 ");
    add = new JButton(" + ");
    sub = new JButton("  -  ");
    div = new JButton("  / ");
    mult = new JButton(" *  ");
    equalto = new JButton(" = ");
    exit = new JButton("    Exit     ");
    point = new JButton("  . ");
    reset = new JButton("C");
    num1.addActionListener(this);
    num2.addActionListener(this);
    num3.addActionListener(this);
    num4.addActionListener(this);
    num5.addActionListener(this);
    num6.addActionListener(this);
    num7.addActionListener(this);
    num8.addActionListener(this);
    num9.addActionListener(this);
    num0.addActionListener(this);
    add.addActionListener(this);
    sub.addActionListener(this);
    mult.addActionListener(this);
    div.addActionListener(this);
    equalto.addActionListener(this);
    exit.addActionListener(this);
    point.addActionListener(this);
    reset.addActionListener(this); 
    content.add(jl);
    content.add(textField);
    content.add(num1);
    content.add(num2);
    content.add(num3);
    content.add(add);
    content.add(num4);
    content.add(num5);
    content.add(num6);
    content.add(sub);
    content.add(num7);
    content.add(num8);
    content.add(num9);
    content.add(div);
    content.add(num0);
    content.add(point);
    content.add(mult);
    content.add(equalto);
    content.add(reset);
    content.add(exit);
  }

  public static void main(String arg[]) {
   Calculadora jf = new Calculadora();
    jf.setSize(230, 250);
    jf.setVisible(true);

  }

  public void actionPerformed(ActionEvent e) {
    Object o = e.getSource();
    if (o == num1) {
      textField.setText(s.concat("1"));
      s = textField.getText();
    } else if (o == num2) {
      textField.setText(s.concat("2"));
      s = textField.getText();
    } else if (o == num3) {
      textField.setText(s.concat("3"));
      s = textField.getText();
    } else if (o == num4) {
      textField.setText(s.concat("4"));
      s = textField.getText();
    } else if (o == num5) {
      textField.setText(s.concat("5"));
      s = textField.getText();
    } else if (o == num6) {
      textField.setText(s.concat("6"));
      s = textField.getText();
    } else if (o == num7) {
      textField.setText(s.concat("7"));
      s = textField.getText();
    } else if (o == num8) {
      textField.setText(s.concat("8"));
      s = textField.getText();
    } else if (o == num9) {
      textField.setText(s.concat("9"));
      s = textField.getText();
    } else if (o == num0) {
      textField.setText(s.concat("0"));
      s = textField.getText();
    } else if (o == add) {

      textField.setText("");
      first = Double.parseDouble(s);
      System.out.println(first);
      s = "";
      ope = "+";
    } else if (o == sub) {
      textField.setText("");
      first = Double.parseDouble(s);
      s = "";
      ope = "-";
    } else if (o == mult) {
      textField.setText("");
      first = Double.parseDouble(s);
      s = "";
      ope = "*";
    } else if (o == div) {
      textField.setText("");
      first = Double.parseDouble(s);
      s = "";
      ope = "/";
    } else if (o == equalto) {
      if (flag == 0) {
        second = Double.parseDouble(s);
        total(first, second, ope);
        flag = 1;
      } else if (flag == 1) {
        second = Double.parseDouble(s);
        total(first, second, ope);
      }
      System.out.println(first);
    } else if (o == exit) {
      System.exit(0);
    } else if (o == point) {
      textField.setText(s.concat("."));
      s = textField.getText();
    }
    if (o == reset) {
      textField.setText("");
      s = textField.getText();
      total1 = 0;
    }
  }

  private void clearfields() {
    first = 0;
    second = 0;
    ope = "";
    flag = 0;
    total1 = 0;
    s = "";
  }
}
