package dadosactivity.cursoandroid.com.dadosactivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    private TextView texto;
    private TextView texto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        texto = findViewById(R.id.textoId);
        texto2 = findViewById(R.id.texto2Id);

        Bundle extra = getIntent().getExtras();

        if(extra != null){
            String textoPassado = extra.getString("nome");
            String segundoTextoPassado = extra.getString("senha");
            texto.setText(textoPassado);
            texto2.setText(segundoTextoPassado);
        }
    }
}
