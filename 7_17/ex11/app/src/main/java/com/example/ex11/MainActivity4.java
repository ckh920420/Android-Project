package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity4 extends AppCompatActivity {

    ProgressBar pro1;
    ProgressBar pro2;

    //날짜구하기
    TextView date;
    int mYear, mMonth, mDay;

    //시간 구하기
    TextView time;
    int mHour;
    int mMinute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        pro1=findViewById(R.id.pro1);
        pro2=findViewById(R.id.pro2);

        //날짜 구하기, 시간구하기
        date=findViewById(R.id.date);
        time=findViewById(R.id.time);
        Calendar cal= new GregorianCalendar();
                mYear=cal.get(Calendar.YEAR);
                mMonth=cal.get(Calendar.MONTH);
                mDay=cal.get(Calendar.DAY_OF_MONTH);
                mHour=cal.get(Calendar.HOUR_OF_DAY);
                mMinute=cal.get(Calendar.MINUTE);
        updateNow();
    }





    public void mClick(View v){


        switch (v.getId()){

            case R.id.btn1 : // 증가
                pro1.incrementProgressBy(10);
                break;

            case R.id.btn2 : // 감소
                pro1.incrementProgressBy(-10);
                break;

            case R.id.btn3 : // 시작
                pro2.setVisibility(View.VISIBLE);
                break;

            case R.id.btn4 : // 멈춤
                pro2.setVisibility(View.INVISIBLE);
                break;

            case R.id.date : //현재 날짜
                new DatePickerDialog(MainActivity4.this, mDateSet, mYear, mMonth,mDay).show();

            case R.id.time :
                new TimePickerDialog(MainActivity4.this,null,mHour,mMinute,false).show();


        }


    }

    //날짜 출력 메서드
    private void updateNow(){
        date.setText(String.format("%d년 %d월 %d일 %d시 %d분", mYear,mMonth + 1 ,mDay, mHour, mMinute));
    }


    // 날짜 변경 리스너
    DatePickerDialog.OnDateSetListener mDateSet=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            mYear=i;
            mMonth=i1;
            mDay=i2;

            updateNow();

        }
    };

    // 시간 변경 리스너
    TimePickerDialog.OnTimeSetListener mTimeSet=new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int i, int i1) {
            mHour=i;
            mMinute=i1;
            updateNow();
        }
    };

}
