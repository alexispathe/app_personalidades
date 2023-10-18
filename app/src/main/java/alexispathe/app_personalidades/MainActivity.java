package alexispathe.app_personalidades;

import androidx.appcompat.app.AppCompatActivity;
import alexispathe.app_personalidades.ui.main.MainFragment;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaración de variables para los elementos de la interfaz de usuario
    private CheckBox checkBoxFlematico;
    private CheckBox checkBoxMelancolico;
    private CheckBox checkBoxSanguineo;
    private CheckBox checkBoxColerico;
    private RadioButton radioIntrovertido;
    private RadioButton radioExtrovertido;
    private TextView textViewFlematico;
    private TextView textViewMelancolico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragment);

        // Inicialización de las variables con los elementos de la interfaz
        checkBoxFlematico = findViewById(R.id.checkBoxFlematico);
        checkBoxMelancolico = findViewById(R.id.checkBoxMelancolico);
        checkBoxSanguineo = findViewById(R.id.checkBoxSanguineo);
        checkBoxColerico = findViewById(R.id.checkBoxColerico);
        radioIntrovertido = findViewById(R.id.radioIntrovertido);
        radioExtrovertido = findViewById(R.id.radioExtrovertido);
        textViewFlematico = findViewById(R.id.textViewFlematico);
        textViewMelancolico = findViewById(R.id.textViewMelancolico);

        // Obtención de la referencia al grupo de radio buttons
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        // Configuración del listener para el RadioButton "Introvertido"
        radioIntrovertido.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Mostrar los CheckBox correspondientes y ocultar los demás elementos
                checkBoxFlematico.setVisibility(CheckBox.VISIBLE);
                checkBoxMelancolico.setVisibility(CheckBox.VISIBLE);
                checkBoxSanguineo.setVisibility(CheckBox.GONE);
                checkBoxColerico.setVisibility(CheckBox.GONE);
                // Ocultar los TextViews de los mensajes
                textViewMelancolico.setVisibility(TextView.GONE);
                textViewFlematico.setVisibility(TextView.GONE);
            } else {
                // Ocultar los CheckBox y TextViews cuando el RadioButton se deselecciona
                checkBoxFlematico.setVisibility(CheckBox.GONE);
                checkBoxMelancolico.setVisibility(CheckBox.GONE);
            }
        });

        // Configuración del listener para el RadioButton "Extrovertido"
        radioExtrovertido.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Mostrar los CheckBox correspondientes y ocultar los demás elementos
                checkBoxFlematico.setVisibility(CheckBox.GONE);
                checkBoxMelancolico.setVisibility(CheckBox.GONE);
                checkBoxSanguineo.setVisibility(CheckBox.VISIBLE);
                checkBoxColerico.setVisibility(CheckBox.VISIBLE);
                // Ocultar los TextViews de los mensajes
                textViewMelancolico.setVisibility(TextView.GONE);
                textViewFlematico.setVisibility(TextView.GONE);
            } else {
                // Ocultar los CheckBox y TextViews cuando el RadioButton se deselecciona
                checkBoxSanguineo.setVisibility(CheckBox.GONE);
                checkBoxColerico.setVisibility(CheckBox.GONE);
            }
        });

        // Configuración del listener para el CheckBox "Flemático"
        checkBoxFlematico.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Mostrar u ocultar el TextView según el estado del CheckBox
                if (isChecked) {
                    textViewFlematico.setVisibility(TextView.VISIBLE);
                } else {
                    textViewFlematico.setVisibility(TextView.GONE);
                }
            }
        });

        // Configuración del listener para el CheckBox "Melancólico"
        checkBoxMelancolico.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Mostrar u ocultar el TextView según el estado del CheckBox
                if (isChecked) {
                    textViewMelancolico.setVisibility(TextView.VISIBLE);
                } else {
                    textViewMelancolico.setVisibility(TextView.GONE);
                }
            }
        });
    }
}
