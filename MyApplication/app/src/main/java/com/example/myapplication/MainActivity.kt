package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="march_parent"
    xmlns:android="http://schemas.android.com/apk/res/android"

    android:orientation="vertical"

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#ff0000"
        android:text="버튼입니다"

    <Linearlayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        xmlns:android=""
        android:orientation="vertical">
        android:padding=<"30dp">

    <TextView
        android:layout_margin="20dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_parent"
        android:text="Hello World!" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/btn1"
        android:text="버튼입니다"
        android:background="#00f00"

    <Button
        android:layout_height="wrap_content"
        android:layout_width="match_parent"
        android:text="버튼1"
        android:background="#00ff00"
        />
    <TextView
        android:layout_padding="30dp"
        android:layout_height="wrap_content"
        android:layout_width="match_parent"
        android:text="이것은 텍스트 뷰입니다."
    <Button
        android:layout_height="wrap_content"
        android:layout_width="match_parent"
        android:text="버튼2"
        />
    <Button
        android:layout_height="wrap_content"
        android:layout_width="match_parent"
        android:text="버튼3"
        />
    <Button
        android:layout_height="wrap_content"
        android:layout_width="match_parent"
        android:text="버튼4"
        android:rotation="45"
        />
    <EditText
        android:layout_margin="20dp"
        android:layout_height="wrap_content"
        android:layout_width="match_parent"
        android:text="이것은 에디트 텍스트입니다"
        android:background=

    <TextView
        android:text="TextView 연습 1"
        android:layout_width="match_parent"
        android:layout_height="wrap_parent"
        android:id="@+id/textView1" />
    <TextView
        android:text="TextView 연습 2"
        android:layout_width="match_parent"
        android:layout_height="wrap_parent"
        android:id="@+id/textView2" />
    <TextView
        android:text="TextView 연습 3"
        android:layout_width="match_parent"
        android:layout_height="wrap_parent"
        android:id="@+id/textView3" />

    //텍스트 속성을 변경하는 Java코드

    TextView tv1, tv2, tv3;
    tv1 = (TextView) findViewById(R.id.textView1);
    tv2 = (TextView) findViewById(R.id.textView2);
    tv3 = (TextView) findViewById(R.id.textView3);

    tv1.setText("안녕하세요")
    tv1/setTextColor(Color.RED);
    tv2.setTextSize(30);
    tv2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);
    tv3.setText("가나다라마바사아자차카타하가나다라마바사아자차카타하");
    tv3.setSingleLine();

    btnAdd.setOnClickListener(new View.OnTouchListener(){
        public boolean onTouch(View arg0, MotionEvent arg1){
            num1 = edit1.getText().toString();
            num2 = edit2.getText().toString();
            result = Integer.parseInt(num1) + Integer.parseInt(num2);
            textResults.setText("계산결과 : " + result.toString());
            return false;
        }
    });

}
