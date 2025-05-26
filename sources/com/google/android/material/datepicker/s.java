package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n1;
import com.google.android.material.button.MaterialButton;
import q5.v0;

/* loaded from: classes3.dex */
public final class s<S> extends e0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f32556o = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f32557b;

    /* renamed from: c, reason: collision with root package name */
    public DateSelector f32558c;

    /* renamed from: d, reason: collision with root package name */
    public CalendarConstraints f32559d;

    /* renamed from: e, reason: collision with root package name */
    public DayViewDecorator f32560e;

    /* renamed from: f, reason: collision with root package name */
    public Month f32561f;

    /* renamed from: g, reason: collision with root package name */
    public q f32562g;

    /* renamed from: h, reason: collision with root package name */
    public android.support.v4.media.a f32563h;

    /* renamed from: i, reason: collision with root package name */
    public RecyclerView f32564i;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f32565j;

    /* renamed from: k, reason: collision with root package name */
    public View f32566k;

    /* renamed from: l, reason: collision with root package name */
    public View f32567l;

    /* renamed from: m, reason: collision with root package name */
    public View f32568m;

    /* renamed from: n, reason: collision with root package name */
    public View f32569n;

    @Override // com.google.android.material.datepicker.e0
    public final void M6(u uVar) {
        this.f32515a.add(uVar);
    }

    public final void N6(Month month) {
        c0 c0Var = (c0) this.f32565j.f19240m;
        int f13 = c0Var.f32510d.f32471a.f(month);
        int f14 = f13 - c0Var.f32510d.f32471a.f(this.f32561f);
        boolean z13 = Math.abs(f14) > 3;
        boolean z14 = f14 > 0;
        this.f32561f = month;
        if (z13 && z14) {
            this.f32565j.G2(f13 - 3);
            this.f32565j.post(new k(this, f13));
        } else if (!z13) {
            this.f32565j.post(new k(this, f13));
        } else {
            this.f32565j.G2(f13 + 3);
            this.f32565j.post(new k(this, f13));
        }
    }

    public final void O6(q qVar) {
        this.f32562g = qVar;
        if (qVar != q.YEAR) {
            if (qVar == q.DAY) {
                this.f32568m.setVisibility(8);
                this.f32569n.setVisibility(0);
                this.f32566k.setVisibility(0);
                this.f32567l.setVisibility(0);
                N6(this.f32561f);
                return;
            }
            return;
        }
        RecyclerView recyclerView = this.f32564i;
        recyclerView.f19242n.M0(this.f32561f.f32488c - ((l0) recyclerView.f19240m).f32548d.f32559d.f32471a.f32488c);
        this.f32568m.setVisibility(0);
        this.f32569n.setVisibility(8);
        this.f32566k.setVisibility(8);
        this.f32567l.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f32557b = bundle.getInt("THEME_RES_ID_KEY");
        this.f32558c = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f32559d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f32560e = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f32561f = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i13;
        int i14;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f32557b);
        this.f32563h = new android.support.v4.media.a(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f32559d.f32471a;
        int i15 = 0;
        int i16 = 1;
        if (w.W6(contextThemeWrapper, R.attr.windowFullscreen)) {
            i13 = fj.i.mtrl_calendar_vertical;
            i14 = 1;
        } else {
            i13 = fj.i.mtrl_calendar_horizontal;
            i14 = 0;
        }
        View inflate = cloneInContext.inflate(i13, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(fj.e.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(fj.e.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(fj.e.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(fj.e.mtrl_calendar_days_of_week_height);
        int i17 = z.f32594g;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(fj.e.mtrl_calendar_month_vertical_padding) * (i17 - 1)) + (resources.getDimensionPixelSize(fj.e.mtrl_calendar_day_height) * i17) + resources.getDimensionPixelOffset(fj.e.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(fj.g.mtrl_calendar_days_of_week);
        v0.o(gridView, new l(this, i15));
        int i18 = this.f32559d.f32475e;
        gridView.setAdapter((ListAdapter) (i18 > 0 ? new i(i18) : new i()));
        gridView.setNumColumns(month.f32489d);
        gridView.setEnabled(false);
        this.f32565j = (RecyclerView) inflate.findViewById(fj.g.mtrl_calendar_months);
        getContext();
        this.f32565j.R2(new m(this, i14, i14));
        this.f32565j.setTag("MONTHS_VIEW_GROUP_TAG");
        c0 c0Var = new c0(contextThemeWrapper, this.f32558c, this.f32559d, this.f32560e, new n(this));
        this.f32565j.H2(c0Var);
        int integer = contextThemeWrapper.getResources().getInteger(fj.h.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(fj.g.mtrl_calendar_year_selector_frame);
        this.f32564i = recyclerView;
        if (recyclerView != null) {
            recyclerView.f19254t = true;
            recyclerView.R2(new GridLayoutManager(integer, 1, false));
            this.f32564i.H2(new l0(this));
            this.f32564i.m(new o(this));
        }
        if (inflate.findViewById(fj.g.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(fj.g.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            v0.o(materialButton, new l(this, 2));
            View findViewById = inflate.findViewById(fj.g.month_navigation_previous);
            this.f32566k = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(fj.g.month_navigation_next);
            this.f32567l = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f32568m = inflate.findViewById(fj.g.mtrl_calendar_year_selector_frame);
            this.f32569n = inflate.findViewById(fj.g.mtrl_calendar_day_selector_frame);
            O6(q.DAY);
            materialButton.setText(this.f32561f.e());
            this.f32565j.o(new p(this, c0Var, materialButton));
            materialButton.setOnClickListener(new androidx.appcompat.app.c(this, 5));
            this.f32567l.setOnClickListener(new j(this, c0Var, i16));
            this.f32566k.setOnClickListener(new j(this, c0Var, i15));
        }
        if (!w.W6(contextThemeWrapper, R.attr.windowFullscreen)) {
            new n1().b(this.f32565j);
        }
        this.f32565j.G2(c0Var.f32510d.f32471a.f(this.f32561f));
        v0.o(this.f32565j, new l(this, i16));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f32557b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f32558c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f32559d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f32560e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f32561f);
    }
}
