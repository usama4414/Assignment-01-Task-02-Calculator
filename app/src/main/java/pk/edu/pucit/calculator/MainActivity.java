package pk.edu.pucit.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {


    private TextView btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn00, btn_del, btn_add, btn_mul, btn_sub, btn_div, btn_dot, btn_ac, btn_equals, btn_percentage;
    private TextView tv_equation, tv_result;
    private String myEquation;
    boolean isDot,isNumber;
    int count=0;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.n0);
        btn1 = findViewById(R.id.n1);
        btn2 = findViewById(R.id.n2);
        btn3 = findViewById(R.id.n3);
        btn4 = findViewById(R.id.n4);
        btn5 = findViewById(R.id.n5);
        btn6 = findViewById(R.id.n6);
        btn7 = findViewById(R.id.n7);
        btn8 = findViewById(R.id.n8);
        btn9 = findViewById(R.id.n9);
        btn00 = findViewById(R.id.n00);
        btn_del = findViewById(R.id.del);
        btn_add = findViewById(R.id.addition);
        btn_mul = findViewById(R.id.multiplication);
        btn_sub = findViewById(R.id.subtraction);
        btn_div = findViewById(R.id.division);
        btn_dot = findViewById(R.id.dot);
        btn_ac = findViewById(R.id.AC);
        btn_equals = findViewById(R.id.equals);
        btn_percentage = findViewById(R.id.percentage);


        tv_equation = findViewById(R.id.tv_equation);
        tv_result = findViewById(R.id.tv_result);




        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                tv_equation.setText(myEquation + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                tv_equation.setText(myEquation + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                tv_equation.setText(myEquation + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                tv_equation.setText(myEquation + "3");
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                tv_equation.setText(myEquation + "4");
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                tv_equation.setText(myEquation + "5");
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                tv_equation.setText(myEquation + "6");
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                tv_equation.setText(myEquation + "7");
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                tv_equation.setText(myEquation + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                tv_equation.setText(myEquation + "9");
            }
        });

        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                tv_equation.setText(myEquation + "00");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                int length = myEquation.length() - 1;
                if (length + 1 > 0) {
                    char last = myEquation.charAt(length);
                    if (last == '+' || last == '-' || last == '*' || last == '/' || last == '%') {
                        myEquation =  myEquation.substring(0, length);
                        tv_equation.setText(myEquation);
                    }
                    tv_equation.setText(myEquation + "+");
                    isDot = false;
                    isNumber = true;
                    count = 0;
                }
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                int length = myEquation.length() - 1;
                if (length + 1 > 0) {
                    char last = myEquation.charAt(length);
                    if (last == '+' || last == '-' || last == '*' || last == '/' || last == '%') {
                        myEquation = myEquation.substring(0, length);
                        tv_equation.setText(myEquation);
                    }
                    tv_equation.setText(myEquation + "/");
                    isDot = false;
                    isNumber = true;
                    count = 0;

                }
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                int length = myEquation.length() - 1;
                if (length + 1 > 0) {
                    char last = myEquation.charAt(length);
                    if (last == '+' || last == '-' || last == '*' || last == '/' || last == '%') {
                        myEquation = myEquation.substring(0, length);
                        tv_equation.setText(myEquation);
                    }
                    tv_equation.setText(myEquation + "*");
                    isDot = false;
                    isNumber = true;
                    count = 0;

                }
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                int length = myEquation.length() ;
                if (length  > 0) {
                    int l = length - 1;
                    char last = myEquation.charAt(l);
                    if (last == '-' || last == '+' || last == '%') {
                        myEquation = myEquation.substring(0, l);
                        tv_equation.setText(myEquation);
                    }
                }
                tv_equation.setText(myEquation + "-");
                isDot = false;
                isNumber = true;
                count = 0;
            }
        });

        btn_percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation = tv_equation.getText().toString();
                int length = myEquation.length() - 1;
                if (length + 1 > 0) {
                    char last = myEquation.charAt(length);
                    if (last == '+' || last == '-' || last == '*' || last == '/' || last == '%') {
                        myEquation = myEquation.substring(0, length);
                        tv_equation.setText(myEquation);
                    }
                    tv_equation.setText(myEquation + "%");
                    isDot = false;
                    isNumber = true;
                    count = 0;

                }
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEquation=tv_equation.getText().toString();
                if(count==0) {
                    tv_equation.setText(myEquation + ".");
                    isDot = true;
                    isNumber = false;
                    count = 1;
                }
            }
        });

        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=tv_equation.getText().toString();
                int length=tv_equation.length();

                if(length>0)
                {
                    s=s.substring(0,length-1);
                    tv_equation.setText(s);
                }
            }
        });

        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv_equation.getText().toString();
                if (s != "") {
                    Expression expression = new ExpressionBuilder(s).build();
                    try {
                        double result = expression.evaluate();
                        tv_result.setText(Double.toString(result));
                    }
                    catch (ArithmeticException ex) {
                        tv_result.setText("Error");
                    }
                }
            }
        });


        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_equation.setText("");
                tv_result.setText("");
                count=0;
            }
        });
    }
}
