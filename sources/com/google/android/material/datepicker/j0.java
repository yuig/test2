package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes3.dex */
public final class j0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f32542b;

    public j0(l0 l0Var, int i13) {
        this.f32542b = l0Var;
        this.f32541a = i13;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kg.n.a(view);
        l0 l0Var = this.f32542b;
        Month b13 = Month.b(this.f32541a, l0Var.f32548d.f32561f.f32487b);
        s sVar = l0Var.f32548d;
        CalendarConstraints calendarConstraints = sVar.f32559d;
        Month month = calendarConstraints.f32471a;
        if (b13.compareTo(month) < 0) {
            b13 = month;
        } else {
            Month month2 = calendarConstraints.f32472b;
            if (b13.compareTo(month2) > 0) {
                b13 = month2;
            }
        }
        sVar.N6(b13);
        sVar.O6(q.DAY);
    }
}
