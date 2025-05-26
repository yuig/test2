package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.y2;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public final class b0 extends y2 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f32508u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f32509v;

    public b0(LinearLayout linearLayout, boolean z13) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(fj.g.month_title);
        this.f32508u = textView;
        WeakHashMap weakHashMap = v0.f102521a;
        new q5.h0(b5.c.tag_accessibility_heading, 3).g(textView, Boolean.TRUE);
        this.f32509v = (MaterialCalendarGridView) linearLayout.findViewById(fj.g.month_grid);
        if (z13) {
            return;
        }
        textView.setVisibility(8);
    }
}
