package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class i extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f32534a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32535b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32536c;

    public i() {
        Calendar g13 = i0.g(null);
        this.f32534a = g13;
        this.f32535b = g13.getMaximum(7);
        this.f32536c = g13.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f32535b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        int i14 = this.f32535b;
        if (i13 >= i14) {
            return null;
        }
        int i15 = i13 + this.f32536c;
        if (i15 > i14) {
            i15 -= i14;
        }
        return Integer.valueOf(i15);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(fj.i.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i14 = i13 + this.f32536c;
        int i15 = this.f32535b;
        if (i14 > i15) {
            i14 -= i15;
        }
        Calendar calendar = this.f32534a;
        calendar.set(7, i14);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(fj.k.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public i(int i13) {
        Calendar g13 = i0.g(null);
        this.f32534a = g13;
        this.f32535b = g13.getMaximum(7);
        this.f32536c = i13;
    }
}
