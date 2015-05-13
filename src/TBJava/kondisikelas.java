/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TBJava;

import java.util.Scanner;

/**
 *
 * @author Danang
 */
public class kondisikelas extends RuangKelas{
    Scanner kn = new Scanner(System.in);
    
    private String namaruangan;
    private String lokasiruaangan;
    private String programstudi;
    private String fakultas;
    private int panjang;
    private int lebar;
    private int jumlahkursi;
    private int jumlahpintu;
    private int jumlahjendela;
    private double luas;
    private double rasioluas;
    
    

    double hitungluas(int panjang, int lebar){
        luas = panjang*lebar;
        return luas;
    }
    
    String bentuk (int panjang , int lebar){
        
        if (panjang!=lebar){
        return "sesuai";
        }
        else {
        return "tidak sesuai";
        }
    }
    
    String hitungrasio (int panjang, int lebar){
        int rasioluas = (panjang*lebar) / jumlahkursi;
                if(rasioluas >= 0.5){
                return "sesuai";
                } 
                else {
                return "tidak sesuai";
                }
    }
    
    String jumlahpintujadi (int jumlahpintu,int jumlahjendela){
    if (jumlahpintu>=2 && jumlahjendela >=1){
    return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    
    
    }
    
    public String getNamaruangan() {
        return namaruangan;
    }

    public void setNamaruangan(String namaruangan) {
        this.namaruangan = namaruangan;
    }

    public String getLokasiruaangan() {
        return lokasiruaangan;
    }

    public void setLokasiruaangan(String lokasiruaangan) {
        this.lokasiruaangan = lokasiruaangan;
    }

    public String getProgramstudi() {
        return programstudi;
    }

    public void setProgramstudi(String programstudi) {
        this.programstudi = programstudi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getJumlahkursi() {
        return jumlahkursi;
    }

    public void setJumlahkursi(int jumlahkursi) {
        this.jumlahkursi = jumlahkursi;
    }

    public int getJumlahpintu() {
        return jumlahpintu;
    }

    public void setJumlahpintu(int jumlahpintu) {
        this.jumlahpintu = jumlahpintu;
    }

    public int getJumlahjendela() {
        return jumlahjendela;
    }

    public void setJumlahjendela(int jumlahjendela) {
        this.jumlahjendela = jumlahjendela;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }
    
    
    
    public void kondisi(){
    //public void inputan(){
        System.out.println("Nama ruang = ");
        String da=kn.next();
        setNamaruangan(da);
        System.out.println("Lokasi ruang = ");
        String dd=kn.next();
        setLokasiruaangan(dd);
        System.out.println("Program studi = ");
        String db=kn.next();
        setProgramstudi(db);
        System.out.println("Fakultas = ");
        String dc=kn.next();
        setFakultas(dc);
        System.out.println("\nPanjang ruang = ");
        int de=kn.nextInt();
        setPanjang(de);
        System.out.println("Lebar ruang = ");
         int df=kn.nextInt();
        setLebar(df);
        System.out.println("Jumlah kursi = ");
         int dg=kn.nextInt();
        setJumlahkursi(dg);
        System.out.println("jumlah pintu = ");
         int dh=kn.nextInt();
        setJumlahpintu(dh);
        System.out.println("Jumlah jendela = ");
         int di=kn.nextInt();
        setJumlahjendela(di);
        
    }
    
    public void hasilkondisi(){
    //public void outputan(){
        System.out.println("Ruangan "+getNamaruangan());
        System.out.println(getLokasiruaangan());
        System.out.println("Jurusan "+getProgramstudi());
        System.out.println("fakultas "+getFakultas());
        System.out.println("\nPanjang ruang "+getPanjang());
        System.out.println("Lebar ruang "+getLebar());
        System.out.println("Kesesuaian ruangan = ");
    }
    
}
