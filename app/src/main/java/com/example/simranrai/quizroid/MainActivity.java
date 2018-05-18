package com.example.simranrai.quizroid;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Answer views (Checkboxes, EditTexts, RadioButtons
        final CheckBox q1Answer = findViewById(R.id.answer1_q1_chkbox);
        final CheckBox q2Answer = findViewById(R.id.answer2_q1_chkbox);
        final CheckBox q3Answer = findViewById(R.id.answer3_q1_chkbox);
        final CheckBox q4Answer = findViewById(R.id.answer4_q1_chkbox);

        // When scrolling to the next view, there should be some margin above for whitespace:
        final int spaceAboveScrolledView = 16;

        // ScrollView used to reference the ScrollView in the layout.
        final ScrollView sv = findViewById(R.id.main_scroll_view);

        // NEXT BUTTON to go to Q2
        Button q1NextBtn = (Button) findViewById(R.id.btn_q1_next);
        q1NextBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                View q2InsideView = findViewById(R.id.q2_linear_layout);
                //sv.smoothScrollTo(0, (int) q2InsideView.getY() - spaceAboveScrolledView);
                ObjectAnimator.ofInt(sv, "scrollY", (int) q2InsideView.getY() - spaceAboveScrolledView).setDuration(500).start();


            }
        });

        // NEXT BUTTON to go to Q3
        Button q2NextBtn = (Button) findViewById(R.id.btn_q2_next);
        q2NextBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                View q3InsideView = findViewById(R.id.q3_linear_layout);
                ObjectAnimator.ofInt(sv, "scrollY", (int) q3InsideView.getY() - spaceAboveScrolledView).setDuration(500).start();


            }
        });

        // NEXT BUTTON to go to Q4
        Button q3NextBtn = (Button) findViewById(R.id.btn_q3_next);
        q3NextBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                View q4InsideView = findViewById(R.id.q4_linear_layout);
                ObjectAnimator.ofInt(sv, "scrollY", (int) q4InsideView.getY() - spaceAboveScrolledView).setDuration(500).start();


            }
        });

        // NEXT BUTTON to go to Q5
        Button q4NextBtn = (Button) findViewById(R.id.btn_q4_next);
        q4NextBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                View q5InsideView = findViewById(R.id.q5_linear_layout);
                ObjectAnimator.ofInt(sv, "scrollY", (int) q5InsideView.getY() - spaceAboveScrolledView).setDuration(500).start();


            }
        });

        // NEXT BUTTON to go to Q6
        Button q5NextBtn = (Button) findViewById(R.id.btn_q5_next);
        q5NextBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                View q6InsideView = findViewById(R.id.q6_linear_layout);
                ObjectAnimator.ofInt(sv, "scrollY", (int) q6InsideView.getY() - spaceAboveScrolledView).setDuration(500).start();


            }
        });

        // NEXT BUTTON to go to Q7
        Button q6NextBtn = (Button) findViewById(R.id.btn_q6_next);
        q6NextBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                View q7InsideView = findViewById(R.id.q7_linear_layout);
                ObjectAnimator.ofInt(sv, "scrollY", (int) q7InsideView.getY() - spaceAboveScrolledView).setDuration(500).start();


            }
        });

        // BACK BUTTON to go to Q1
        Button q2BackBtn = (Button) findViewById(R.id.btn_q2_back);
        q2BackBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                View q1InsideView = findViewById(R.id.q1_linear_layout);
                //sv.smoothScrollTo(0, (int) q2InsideView.getY() - spaceAboveScrolledView);
                ObjectAnimator.ofInt(sv, "scrollY", (int) q1InsideView.getY() - spaceAboveScrolledView).setDuration(500).start();


            }
        });

        // BACK BUTTON to go to Q2
        Button q3BackBtn = (Button) findViewById(R.id.btn_q3_back);
        q3BackBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                View q2InsideView = findViewById(R.id.q2_linear_layout);
                ObjectAnimator.ofInt(sv, "scrollY", (int) q2InsideView.getY() - spaceAboveScrolledView).setDuration(500).start();


            }
        });

        // BACK BUTTON to go to Q3
        Button q4BackBtn = (Button) findViewById(R.id.btn_q4_back);
        q4BackBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                View q3InsideView = findViewById(R.id.q3_linear_layout);
                ObjectAnimator.ofInt(sv, "scrollY", (int) q3InsideView.getY() - spaceAboveScrolledView).setDuration(500).start();


            }
        });

        // BACK BUTTON to go to Q4
        Button q5BackBtn = (Button) findViewById(R.id.btn_q5_back);
        q5BackBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                View q4InsideView = findViewById(R.id.q4_linear_layout);
                ObjectAnimator.ofInt(sv, "scrollY", (int) q4InsideView.getY() - spaceAboveScrolledView).setDuration(500).start();


            }
        });

        // BACK BUTTON to go to Q5
        Button q6BackBtn = (Button) findViewById(R.id.btn_q6_back);
        q6BackBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                View q5InsideView = findViewById(R.id.q5_linear_layout);
                ObjectAnimator.ofInt(sv, "scrollY", (int) q5InsideView.getY() - spaceAboveScrolledView).setDuration(500).start();


            }
        });

        // BACK BUTTON to go to Q6
        Button q7BackBtn = (Button) findViewById(R.id.btn_q7_back);
        q7BackBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                View q6InsideView = findViewById(R.id.q6_linear_layout);
                ObjectAnimator.ofInt(sv, "scrollY", (int) q6InsideView.getY() - spaceAboveScrolledView).setDuration(500).start();


            }
        });


        // TextView for results and submission
        final TextView resultTextView = findViewById(R.id.result_textview);


        // SUBMIT Button to Submit/Check Answers
        Button submit = (Button) findViewById(R.id.btn_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Clear the TextView of any text
                resultTextView.setText("");
                resultTextView.append("QUIZ RESULTS\n");


                // Question 1 Check
                if (q1Answer.isChecked() && !q2Answer.isChecked() && q3Answer.isChecked() && !q4Answer.isChecked()) {
                    resultTextView.append(setCorrectAnswerString(1));
                } else {
                    resultTextView.append(setIncorrectAnswerString(1));
                }

                // Question 2 Check
                EditText ans2EditText = (EditText) findViewById(R.id.answer_q2_edttxt);
                String answer2Input = ans2EditText.getText().toString().toLowerCase();
                if (answer2Input.equals("imageview")) {
                    resultTextView.append(setCorrectAnswerString(2));
                } else {
                    resultTextView.append(setIncorrectAnswerString(2));

                }

                // Question 3 Check
                RadioButton q3RadioButtonAnswer4 = (RadioButton) findViewById(R.id.answer4_q3_radbtn);
                if (q3RadioButtonAnswer4.isChecked()) {
                    resultTextView.append(setCorrectAnswerString(3));
                } else {
                    resultTextView.append(setIncorrectAnswerString(3));
                }

                // Question 4
                CheckBox q4Answer1 = findViewById(R.id.answer1_q4_chkbox);
                CheckBox q4Answer2 = findViewById(R.id.answer2_q4_chkbox);
                CheckBox q4Answer3 = findViewById(R.id.answer3_q4_chkbox);
                CheckBox q4Answer4 = findViewById(R.id.answer4_q4_chkbox);
                if (!q4Answer1.isChecked() && q4Answer2.isChecked() && q4Answer3.isChecked() && q4Answer4.isChecked()) {
                    resultTextView.append(setCorrectAnswerString(4));
                } else {
                    resultTextView.append(setIncorrectAnswerString(4));
                }

                // Question 5
                EditText ans5EditText = (EditText) findViewById(R.id.answer_q5_edttxt);
                String answer5Input = ans5EditText.getText().toString().toLowerCase();
                if (answer5Input.equals("7")) {
                    resultTextView.append(setCorrectAnswerString(5));
                } else {
                    resultTextView.append(setIncorrectAnswerString(5));

                }

                // Question 6
                CheckBox q6Answer1 = findViewById(R.id.answer1_q6_chkbox);
                CheckBox q6Answer2 = findViewById(R.id.answer2_q6_chkbox);
                CheckBox q6Answer3 = findViewById(R.id.answer3_q6_chkbox);
                CheckBox q6Answer4 = findViewById(R.id.answer4_q6_chkbox);
                if (q6Answer1.isChecked() && q6Answer2.isChecked() && q6Answer3.isChecked() && q6Answer4.isChecked()) {
                    resultTextView.append(setCorrectAnswerString(6));
                } else {
                    resultTextView.append(setIncorrectAnswerString(6));
                }

                // Question 7
                RadioButton q7RadioButtonAnswer2 = (RadioButton) findViewById(R.id.answer2_q7_radbtn);
                if (q7RadioButtonAnswer2.isChecked()) {
                    resultTextView.append(setCorrectAnswerString(7));
                } else {
                    resultTextView.append(setIncorrectAnswerString(7));
                }

                // Scroll down to the TextView result box
                ObjectAnimator.ofInt(sv, "scrollY", (int) resultTextView.getY() - spaceAboveScrolledView).setDuration(500).start();

            }
        });

        // CLEAR Button to clear results
        Button clear = (Button) findViewById(R.id.btn_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resultTextView.setText("");
                resultTextView.setText("Click \'Submit\' to see results...");
            }
        });


    }

    /**
     * This method will take in the question number and format a String with Green text if the answer was correct
     *
     * @param qNum the question number
     * @return formatted string with number of correct answers highlighted in green
     */
    public SpannableString setCorrectAnswerString(int qNum) {
        String input = "\nQuestion " + qNum + " Correct!";
        SpannableString ansStringCorrect = new SpannableString(input);
        ansStringCorrect.setSpan(new ForegroundColorSpan(Color.GREEN), input.length() - 8, input.length(), 0);
        return ansStringCorrect;
    }

    /**
     * This method will take in the question number and format a String with Red text if the answer was incorrect
     *
     * @param qNum the question number
     * @return formatted string with number of incorrect answers highlighted in red
     */
    public SpannableString setIncorrectAnswerString(int qNum) {
        String input = "\nQuestion " + qNum + " Incorrect.";
        SpannableString ansStringIncorrect = new SpannableString(input);
        ansStringIncorrect.setSpan(new ForegroundColorSpan(Color.RED), input.length() - 10, input.length(), 0);
        return ansStringIncorrect;
    }
}
