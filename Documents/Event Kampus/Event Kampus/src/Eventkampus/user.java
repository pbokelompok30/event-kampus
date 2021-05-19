/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventkampus;

/**
 *
 * @author Try WIguna
 */
public class user {
    private String nama;
    private String addDate;
    private String email;
    private String jurusan;
    private String instansi;
    private String konsumsi;
    private String numbHp;
    private String username;
    private String password;
    private byte [] picture;  
    private String nomerInduk;
    private String kategori;

        public user (String pnama,String paddDate,String pemail, String pjurusan, String pinstansi,String pkonsumsi,String pnumbHp,String pusername,String ppassword,byte [] pimg,String pnim,String pktgr){
        this.nama=pnama;
        this.addDate=paddDate;
        this.email=pemail;
        this.jurusan=pjurusan;
        this.instansi=pinstansi;
        this.konsumsi=pkonsumsi;
        this.numbHp=pnumbHp;
        this.username=pusername;
        this.password=ppassword;
        this.picture=pimg;
        this.nomerInduk=pnim;
        this.kategori=pktgr;
    } 
        public String getNama()
        {
            return nama;
        }

    public String getAddDate()
        {
            return addDate;
        }
        public String getEmail()
        {
            return email;
        }
        public String getJurusan()
        {
            return jurusan;
        }
        public String getInstansi()
        {
            return instansi;
        }
        public String getKonsumsi()
        {
            return konsumsi;
        }
        public String getNumbHp()
        {
            return numbHp;
        }
        public String getUsername()
        {
            return username;
        }
        public String getPassword()
        {
            return password;
        }
        public byte[] getImage()
        {
            return picture;
        }
        public String getNomerInduk()
        {
            return nomerInduk;
        }
        public String getKategori()
        {
            return kategori;
        }

}

