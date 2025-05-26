package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class x<S> extends e0 {

    /* renamed from: b, reason: collision with root package name */
    public int f32590b;

    /* renamed from: c, reason: collision with root package name */
    public DateSelector f32591c;

    /* renamed from: d, reason: collision with root package name */
    public CalendarConstraints f32592d;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f32590b = bundle.getInt("THEME_RES_ID_KEY");
        this.f32591c = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f32592d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f32591c.K1(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f32590b)), viewGroup, this.f32592d, new u(this, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f32590b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f32591c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f32592d);
    }
}
