package polinema.ac.id.androiduistarter.fragments.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import polinema.ac.id.androiduistarter.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 */
public class Cek_Resi_Fragment extends Fragment {

    ImageButton btnCari;
    EditText noResi;
    RadioGroup ekspedisi;
//    StringBuffer pilih_hobi;

    public Cek_Resi_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_cek__resi, container, false);
        btnCari = (ImageButton)rootView.findViewById(R.id.btnCari);
        noResi = (EditText)rootView.findViewById(R.id.noResi);
        ekspedisi = (RadioGroup)rootView.findViewById(R.id.ekspedisi);

        btnCari.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Integer kirim = ekspedisi.getCheckedRadioButtonId();
                RadioButton ekspedisi = (RadioButton)rootView.findViewById(kirim);

                Toast.makeText(getActivity(),"Nomer Resi : "+noResi.getText() + "\n\n" + "Ekspedisi : "+ekspedisi.getText()+ "\n\n" + "Pengirim : hnbl31" + "\n\n" + "Penerima : Indah Wahyuningtyas" + "\n\n" + "Status : "+ "\n" + "08-08-2019 21:24[PASURUAN]Paket telah diterima"+ "\n" + "08-08-2019 11:34[PASURUAN]Paket akan dikirim ke alamat penerima"+ "\n" + "07-08-2019 02:01[SURABAYA]Paket telah sampai di SUB_GATEWAY"+ "\n" + "07-08-2019 09:35[BANDUNG]Paket akan dikirimkan ke SUB_GATEWAY", Toast.LENGTH_LONG).show();
            }
        });
        return rootView;
    }
}
