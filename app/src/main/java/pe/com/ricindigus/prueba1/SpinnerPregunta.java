package pe.com.ricindigus.prueba1;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SpinnerPregunta extends Fragment {
    private String pregunta;
    private String[] subpreguntas;
    private TextView txtPregunta;
    private Spinner spinner;

    @SuppressLint("ValidFragment")
    public SpinnerPregunta(String pregunta, String[] subpreguntas) {
        this.pregunta = pregunta;
        this.subpreguntas = subpreguntas;
    }

    public SpinnerPregunta() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.spinner_pregunta_layout, container, false);
        txtPregunta = (TextView) rootView.findViewById(R.id.spinnerPregunta);
        spinner = (Spinner) rootView.findViewById(R.id.spinner);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtPregunta.setText(pregunta);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(),android.R.layout.simple_spinner_item, subpreguntas);
        spinner.setAdapter(adapter);
    }
}
