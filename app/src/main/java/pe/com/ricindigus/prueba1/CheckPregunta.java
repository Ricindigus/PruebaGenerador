package pe.com.ricindigus.prueba1;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CheckPregunta extends Fragment {

    private String pregunta;
    private String[] subpreguntas;
    private TextView txtPregunta;
    private CheckBox ck1;
    private CheckBox ck2;
    private CheckBox ck3;
    private CheckBox ck4;
    private CheckBox ck5;
    private CheckBox ck6;


    @SuppressLint("ValidFragment")
    public CheckPregunta(String pregunta, String[] subpreguntas) {
        this.pregunta = pregunta;
        this.subpreguntas = subpreguntas;
    }

    public CheckPregunta() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.check_pregunta_layout, container, false);
        txtPregunta = (TextView) rootView.findViewById(R.id.checkPregunta);
        ck1 = (CheckBox) rootView.findViewById(R.id.ck1);
        ck2 = (CheckBox) rootView.findViewById(R.id.ck2);
        ck3 = (CheckBox) rootView.findViewById(R.id.ck3);
        ck4 = (CheckBox) rootView.findViewById(R.id.ck4);
        ck5 = (CheckBox) rootView.findViewById(R.id.ck5);
        ck6 = (CheckBox) rootView.findViewById(R.id.ck6);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtPregunta.setText(pregunta);
        CheckBox[] checkBoxes = {ck1, ck2, ck3, ck4, ck5, ck6};
        for (int i = 0; i < subpreguntas.length; i++) {
            checkBoxes[i].setVisibility(View.VISIBLE);
            checkBoxes[i].setText(subpreguntas[i]);
        }
    }
}
