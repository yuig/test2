package com.google.android.material.search;

import android.view.View;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f32989b;

    public /* synthetic */ c(SearchView searchView, int i13) {
        this.f32988a = i13;
        this.f32989b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f32988a;
        SearchView searchView = this.f32989b;
        switch (i13) {
            case 0:
                int i14 = SearchView.B;
                searchView.l();
                break;
            case 1:
                int i15 = SearchView.B;
                if (!searchView.f32984z.equals(g.HIDDEN) && !searchView.f32984z.equals(g.HIDING)) {
                    searchView.f32973o.j();
                    break;
                }
                break;
            default:
                searchView.f32968j.setText("");
                searchView.i();
                break;
        }
    }
}
