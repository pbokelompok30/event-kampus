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
public class event {
    private String namaEvent;
    private String tanggalEvent;
    private String instansiEvent;
    private String tempat;
    private int harga;
    private String kategori;
    private byte [] foto;
    private String deskripsi;
    

        public event(String pnamaEvent,String ptanggalEvent,String pinstansiEvent,String ptempat,int pharga,String pkategori,String pdeskripsi,byte[] pimg){
            this.namaEvent=pnamaEvent;
            this.tanggalEvent=ptanggalEvent;
            this.instansiEvent=pinstansiEvent;
            this.tempat=ptempat;
            this.harga=pharga;
            this.kategori=pkategori;
            this.deskripsi=pdeskripsi;
            this.foto=pimg;
    }
        public String getNamaEvent()
        {
            return namaEvent;
        }
        public String getDate()
        {
            return tanggalEvent;
        }
        public String getInstansi()
        {
            return instansiEvent;
        }
        public String getTempat()
        {
            return tempat;
        }
        public int getHarga()
        {
            return harga;
        }
        public String getKategori()
        {
            return kategori;
        }
        public String getDeskripsi()
        {
            return deskripsi;
        }
        public byte[] getImage()
        {
            return foto;
        }

}
