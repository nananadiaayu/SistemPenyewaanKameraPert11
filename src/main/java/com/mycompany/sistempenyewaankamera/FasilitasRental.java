
package com.mycompany.sistempenyewaankamera;

import java.io.Serializable;

public class FasilitasRental implements Serializable {

    private String namaFasilitas;
    private String lokasi;
    private int kapasitas;

    public FasilitasRental(String namaFasilitas, String lokasi, int kapasitas) {
        this.namaFasilitas = namaFasilitas;
        this.lokasi = lokasi;
        this.kapasitas = kapasitas;
    }

    public void tampilkanInfo() {
        System.out.println("\n========== INFORMASI FASILITAS RENTAL ==========");
        System.out.println("Nama Fasilitas : " + namaFasilitas);
        System.out.println("Lokasi         : " + lokasi);
        System.out.println("Kapasitas      : " + kapasitas + " kamera");
    }
}
