package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f32539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f32540c;

    public /* synthetic */ j(s sVar, c0 c0Var, int i13) {
        this.f32538a = i13;
        this.f32540c = sVar;
        this.f32539b = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f32538a;
        c0 c0Var = this.f32539b;
        s sVar = this.f32540c;
        switch (i13) {
            case 0:
                kg.n.a(view);
                int l13 = ((LinearLayoutManager) sVar.f32565j.f19242n).l1() - 1;
                if (l13 >= 0) {
                    Calendar c13 = i0.c(c0Var.f32510d.f32471a.f32486a);
                    c13.add(2, l13);
                    sVar.N6(new Month(c13));
                    break;
                }
                break;
            default:
                kg.n.a(view);
                int k13 = ((LinearLayoutManager) sVar.f32565j.f19242n).k1() + 1;
                if (k13 < sVar.f32565j.f19240m.e()) {
                    Calendar c14 = i0.c(c0Var.f32510d.f32471a.f32486a);
                    c14.add(2, k13);
                    sVar.N6(new Month(c14));
                    break;
                }
                break;
        }
    }
}
