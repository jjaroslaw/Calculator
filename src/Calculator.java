import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator extends JFrame implements ActionListener{
	public Calculator() {
		
		this.setTitle("CalcX");
		this.setBounds(100, 100, 358, 481);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setMinimumSize(new Dimension(358, 481));
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 37));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setSize(209, 43);
		this.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setEditable(false);
		textField.setBackground(new Color(228, 228, 228));
		
		extraTextField = new JTextField();
		extraTextField.setFont(new Font("Arial", Font.PLAIN, 16));
		extraTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		extraTextField.setSize(209, 33);
		this.getContentPane().add(extraTextField);
		extraTextField.setColumns(10);
		extraTextField.setBorder(null);
		extraTextField.setEditable(false);
		extraTextField.setBackground(new Color(228, 228, 228));
		
		JLabel lblCreatedByJaroslaw = new JLabel("Created by Jaroslaw Juszczak");
		lblCreatedByJaroslaw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCreatedByJaroslaw.setFont(new Font("Arial", Font.PLAIN, 9));
		lblCreatedByJaroslaw.setSize(146, 14);
		this.getContentPane().add(lblCreatedByJaroslaw);
		this.getContentPane().setBackground(new Color(228, 228, 228));
		
		buttonAdjustment(buttonSqrt = new JButton("\u221A"), new Font("Arial", Font.ITALIC, 20), 240, 240, 240);
		buttonAdjustment(buttonSquare = new JButton("x"+"\u00B2"), new Font("Times New Roman", Font.ITALIC, 19), 240, 240, 240);
		buttonAdjustment(buttonCubed = new JButton("x"+"\u00B3"), new Font("Times New Roman", Font.ITALIC, 19), 240, 240, 240);
		buttonAdjustment(buttonInverse = new JButton("1/x"), new Font("Times New Roman", Font.ITALIC, 19), 240, 240, 240);
		
		buttonAdjustment(buttonCE = new JButton("CE"), new Font("Arial", Font.PLAIN, 20), 240, 240, 240);
		buttonAdjustment(buttonC = new JButton("C"), new Font("Arial", Font.PLAIN, 20), 240, 240, 240);
		buttonAdjustment(buttonBackSpace = new JButton("\u2190"), new Font("Arial", Font.PLAIN, 16), 240, 240, 240);
		buttonAdjustment(buttonDivide = new JButton("\u00F7"), new Font("Arial", Font.PLAIN, 28), 240, 240, 240);
		
		buttonAdjustment(button7 = new JButton("7"), new Font("Arial", Font.BOLD, 20), 255, 255, 255);
		buttonAdjustment(button8 = new JButton("8"), new Font("Arial", Font.BOLD, 20), 255, 255, 255);
		buttonAdjustment(button9 = new JButton("9"), new Font("Arial", Font.BOLD, 20), 255, 255, 255);
		buttonAdjustment(buttonMultiply = new JButton("x"), new Font("Tahoma", Font.PLAIN, 20), 240, 240, 240);
		
		buttonAdjustment(button4 = new JButton("4"), new Font("Arial", Font.BOLD, 20), 255, 255, 255);
		buttonAdjustment(button5 = new JButton("5"), new Font("Arial", Font.BOLD, 20), 255, 255, 255);
		buttonAdjustment(button6 = new JButton("6"), new Font("Arial", Font.BOLD, 20), 255, 255, 255);
		buttonAdjustment(buttonPlus = new JButton("+"), new Font("Arial", Font.PLAIN, 20), 240, 240, 240);
		
		buttonAdjustment(button1 = new JButton("1"), new Font("Arial", Font.BOLD, 20), 255, 255, 255);
		buttonAdjustment(button2 = new JButton("2"), new Font("Arial", Font.BOLD, 20), 255, 255, 255);
		buttonAdjustment(button3 = new JButton("3"), new Font("Arial", Font.BOLD, 20), 255, 255, 255);
		buttonAdjustment(buttonMinus = new JButton("-"), new Font("Arial", Font.PLAIN, 20), 240, 240, 240);
		
		buttonAdjustment(buttonPlusMinus = new JButton("\u00B1"), new Font("Arial", Font.PLAIN, 20), 240, 240, 240);
		buttonAdjustment(button0 = new JButton("0"), new Font("Arial", Font.BOLD, 20), 255, 255, 255);
		buttonAdjustment(buttonComma = new JButton(","), new Font("Tahoma", Font.PLAIN, 20), 240, 240, 240);
		buttonAdjustment(buttonEquals = new JButton("="), new Font("Arial", Font.PLAIN, 20), 240, 240, 240);
		
		GroupLayout layout = new GroupLayout(this.getContentPane());
		this.getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		layout.setHorizontalGroup(layout.createParallelGroup()
				.addGap(30, 30, Short.MAX_VALUE)
				.addComponent(extraTextField)
				.addComponent(textField)
				.addGap(30, 30, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup()
					.addGroup(layout.createSequentialGroup()
						.addComponent(buttonSqrt, 75, 75, Short.MAX_VALUE).addComponent(buttonSquare, 75, 75, Short.MAX_VALUE).addComponent(buttonCubed, 75, 75, Short.MAX_VALUE).addComponent(buttonInverse, 75, 75, Short.MAX_VALUE))
					.addGroup(layout.createSequentialGroup()
						.addComponent(buttonCE, 75, 75, Short.MAX_VALUE).addComponent(buttonC, 75, 75, Short.MAX_VALUE).addComponent(buttonBackSpace, 75, 75, Short.MAX_VALUE).addComponent(buttonDivide, 75, 75, Short.MAX_VALUE))
					.addGroup(layout.createSequentialGroup()
							.addComponent(button7, 75, 75, Short.MAX_VALUE).addComponent(button8, 75, 75, Short.MAX_VALUE).addComponent(button9, 75, 75, Short.MAX_VALUE).addComponent(buttonMultiply, 75, 75, Short.MAX_VALUE))
					.addGroup(layout.createSequentialGroup()
							.addComponent(button4, 75, 75, Short.MAX_VALUE).addComponent(button5, 75, 75, Short.MAX_VALUE).addComponent(button6, 75, 75, Short.MAX_VALUE).addComponent(buttonPlus, 75, 75, Short.MAX_VALUE))
					.addGroup(layout.createSequentialGroup()
								.addComponent(button1, 75, 75, Short.MAX_VALUE).addComponent(button2, 75, 75, Short.MAX_VALUE).addComponent(button3, 75, 75, Short.MAX_VALUE).addComponent(buttonMinus, 75, 75, Short.MAX_VALUE))
					.addGroup(layout.createSequentialGroup()
						.addComponent(buttonPlusMinus, 75, 75, Short.MAX_VALUE).addComponent(button0, 75, 75, Short.MAX_VALUE).addComponent(buttonComma, 75, 75, Short.MAX_VALUE).addComponent(buttonEquals, 75, 75, Short.MAX_VALUE)))
				.addComponent(lblCreatedByJaroslaw)
				);
		
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGap(30, 30, Short.MAX_VALUE)
				.addComponent(extraTextField, 33, 33, 33)
				.addComponent(textField, 43, 43, 43)
				.addGap(30, 30, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup()
					.addGroup(layout.createSequentialGroup()
							.addComponent(buttonSqrt, 42, 42, Short.MAX_VALUE).addComponent(buttonCE, 42, 42, Short.MAX_VALUE).addComponent(button7, 42, 42, Short.MAX_VALUE).addComponent(button4, 42, 42, Short.MAX_VALUE).addComponent(button1, 42, 42, Short.MAX_VALUE).addComponent(buttonPlusMinus, 42, 42, Short.MAX_VALUE))	
					.addGroup(layout.createSequentialGroup()
							.addComponent(buttonSquare, 42, 42, Short.MAX_VALUE).addComponent(buttonC, 42, 42, Short.MAX_VALUE).addComponent(button8, 42, 42, Short.MAX_VALUE).addComponent(button5, 42, 42, Short.MAX_VALUE).addComponent(button2, 42, 42, Short.MAX_VALUE).addComponent(button0, 42, 42, Short.MAX_VALUE))
					.addGroup(layout.createSequentialGroup()
							.addComponent(buttonCubed, 42, 42, Short.MAX_VALUE).addComponent(buttonBackSpace, 42, 42, Short.MAX_VALUE).addComponent(button9, 42, 42, Short.MAX_VALUE).addComponent(button6, 42, 42, Short.MAX_VALUE).addComponent(button3, 42, 42, Short.MAX_VALUE).addComponent(buttonComma, 42, 42, Short.MAX_VALUE))
					.addGroup(layout.createSequentialGroup()
							.addComponent(buttonInverse, 42, 42, Short.MAX_VALUE).addComponent(buttonDivide, 42, 42, Short.MAX_VALUE).addComponent(buttonMultiply, 42, 42, Short.MAX_VALUE).addComponent(buttonPlus, 42, 42, Short.MAX_VALUE).addComponent(buttonMinus, 42, 42, Short.MAX_VALUE).addComponent(buttonEquals, 42, 42, Short.MAX_VALUE)))
				.addComponent(lblCreatedByJaroslaw)
						);	
	}
	
	private void buttonAdjustment(Object button, Font font, int r, int g, int b) {
		this.getContentPane().add((Component) button);
		((Component) button).setFont(font);
		((AbstractButton) button).addActionListener(this);
		((Component) button).setBackground(new Color(r, g, b));
		((AbstractButton) button).setBorderPainted(false);
		((AbstractButton) button).setFocusPainted(false);
		
		((Component) button).addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	((Component) button).setBackground(new Color(216, 216, 216));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	((Component) button).setBackground(new Color(r, g, b));
		    }
		} );
	}
	
	private JTextField textField;
	private JTextField extraTextField;
	private JButton buttonSqrt;
	private JButton buttonSquare;
	private JButton buttonBackSpace;
	private JButton buttonComma;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JButton buttonC;
	private JButton buttonPlus;
	private JButton buttonMinus;
	private JButton buttonEquals;
	private JButton buttonDivide;
	private JButton buttonMultiply;
	private JButton buttonInverse;
	private JButton buttonCE;
	private JButton buttonPlusMinus;
	private JButton buttonCubed;
	private JLabel lblCreatedByJaroslaw;
	
	double firstNumber;
	double secondNumber;
	String operation;
	String answer;
	String tmpExtraFieldText;
	boolean lastButtonEquals;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			addNumber(1);
		}
		else if (e.getSource() == button2) {
			addNumber(2);
		}
		else if (e.getSource() == button3) {
			addNumber(3);
		}
		else if (e.getSource() == button4) {
			addNumber(4);
		}
		else if (e.getSource() == button5) {
			addNumber(5);
		}
		else if (e.getSource() == button6) {
			addNumber(6);
		}
		else if (e.getSource() == button7) {
			addNumber(7);
		}
		else if (e.getSource() == button8) {
			addNumber(8);
		}
		else if (e.getSource() == button9) {
			addNumber(9);
		}
		else if (e.getSource() == button0) {
			if (!(textField.getText().equals("0")) && operation != "/")
				addNumber(0);
		}
		else if (e.getSource() == buttonComma && textField.getText().length() > 0) {
			int count = textField.getText().length() - textField.getText().replace(".", "").length();
			if (count == 0) {
				String enterNumber = textField.getText();
				enterNumber += ".";
				textField.setText(enterNumber);
				lastButtonEquals = false;
			}
		}
		else if (e.getSource() == buttonC) {
			extraTextField.setText("");
			textField.setText("");
			firstNumber = 0.0;
			secondNumber = 0.0;
			operation = "";
			answer = "";
			lastButtonEquals = false;
		}
		else if (e.getSource() == buttonPlus && textField.getText().length() > 0) {
			firstNumber = Double.parseDouble(textField.getText());
			operation = "+";
			extraTextField.setText(textField.getText() + " " + operation + " ");
			textField.setText("");
			lastButtonEquals = false;
		}
		else if (e.getSource() == buttonMinus && textField.getText().length() > 0) {
			firstNumber = Double.parseDouble(textField.getText());
			operation = "-";
			extraTextField.setText(textField.getText() + " " + operation + " ");
			textField.setText("");
			lastButtonEquals = false;
		}
		else if (e.getSource() == buttonDivide && textField.getText().length() > 0) {
			firstNumber = Double.parseDouble(textField.getText());
			operation = "/";
			extraTextField.setText(textField.getText() + " " + operation + " ");
			textField.setText("");
			lastButtonEquals = false;
		}
		else if (e.getSource() == buttonMultiply && textField.getText().length() > 0) {
			firstNumber = Double.parseDouble(textField.getText());
			operation = "x";
			extraTextField.setText(textField.getText() + " x ");
			textField.setText("");
			lastButtonEquals = false;
		}
		else if (e.getSource() == buttonEquals && textField.getText().length() > 0 && operation != null) {
			if (lastButtonEquals == false)
				secondNumber = Double.parseDouble(textField.getText());
			    tmpExtraFieldText = String.format("%.7f", secondNumber);
			    deleteZeros(tmpExtraFieldText);
			    String secondNumberExtraText = answer;
			    String firstNumberExtraText = String.format("%.7f", firstNumber);
			    deleteZeros(firstNumberExtraText);
			    firstNumberExtraText = answer;
			    extraTextField.setText(firstNumberExtraText + " " + operation + " " + secondNumberExtraText + " =");
			
			if (operation == "+") {
				answer = String.format("%.7f", (firstNumber + secondNumber));
				deleteZeros(answer);
				textField.setText(answer);
				lastButtonEquals = true;
				firstNumber = Double.parseDouble(textField.getText());
			}
			else if (operation == "-") {
				answer = String.format("%.7f", (firstNumber - secondNumber));
				deleteZeros(answer);
				textField.setText(answer);
				lastButtonEquals = true;
				firstNumber = Double.parseDouble(textField.getText());
			}
			else if (operation == "x") {
				answer = String.format("%.7f", (firstNumber * secondNumber));
				deleteZeros(answer);
				textField.setText(answer);
				lastButtonEquals = true;
				firstNumber = Double.parseDouble(textField.getText());
			}
			else if (operation == "/") {
				answer = String.format("%.7f", (firstNumber / secondNumber));
				deleteZeros(answer);
				textField.setText(answer);
				lastButtonEquals = true;
				firstNumber = Double.parseDouble(textField.getText());
			}
		}
		else if (e.getSource() == buttonSquare && textField.getText().length() > 0) {
			extraTextField.setText("(" + textField.getText() + ")" + "\u00B2" +" =");
			firstNumber = Double.parseDouble(textField.getText());
			firstNumber = Math.pow(firstNumber, 2.0);
			answer = String.format("%.7f", firstNumber);
			deleteZeros(answer);
			textField.setText(answer);
		}
		else if (e.getSource() == buttonSqrt && textField.getText().length() > 0 && Double.parseDouble(textField.getText()) > 0) {
			extraTextField.setText("\u221A" + "(" + textField.getText() + ") =");
			firstNumber = Double.parseDouble(textField.getText());
			firstNumber = Math.sqrt(firstNumber);
			answer = String.format("%.7f", firstNumber);
			deleteZeros(answer);
			textField.setText(answer);
		}
		else if (e.getSource() == buttonBackSpace && textField.getText().length() > 0) {
			if (lastButtonEquals == false) {
				StringBuilder strB = new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length() -1);
				answer = strB.toString();
				textField.setText(answer);
			}
		}
		else if (e.getSource() == buttonCubed && textField.getText().length() > 0) {
			extraTextField.setText("(" + textField.getText() + ")" + "\u00B3" +" =");
			firstNumber = Double.parseDouble(textField.getText());
			firstNumber = Math.pow(firstNumber, 3.0);
			answer = String.format("%.7f", firstNumber);
			deleteZeros(answer);
			textField.setText(answer);
		}
		else if (e.getSource() == buttonInverse && textField.getText().length() > 0) {
			extraTextField.setText("1/(" + textField.getText() + ")" +" =");
			firstNumber = Double.parseDouble(textField.getText());
			firstNumber = 1/firstNumber;
			answer = String.format("%.7f", firstNumber);
			deleteZeros(answer);
			textField.setText(answer);
		}
		else if (e.getSource() == buttonCE && textField.getText().length() > 0) {
			textField.setText("");
		}
		else if (e.getSource() == buttonPlusMinus && textField.getText().length() > 0 && Double.parseDouble(textField.getText()) != 0) {
			double tmpNumber = Double.parseDouble(textField.getText());
			lastButtonEquals = false;
			if (tmpNumber > 0) {
				answer = textField.getText();
				textField.setText("-" + answer);
			}
			else {
				tmpNumber = Math.abs(tmpNumber);
				answer = String.format("%.7f", tmpNumber);
				deleteZeros(answer);
				textField.setText(answer);
			}
		}
		
	}
	
	public void addNumber(int number) {
		String enterNumber = textField.getText();
		if (!textField.getText().equals("0")) {
			enterNumber += Integer.toString(number);
			textField.setText(enterNumber);
			lastButtonEquals = false;
		}
	}
	
	public void deleteZeros(String number) {
		number = number.replace(',','.');
		if (number.length() > 1 && number.lastIndexOf("0") == number.length()-1) {
			StringBuilder strB = new StringBuilder(number);
			strB.deleteCharAt(number.length() -1);
			number = strB.toString();
			deleteZeros(number);
		}
		else if (number.lastIndexOf(".") == number.length()-1) {
			StringBuilder strB = new StringBuilder(number);
			strB.deleteCharAt(number.length() -1);
			number = strB.toString();
			answer = number;
		}
		else {
			answer = number;
		}
	}
	
	public static void main(String[] args) {
		new Calculator().setVisible(true);
	}
}
