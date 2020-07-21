package com.example.ex03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText kor=findViewById(R.id.kor);
                EditText eng=findViewById(R.id.eng);
                EditText mat=findViewById(R.id.mat);

                // 값을 가져오는 get
                String strKor=kor.getText().toString();
                String strEng=eng.getText().toString();
                String strMat=mat.getText().toString();

                //문자형을 정수형으로 변환하는 함수
                int intKor=Integer.parseInt(strKor);
                int intEng=Integer.parseInt(strEng);
                int intMat=Integer.parseInt(strMat);

                //정수끼리 계산(단항계산)
                int intTot=intKor + intEng + intMat;
                double dubAvg=intTot/3.;//double : 실수(소수점을 포함하는) , int : 정수값

                //TextView 타입으로 tot, agv 값 찾아오기(findViewById 함수)
                TextView tot=findViewById(R.id.tot);
                TextView avg=findViewById((R.id.avg));

                //값을 내보내는 set
                tot.setText("총점 : " + intTot);
                avg.setText("평균 : " + dubAvg);


                /*
                타입 + 변수
                ex) int 1;

                 */

            }
        });


    }
}