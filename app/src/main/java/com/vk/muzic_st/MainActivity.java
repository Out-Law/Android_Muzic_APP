package com.vk.muzic_st;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    EditText Name_Text, Password_Text;
    Button Enter_btn;
    String Name[], Password[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Enter_btn = (Button) findViewById(R.id.Enter_btn);
        Enter_btn.setOnClickListener(this);

        Name_Text = (EditText) findViewById(R.id.name);
        Password_Text = (EditText) findViewById(R.id.passowrd);

        Name = getResources().getStringArray(R.array.Name);
        Password = getResources().getStringArray(R.array.Password);

    }


    @Override
    public void onClick(View v) {
        int  temp=0;
        for (int i=0; i<3; i++){
            if(Name[i].equals(Name_Text.getText().toString()) && Password[i]
                    .equals(Password_Text.getText().toString())){
                temp=1;
            }
        }
        if(temp==1) {
            Intent intent = new Intent(this, Home.class);
            intent.putExtra("fname", Name_Text.getText().toString());
            startActivity(intent);
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext
                    (), "Не правельный пароль или логин", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
