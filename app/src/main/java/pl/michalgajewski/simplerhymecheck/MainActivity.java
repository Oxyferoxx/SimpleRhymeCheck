package pl.michalgajewski.simplerhymecheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {


    Button mButton;
    EditText editText1;
    EditText editText2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            mButton = (Button)findViewById(R.id.button);
            editText1 = (EditText)findViewById(R.id.editText1);
            editText2 = (EditText)findViewById(R.id.editText2);
            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String rhyme1 = editText1.getText().toString();
                    String rhyme2 = editText2.getText().toString();
                    if (rhyme1.substring(rhyme1.length()-2).equals(rhyme2.substring(rhyme2.length()-2))){
                        Toast.makeText(getApplicationContext(), "Słowa się rymują", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(), "Słowa się nie rymują", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }
    }
