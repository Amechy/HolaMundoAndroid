package example.com.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

/**
 *  Mi primera aplicación de Android
 *  @author Alejandro Mechiné Gamarra
 *  @version 1.0
 *  @see android.app.Activity
 */
public class HolaMundoActivity extends AppCompatActivity {

    private Switch swWhite;
    private TextView cuadroTexto;


    @Override
    // Comentario de una línea
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);
        swWhite = (Switch) findViewById(R.id.swBotonsito);        //Asignamos el switch creado al elemento gráfico
        cuadroTexto = (TextView) findViewById(R.id.txvTexto);

        // Creamos el código
        swWhite.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            cuadroTexto.setText(R.string.mensajeActivado);
                        } else {
                            cuadroTexto.setText(R.string.mensajeDesactivado);
                        }
                    }
                }
        );
    }

}
