package com.google.android.material.search;

import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.h0;
import l8.p;
import lb.l0;
import q5.a2;
import q5.v;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements h0, v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f32987a;

    public /* synthetic */ b(SearchView searchView) {
        this.f32987a = searchView;
    }

    @Override // com.google.android.material.internal.h0
    public final a2 d(View view, a2 a2Var, p pVar) {
        MaterialToolbar materialToolbar = this.f32987a.f32965g;
        boolean H0 = l0.H0(materialToolbar);
        materialToolbar.setPadding(a2Var.c() + (H0 ? pVar.f82077c : pVar.f82075a), pVar.f82076b, a2Var.d() + (H0 ? pVar.f82075a : pVar.f82077c), pVar.f82078d);
        return a2Var;
    }

    @Override // q5.v
    public final a2 k(View view, a2 a2Var) {
        int i13 = SearchView.B;
        SearchView searchView = this.f32987a;
        searchView.getClass();
        int e13 = a2Var.e();
        View view2 = searchView.f32962d;
        if (view2.getLayoutParams().height != e13) {
            view2.getLayoutParams().height = e13;
            view2.requestLayout();
        }
        view2.setVisibility(e13 > 0 ? 0 : 8);
        return a2Var;
    }
}
