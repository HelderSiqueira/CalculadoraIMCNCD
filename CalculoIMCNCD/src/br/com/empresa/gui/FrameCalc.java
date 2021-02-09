package br.com.empresa.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import br.com.empresa.model.Calculo;

public class FrameCalc {

	public void	criarTela() {
		
		//CARACTERISTICAS DA TELA 
		JFrame tela = new JFrame();
		tela.setTitle("Calculo de IMC e NCD");
		tela.setSize(600, 320);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		//CONSTRUINDO JLABEL NOME
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(10, 10, 60, 30);
		
		//CONSTRUINDO TEXTFIELD NOME
		JTextField textNome = new JTextField();
		textNome.setBounds(60, 10, 230, 30);
		
		//CONSTRUINDO EXIBIÇÃO DATA
		JLabel labelData = new JLabel();
		labelData.setText("Data de nascimento:");
		labelData.setBounds(310, 10, 150, 30);
		
		//CONSTRUINDO TEXTFIELD DATA
		JTextField textData = new JTextField();
		textData.setBounds(450, 10, 110, 30);
		
		//CONSTRUINDO JLABEL ALTURA
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(10, 60, 60, 30);
		
		//CONSTRUINDO TEXTFIELD ALTURA
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70, 60, 120, 30);
		
		//CONSTRUINDO JLABEL PESO
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(10, 100, 60, 30);
		
		//CONSTRUINDO TEXTFIELD PESO
		JTextField textPeso = new JTextField();
		textPeso.setBounds(70, 100, 120, 30);
		
		//CONSTRUINDO LABEL PARA A CHECKBOX
		JLabel labelSexo = new JLabel();
		labelSexo.setText("Sexo:");
		labelSexo.setBounds(225, 60, 100, 30);
		
		//CONSTRUINDO CHECKBOX MASC - FEMI
		JRadioButton masculino = new JRadioButton("Masculino");
		JRadioButton feminino = new JRadioButton("Feminino");
		masculino.setBounds(220, 100, 85, 30);
		feminino.setBounds(305, 100, 85, 30); //30
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(masculino);
		grupo.add(feminino);
		
		//CONSTRUINDO LABEL PARA LVL ATIVIDADE
		JLabel labelFatividade =  new JLabel();
		labelFatividade.setText("Frequência de atividade:");
		labelFatividade.setBounds(420, 60, 150, 30);
		
		//CONSTRUINDO COMBOBOX LVL ATIVIDADE
		JComboBox<String> atividade = new JComboBox<String>();
		atividade.setBounds(420, 100, 110, 30);
		atividade.addItem(" Muito baixa");
		atividade.addItem(" Baixa");
		atividade.addItem(" Mediana");
		atividade.addItem(" Alta");
		atividade.addItem(" Muito alta");
		
		//CONSTRUINDO JLABEL IMC =
		JLabel labelIMC = new JLabel();
		labelIMC.setText("Seu IMC é: ");
		labelIMC.setBounds(10, 200, 80, 30);
		
		//CONSTRUINDO TEXTFIELD RESULTADO IMC =
		JTextField textIMC = new JTextField();
		textIMC.setBounds(80, 200, 110, 30);
		
		//CONSTRUINDO LABEL RESULTADO NCD =
		JLabel labelNCD = new JLabel();
		labelNCD.setText("Seu NCD é: ");
		labelNCD.setBounds(10, 240, 80, 30);
		
		//CONSTRUINDO TEXTFIELD RESULTADO NCD = 
		JTextField textNCD = new JTextField();
		textNCD.setBounds(80, 240, 110, 30);
		
		//CONSTRUINDO BOTÃO CALCULAR
		JButton btnCalcular = new JButton();
		btnCalcular.setText("CALCULAR");
		btnCalcular.setBounds(260, 229, 120, 40);
		
		//CONSTRUINDO BOTÃO LIMPAR
		JButton btnLimpar = new JButton();
		btnLimpar.setText("LIMPAR");
		btnLimpar.setBounds(420, 229, 120, 40);
		
		//EXIBINDO NA TELA
		tela.getContentPane().add(labelNome);
		tela.getContentPane().add(textNome);
		tela.getContentPane().add(labelData);
		tela.getContentPane().add(textData);
		tela.getContentPane().add(labelAltura);
		tela.getContentPane().add(textAltura);
		tela.getContentPane().add(labelPeso);
		tela.getContentPane().add(textPeso);
		tela.getContentPane().add(labelIMC);
		tela.getContentPane().add(labelNCD);
		tela.getContentPane().add(textIMC);
		tela.getContentPane().add(textNCD);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(btnLimpar);
		tela.getContentPane().add(labelSexo);
		tela.getContentPane().add(labelFatividade);
		tela.getContentPane().add(atividade);
		tela.getContentPane().add(masculino);
		tela.getContentPane().add(feminino);
		
		tela.setVisible(true);
	}
}
