/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscaminas;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author nenod
 */
public class BuscaMinas extends JFrame{

    public BuscaMinas(){

        setLayout(new BorderLayout());
        setSize(900,700);
        setTitle("Juego: Busca Minas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    
         JPanel panTitulo = new JPanel(new GridBagLayout());
        panTitulo.setBackground(Color.RED);
         GridBagConstraints dimension = new GridBagConstraints();
         dimension.insets = new Insets(5,5,5,5);
      
         this.getContentPane().add(panTitulo);
         
         //setLayout(new BorderLayout());
        //pan.setBackground(Color.GREEN);
         
         JLabel  nombre =  new JLabel("Nombre del jugador: ");
       
         nombre.setForeground(Color.BLACK);
         nombre.setFont(new Font("arial",1,15));
         panTitulo.add(nombre);
         JTextField cajaTexto1 = new JTextField(15);
         
         
         
         JLabel dificultad =  new JLabel("Elige la Dificultad: ");
         JTextField cajaTexto2 = new JTextField(15);
     
         dificultad.setForeground(Color.BLACK);
         dificultad.setFont(new Font("arial",1,15));
         panTitulo.add(dificultad);
         
         
        
         JLabel numMinas =  new JLabel("Numero de minas: ");
         JTextField cajaTexto3 = new JTextField(15);
       
         numMinas.setForeground(Color.BLACK);
         numMinas.setFont(new Font("arial",1,15));
         panTitulo.add(numMinas);
         
         
         
         JButton bot2 = new JButton("Iniciar");
         JButton bot3 = new JButton("Generar minas");
         bot3.setMnemonic('b');
         
         
         dimension.gridx=0;
         dimension.gridy=0;
         panTitulo.add(nombre, dimension);
         
         dimension.gridx=1;
         dimension.gridy=0;
         panTitulo.add(cajaTexto1, dimension);
         
         dimension.gridx=1;
         dimension.gridy=2;
         panTitulo.add(numMinas, dimension);
         
         dimension.gridx=0;
         dimension.gridy=1;
         panTitulo.add(dificultad, dimension);
         
         String[] lenguajes = {"Facil", "Normal", "Dicifil"};
        JComboBox lista = new JComboBox(lenguajes);
       
         dimension.gridx=1;
         dimension.gridy=1;
         panTitulo.add(lista, dimension);
         

        
        
         
         dimension.gridx=1;
         dimension.gridy=4;
         panTitulo.add(bot2, dimension);
         
         dimension.gridx=1;
         dimension.gridy=3;
         panTitulo.add(bot3, dimension);
         
         
         
         JPanel minitas1 = new JPanel();
         //minitas1.setBackground(Color.RED);
         minitas1.setLayout(new GridLayout(4,4));
         minitas1.setPreferredSize(new Dimension(1000,450));
         minitas1.setBackground(Color.RED);
         
         for(int i=0; i<52; i++){
             JButton minas = new JButton();
             minas.setBackground(Color.BLUE);
             minitas1.add(minas);
            }
         JPanel panPunt = new JPanel();
         panPunt.setLayout(new FlowLayout());
         panPunt.setBackground(Color.RED);
         panPunt.setPreferredSize(new Dimension(1000,70));
         
         JLabel puntaje = new JLabel();
         puntaje.setText("Puntuacion obtenida:");
         panPunt.add(puntaje);
         
         add(panTitulo, BorderLayout.NORTH);
         add( minitas1, BorderLayout.CENTER);
         add(panPunt, BorderLayout.SOUTH);
         
           setVisible(true);      
         
    } 
}

