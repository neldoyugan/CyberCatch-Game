package com.example.cybercatch;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageButton;



import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private GameView gameView;
    private ImageButton btnMagnet;
    private MediaPlayer bgPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        // If you created a custom GameView class, create and attach it programmatically:
        SurfaceView surface = findViewById(R.id.game_surface);
        gameView = new GameView(this, surface);
        btnMagnet = findViewById(R.id.btn_magnet);

        btnMagnet.setOnTouchListener((v, event) -> {
            // When pressed, activate magnet
            if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                gameView.activateMagnet();
            }
            return true;
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        gameView.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        gameView.shutdown();
    }
}
