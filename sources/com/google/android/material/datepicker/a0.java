package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class a0 implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f32499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f32500b;

    public a0(c0 c0Var, MaterialCalendarGridView materialCalendarGridView) {
        this.f32500b = c0Var;
        this.f32499a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        MaterialCalendarGridView materialCalendarGridView = this.f32499a;
        z a13 = materialCalendarGridView.a();
        if (i13 < a13.a() || i13 > a13.c()) {
            return;
        }
        r rVar = this.f32500b.f32513g;
        long longValue = materialCalendarGridView.a().getItem(i13).longValue();
        s sVar = ((n) rVar).f32549a;
        if (sVar.f32559d.f32473c.u0(longValue)) {
            sVar.f32558c.h2(longValue);
            Iterator it = sVar.f32515a.iterator();
            while (it.hasNext()) {
                ((d0) it.next()).b(sVar.f32558c.X1());
            }
            sVar.f32565j.f19240m.h();
            RecyclerView recyclerView = sVar.f32564i;
            if (recyclerView != null) {
                recyclerView.f19240m.h();
            }
        }
    }
}
