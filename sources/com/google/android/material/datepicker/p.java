package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class p extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f32553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f32554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f32555c;

    public p(s sVar, c0 c0Var, MaterialButton materialButton) {
        this.f32555c = sVar;
        this.f32553a = c0Var;
        this.f32554b = materialButton;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        if (i13 == 0) {
            recyclerView.announceForAccessibility(this.f32554b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        s sVar = this.f32555c;
        int k13 = i13 < 0 ? ((LinearLayoutManager) sVar.f32565j.f19242n).k1() : ((LinearLayoutManager) sVar.f32565j.f19242n).l1();
        c0 c0Var = this.f32553a;
        Calendar c13 = i0.c(c0Var.f32510d.f32471a.f32486a);
        c13.add(2, k13);
        sVar.f32561f = new Month(c13);
        Calendar c14 = i0.c(c0Var.f32510d.f32471a.f32486a);
        c14.add(2, k13);
        this.f32554b.setText(new Month(c14).e());
    }
}
