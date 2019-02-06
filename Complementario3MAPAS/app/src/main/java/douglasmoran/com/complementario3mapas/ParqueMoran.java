package douglasmoran.com.complementario3mapas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ParqueMoran extends AppCompatActivity {

    ImageView portada,img1,img2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_moran);

        portada = findViewById(R.id.portada);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);

    }
}
