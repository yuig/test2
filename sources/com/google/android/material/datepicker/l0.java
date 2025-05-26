package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class l0 extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final s f32548d;

    public l0(s sVar) {
        this.f32548d = sVar;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f32548d.f32559d.f32476f;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        s sVar = this.f32548d;
        int i14 = sVar.f32559d.f32471a.f32488c + i13;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i14));
        TextView textView = ((k0) y2Var).f32545u;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(i0.f().get(1) == i14 ? String.format(context.getString(fj.k.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i14)) : String.format(context.getString(fj.k.mtrl_picker_navigate_to_year_description), Integer.valueOf(i14)));
        android.support.v4.media.a aVar = sVar.f32563h;
        Calendar f13 = i0.f();
        a0.a aVar2 = (a0.a) (f13.get(1) == i14 ? aVar.f15842f : aVar.f15840d);
        Iterator it = sVar.f32558c.T1().iterator();
        while (it.hasNext()) {
            f13.setTimeInMillis(((Long) it.next()).longValue());
            if (f13.get(1) == i14) {
                aVar2 = (a0.a) aVar.f15841e;
            }
        }
        aVar2.c(textView);
        textView.setOnClickListener(new j0(this, i14));
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView recyclerView, int i13) {
        return new k0((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(fj.i.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
