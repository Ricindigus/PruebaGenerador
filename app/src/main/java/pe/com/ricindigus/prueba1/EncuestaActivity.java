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

        CheckPregunta checkPregunta = new CheckPregunta("Cual o cuales Hobbie(s)?",new String[]{"Futbol","Cine","Musica","Pintar"});
        RadioPregunta radioPregunta = new RadioPregunta("Sexo?",new String[]{"Masculino","Femenino"});
        EditPregunta editPregunta = new EditPregunta("Cuanto cobras?", "Soles");

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
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        SpinnerPregunta spinnerPregunta = new SpinnerPregunta("Nivel de estudios?",new String[]{"Primaria","Secundaria","Universidad"});
        EditPregunta editPregunta = new EditPregunta("Cuantos hijos tienes en el colegio","Número");
        RadioPregunta radioPregunta = new RadioPregunta("Cuántos años tienes?",new String[]{"10","20","30"});

        fragmentTransaction.replace(R.id.fragment1, spinnerPregunta);
        fragmentTransaction.replace(R.id.fragment2, editPregunta);
        fragmentTransaction.replace(R.id.fragment3, radioPregunta);
        fragmentTransaction.commit();
    }
    public void retroceder(){
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        RadioPregunta radioPregunta = new RadioPregunta("Color favorito?",new String[]{"Azul", "Verde", "Rojo", "Amarillo"});
        SpinnerPregunta spinnerPregunta = new SpinnerPregunta("Material predominante en su casa",new String[]{"Adobe","Ladrillo","Maderba","Esteras"});
        CheckPregunta checkPregunta = new CheckPregunta("Comida favorita a base de papa?", new String[]{"Papa a la huancaina","Papa rellena","Causa"});

        fragmentTransaction.replace(R.id.fragment1, radioPregunta);
        fragmentTransaction.replace(R.id.fragment2, spinnerPregunta);
        fragmentTransaction.replace(R.id.fragment3, checkPregunta);
        fragmentTransaction.commit();
    }
}
