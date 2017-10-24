package pe.com.ricindigus.prueba1;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RadioPregunta extends Fragment {
    private String pregunta;
    private String[] subpreguntas;
    private TextView txtPregunta;
    private RadioGroup radioGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private RadioButton rb5;
    private RadioButton rb6;

    @SuppressLint("ValidFragment")
    public RadioPregunta(String pregunta, String[] subpreguntas) {
        this.pregunta = pregunta;
        this.subpreguntas = subpreguntas;
    }

    public RadioPregunta() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.radio_pregunta_layout, container, false);
        txtPregunta = (TextView) rootview.findViewById(R.id.radioPregunta);
        radioGroup = (RadioGroup) rootview.findViewById(R.id.radioGroup);
        rb1 = (RadioButton) rootview.findViewById(R.id.rb1);
        rb2 = (RadioButton) rootview.findViewById(R.id.rb2);
        rb3 = (RadioButton) rootview.findViewById(R.id.rb3);
        rb4 = (RadioButton) rootview.findViewById(R.id.rb4);
        rb5 = (RadioButton) rootview.findViewById(R.id.rb5);
        rb6 = (RadioButton) rootview.findViewById(R.id.rb6);
        return rootview;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtPregunta.setText(pregunta);
        RadioButton[] radioButtons = {rb1, rb2, rb3, rb4, rb5, rb6};
        for (int i = 0; i <subpreguntas.length ; i++) {
            radioButtons[i].setVisibility(View.VISIBLE);
            radioButtons[i].setText(subpreguntas[i]);
        }
    }
}
