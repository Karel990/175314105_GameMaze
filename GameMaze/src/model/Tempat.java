package model;

import java.awt.Graphics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static sun.audio.AudioPlayer.player;

public class Tempat extends JPanel {

    private ArrayList tembok = new ArrayList();
    private ArrayList tempat = new ArrayList();
    private Pemain pemain;
    private Target target;
    private int lebar = 0;
    private int tinggi = 0;
    private int jarak = 40;
    private File Alamatpeta;
    private int langkah=0;
    private ArrayList<String> Allperintah = new ArrayList<String>();

    public Tempat(File file) {
        bacaKonfigurasi(file);
    }
    public void bacaKonfigurasi(File file) {
        try {
            if (file != null) {
                FileInputStream input = new FileInputStream(file);
                Alamatpeta = file;
                String hasilBaca = "";
                int posisiX = 0;
                int posisiY = 0;
                Tembok wall;
                int data;
                while ((data = input.read()) != -1) {
                    char item = (char) data;
                    if (item == '\n') {
                        hasilBaca = hasilBaca + (char) data;
                        posisiY += jarak;
                        lebar = posisiX;
                        posisiX = 0;
                    } else if (item == '#') {
                        hasilBaca = hasilBaca + (char) data;
                        wall = new Tembok(posisiX, posisiY);
                        tembok.add(wall);
                        posisiX += jarak;
                    } else if (item == 'o') {
                        hasilBaca = hasilBaca + (char) data;
                        target = new Target(posisiX, posisiY);
                        posisiX += jarak;
                    } else if (item == '@') {
                        hasilBaca = hasilBaca + (char) data;
                        pemain = new Pemain(posisiX, posisiY);
                        posisiX += jarak;
                    } else if (item == '.') {
                        hasilBaca = hasilBaca + (char) data;
                        posisiX += jarak;
                    }
                    tinggi = posisiY;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Tempat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void PerintahGerak(String input) {
        String in[] = input.split(" ");
        if (in.length > 2) {
            JOptionPane.showMessageDialog(null, "Jumlah kata lebih dari 2");
        } else if (in.length == 2) {
            if (in[0].matches("[udrl]")) {
                Allperintah.add(input);
                if (in[0].equalsIgnoreCase("u")) {
                    for (int i = 0; i < Integer.parseInt(String.valueOf(in[1])); i++) {
                        if (cekObjekTabrakTembokKiri(pemain, "u")) {
                            return;
                        } else {
                            pemain.Gerak(0, -jarak);
                            repaint();
                        }

                    }
                } else if (in[0].equalsIgnoreCase("d")) {
                    for (int i = 0; i < Integer.parseInt(String.valueOf(in[1])); i++) {
                        if (cekObjekTabrakTembokKanan(pemain, "d")) {
                            return;
                        } else {
                            pemain.Gerak(0, jarak);
                            repaint();
                        }
                    }
                } else if (in[0].equalsIgnoreCase("r")) {
                    for (int i = 0; i < Integer.parseInt(String.valueOf(in[1])); i++) {
                        if (cekObjekTabrakTembokAtas(pemain, "r")) {
                            return;
                        } else {
                            pemain.Gerak(jarak, 0);
                            repaint();
                        }
                    }
                } else if (in[0].equalsIgnoreCase("l")) {
                    for (int i = 0; i < Integer.parseInt(String.valueOf(in[1])); i++) {
                        if (cekObjekTabrakTembokBawah(pemain, "l")) {
                            return;
                        } else {
                            pemain.Gerak(-jarak, 0);
                            repaint();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Kata Tidak Dikenal");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Kata Tidak Dikenal");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Jumlah kata hanya satu");
        }
    }

    public void savePermainan(File file) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < this.Allperintah.size(); i++) {
                String data = this.Allperintah.get(i) + ",";
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tempat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tempat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadPermainan(File file) throws IOException {
        FileInputStream fis = null;
        try {
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;

            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt == ',') {
                    this.Allperintah.add(hasilBaca);
                    hasilBaca = "";
                } else {
                    hasilBaca = hasilBaca + (char) dataInt;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tempat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tempat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(0, 0, this.getLebar(), this.getTinggi());
        tempat.addAll(tembok);
        tempat.add(target);
        tempat.add(pemain);
        for (int i = 0; i < tempat.size(); i++) {
            if (tempat.get(i) != null) {
                Sel item = (Sel) tempat.get(i);
                g.drawImage(item.getImage(), item.getPosisiX(), item.getPosisiY(), this);
            }
        }
    }
    private boolean cekObjekTabrakTembokKiri(Sel pemain, String u) {
        boolean bantu = false;
            for (int i = 0; i < tembok.size(); i++) {
                Tembok wall = (Tembok) tembok.get(i);
                if (pemain.PosisiKiriObjek(wall)) {
                    bantu = true;
                    break;
                }
            }
            return bantu;
        }
    private boolean cekObjekTabrakTembokKanan(Sel player, String d) {
            boolean bantu = false;
            for (int i = 0; i < tembok.size(); i++) {
                Tembok wall = (Tembok) tembok.get(i);
                if (pemain.PosisiKananObjek(wall)) {
                    bantu = true;
                    break;
                }
            }
            return bantu;
    }            
    private boolean cekObjekTabrakTembokAtas(Sel player, String r) {
            boolean bantu = false;
            for (int i = 0; i < tembok.size(); i++) {
                Tembok wall = (Tembok) tembok.get(i);
                if (pemain.PosisiAtasObjek(wall)) {
                    bantu = true;
                    break;
                }
            }
            return bantu;
        }
    private boolean cekObjekTabrakTembokBawah(Sel player, String l) {
            boolean bantu = false;
            for (int i = 0; i < tembok.size(); i++) {
                Tembok wall = (Tembok) tembok.get(i);
                if (pemain.PosisiBawahObjek(wall)) {
                    bantu = true;
                    break;
                }
            }return bantu;
        }
        
    public void Completed() {
        if (pemain.getPosisiX() == target.getPosisiX() && pemain.getPosisiY() == target.getPosisiY()) {
            JOptionPane.showMessageDialog(null, "Selamat anda berhasil menyelesaikan game ini dengan " + this.getAllperintah().size() + " langkah");
            tempat.clear();
        }
    }
    public void restart() {
        Allperintah.clear();
        tembok.clear();
        tempat.clear();
        bacaKonfigurasi(Alamatpeta);
        repaint();
    }

    public void save() {
        try {
            this.savePermainan(new File("save.dat"));
        } catch (IOException ex) {
            Logger.getLogger(Tempat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int getLebar() {
        return this.lebar;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public Pemain getPemain() {
        return pemain;
    }

    public void setPemain(Pemain pemain) {
        this.pemain = pemain;
    }

    public Target getGawang() {
        return target;
    }

    public void setGawang(Target gawang) {
        this.target = gawang;
    }

    public ArrayList getTempat() {
        return tempat;
    }

    public void setTempat(ArrayList tempat) {
        this.tempat = tempat;
    }

    public ArrayList getAllperintah() {
        return Allperintah;
    }

    public void setAllperintah(ArrayList Allperintah) {
        this.Allperintah = Allperintah;
    }
    public String langkah(){
    String tampil=""+langkah;
    return tampil;
    }
    public void Naik() {
        if (cekObjekTabrakTembokAtas(pemain, "r")) {
            return;
        } else {
            pemain.Gerak(0, - jarak);
            repaint();
        }
        langkah++;
    }
    public void Turun(){
        if (cekObjekTabrakTembokBawah(pemain, "l")) {
            return;
        } else {
            pemain.Gerak(0, jarak);
            repaint();
        }
        langkah++;
    }
    public void Kanan(){
        if (cekObjekTabrakTembokKanan(pemain, "d")) {
            return;
        } else {
            pemain.Gerak(jarak, 0);
            repaint();
        }
        langkah++;
    }
    public void Kiri(){
        if (cekObjekTabrakTembokKiri(pemain, "u")) {
            return;
        } else {
            pemain.Gerak(-jarak, 0);
            repaint();
        }
        langkah++;
    }

}
