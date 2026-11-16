
package com.mycompany.sistempenyewaankamera;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class DataRental implements Serializable {

    private ArrayList<Kamera> daftarKamera;
    private HashMap<String, Pelanggan> daftarPelanggan;

    public DataRental(ArrayList<Kamera> daftarKamera,
                      HashMap<String, Pelanggan> daftarPelanggan) {
        this.daftarKamera = new ArrayList<>(daftarKamera);
        this.daftarPelanggan = new HashMap<>(daftarPelanggan);
    }

    public ArrayList<Kamera> getDaftarKamera() {
        return daftarKamera;
    }

    public HashMap<String, Pelanggan> getDaftarPelanggan() {
        return daftarPelanggan;
    }
}
