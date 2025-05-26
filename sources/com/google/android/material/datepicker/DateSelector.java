package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public interface DateSelector<S> extends Parcelable {
    static void z1(EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        h hVar = new h(editTextArr, 0);
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(hVar);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new q5.z(editText2, 2), 100L);
    }

    View K1(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, u uVar);

    boolean N1();

    ArrayList T1();

    Object X1();

    String d1(Context context);

    ArrayList h1();

    void h2(long j13);

    void j1(Object obj);

    int n0();

    String q0(Context context);

    int s0(Context context);
}
