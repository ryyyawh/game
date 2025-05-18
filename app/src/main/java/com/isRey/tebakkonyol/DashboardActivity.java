package com.isRey.tebakkonyol;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    private SharedPreferences prefs;
    private int maxStageUnlocked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        prefs = getSharedPreferences("game_prefs", MODE_PRIVATE);
        maxStageUnlocked = prefs.getInt("max_stage_unlocked", 1); // default unlock stage 1

        // Tombol Main Sekarang
        Button btnPlay = findViewById(R.id.btn_play);
        btnPlay.setOnClickListener(v -> openStage(1));

        // Setup tombol tiap stage
        setupStageButton(R.id.btn_stage_1, 1);
        setupStageButton(R.id.btn_stage_2, 2);
        setupStageButton(R.id.btn_stage_3, 3);
        setupStageButton(R.id.btn_stage_4, 4);
        setupStageButton(R.id.btn_stage_5, 5);
        setupStageButton(R.id.btn_stage_6, 6);
        setupStageButton(R.id.btn_stage_7, 7);
        setupStageButton(R.id.btn_stage_8, 8);
        setupStageButton(R.id.btn_stage_9, 9);
        setupStageButton(R.id.btn_stage_10, 10);
        setupStageButton(R.id.btn_stage_11, 11);
    }

    private void setupStageButton(int buttonId, int stageNumber) {
        Button btnStage = findViewById(buttonId);
        btnStage.setOnClickListener(v -> {
            if (maxStageUnlocked >= stageNumber) {
                openStage(stageNumber);
            } else {
                Toast.makeText(DashboardActivity.this,
                        "Stage " + stageNumber + "kata si rey belum terbuka. Selesaikan stage sebelumnya dulu.",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void openStage(int stageNumber) {
        Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
        intent.putExtra("start_stage", stageNumber);
        startActivity(intent);
    }

    // Bisa kamu panggil di MainActivity saat user selesai stage untuk update progress unlock:
    public void updateMaxStageUnlocked(int finishedStage) {
        if (finishedStage >= maxStageUnlocked) {
            maxStageUnlocked = finishedStage + 1;
            SharedPreferences.Editor editor = prefs.edit();
            editor.putInt("max_stage_unlocked", maxStageUnlocked);
            editor.apply();
        }
    }
}