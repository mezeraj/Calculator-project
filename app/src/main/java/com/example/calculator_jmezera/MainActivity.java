package com.example.calculator_jmezera;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String first;
    private String second;
    private String hello = "01134";

    private TextView screenTxt;

    private Button zeroBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;

    private Button plusBtn;
    private Button minusBtn;
    private Button multBtn;
    private Button divBtn;
    private Button equalsBtn;
    private Button clearBtn;
    private Button decimalBtn;
    private Button ceBtn;
    private Button sqrtBtn;
    private Button helloBtn;

    private boolean empty = true;
    private boolean floatV = false;
    private int op = -1;

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        String saveFirst = first;
        String saveSecond = screenTxt.getText().toString();
        int saveOp = op;

        savedInstanceState.putString("key1",saveFirst);
        savedInstanceState.putString("key2",saveSecond);
        savedInstanceState.putInt("keyOp", saveOp);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String saveFirst = savedInstanceState.getString("key1");
        String saveSecond =savedInstanceState.getString("key2");
        int saveOp = savedInstanceState.getInt("keyOp");
        first = saveFirst; second = saveSecond; op = saveOp;
        if (second == null){
            screenTxt.setText(first);
        }
        else {
            screenTxt.setText(second);
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screenTxt = findViewById(R.id.screenTxt);

        zeroBtn = findViewById(R.id.zeroBtn);
        oneBtn = findViewById(R.id.oneBtn);
        twoBtn = findViewById(R.id.twoBtn);
        threeBtn = findViewById(R.id.threeBtn);
        fourBtn = findViewById(R.id.fourBtn);
        fiveBtn = findViewById(R.id.fiveBtn);
        sixBtn = findViewById(R.id.sixBtn);
        sevenBtn = findViewById(R.id.sevenBtn);
        eightBtn = findViewById(R.id.eightBtn);
        nineBtn = findViewById(R.id.nineBtn);

        plusBtn = findViewById(R.id.plusBtn);
        minusBtn = findViewById(R.id.minusBtn);
        multBtn = findViewById(R.id.multBtn);
        divBtn = findViewById(R.id.divBtn);
        equalsBtn = findViewById(R.id.equalBtn);
        clearBtn = findViewById(R.id.clearBtn);
        decimalBtn = findViewById(R.id.decimalBtn);
        ceBtn = findViewById(R.id.ceBtn);
        sqrtBtn = findViewById(R.id.sqrtBtn);
        helloBtn = findViewById(R.id.helloBtn);

        helloBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenTxt.setText(hello);
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenTxt.setText("0");
                first = null;
                second = null;
                empty = true;
                op = -1;
            }
        });

        ceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op != -1) {
                    screenTxt.setText("");
                    screenTxt.setText(first);
                    empty = true;
                }

            }
        });

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = screenTxt.getText().toString();
                op = 0;
                empty = true;
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = screenTxt.getText().toString();;
                op = 1;
                empty = true;
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = screenTxt.getText().toString();
                op = 3;
                floatV = true;
                empty = true;
            }
        });

        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = screenTxt.getText().toString();
                op = 2;
                empty = true;
            }
        });

        sqrtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = screenTxt.getText().toString();
                first = Double.toString(Math.sqrt(Float.parseFloat(first)));
                screenTxt.setText(first);
                empty = true;
            }
        });


        decimalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screenTxt.getText().equals("")){
                    screenTxt.setText("0.");
                    empty = false;
                }
                else {
                    screenTxt.setText(screenTxt.getText()+".");
                    floatV = true;
                }
            }
        });

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (empty){
                    screenTxt.setText("1");
                    empty = false;
                }
                else {
                    screenTxt.setText(screenTxt.getText() + "1");
                }
            }

        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (empty){
                    screenTxt.setText("2");
                    empty = false;
                }
                else {
                    screenTxt.setText(screenTxt.getText() + "2");
                }
            }

        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (empty){
                    screenTxt.setText("3");
                    empty = false;
                }
                else {
                    screenTxt.setText(screenTxt.getText() + "3");
                }
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (empty){
                    screenTxt.setText("4");
                    empty = false;
                }
                else {
                    screenTxt.setText(screenTxt.getText() + "4");
                }
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (empty){
                    screenTxt.setText("5");
                    empty = false;
                }
                else {
                    screenTxt.setText(screenTxt.getText() + "5");
                }
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (empty) {
                    screenTxt.setText("6");
                    empty = false;
                } else {
                    screenTxt.setText(screenTxt.getText() + "6");
                }
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (empty){
                    screenTxt.setText("7");
                    empty = false;
                }
                else {
                    screenTxt.setText(screenTxt.getText() + "7");
                }
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (empty == true){
                    screenTxt.setText("8");
                    empty = false;
                }
                else {
                    screenTxt.setText(screenTxt.getText() + "8");
                }
            }

        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (empty == true){
                    screenTxt.setText("9");
                    empty = false;
                }
                else {
                    screenTxt.setText(screenTxt.getText() + "9");
                }
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (empty){
                    screenTxt.setText("0");
                    empty = false;
                }
                else {
                    screenTxt.setText(screenTxt.getText() + "0");
                }
                }
        });
        equalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == -1) {

                }
                else {
                    second = screenTxt.getText().toString();
                    if (op == 0) {
                        if (floatV == true) {
                            float total = Float.parseFloat(first) + Float.parseFloat(second);
                            screenTxt.setText(Float.toString(total));
                            first = Float.toString(total);
                        } else {
                            int total = Integer.parseInt(first) + Integer.parseInt(second);
                            screenTxt.setText(Integer.toString(total));
                            first = Integer.toString(total);
                        }

                    } else if (op == 1) {
                        if (floatV == true) {
                            float newS1 = Float.parseFloat(first);
                            float newS2 = Float.parseFloat(second);
                            float total = newS1 - newS2;
                            screenTxt.setText(Float.toString(total));
                            first = Float.toString(total);
                        } else {
                            int newS1 = Integer.parseInt(first);
                            int newS2 = Integer.parseInt(second);
                            int total = newS1 - newS2;
                            screenTxt.setText(Integer.toString(total));
                            first = Integer.toString(total);
                        }

                    } else if (op == 3) {
                        if (floatV == true) {
                            float newS1 = Float.parseFloat(first);
                            float newS2 = Float.parseFloat(second);
                            float total = newS1 / newS2;
                            screenTxt.setText(Float.toString(total));
                            first = Float.toString(total);
                        } else {
                            int newS1 = Integer.parseInt(first);
                            int newS2 = Integer.parseInt(second);
                            int total = newS1 / newS2;
                            screenTxt.setText(Integer.toString(total));
                            first = Integer.toString(total);
                        }
                    } else if (op == 2) {
                        if (floatV == true) {
                            float newS1 = Float.parseFloat(first);
                            float newS2 = Float.parseFloat(second);
                            float total = newS1 * newS2;
                            screenTxt.setText(Float.toString(total));
                            first = Float.toString(total);
                        } else {
                            int newS1 = Integer.parseInt(first);
                            int newS2 = Integer.parseInt(second);
                            int total = newS1 * newS2;
                            screenTxt.setText(Integer.toString(total));
                            first = Integer.toString(total);
                        }
                    }
                }
                empty = true;
                op = -1;
            }
        });
    }
}
