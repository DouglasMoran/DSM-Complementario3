package douglasmoran.com.complementario3mapas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class TomaQuezaltepeque extends AppCompatActivity {

    ImageView toma1,toma2,toma3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toma_quezaltepeque);

        toma1 = findViewById(R.id.toma1);
        toma2 = findViewById(R.id.toma2);
        toma3 = findViewById(R.id.toma3);

    }
}
