package com.isRey.tebakkonyol;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView questionText, levelText;
    private Button option1, option2, option3, option4;
    private ImageView levelIcon;

    private List<Question> questions;
    private int currentLevel;
    private int currentQuestionIndex;

    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionText = findViewById(R.id.question_text);
        levelText = findViewById(R.id.level_text);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        levelIcon = findViewById(R.id.level_icon);

        prefs = getSharedPreferences("game_prefs", Context.MODE_PRIVATE);

        // Ambil level yang dikirim dari Dashboard, default 1
        currentLevel = getIntent().getIntExtra("start_stage", 1);
        currentQuestionIndex = 0;

        loadLevel(currentLevel);

        // Listener untuk semua opsi jawaban
        Button.OnClickListener optionClickListener = v -> {
            Button clicked = (Button) v;
            checkAnswer(clicked.getText().toString());
        };

        option1.setOnClickListener(optionClickListener);
        option2.setOnClickListener(optionClickListener);
        option3.setOnClickListener(optionClickListener);
        option4.setOnClickListener(optionClickListener);
    }

    private void loadLevel(int level) {
        currentLevel = level;
        currentQuestionIndex = 0;
        questions = QuestionBank.getQuestionsForLevel(level);

        levelText.setText("Level " + currentLevel + " / 11");
        int resId = getResources().getIdentifier("level" + currentLevel + "_icon", "drawable", getPackageName());
        if (resId != 0) {
            levelIcon.setImageResource(resId);
        } else {
            // Jika icon tidak ditemukan, bisa pakai default
            levelIcon.setImageResource(R.drawable.default_level_icon);
        }

        showQuestion();
    }

    private void showQuestion() {
        if (currentQuestionIndex < questions.size()) {
            Question q = questions.get(currentQuestionIndex);
            questionText.setText(q.getQuestion());
            String[] options = q.getOptions();
            option1.setText(options[0]);
            option2.setText(options[1]);
            option3.setText(options[2]);
            option4.setText(options[3]);
        } else {
            // Selesai semua soal di level ini, unlock dan lanjut ke level berikutnya
            int maxStageUnlocked = prefs.getInt("max_stage_unlocked", 1);
            if (currentLevel == 11) {
                Toast.makeText(this,
                        "Selamat! Kamu sudah menyelesaikan Boss Level. Nantikan update berikutnya dari si Reyy....!",
                        Toast.LENGTH_LONG).show();
                // Bisa juga langsung finish activity
                finish();
                return;
            }

            // Update unlock stage berikutnya kalau perlu
            if (currentLevel >= maxStageUnlocked) {
                maxStageUnlocked = currentLevel + 1;
                prefs.edit().putInt("max_stage_unlocked", maxStageUnlocked).apply();
            }

            Toast.makeText(this,
                    "Selamat! Lanjut ke level berikutnya: Level " + (currentLevel + 1),
                    Toast.LENGTH_SHORT).show();

            loadLevel(currentLevel + 1);
        }
    }

    private void checkAnswer(String selectedAnswer) {
        Question currentQuestion = questions.get(currentQuestionIndex);
        String correctAnswer = currentQuestion.getOptions()[currentQuestion.getAnswerIndex()];

        if (selectedAnswer.equals(correctAnswer)) {
            showCorrectAnswerDialog();
        } else {
            Toast.makeText(this, "Jawaban salah, coba lagi!", Toast.LENGTH_SHORT).show();
        }
    }

    private void showCorrectAnswerDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Jawaban Benar!");
        builder.setMessage("Mau lanjut ke pertanyaan berikutnya atau ulang pertanyaan ini?");
        builder.setPositiveButton("Lanjut", (dialog, which) -> {
            currentQuestionIndex++;
            showQuestion();
        });
        builder.setNegativeButton("Ulang", (dialog, which) -> {
            showQuestion(); // ulang pertanyaan yg sama
        });
        builder.setCancelable(false);
        builder.show();
    }
}