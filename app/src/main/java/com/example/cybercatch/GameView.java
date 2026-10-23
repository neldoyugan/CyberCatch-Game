package com.example.cybercatch;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.example.cybercatch.Orb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

// ⭐⭐⭐ FIXED: MUST extend SurfaceView
public class GameView extends SurfaceView implements SurfaceHolder.Callback, Runnable {

    private Thread thread;
    private volatile boolean running = false;

    private final Context ctx;
    private final SurfaceHolder holder;
    private final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Random rand = new Random();
