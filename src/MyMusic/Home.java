/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMusic;

import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.nio.file.Paths;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    //menetukan class MP3 player dari jaco mp3 player
    MP3Player Player;
    //menetukan file untuk lagu
    File songFile;
    //mebebtukan directory saat ini
    String currentDirectory = "home.user";
    //disini kita menentukan jalur untuk run
    String currentPath;
    //String ini untuk jalur atau gambar
    String imagePath;
    //kita membutuhkan string untuk app title
    String appName = "";
    
    //sekarang chek jika tombol repeat memungkin atau tidak
    boolean repeat = false;
    // disini kita membuat boolean untuk windowcollapsed
    boolean windowCollapsed = false;
    //disini kita membutuhkan untuk menentukan posisi xmouse dan ymouse di screen
    int xMouse,yMouse;
    private int count;
    
    public Home() {
        initComponents();
        //disini untuk app title
        appTitle.setText(appName);
        
        //disini kita pergi menuju file lagu
        songFile = new File ("Untuk Display Lagu");
        
        //sekarang buat String untuk mendapatkan nama file
        String fileName = songFile.getName();
        //disini kita mengaturlabel nama lagu dengan nama ini
        songNameDisplay.setText(fileName);
        
        //tambahkan method untuk variable player
        Player = mp3Player();
        //sekarang tamabahkan lagu ke player
        Player.addToPlayList(songFile);
        
        //disini kita dapatkan jalur dan gambar di string
        currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        imagePath = ("\\Pictures");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        playButton = new javax.swing.JLabel();
        pauseButton = new javax.swing.JLabel();
        stopButton = new javax.swing.JLabel();
        uploadButton = new javax.swing.JLabel();
        repeatOnOff = new javax.swing.JLabel();
        repeatButton = new javax.swing.JLabel();
        songNameMainPanel = new javax.swing.JPanel();
        songNameSubPanel = new javax.swing.JPanel();
        songNameDisplay = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        appTitle = new javax.swing.JLabel();
        exitButton = new javax.swing.JLabel();
        vdownButton = new javax.swing.JLabel();
        vupButton = new javax.swing.JLabel();
        vfullButton = new javax.swing.JLabel();
        muteButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(153, 204, 255));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        controlPanel.setBackground(new java.awt.Color(255, 255, 255));
        controlPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        playButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyMusic/Pictures/play.png"))); // NOI18N
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButtonMouseClicked(evt);
            }
        });

        pauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyMusic/Pictures/pause.png"))); // NOI18N
        pauseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pauseButtonMouseClicked(evt);
            }
        });

        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyMusic/Pictures/stop.png"))); // NOI18N
        stopButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopButtonMouseClicked(evt);
            }
        });

        uploadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyMusic/Pictures/upload.png"))); // NOI18N
        uploadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadButtonMouseClicked(evt);
            }
        });

        repeatOnOff.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        repeatOnOff.setText("Repeat Off");

        repeatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyMusic/Pictures/repeat.png"))); // NOI18N
        repeatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repeatButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(repeatButton)
                        .addGap(52, 52, 52)
                        .addComponent(pauseButton))
                    .addComponent(repeatOnOff))
                .addGap(38, 38, 38)
                .addComponent(playButton)
                .addGap(33, 33, 33)
                .addComponent(stopButton)
                .addGap(60, 60, 60)
                .addComponent(uploadButton)
                .addGap(190, 190, 190))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(controlPanelLayout.createSequentialGroup()
                            .addComponent(repeatOnOff)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(repeatButton)
                                .addComponent(pauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(35, 35, 35))
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(stopButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playButton, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(uploadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        songNameMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        songNameSubPanel.setBackground(new java.awt.Color(255, 255, 255));
        songNameSubPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 204, 255), 5, true));

        songNameDisplay.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        songNameDisplay.setText("Untuk Display Lagu");

        javax.swing.GroupLayout songNameSubPanelLayout = new javax.swing.GroupLayout(songNameSubPanel);
        songNameSubPanel.setLayout(songNameSubPanelLayout);
        songNameSubPanelLayout.setHorizontalGroup(
            songNameSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songNameSubPanelLayout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(songNameDisplay)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        songNameSubPanelLayout.setVerticalGroup(
            songNameSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, songNameSubPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(songNameDisplay)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout songNameMainPanelLayout = new javax.swing.GroupLayout(songNameMainPanel);
        songNameMainPanel.setLayout(songNameMainPanelLayout);
        songNameMainPanelLayout.setHorizontalGroup(
            songNameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songNameMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(songNameSubPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        songNameMainPanelLayout.setVerticalGroup(
            songNameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, songNameMainPanelLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(songNameSubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        headerPanel.setBackground(java.awt.SystemColor.controlHighlight);
        headerPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        appTitle.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        appTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyMusic/Pictures/MyMusic.PNG"))); // NOI18N
        appTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                appTitleMouseDragged(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyMusic/Pictures/power.png"))); // NOI18N
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(appTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(32, 32, 32))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(exitButton)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(appTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vdownButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyMusic/Pictures/volume_down.png"))); // NOI18N
        vdownButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vdownButtonMouseClicked(evt);
            }
        });

        vupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyMusic/Pictures/volume_up.png"))); // NOI18N
        vupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vupButtonMouseClicked(evt);
            }
        });

        vfullButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyMusic/Pictures/volume_full.png"))); // NOI18N
        vfullButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vfullButtonMouseClicked(evt);
            }
        });

        muteButton.setBackground(new java.awt.Color(204, 255, 255));
        muteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyMusic/Pictures/volume_mute.png"))); // NOI18N
        muteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(songNameMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vdownButton)
                .addGap(18, 18, 18)
                .addComponent(vupButton)
                .addGap(18, 18, 18)
                .addComponent(vfullButton)
                .addGap(18, 18, 18)
                .addComponent(muteButton)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(songNameMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vdownButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vupButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vfullButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(muteButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void muteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muteButtonMouseClicked
        // TODO add your handling code here:
        volumeControl(0.0);
    }//GEN-LAST:event_muteButtonMouseClicked

    private void vfullButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vfullButtonMouseClicked
        // TODO add your handling code here:
        volumeControl(1.0);
    }//GEN-LAST:event_vfullButtonMouseClicked

    private void vupButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vupButtonMouseClicked
        // TODO add your handling code here:
        volumeUpControl(0.1);
    }//GEN-LAST:event_vupButtonMouseClicked

    private void vdownButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vdownButtonMouseClicked
        // TODO add your handling code here:
        volumeDownControl(0.1);
    }//GEN-LAST:event_vdownButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this,
            "Yakin untuk keluar dari MyMusic?",
            "Konfirmasi Keluar Aplikasi",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_exitButtonMouseClicked

    private void appTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitleMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_appTitleMouseDragged

    private void repeatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeatButtonMouseClicked

        // TODO add your handling code here:
        if(repeat == false) {
            repeat = true;
            Player.setRepeat(repeat);

            repeatOnOff.setText("Repeat On");
        } else if(repeat == true) {
            repeat = false;
            Player.setRepeat(repeat);

            repeatOnOff.setText("Repeat Off");
        }
    }//GEN-LAST:event_repeatButtonMouseClicked

    private void uploadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadButtonMouseClicked
        // TODO add your handling code here:
        JFileChooser openFileChooser = new JFileChooser(currentDirectory);
        openFileChooser.setFileFilter(new FileTypeFilter(".mp3", "Open MP3 Files Only!"));
        int result = openFileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            songFile = openFileChooser.getSelectedFile();
            Player.addToPlayList(songFile);
            Player.skipForward();
            currentDirectory = songFile.getAbsolutePath();
            songNameDisplay.setText("Playing Now... | " + songFile.getName());

        }
    }//GEN-LAST:event_uploadButtonMouseClicked

    private void stopButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopButtonMouseClicked
        // TODO add your handling code here:
        Player.stop();
    }//GEN-LAST:event_stopButtonMouseClicked

    private void pauseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseButtonMouseClicked
        // TODO add your handling code here:
        Player.pause();
    }//GEN-LAST:event_pauseButtonMouseClicked

    private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseClicked
        // TODO add your handling code here:
        Player.play();
    }//GEN-LAST:event_playButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel exitButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel muteButton;
    private javax.swing.JLabel pauseButton;
    private javax.swing.JLabel playButton;
    private javax.swing.JLabel repeatButton;
    private javax.swing.JLabel repeatOnOff;
    private javax.swing.JLabel songNameDisplay;
    private javax.swing.JPanel songNameMainPanel;
    private javax.swing.JPanel songNameSubPanel;
    private javax.swing.JLabel stopButton;
    private javax.swing.JLabel uploadButton;
    private javax.swing.JLabel vdownButton;
    private javax.swing.JLabel vfullButton;
    private javax.swing.JLabel vupButton;
    // End of variables declaration//GEN-END:variables

    //kita buat custom mp3 player
    private MP3Player mp3Player() {
        MP3Player mp3Player = new MP3Player ();
        return mp3Player;
    }
    
    //kita buat method untuk mengecilkan volume
    private void volumeDownControl(Double valueToPlusMinus) {
        //dapatkan informasi mixer dari audio sistem
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        //sekarang hunakan loop for untuk list semua mixer
        for (Mixer.Info mixerInfo : mixers){
            //dapatkan mixer
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            //dapatkan line target
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            //disini gunakan loop lagi untuk list line
            for (Line.Info lineInfo : lineInfos){
                //buat null line
                Line line = null;
                //buat boolean terbuka
                boolean opened = true;
                // sekarang gunakan try exception untun line terbuka
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    //sekarang chek jika line tidak terbuka
                    if (!opened){
                        //buka line
                        line.open();
                    }
                    //buat control float
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    //sekarang buat jalur volume
                    float currentVolume = volControl.getValue();
                    //buat variable ganda dan value plus minus
                    Double volumeToCut = valueToPlusMinus;
                    //buat float dan hitung pejumlahan atau pengurangan volume
                    float changeCalc = (float) ((float)currentVolume-(double)volumeToCut);
                    //ubah value kedalam line volume
                    volControl.setValue(changeCalc);
                    
                } catch (LineUnavailableException lineException){                   
                } catch (IllegalArgumentException illException) {
                } finally {
                    //tutup line jika terbuka
                    if (line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    }
    
    //kita buat method untuk volume membesar
    private void volumeUpControl(Double valueToPlusMinus) {
        //dapatkan informasi mixer dari audio sistem
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        //sekarang hunakan loop for untuk list semua mixer
        for (Mixer.Info mixerInfo : mixers){
            //dapatkan mixer
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            //dapatkan line target
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            //disini gunakan loop lagi untuk list line
            for (Line.Info lineInfo : lineInfos){
                //buat null line
                Line line = null;
                //buat boolean terbuka
                boolean opened = true;
                // sekarang gunakan try exception untun line terbuka
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    //sekarang chek jika line tidak terbuka
                    if (!opened){
                        //buka line
                        line.open();
                    }
                    //buat control float
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    //sekarang buat jalur volume
                    float currentVolume = volControl.getValue();
                    //buat variable ganda dan value plus minus
                    Double volumeToCut = valueToPlusMinus;
                    //buat float dan hitung pejumlahan atau pengurangan volume
                    float changeCalc = (float) ((float)currentVolume+(double)volumeToCut);
                    //ubah value kedalam line volume
                    volControl.setValue(changeCalc);
                    
                } catch (LineUnavailableException lineException){                   
                } catch (IllegalArgumentException illException) {
                } finally {
                    //tutup line itu terbuka
                    if (line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    }
    
    //kita buat method untuk volume 
    private void volumeControl(Double valueToPlusMinus) {
        //dapatkan informasi mixer dari audio sistem
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        //sekarang hunakan loop for untuk list semua mixer
        for (Mixer.Info mixerInfo : mixers){
            //dapatkan mixer
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            //dapatkan line target
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            //disini gunakan loop lagi untuk list line
            for (Line.Info lineInfo : lineInfos){
                //buat null line
                Line line = null;
                //buat boolean terbuka
                boolean opened = true;
                // sekarang gunakan try exception untun line terbuka
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    //sekarang chek jika line tidak terbuka
                    if (!opened){
                        //buka line
                        line.open();
                    }
                    //buat control float
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    //sekarang buat jalur volume
                    float currentVolume = volControl.getValue();
                    //buat variable ganda dan value plus minus
                    Double volumeToCut = valueToPlusMinus;
                    //buat float dan hitung pejumlahan atau pengurangan volume
                    float changeCalc = (float) ((double)volumeToCut);
                    //ubah value kedalam line volume
                    volControl.setValue(changeCalc);
                    
                } catch (LineUnavailableException | IllegalArgumentException lineException){
                } finally {
                    //tutup line itu terbuka
                    if (line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    }
}
