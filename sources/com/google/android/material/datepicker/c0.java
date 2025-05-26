package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class c0 extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f32510d;

    /* renamed from: e, reason: collision with root package name */
    public final DateSelector f32511e;

    /* renamed from: f, reason: collision with root package name */
    public final DayViewDecorator f32512f;

    /* renamed from: g, reason: collision with root package name */
    public final r f32513g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32514h;

    public c0(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, n nVar) {
        Month month = calendarConstraints.f32471a;
        Month month2 = calendarConstraints.f32474d;
        if (month.compareTo(month2) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month2.compareTo(calendarConstraints.f32472b) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i13 = z.f32594g;
        int i14 = s.f32556o;
        this.f32514h = (contextThemeWrapper.getResources().getDimensionPixelSize(fj.e.mtrl_calendar_day_height) * i13) + (w.W6(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(fj.e.mtrl_calendar_day_height) : 0);
        this.f32510d = calendarConstraints;
        this.f32511e = dateSelector;
        this.f32512f = dayViewDecorator;
        this.f32513g = nVar;
        A(true);
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f32510d.f32477g;
    }

    @Override // androidx.recyclerview.widget.b2
    public final long f(int i13) {
        Calendar c13 = i0.c(this.f32510d.f32471a.f32486a);
        c13.add(2, i13);
        return new Month(c13).f32486a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        b0 b0Var = (b0) y2Var;
        CalendarConstraints calendarConstraints = this.f32510d;
        Calendar c13 = i0.c(calendarConstraints.f32471a.f32486a);
        c13.add(2, i13);
        Month month = new Month(c13);
        b0Var.f32508u.setText(month.e());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) b0Var.f32509v.findViewById(fj.g.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().f32596a)) {
            z zVar = new z(month, this.f32511e, calendarConstraints, this.f32512f);
            materialCalendarGridView.setNumColumns(month.f32489d);
            materialCalendarGridView.setAdapter((ListAdapter) zVar);
        } else {
            materialCalendarGridView.invalidate();
            z a13 = materialCalendarGridView.a();
            Iterator it = a13.f32598c.iterator();
            while (it.hasNext()) {
                a13.e(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            DateSelector dateSelector = a13.f32597b;
            if (dateSelector != null) {
                Iterator it2 = dateSelector.T1().iterator();
                while (it2.hasNext()) {
                    a13.e(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                a13.f32598c = dateSelector.T1();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new a0(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView recyclerView, int i13) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(fj.i.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (!w.W6(recyclerView.getContext(), R.attr.windowFullscreen)) {
            return new b0(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f32514h));
        return new b0(linearLayout, true);
    }
}
