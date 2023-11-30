package holanoseporquenofunciona;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraInterfaz extends JFrame{
	Calculadora calculadora;
	
	public CalculadoraInterfaz() {
		setTitle("Calculadora de División");
	    setSize(300, 200);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JTextField text1= new JTextField("");
	    JTextField tex21= new JTextField("");
	    JLabel jlabel= new JLabel("");
	    JButton botonCalcular = new JButton("Calcular");
	    JPanel pElementos= new JPanel(new GridLayout(4, 2));
	    pElementos.add(new JLabel("Número 1:"));
	    pElementos.add(text1);
	    pElementos.add(new JLabel("Número 2:"));
	    pElementos.add(tex21);
	    pElementos.add(botonCalcular);
	    JLabel labelRest= new JLabel("Resultado:");
	    pElementos.add(labelRest);
	    pElementos.add(jlabel);
	    this.add(pElementos);
	    
	    botonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String num1= text1.getText();
				String num2= tex21.getText();
				int num11= Integer.parseInt(num1);
				int num21= Integer.parseInt(num2);
				calculadora=new Calculadora(num11,num21);
				double resultado = 0;
				try {
					resultado = calculadora.calcularDivisón();
				} catch (CalculadoraException e1) {
					// TODO Auto-generated catch block
					mostrarError(e1.getMennsaje());
				}
				labelRest.setText("Resultado: "+ resultado);
				
			}
	    	
	    });
	    this.setVisible(true);
	}
	public static void main(String[] args) {
		new CalculadoraInterfaz();
	}
	


private void mostrarError(String mensaje) {
JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
}

}
