import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculadoraComInterface {
    public static void main(String[] args){
        JFrame janela = new JFrame();


        var ref = new Object() {
            double number1;

            double number2;
            String oper;
            double resultado = 0;
        };



        //Tamanho da janela
        janela.setBounds(60, 100, 400, 580);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        // Tela

        JTextField visor = new JTextField();
        visor.setBounds(15,15,360,100);
        janela.add(visor);




        //Botoes
        JButton bks = new JButton("⌫");
        bks.setBounds(0,460,90,80);
        janela.add(bks);

        JButton nu0 = new JButton("0");
        nu0.setBounds(90,460,90,80);
        janela.add(nu0);

        JButton virg = new JButton(".");
        virg.setBounds(180,460,90,80);
        janela.add(virg);

        JButton igual = new JButton("=");
        igual.setBounds(270,460,115,80);
        janela.add(igual);

        JButton nu1 = new JButton("1");
        nu1.setBounds(0,379,90,80);
        janela.add(nu1);

        JButton nu2 = new JButton("2");
        nu2.setBounds(90, 379,90,80);
        janela.add(nu2);

        JButton nu3 = new JButton("3");
        nu3.setBounds(180,379,90,80);
        janela.add(nu3);

        JButton soma = new JButton("+");
        soma.setBounds(270,379,115,80);
        janela.add(soma);

        JButton nu4 = new JButton("4");
        nu4.setBounds(0,299,90,80);
        janela.add(nu4);

        JButton nu5 = new JButton("5");
        nu5.setBounds(90,299,90,80);
        janela.add(nu5);

        JButton nu6 = new JButton("6");
        nu6.setBounds(180,299,90,80);
        janela.add(nu6);

        JButton subtr = new JButton("-");
        subtr.setBounds(270,299,115,80);
        janela.add(subtr);

        JButton nu7 = new JButton("7");
        nu7.setBounds(0,219,90,80);
        janela.add(nu7);

        JButton nu8 = new JButton("8");
        nu8.setBounds(90,219, 90,80);
        janela.add(nu8);

        JButton nu9 = new JButton("9");
        nu9.setBounds(180,219,90,80);
        janela.add(nu9);

        JButton mult = new JButton("X");
        mult.setBounds(270,219,115,80);
        janela.add(mult);

        JButton limpar = new JButton("C");
        limpar.setBounds(0,159,180,60);
        janela.add(limpar);

        JButton div = new JButton("÷");
        div.setBounds(180,159,220,60);
        janela.add(div);


        nu0.addActionListener(e -> {
            visor.setText(visor.getText() + "0");
        });

        nu1.addActionListener(e -> {
            visor.setText(visor.getText() + "1");
        });

        nu2.addActionListener(e -> {
            visor.setText(visor.getText() + "2");
        });

        nu3.addActionListener(e -> {
            visor.setText(visor.getText() + "3");
        });

        nu4.addActionListener(e -> {
            visor.setText(visor.getText() + "4");
        });

        nu5.addActionListener(e ->{
            visor.setText(visor.getText() + "5");
        });

        nu6.addActionListener(e -> {
            visor.setText(visor.getText() + "6");
        });

        nu7.addActionListener(e ->{
            visor.setText(visor.getText() + "7");
        });

        nu8.addActionListener(e -> {
            visor.setText(visor.getText() + "8");
        });

        nu9.addActionListener(e -> {
            visor.setText(visor.getText() + "9");
        });

        limpar.addActionListener(e ->{
            visor.setText("");
        });

        virg.addActionListener(e->{
            visor.setText(visor.getText() + ".");
        });

        soma.addActionListener(e-> {
            ref.number1 = Double.parseDouble(visor.getText());
            ref.oper = "+";
            visor.setText("");
        });

        subtr.addActionListener(e->{
            ref.number1 = Double.parseDouble(visor.getText());
            ref.oper = "-";
            visor.setText("");
        });

        mult.addActionListener(e-> {
            ref.number1 = Double.parseDouble(visor.getText());
            ref.oper = "X";
            visor.setText("");
        });
        div.addActionListener(e-> {
            ref.number1 = Double.parseDouble(visor.getText());
            ref.oper = "÷";
            visor.setText("");
        });
        igual.addActionListener(e->{
            ref.number2 = Double.parseDouble(visor.getText());


            if (ref.oper.equals("+")){
                ref.resultado = ref.number1 + ref.number2;
            }
            else if (ref.oper.equals("-")) {
                ref.resultado = ref.number1 - ref.number2;
            }
            else if (ref.oper.equals("X")) {
                ref.resultado = ref.number1 * ref.number2;
            }

            else if (ref.oper.equals("÷")) {
                if (ref.number2 < 1){
                    visor.setText("Não é possivel dividir por 0");
                }
                else {
                    ref.resultado = ref.number1 / ref.number2;
                }

            }

            visor.setText(String.valueOf(ref.resultado));
        });



        //operaçao de 3 numeros ou mais ( ex: 5*5/ 10 )
        // botao apagar 1 numero



        janela.setVisible(true);
    }
}
