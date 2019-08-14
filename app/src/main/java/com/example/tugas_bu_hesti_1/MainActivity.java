package com.example.tugas_bu_hesti_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText Nama;
    private EditText Jenis;
    private EditText Jumlah;
    private EditText Alamat;
    private Button Submit;
    private TextView id_Name;
    private TextView id_Jenis;
    private TextView id_Jumlah;
    private TextView id_almt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama = findViewById(R.id.Nama_Pembeli);
        Jenis = findViewById(R.id.Jenis_Headphone);
        Jumlah = findViewById(R.id.Jumlah_Headphone);
        Alamat = findViewById(R.id.Alamat_Headphone);
        Submit = findViewById(R.id.submit);
        id_Name = findViewById(R.id.id_Name);
        id_Jenis = findViewById(R.id.id_Jenis);
        id_Jumlah = findViewById(R.id.id_Jumlah);
        id_almt = findViewById(R.id.id_almt);

        Submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.submit);
        String inputNama = Nama.getText().toString();
        String inputJenis= Jenis.getText().toString();
        String inputJumlah = Jumlah.getText().toString();
        String inputAlamat = Alamat.getText().toString();

        if (inputNama.length()==0){
            Nama.setError("Jangan Lupa Diisi!");
        }else{
            id_Name.setText(inputNama);
        }if (inputJenis.length()==0){
            Jenis.setError("Jangan Lupa Diisi!");
        }else{
            id_Jenis.setText(inputJenis);
        }if (inputJumlah.length()==0) {
            Jumlah.setError("Jangan Lupa Diisi!");
        }else{
            id_Jumlah.setText(inputJumlah);
        }if (inputAlamat.length()==0) {
            Alamat.setError("Jangan Lupa Diisi!");
        }else{
            id_almt.setText(inputAlamat);
        }
    }
}