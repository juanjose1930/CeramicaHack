/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author optim
 */
public class CopyPhotosFrame extends javax.swing.JFrame {
    
    private Timer t;
    int x = 0;

    /**
     * Creates new form CopyPhotosFrame
     */
    public CopyPhotosFrame() {
        initComponents();
        jComboBoxFolders.setVisible(false);
        labelComboBoxFolders.setVisible(false);
        this.setTitle("COPIAR ARCHIVOS");
        this.setLocationRelativeTo(null);
        this.setSize(670, 410);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        labelComboBoxFolders = new javax.swing.JLabel();
        Btn_Copiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnMaterialFolder = new javax.swing.JButton();
        txtMateriealFolder = new javax.swing.JTextField();
        jComboBoxFolders = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtIMGFOLDER = new javax.swing.JTextField();
        btnSearchIMG = new javax.swing.JButton();
        jProgressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(102, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("URL DONDE SE ENCUENTRAN LOS ARCHIVOS");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 50, 440, 20);

        labelComboBoxFolders.setForeground(new java.awt.Color(102, 51, 0));
        labelComboBoxFolders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelComboBoxFolders.setText("CARPETA DONDE SE GUARDARÁN LAS IMÁGENES");
        labelComboBoxFolders.setToolTipText("");
        jPanel1.add(labelComboBoxFolders);
        labelComboBoxFolders.setBounds(110, 190, 440, 20);

        Btn_Copiar.setForeground(new java.awt.Color(102, 51, 0));
        Btn_Copiar.setText("ORGANIZAR");
        Btn_Copiar.setToolTipText("");
        Btn_Copiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Copiar.setBorderPainted(false);
        Btn_Copiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Copiar.setFocusable(false);
        Btn_Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CopiarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Copiar);
        Btn_Copiar.setBounds(270, 270, 160, 22);

        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("URL DE LA CARPETA DE MATERIAL");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 110, 440, 20);

        btnMaterialFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recurso 6.png"))); // NOI18N
        btnMaterialFolder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0)));
        btnMaterialFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaterialFolderActionPerformed(evt);
            }
        });
        jPanel1.add(btnMaterialFolder);
        btnMaterialFolder.setBounds(580, 150, 40, 30);
        jPanel1.add(txtMateriealFolder);
        txtMateriealFolder.setBounds(90, 150, 480, 22);

        jComboBoxFolders.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBoxFolders);
        jComboBoxFolders.setBounds(90, 220, 480, 30);

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 51, 0));
        jLabel6.setText("Organizar imágenes");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(270, 10, 150, 30);
        jPanel1.add(txtIMGFOLDER);
        txtIMGFOLDER.setBounds(90, 80, 480, 22);

        btnSearchIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recurso 6.png"))); // NOI18N
        btnSearchIMG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0)));
        btnSearchIMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIMGActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchIMG);
        btnSearchIMG.setBounds(580, 80, 40, 30);

        jProgressBar.setStringPainted(true);
        jPanel1.add(jProgressBar);
        jProgressBar.setBounds(100, 310, 460, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LINTERNA.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 310, 70, 30);

        jButton1.setText("Atrás");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 28, 50, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NOTA.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(590, 250, 60, 60);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchIMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIMGActionPerformed
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int r = file.showOpenDialog(this);
        //File fileName = file.getSelectedFile();
        if(r == JFileChooser.APPROVE_OPTION ){
            File archivo = file.getSelectedFile();
            txtIMGFOLDER.setText(archivo.toString());
        }
    }//GEN-LAST:event_btnSearchIMGActionPerformed

    private void btnMaterialFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaterialFolderActionPerformed
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int r = file.showOpenDialog(this);
        //File fileName = file.getSelectedFile();
        if(r == JFileChooser.APPROVE_OPTION ){
            File archivo = file.getSelectedFile();
            if(archivo.getName().equals("Cerámica") || archivo.getName().equals("Estucos") || archivo.getName().equals("Lítica") || archivo.getName().equals("Malacología") || archivo.getName().equals("Metales") || archivo.getName().equals("Óseo")){
                txtMateriealFolder.setText(archivo.toString());
                labelComboBoxFolders.setVisible(true);
                jComboBoxFolders.setVisible(true);
                jComboBoxFolders.removeAllItems();
                jComboBoxFolders.addItem("Alta resolución");
                jComboBoxFolders.addItem("Baja resolución");
                jComboBoxFolders.addItem("Cédula automatizada");
                jComboBoxFolders.addItem("Deterioros - DIMENSIONADAS");
                jComboBoxFolders.addItem("Finales - DIMENSIONADAS");
                jComboBoxFolders.addItem("Inicio - DIMENSIONADAS");
                jComboBoxFolders.addItem("Procesos - DIMENSIONADAS");
                jComboBoxFolders.addItem("Cédula CATSA");
                jComboBoxFolders.addItem("Deterioros - TAMAÑO ORIGINAL");
                jComboBoxFolders.addItem("Finales - TAMAÑO ORIGINAL");
                jComboBoxFolders.addItem("Inicio - TAMAÑO ORIGINAL");
                jComboBoxFolders.addItem("Procesos - TAMAÑO ORIGINAL");
                jComboBoxFolders.addItem("Todas - TAMAÑO ORIGINAL");
            }else{
                JOptionPane.showMessageDialog(null, "Elige una carpeta válida:\n• Cerámica\n• Estucos\n• Lítica\n• Malacología\n• Metales\n• Óseo");
            }
        }
    }//GEN-LAST:event_btnMaterialFolderActionPerformed

    private void Btn_CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CopiarActionPerformed
        String URLImg = txtIMGFOLDER.getText();
        String URLMaterial = txtMateriealFolder.getText();
        String folder = (String) jComboBoxFolders.getSelectedItem();
        if(URLImg.isEmpty() || URLMaterial.isEmpty()){
            JOptionPane optionPane = new JOptionPane("¡NO SE PERMITE QUE DEJES CAMPOS VACIOS, FAVOR DE LLENAR LOS CAMPOS!",JOptionPane.WARNING_MESSAGE);
            JDialog dialog = optionPane.createDialog("RELLENE LOS CAMPOS"); 
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }else{
            File folderImg = new File(URLImg);
            File[] archivos = folderImg.listFiles();
            ArrayList<String> claves = new ArrayList<>();
            boolean correctFolder = true;
            for(File archivo :archivos) {
                if (!claves.contains(filterFileName(folder,archivo.getName())) && archivo.isFile()) {
                    claves.add(filterFileName(folder,archivo.getName()));
                    if(correctFolder){
                        correctFolder = validateFileAndFolder(folder, archivo.getName());
                    }
                }
            }
            String[] clavesFinal = new String[claves.size()];
            clavesFinal = claves.toArray(clavesFinal);
            
            String folderDirection = filterDirection(folder);
            String message = "¿Estás seguro?\nSe moverán archivos desde \""+folderImg.getName()+"\" hacia \""+folder+"\".\n";
            String idealType;
            if(folder.equals("Alta resolución") || folder.equals("Baja resolución") || folder.equals("Cédula automatizada") || folder.equals("Cédula CATSA")){
                idealType = "pdf";
            }else{
                idealType = "jpg";
            }
            if(correctFolder){
                message += "Todos los archivos dentro de \""+folderImg.getName()+"\" son de tipo "+idealType+", los cuales son compatibles con la carpeta de destino \""+folder+"\". ✓";
            }else{
                message += "ADVERTENCIA: Existen archivos dentro de \""+folderImg.getName()+"\" que NO son de tipo "+idealType+", tipo esperado en la carpeta de destino \""+folder+"\". X";
            }
            
            int res = JOptionPane.showOptionDialog(
                null, 
                message, 
                "Confirma el movimiento",
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[] { "CONTINUAR", "CANCELAR"},
                "CONTINUAR"
            );
            
            if (res == JOptionPane.YES_OPTION) {
                //jLabelLoading.setText("Iniciando...");
                savePhotos(URLImg, URLMaterial,clavesFinal,folderDirection,folder,archivos);
            }
        }
    }//GEN-LAST:event_Btn_CopiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainRun frame = new MainRun();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void savePhotos(String URLImg, String URLMaterial, String[] claves, String folderDirection, String folder, File[] archivos){
        
        DateFormat dateFormat = new SimpleDateFormat("dMMMyyyy_HHmm");
        String date = dateFormat.format(new Date());
        File carpeta = new File(URLMaterial);
        ExportarExcel excel = new ExportarExcel(URLMaterial+"/informe_"+folder.replaceAll(" ", "_").replaceAll("_-_","_")+"_"+date.toUpperCase()+".xlsx", carpeta.getName());
        ArrayList<String[]> arrayContenido = new ArrayList<>();
        
        Thread hilos = new Thread(){
            @Override
            public void run(){
                jProgressBar.setMaximum(claves.length * archivos.length);
                int counter = 0;
                for(String clave :claves) {
                    String exist;
                    int fotosCarpetaOrigen = 0;
                    int fotosCarpetaDestino = 0;
                    int fotosMovidasDestino = 0;
                    int fotosSinMoverDestino = 0;
                    File directorio = new File(URLMaterial+"\\"+clave);
                    if(directorio.exists()){
                        exist = "CARPETA CREADA.";
                    }else{
                        exist = "CARPETA NO CREADA.";
                    }
                    for(File archivo :archivos) {
                        if(filterFileName(folder,archivo.getName()).equals(clave)){
                            //jLabelLoading.setText("Moviendo "+archivo.getName()+" ...");
                            fotosCarpetaOrigen ++;
                            String destino = URLMaterial+"\\"+clave+"\\"+folderDirection+"\\"+archivo.getName();
                            Path origenPath = FileSystems.getDefault().getPath(URLImg+"\\"+archivo.getName());
                            Path destinoPath = FileSystems.getDefault().getPath(destino);
                            File archivoExist = new File(destino);
                            if(archivoExist.exists()){
                                fotosCarpetaDestino ++;
                            }else{
                                if(directorio.exists()){
                                    fotosMovidasDestino ++;
                                    try {
                                        Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
                                    } catch (IOException e) {
                                        System.err.println(e);
                                    }
                                }else{
                                    fotosSinMoverDestino++;
                                }
                            }    
                        }
                        //progressbar(archivos.length, counter);
                        jProgressBar.setValue(counter);
                        counter++;
                    }
                    String[] rowClave  = {String.valueOf(clave),String.valueOf(exist),String.valueOf(fotosCarpetaOrigen),String.valueOf(fotosCarpetaDestino),String.valueOf(fotosMovidasDestino),String.valueOf(fotosCarpetaDestino+fotosMovidasDestino),String.valueOf(fotosSinMoverDestino)};          
                    arrayContenido.add(rowClave);
                }
                ArrayList<String[]> foldersTrue = new ArrayList<>();
                ArrayList<String[]> foldersFalse = new ArrayList<>();
                for (String[] contenido: arrayContenido) {
                    if(contenido[1].equals("CARPETA CREADA.")){
                        foldersTrue.add(contenido);
                    }else{
                        foldersFalse.add(contenido);
                    }
                }

                int i = 3;
                for (String[] folderFalse: foldersFalse) {
                    excel.ContenidoArray(i, folderFalse);
                    i++;
                }
                for (String[] folderTrue: foldersTrue) {
                    excel.ContenidoArray(i, folderTrue);
                    i++;
                }

                String[] encabezado = 
                    {"Clave",
                    "Estatus",
                    "Número de archivos en la carpeta original",
                    "Número de archivos que ya se encontraban en la carpeta de destino",
                    "Número de archivos nuevas en la carpeta de destino",
                    "Total de archivos en la carpeta de destino después del movimiento",
                    "Número de archivos sin copiar (NO EXISTE CARPETA)"
                    };
                excel.encabezadoArray(encabezado);
                
                excel.ContenidoIndividual(0, 0,"DESTINO: "+carpeta.getName()+" /// "+folder );

                excel.crearArchivo();

                //jLabelLoading.setText("¡Listo!");
                counter++;
                jProgressBar.setValue(counter);
                JOptionPane.showMessageDialog(null,"El proceso se ha completado.");
                
            }
        };
        hilos.start();
    }
      
    public String filterDirection(String folder){
        switch(folder){
            case "Alta resolución":
                return "\\Cédula de registro\\Cédula anterior\\Alta resolución";
            case "Baja resolución":
                return "\\Cédula de registro\\Cédula anterior\\Baja resolución";
            case "Cédula automatizada":
                return "\\Cédula de registro\\Cédula automatizada\\Cédula";
            case "Deterioros - DIMENSIONADAS":
                return "\\Cédula de registro\\Cédula automatizada\\Deterioros";
            case "Finales - DIMENSIONADAS":
                return "\\Cédula de registro\\Cédula automatizada\\Finales";
            case "Inicio - DIMENSIONADAS":
                return "\\Cédula de registro\\Cédula automatizada\\Inicio";
            case "Procesos - DIMENSIONADAS":
                return "\\Cédula de registro\\Cédula automatizada\\Procesos";
            case "Cédula CATSA":
                return "\\Cédula de registro\\Cédula CATSA";
            case "Deterioros - TAMAÑO ORIGINAL":
                return "\\Registro fotográfico\\Deterioros";
            case "Finales - TAMAÑO ORIGINAL":
                return "\\Registro fotográfico\\Finales";
            case "Inicio - TAMAÑO ORIGINAL":
                return "\\Registro fotográfico\\Inicio";
            case "Procesos - TAMAÑO ORIGINAL":
                return "\\Registro fotográfico\\Procesos";
            case "Todas - TAMAÑO ORIGINAL":
                return "\\Registro fotográfico\\Todas";
            default:
                JOptionPane.showMessageDialog(null, "¡Ocurrió un error inesperado!");
                return "";
        }
    }
    
    public String filterFileName(String folder, String file){
        // file viene de un archivo.getName()
        String[] claveParts;
        String clave;
        switch(folder){
            case "Alta resolución":
                //T2_14217_226_0000452.pdf
                return file.split("\\.")[0];
            case "Baja resolución":
                //T2_14217_226_0000452_BR.pdf
                file = file.split("\\.")[0];
                claveParts = file.split("_");
                clave = "";
                for(int i = 0; i < claveParts.length-1; i++){
                    clave += claveParts[i];
                    if(i < claveParts.length-2){
                        clave += "_";
                    }
                }
                return clave;
            case "Cédula automatizada":
                //T2_14217_226_0000452_OCER_F.pdf
                //T2_14217_226_0000452_OMARL_F.pdf
                file = file.split("\\.")[0];
                claveParts = file.split("_");
                clave = "";
                for(int i = 0; i < claveParts.length-2; i++){
                    clave += claveParts[i];
                    if(i < claveParts.length-3){
                        clave += "_";
                    }
                }
                return clave;
            case "Cédula CATSA":
                //UTM_T2_14217_226_0000452.pdf
                file = file.split("\\.")[0];
                claveParts = file.split("_");
                clave = "";
                for(int i = 1; i < claveParts.length; i++){
                    clave += claveParts[i];
                    if(i < claveParts.length-1){
                        clave += "_";
                    }
                }
                return clave;
            default:
                //Carpetas de Deterioros, Finales, Inicio, Registro, etc. Tanto dimencionadas como originales
                //T2_14217_226_0000452_1.jpg
                file = file.split("\\.")[0];
                claveParts = file.split("_");
                clave = "";
                for(int i = 0; i < claveParts.length-1; i++){
                    clave += claveParts[i];
                    if(i < claveParts.length-2){
                        clave += "_";
                    }
                }
                return clave;
        }
    }
    
    public boolean validateFileAndFolder(String folder, String file){
        if(file.split("\\.")[1].toLowerCase().equals("jpg") || file.split("\\.")[1].toLowerCase().equals("pdf")){
            if(folder.equals("Alta resolución") || folder.equals("Baja resolución") || folder.equals("Cédula automatizada") || folder.equals("Cédula CATSA")){
                return file.split("\\.")[1].toLowerCase().equals("pdf");
            }else{
                return file.split("\\.")[1].toLowerCase().equals("jpg");
            }
        }
        return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CopyPhotosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CopyPhotosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CopyPhotosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CopyPhotosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

  /* txtIMGFOLDEReate and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CopyPhotosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Copiar;
    private javax.swing.JButton btnMaterialFolder;
    private javax.swing.JButton btnSearchIMG;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxFolders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JLabel labelComboBoxFolders;
    private javax.swing.JTextField txtIMGFOLDER;
    private javax.swing.JTextField txtMateriealFolder;
    // End of variables declaration//GEN-END:variables
}
