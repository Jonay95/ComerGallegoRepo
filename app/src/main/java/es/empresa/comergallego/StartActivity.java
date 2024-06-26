package es.empresa.comergallego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_start);

        //agregar animaciones

        Animation ani1= AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation ani2= AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        TextView label1 = findViewById(R.id.label1_start);
        ImageView ima1 = findViewById(R.id.ima1_star);


        label1.setAnimation(ani2);
        ima1.setAnimation(ani1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(StartActivity.this, LoginActivity.class);
                //Intent intent = new Intent(StartActivity.this, SearchActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);

    }
}