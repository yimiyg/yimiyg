package com.example.cry;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends Activity {
        private Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt_C, bt_jia, bt_jian, bt_cheng, bt_chu, bt_equal;
        private TextView textView;
        private EditText editText;
        private String opt = "+";//操作符
        private int n1 = 0, n2 = 0;
        private View.OnClickListener lisenter = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.tv);//返回view
                editText = (EditText) findViewById(R.id.et);
                Button btn = (Button) v;
                switch (btn.getId()) {
                    case R.id.bt_0://0
                    {
                        //textView.setText(n1 + "+" + 10);
                        editText.setText(editText.getText().toString() + 0);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.bt_1://1
                    {
                        String str = editText.getText().toString();//默认值为""?
                        editText.setText(str + 1);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.bt_2://2
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 2);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.bt_3://3
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 3);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.bt_4://4
                    {
                        editText.setText(editText.getText().toString() + 4);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.bt_5://5
                    {
                        editText.setText(editText.getText().toString() + 5);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.bt_6://6
                    {
                        editText.setText(editText.getText().toString() + 6);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.bt_7://7
                    {
                        editText.setText(editText.getText().toString() + 7);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.bt_8://8
                    {
                        editText.setText(editText.getText().toString() + 8);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.bt_9://9
                    {
                        editText.setText(editText.getText().toString() + 9);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.bt_C:// CLS
                    {
                        textView.setText("");
                        editText.setText("");
                        break;
                    }
                    case R.id.bt_jia:// +
                    {
                        String str = editText.getText().toString();
                        n1=Integer.parseInt(str);
                        opt = "+";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.bt_jian:// -
                    {
                        String str = editText.getText().toString();
                        n1=Integer.parseInt(str);
                        opt = "-";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.bt_cheng:// *
                    {
                        String str = editText.getText().toString();
                        n1=Integer.parseInt(str);
                        opt = "*";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.bt_chu:// /
                    {
                        String str = editText.getText().toString();
                        n1=Integer.parseInt(str);
                        opt = "/";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.bt_equal:// =
                    {
                        if(opt == "+")
                        {
                            String str = editText.getText().toString();
                            n2=Integer.parseInt(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((double)(n1)+(double)(n2)+"");
                        }
                        else if(opt == "-")
                        {
                            String str = editText.getText().toString();
                            n2=Integer.parseInt(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((double)(n1)-(double)(n2)+"");
                        }
                        else if(opt == "*")
                        {
                            String str = editText.getText().toString();
                            n2=Integer.parseInt(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((double)(n1)*(double)(n2)+"");
                        }
                        else if(opt == "/")
                        {
                            String str = editText.getText().toString();
                            n2=Integer.parseInt(str);
                            if(n2 == 0)
                            {
                                editText.setText("");
                                textView.setText("除数不能为0");
                                break;
                            }
                            else
                            {
                                textView.setText(n1 + opt + n2 + "=");
                                editText.setText((double)(n1)/(double)(n2)+"");
                            }
                        }

                        break;
                    }
                }
            }
        };
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            bt0 = (Button) findViewById(R.id.bt_0);
            bt1 = (Button) findViewById(R.id.bt_1);
            bt2 = (Button) findViewById(R.id.bt_2);
            bt3 = (Button) findViewById(R.id.bt_3);
            bt4 = (Button) findViewById(R.id.bt_4);
            bt5 = (Button) findViewById(R.id.bt_5);
            bt6 = (Button) findViewById(R.id.bt_6);
            bt7 = (Button) findViewById(R.id.bt_7);
            bt8 = (Button) findViewById(R.id.bt_8);
            bt9 = (Button) findViewById(R.id.bt_9);
            bt_C = (Button) findViewById(R.id.bt_C);
            bt_jia = (Button) findViewById(R.id.bt_jia);
            bt_jian = (Button) findViewById(R.id.bt_jian);
            bt_cheng = (Button) findViewById(R.id.bt_cheng);
            bt_chu = (Button) findViewById(R.id.bt_chu);
            bt_equal = (Button) findViewById(R.id.bt_equal);

            bt0.setOnClickListener(lisenter);
            bt1.setOnClickListener(lisenter);
            bt2.setOnClickListener(lisenter);
            bt3.setOnClickListener(lisenter);
            bt4.setOnClickListener(lisenter);
            bt5.setOnClickListener(lisenter);
            bt6.setOnClickListener(lisenter);
            bt7.setOnClickListener(lisenter);
            bt8.setOnClickListener(lisenter);
            bt9.setOnClickListener(lisenter);
            bt_C.setOnClickListener(lisenter);
            bt_jia.setOnClickListener(lisenter);
            bt_jian.setOnClickListener(lisenter);
            bt_cheng.setOnClickListener(lisenter);
            bt_chu.setOnClickListener(lisenter);
            bt_equal.setOnClickListener(lisenter);
        }
    }
