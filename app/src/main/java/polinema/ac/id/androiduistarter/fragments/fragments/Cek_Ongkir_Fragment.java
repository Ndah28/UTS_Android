package polinema.ac.id.androiduistarter.fragments.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import polinema.ac.id.androiduistarter.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 */
public class Cek_Ongkir_Fragment extends Fragment {

    Button cek;
    TextView berat;
    RadioGroup rb1;
    RadioButton r1, r2, r3, r4, r5, r6, r7, r8, r9;
//    StringBuffer pilih_hobi;

    public Cek_Ongkir_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_cek__ongkir, container, false);
        cek  = (Button)rootView.findViewById(R.id.cek);
        berat = (TextView) rootView.findViewById(R.id.berat);
        rb1 = (RadioGroup)rootView.findViewById(R.id.rb1);
        r1 = (RadioButton)rootView.findViewById(R.id.r1);
        r2 = (RadioButton)rootView.findViewById(R.id.r2);
        r3 = (RadioButton)rootView.findViewById(R.id.r3);
        r4 = (RadioButton)rootView.findViewById(R.id.r4);
        r5 = (RadioButton)rootView.findViewById(R.id.r5);
        r6 = (RadioButton)rootView.findViewById(R.id.r6);
        r7 = (RadioButton)rootView.findViewById(R.id.r7);
        r8 = (RadioButton)rootView.findViewById(R.id.r8);
        r9 = (RadioButton)rootView.findViewById(R.id.r9);

        cek.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Integer kota = rb1.getCheckedRadioButtonId();
                RadioButton rb1 = (RadioButton)rootView.findViewById(kota);

                if (r1.isChecked()){
                    Toast.makeText(getActivity(),"Kota asal-tujuan : "+rb1.getText() + "\n\n" + berat.getText() + "\n\n" + "Expedisi : " + "\n" + "Pos = Rp. 8000" +"\n" + "Jne = Rp. 8000"+"\n" + "Jnt = Rp. 10000", Toast.LENGTH_LONG).show();
                }
                if (r2.isChecked()){
                    Toast.makeText(getActivity(),"Kota asal-tujuan : "+rb1.getText() + "\n\n" + berat.getText() + "\n\n" + "Expedisi : " + "\n" + "Pos = Rp. 8000" +"\n" + "Jne = Rp. 7000"+"\n" + "Jnt = Rp. 13000", Toast.LENGTH_LONG).show();
                }
                if (r3.isChecked()){
                    Toast.makeText(getActivity(),"Kota asal-tujuan : "+rb1.getText() + "\n\n" + berat.getText() + "\n\n" + "Expedisi : " + "\n" + "Pos = Rp. 8000" +"\n" + "Jne = Rp. 8000"+"\n" + "Jnt = Rp. 14000", Toast.LENGTH_LONG).show();
                }
                if (r4.isChecked()){
                    Toast.makeText(getActivity(),"Kota asal-tujuan : "+rb1.getText() + "\n\n" + berat.getText() + "\n\n" + "Expedisi : " + "\n" + "Pos = Rp. 8000" +"\n" + "Jne = Rp. 8000"+"\n" + "Jnt = Rp. 11000", Toast.LENGTH_LONG).show();
                }
                if (r5.isChecked()){
                    Toast.makeText(getActivity(),"Kota asal-tujuan : "+rb1.getText() + "\n\n" + berat.getText() + "\n\n" + "Expedisi : " + "\n" + "Pos = Rp. 8000" +"\n" + "Jne = Rp. 8000"+"\n" + "Jnt = Rp. 12000", Toast.LENGTH_LONG).show();
                }
                if (r6.isChecked()){
                    Toast.makeText(getActivity(),"Kota asal-tujuan : "+rb1.getText() + "\n\n" + berat.getText() + "\n\n" + "Expedisi : " + "\n" + "Pos = Rp. 8000" +"\n" + "Jne = Rp. 8000"+"\n" + "Jnt = Rp. 12000", Toast.LENGTH_LONG).show();
                }
                if (r7.isChecked()){
                    Toast.makeText(getActivity(),"Kota asal-tujuan : "+rb1.getText() + "\n\n" + berat.getText() + "\n\n" + "Expedisi : " + "\n" + "Pos = Rp. 7000" +"\n" + "Jne = Rp. 7000"+"\n" + "Jnt = Rp. 9000", Toast.LENGTH_LONG).show();
                }
                if (r8.isChecked()){
                    Toast.makeText(getActivity(),"Kota asal-tujuan : "+rb1.getText() + "\n\n" + berat.getText() + "\n\n" + "Expedisi : " + "\n" + "Pos = Rp. 8000" +"\n" + "Jne = Rp. 8000"+"\n" + "Jnt = Rp. 15000", Toast.LENGTH_LONG).show();
                }
                if (r9.isChecked()){
                    Toast.makeText(getActivity(),"Kota asal-tujuan : "+rb1.getText() + "\n\n" + berat.getText() + "\n\n" + "Expedisi : " + "\n" + "Pos = Rp. 8000" +"\n" + "Jne = Rp. 8000"+"\n" + "Jnt = Rp. 14000", Toast.LENGTH_LONG).show();
                }
            }
        });
        return rootView;
    }
}
