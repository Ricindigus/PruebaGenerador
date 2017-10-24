package pe.com.ricindigus.prueba1;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class EditPregunta extends Fragment {

    private String pregunta;
    private String subpregunta;
    private TextView txtPregunta;
    private TextInputEditText inputCampo;
    private TextInputLayout inputLayout;

    @SuppressLint("ValidFragment")
    public EditPregunta(String pregunta, String subpregunta) {
        this.pregunta = pregunta;
        this.subpregunta = subpregunta;
    }

    public EditPregunta() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.edit_pregunta_layout, container, false);
        txtPregunta = (TextView) rootView.findViewById(R.id.editPregunta);
        inputLayout = (TextInputLayout) rootView.findViewById(R.id.layoutEdit);
        inputCampo = (TextInputEditText) rootView.findViewById(R.id.campoEdit);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtPregunta.setText(pregunta);
        inputLayout.setHint(subpregunta);
    }
}
