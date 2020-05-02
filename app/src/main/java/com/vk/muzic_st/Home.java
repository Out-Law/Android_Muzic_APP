package com.vk.muzic_st;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Home extends Activity{

    TextView[] Music_TextView = new TextView[5];
    TextView  Login_TextView;
    String URL[], Name_Music[];
    String name_1="Nikita", name_2="Vita", name_3="Luda";
    int number_button=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Music_TextView[0] = (TextView) findViewById(R.id.Text_1);
        Music_TextView[1] = (TextView) findViewById(R.id.Text_2);
        Music_TextView[2] = (TextView) findViewById(R.id.Text_3);
        Music_TextView[3] = (TextView) findViewById(R.id.Text_4);
        Music_TextView[4] = (TextView) findViewById(R.id.Text_5);

        URL = getResources().getStringArray(R.array.URL);
        Name_Music = getResources().getStringArray(R.array.Name_music);

        Login_TextView = (TextView) findViewById(R.id.logintextview);

        Intent intent = getIntent();

        String fName = intent.getStringExtra("fname");

        Login_TextView.setText(fName);

        music_get();


        findViewById(R.id.URL_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Login_TextView.getText().toString().equals(name_1)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[0])));
                }
                if(Login_TextView.getText().toString().equals(name_2)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[5])));
                }
                if(Login_TextView.getText().toString().equals(name_3)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[10])));
                }
            }
        });

        findViewById(R.id.URL_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Login_TextView.getText().toString().equals(name_1)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[1])));
                }
                if(Login_TextView.getText().toString().equals(name_2)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[6])));
                }
                if(Login_TextView.getText().toString().equals(name_3)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[11])));
                }
            }
        });

        findViewById(R.id.URL_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Login_TextView.getText().toString().equals(name_1)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[2])));
                }
                if(Login_TextView.getText().toString().equals(name_2)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[7])));
                }
                if(Login_TextView.getText().toString().equals(name_3)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[12])));
                }
            }
        });

        findViewById(R.id.URL_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Login_TextView.getText().toString().equals(name_1)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[3])));
                }
                if(Login_TextView.getText().toString().equals(name_2)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[8])));
                }
                if(Login_TextView.getText().toString().equals(name_3)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[13])));
                }
            }
        });

        findViewById(R.id.URL_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Login_TextView.getText().toString().equals(name_1)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[4])));
                }
                if(Login_TextView.getText().toString().equals(name_2)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[9])));
                }
                if(Login_TextView.getText().toString().equals(name_3)) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL[14])));
                }
            }
        });
    }


    private void music_get(){
        if(Login_TextView.getText().toString().equals(name_1)) {
            for (int i = 0; i < 5; i++) {
                Music_TextView[i].setText(Name_Music[i]);
            }
        }
        if(Login_TextView.getText().toString().equals(name_2)) {
            for (int i = 0; i < 5; i++) {
                Music_TextView[i].setText(Name_Music[i+5]);
            }
        }
        if(Login_TextView.getText().toString().equals(name_3)) {
            for (int i = 0; i < 5; i++) {
                Music_TextView[i].setText(Name_Music[i+10]);
            }
        }
    }

}