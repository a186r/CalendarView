package com.dsw.calendarview;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

import com.dsw.datepicker.CalendarView;
import com.dsw.datepicker.DayAndPrice;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private Button btn_ll;
    private PopupWindow mPopupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

//        final CalendarView calendarView1 = new CalendarView(MainActivity.this, null);

//		calendarView.setListWorkOrRelax(listDate);

        btn_ll = (Button) findViewById(R.id.btn_ll);
        btn_ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog dialog;
                List<DayAndPrice> list = new ArrayList<DayAndPrice>();
                DayAndPrice dAndPrice = new DayAndPrice("可选", 2016, 6, 1);
                DayAndPrice dAndPrice1 = new DayAndPrice("可选", 2016, 6, 2);
                DayAndPrice dAndPrice2 = new DayAndPrice("可选", 2016, 6, 3);
                DayAndPrice dAndPrice3 = new DayAndPrice("可选", 2016, 6, 4);
                DayAndPrice dAndPrice4 = new DayAndPrice("可选", 2016, 6, 5);
                DayAndPrice dAndPrice5 = new DayAndPrice("可选", 2016, 6, 6);
                DayAndPrice dAndPrice6 = new DayAndPrice("可选", 2016, 6, 7);
                DayAndPrice dAndPrice7 = new DayAndPrice("可选", 2016, 7, 7);
                DayAndPrice dAndPrice8 = new DayAndPrice("可选", 2016, 8, 7);
                list.add(dAndPrice);
                list.add(dAndPrice1);
                list.add(dAndPrice2);
                list.add(dAndPrice3);
                list.add(dAndPrice4);
                list.add(dAndPrice5);
                list.add(dAndPrice6);
                list.add(dAndPrice7);
                list.add(dAndPrice8);

//                final CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView);
                final CalendarView calendarView = new CalendarView(MainActivity.this, null);
                calendarView.setListDayAndPrice(list);
//                calendarView.setDateViewClick(new DateViewClick() {
//
//                    @Override
//                    public void dateClick() {
//                        Log.d("date", "点击了：" + (calendarView.getSelectMonth() + 1) + "月" + calendarView.getSelectDay() + "日");
//                    }
//
//                });
                dialog = new AlertDialog.Builder(MainActivity.this).create();
                dialog.show();
                ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.getWindow().setContentView(calendarView, params);
                dialog.getWindow().setGravity(Gravity.CENTER);

                mPopupWindow.showAsDropDown(v);
            }
        });

    }


}
