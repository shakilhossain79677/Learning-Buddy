package com.example.learningbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class cPage6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_page6);
        Button buttonShow = findViewById(R.id.selector);
        Button next = findViewById(R.id.next);
        Button prev = findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cPage5();
            }
        });


        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                        cPage6.this ,R.style.BottomSheetDialogueTheme
                );
                View bottomSheetView = LayoutInflater.from(getApplicationContext())
                        .inflate(
                                R.layout.layout_bottom_sheet,
                                (LinearLayout) findViewById(R.id.bottomSheetContainer)
                        );
                bottomSheetView.findViewById(R.id.page1).setOnClickListener(new View.OnClickListener(){
                                                                                public void onClick(View v)
                                                                                {
                                                                                    Toast.makeText(cPage6.this, "Going to Page 1", Toast.LENGTH_SHORT).show();
                                                                                    bottomSheetDialog.dismiss();
                                                                                    cPage1();
                                                                                }
                                                                            }
                );
                bottomSheetView.findViewById(R.id.page2).setOnClickListener(new View.OnClickListener(){
                                                                                public void onClick(View v)
                                                                                {
                                                                                    Toast.makeText(cPage6.this, "Going to Page 2", Toast.LENGTH_SHORT).show();
                                                                                    bottomSheetDialog.dismiss();
                                                                                    cPage2();
                                                                                }
                                                                            }
                );
                bottomSheetView.findViewById(R.id.page3).setOnClickListener(new View.OnClickListener(){
                                                                                public void onClick(View v)
                                                                                {
                                                                                    Toast.makeText(cPage6.this, "Going to Page 3", Toast.LENGTH_SHORT).show();
                                                                                    bottomSheetDialog.dismiss();
                                                                                    cPage3();
                                                                                }
                                                                            }
                );
                bottomSheetView.findViewById(R.id.page4).setOnClickListener(new View.OnClickListener(){
                                                                                public void onClick(View v)
                                                                                {
                                                                                    Toast.makeText(cPage6.this, "Going to Page 4", Toast.LENGTH_SHORT).show();
                                                                                    bottomSheetDialog.dismiss();
                                                                                    cPage4();
                                                                                }
                                                                            }
                );
                bottomSheetView.findViewById(R.id.page5).setOnClickListener(new View.OnClickListener(){
                                                                                public void onClick(View v)
                                                                                {
                                                                                    Toast.makeText(cPage6.this, "Going to Page 5", Toast.LENGTH_SHORT).show();
                                                                                    bottomSheetDialog.dismiss();

                                                                                }
                                                                            }
                );
                bottomSheetView.findViewById(R.id.page6).setOnClickListener(new View.OnClickListener(){
                                                                                public void onClick(View v)
                                                                                {
                                                                                    Toast.makeText(cPage6.this, "Already in Page 6", Toast.LENGTH_SHORT).show();
                                                                                    bottomSheetDialog.dismiss();

                                                                                }
                                                                            }
                );
                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
            }

        });
    }
    void cPage4()
    {
        Intent intent = new Intent(this, cPage4.class);
        startActivity(intent);

        // animation
        Animatoo.animateInAndOut(this);
    }

    void cPage1()
    {
        Intent intent = new Intent(this, cPage1.class);
        startActivity(intent);

        // animation
        Animatoo.animateInAndOut(this);
    }
    void cPage2()
    {
        Intent intent = new Intent(this, cPage2.class);
        startActivity(intent);

        // animation
        Animatoo.animateInAndOut(this);
    }

    void cPage3()
    {
        Intent intent = new Intent(this, cPage3.class);
        startActivity(intent);

        // animation
        Animatoo.animateInAndOut(this);
    }


    void cPage5()
    {
        Intent intent = new Intent(this, cPage5.class);
        startActivity(intent);

        // animation
        Animatoo.animateSlideRight(this);
    }
    public void onBackPressed() {
        Intent intent = new Intent(this, coursePage.class);
        startActivity(intent);
        Animatoo.animateSplit(this);

    }
}
