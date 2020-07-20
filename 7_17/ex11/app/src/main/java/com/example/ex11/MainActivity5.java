package com.example.ex11;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void mClick(View v){
        switch (v.getId()){

            case R.id.btn1 : // 저장 및 취소 버튼 없이 알림만 오는 경우
                AlertDialog.Builder alert=new AlertDialog.Builder(this);

                alert.setTitle("서산시청"); //  알림 제목

                alert.setMessage("코로나19 서산시 10번 확진자 접촉자 2명(서울,경기) 검사 결과 음성입니다. 마스크 착용, 손씻기, 거리두기 등 방역수칙을 준수 바랍니다"); // 알림 내용

                alert.setPositiveButton("닫기", null); // 닫기 버튼

                alert.show();//알림 출력

                break;

            case R.id.btn2 : // 저장과 취소가 있음
                alert=new AlertDialog.Builder(this);

                alert.setTitle("중대본");

                alert.setMessage("코로나19는 밀폐, 밀집, 밀접 시설에서 전파 위험이 높습니다. 1) 다중이용시설 방문자제, 2) 환기, 표면소독, 3)마스크 착용, 4)2미터 거리두기 등 방역수칙 실천해 주세요.");

                alert.setPositiveButton("저장하기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity5.this,"저장",Toast.LENGTH_SHORT).show();
                    }
                });

                alert.setNegativeButton("취소하기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity5.this,"취소",Toast.LENGTH_SHORT).show();
                    }
                });

                alert.show();

                break;




        }


    }
}