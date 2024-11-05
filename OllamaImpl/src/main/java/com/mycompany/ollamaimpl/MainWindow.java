/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ollamaimpl;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import org.davidmoten.text.utils.WordWrap;

/**
 *
 * @author boolean
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JList<>();
        input_area = new javax.swing.JTextField();
        send_message_button = new javax.swing.JButton();
        save_chat_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        file_list = new javax.swing.JList<>();
        chatRegistry_label = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        app_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChatBot");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jScrollPane1.setViewportView(txtArea);

        input_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        input_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_areaActionPerformed(evt);
            }
        });

        send_message_button.setText("Enviar");
        send_message_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_message_buttonActionPerformed(evt);
            }
        });

        save_chat_btn.setText("Guardar chat");
        save_chat_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_chat_btnActionPerformed(evt);
            }
        });

        file_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                file_listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(file_list);

        chatRegistry_label.setText("Registro de chats");

        back_button.setText("Regresar");
        back_button.setToolTipText("");
        back_button.setPreferredSize(new java.awt.Dimension(98, 22));
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        app_name.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        app_name.setText("AhuyamaAI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chatRegistry_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(app_name)
                        .addGap(150, 150, 150)
                        .addComponent(save_chat_btn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(input_area, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(send_message_button))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(save_chat_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chatRegistry_label, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(back_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(app_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input_area)
                            .addComponent(send_message_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void input_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_areaActionPerformed

    private void send_message_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_message_buttonActionPerformed
        // TODO add your handling code here:
        //toma caracter por caracter llamando al constructor solamente y revisa si todos son vacios o "whitespaces"
        //Facilmente si el proyecto estuviese en java 11 se usaria el isBlank pero bueno xD
        if(input_area.getText().chars().allMatch(Character::isWhitespace)) {
            JOptionPane.showMessageDialog(this, "El prompt no puede estar vacio","Alerta",JOptionPane.WARNING_MESSAGE);
        }else {
            //Hyphens es = -
        
        try {
            String input = WordWrap.from("Usuario: " + input_area.getText()).maxWidth(50).insertHyphens(true).wrap();
            model.addElement(input);
            String inputToAi = input_area.getText();
            input_area.setText("");
            String answer = WordWrap.from("AhuyamaBot: " +OllamaImpl.ollamaInput(inputToAi)).maxWidth(50).insertHyphens(true).wrap();
            model.addElement(answer);
            
        } catch (IOException ex) {
            model.clear();
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la API Ollama","Error Critico",JOptionPane.WARNING_MESSAGE);
            input_area.requestFocus();
        }
        }
    }//GEN-LAST:event_send_message_buttonActionPerformed

    private void save_chat_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_chat_btnActionPerformed
        // TODO add your handling code here:
        try {
            saveCurrentJTextArea();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_save_chat_btnActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        model.clear();
        file_list.clearSelection();
        for(int i=0;i<savedModel.getSize();i++) {
            model.addElement(savedModel.getElementAt(i));
        }
        file_list.setEnabled(true);
        input_area.setEnabled(true);
        send_message_button.setEnabled(true);
        save_chat_btn.setEnabled(true);
        back_button.setVisible(false);
    }//GEN-LAST:event_back_buttonActionPerformed
    private DefaultListModel<String> savedModel = new DefaultListModel<>();
    private void file_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_file_listValueChanged
        // TODO add your handling code here:
        back_button.setVisible(true);
         for(int i=0;i<model.getSize();i++) {
            savedModel.addElement(model.elementAt(i));
        }
        System.out.println(Arrays.toString(savedModel.toArray()));
        String currentFileSelected = "src\\main\\java\\chat_logs\\" + file_list.getSelectedValue();
        model.clear();
        try {
            BufferedReader br = new BufferedReader(new FileReader(currentFileSelected));
            String line;
            while((line = br.readLine()) != null) {

                model.addElement(line);
            
            }
            file_list.setEnabled(false);
            input_area.setEnabled(false);
            send_message_button.setEnabled(false);
            save_chat_btn.setEnabled(false);
            back_button.setEnabled(true);
            
            
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Back Button Pressed & Chat Empty");
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_file_listValueChanged

    private void saveCurrentJTextArea() throws IOException {
        if(model.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Esta vacio el chat","Alerta",JOptionPane.WARNING_MESSAGE);
        }else {
        SimpleDateFormat formatter = new SimpleDateFormat("HH_mm_ss");
        Date date = new Date();
        File file = new File("src\\main\\java\\chat_logs\\Chat_" + formatter.format(date) + ".txt");
        FileWriter output = new FileWriter(file);
        //System.out.println(modelFileList.getSize());
        for(int i = 0; i<model.getSize();i++) {
            String notWraped = model.getElementAt(i).toString();
            String wrapedString = WordWrap.from(notWraped).maxWidth(50).insertHyphens(true).wrap();
            output.write(wrapedString+"\n");
            System.out.println(model.getElementAt(i).toString());
        }
        SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy");
        Date date2 = new Date();
        output.write("CHAT CERRADO a las " + formatter.format(date) + " en el " + format2.format(date2));
        output.close();
        updateFileHistory();
        file_list.updateUI();
        model.clear();
        back_button.setEnabled(false);
    }
    }
    /**
     * @param args the command line arguments
     */
    DefaultListModel modelFileList = new DefaultListModel();
    private void updateFileHistory() {
        File file = new File("src\\main\\java\\chat_logs");
        File[] fileList = file.listFiles();
        modelFileList.clear();
        for(File f : fileList) {
            modelFileList.addElement(f.getName());
        }
        file_list.setModel(modelFileList);
    }
    DefaultListModel<String> model = new DefaultListModel<>();
    public  void init() {
        this.setIconImage(new ImageIcon("src\\main\\java\\app_icons\\main_icon.png").getImage());
        save_chat_btn.setIcon(new ImageIcon("src\\main\\java\\app_icons\\new_chat_icon.png"));
        send_message_button.setIcon(new ImageIcon("src\\main\\java\\app_icons\\send_message_icon.png"));
        back_button.setIcon(new ImageIcon("src\\main\\java\\app_icons\\back_icon.png"));
        
        input_area.requestFocus();
        back_button.setVisible(false);
       jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       updateFileHistory();
       txtArea.setModel(model);
       txtArea.setCellRenderer(new ListRenderer());
       jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       this.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel app_name;
    private javax.swing.JButton back_button;
    private javax.swing.JLabel chatRegistry_label;
    private javax.swing.JList<String> file_list;
    private javax.swing.JTextField input_area;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton save_chat_btn;
    private javax.swing.JButton send_message_button;
    private javax.swing.JList<String> txtArea;
    // End of variables declaration//GEN-END:variables
}