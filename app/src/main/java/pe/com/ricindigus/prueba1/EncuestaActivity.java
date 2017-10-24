package pe.com.ricindigus.prueba1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class EncuestaActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        CheckPregunta checkPregunta = new CheckPregunta();
        RadioPregunta radioPregunta = new RadioPregunta();
        EditPregunta editPregunta = new EditPregunta();

        fragmentTransaction.add(R.id.fragment1, checkPregunta);
        fragmentTransaction.add(R.id.fragment2, radioPregunta);
        fragmentTransaction.add(R.id.fragment3, editPregunta);

        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.adelante:avanzar();return true;
            case R.id.anterior:retroceder();return true;
            default: return super.onOptionsItemSelected(item);
        }
    }

    public void avanzar(){
        fragmentTransaction = fragmentManager.beginTransaction();

        SpinnerPregunta spinnerPregunta = new SpinnerPregunta();
        EditPregunta editPregunta = new EditPregunta();
        RadioPregunta radioPregunta = new RadioPregunta();

        fragmentTransaction.add(R.id.fragment1, spinnerPregunta);
        fragmentTransaction.add(R.id.fragment2, editPregunta);
        fragmentTransaction.add(R.id.fragment3, radioPregunta);
        fragmentTransaction.commit();
    }
    public void retroceder(){
        fragmentTransaction = fragmentManager.beginTransaction();

        RadioPregunta radioPregunta = new RadioPregunta();
        SpinnerPregunta spinnerPregunta = new SpinnerPregunta();
        CheckPregunta checkPregunta = new CheckPregunta();

        fragmentTransaction.add(R.id.fragment1, radioPregunta);
        fragmentTransaction.add(R.id.fragment2, spinnerPregunta);
        fragmentTransaction.add(R.id.fragment3, checkPregunta);
        fragmentTransaction.commit();
    }
}
