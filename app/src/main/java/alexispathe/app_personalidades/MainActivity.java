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

        checkBoxFlematico = findViewById(R.id.checkBoxFlematico);
        checkBoxMelancolico = findViewById(R.id.checkBoxMelancolico);
        checkBoxSanguineo = findViewById(R.id.checkBoxSanguineo);
        checkBoxColerico = findViewById(R.id.checkBoxColerico);
        radioIntrovertido = findViewById(R.id.radioIntrovertido);
        radioExtrovertido = findViewById(R.id.radioExtrovertido);
        textViewFlematico = findViewById(R.id.textViewFlematico);
        textViewMelancolico = findViewById(R.id.textViewMelancolico);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        radioIntrovertido.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBoxFlematico.setVisibility(CheckBox.VISIBLE);
                checkBoxMelancolico.setVisibility(CheckBox.VISIBLE);
                checkBoxSanguineo.setVisibility(CheckBox.GONE);
                checkBoxColerico.setVisibility(CheckBox.GONE);
                textViewMelancolico.setVisibility(TextView.GONE);
                textViewFlematico.setVisibility(TextView.GONE);
            } else {
                checkBoxFlematico.setVisibility(CheckBox.GONE);
                checkBoxMelancolico.setVisibility(CheckBox.GONE);
            }
        });

        radioExtrovertido.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBoxFlematico.setVisibility(CheckBox.GONE);
                checkBoxMelancolico.setVisibility(CheckBox.GONE);
                checkBoxSanguineo.setVisibility(CheckBox.VISIBLE);
                checkBoxColerico.setVisibility(CheckBox.VISIBLE);
                textViewMelancolico.setVisibility(TextView.GONE);
                textViewFlematico.setVisibility(TextView.GONE);
            } else {
                checkBoxSanguineo.setVisibility(CheckBox.GONE);
                checkBoxColerico.setVisibility(CheckBox.GONE);
            }
        });

        checkBoxFlematico.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textViewFlematico.setVisibility(TextView.VISIBLE);
                } else {
                    textViewFlematico.setVisibility(TextView.GONE);
                }
            }
        });

        checkBoxMelancolico.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textViewMelancolico.setVisibility(TextView.VISIBLE);
                } else {
                    textViewMelancolico.setVisibility(TextView.GONE);
                }
            }
        });
    }
}

