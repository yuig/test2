package ek;

import android.view.View;

/* loaded from: classes.dex */
public final class g implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f59136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f59137b;

    public g(h hVar, View view) {
        this.f59137b = hVar;
        this.f59136a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        if (this.f59136a.getVisibility() == 0) {
            this.f59137b.getClass();
        }
    }
}
