package org.escoladeltreball.rranguera.textmodif;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    CheckBox chk1_inv;
    CheckBox chk2_mayu;
    Button btn1;
    public static final int CODI_MODIFTEXT_2ND_ACTIVITY_REQUEST = 73557; //qualsevol número


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup();
    }


    private void setup() {

        et1 = (EditText) findViewById(R.id.et_entrada);
        chk1_inv = (CheckBox) findViewById(R.id.chk1_inv);
        chk2_mayu = (CheckBox) findViewById(R.id.chk2_mayu);
        btn1 = (Button) findViewById(R.id.btn1);

        btn1.setOnClickListener( v -> convertirText() );
    }


    private void convertirText() {

        Intent intent_textModif = new Intent(this, Main2Activity.class);

        //modificar el text, segons el q s'indiqui
        //TODO

        intent_textModif.putExtra(Intent.EXTRA_COMPONENT_NAME, "blabla");     //valor que passem a la Activity cridada

        //si l'Activity cridada ha de retornar algo:
        startActivityForResult(intent_textModif, CODI_MODIFTEXT_2ND_ACTIVITY_REQUEST);

    }


    //Cal afegir el mètode onActivityResult, si volem recuperar el resultat que ens enviï la Activity filla
    //Mètode q es crida automaticam quan acaba la sub-Activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Toast.makeText(this, "Hem tornat de la p2, amb el Back", Toast.LENGTH_LONG).show();

/*
        if (requestCode == CODI_MODIFTEXT_2ND_ACTIVITY_REQUEST){
            if (resultCode == RESULT_OK){
                if (data.hasExtra(Intent.EXTRA_COMPONENT_NAME)){
                    Toast.makeText(this, data.getCharSequenceExtra(Intent.EXTRA_COMPONENT_NAME), Toast.LENGTH_LONG).show();
                }
            }
        }
*/


//        super.onActivityResult(requestCode, resultCode, data);
    }


}
