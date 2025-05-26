package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import v.d3;

/* loaded from: classes3.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f33001b;

    public /* synthetic */ j(k kVar, int i13) {
        this.f33000a = i13;
        this.f33001b = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f33000a;
        k kVar = this.f33001b;
        switch (i13) {
            case 0:
                boolean g13 = kVar.f33002a.g();
                SearchView searchView = kVar.f33002a;
                if (!g13) {
                    searchView.i();
                }
                searchView.j(g.SHOWN, true);
                break;
            case 1:
                kVar.f33004c.setVisibility(8);
                SearchView searchView2 = kVar.f33002a;
                if (!searchView2.g()) {
                    searchView2.f();
                }
                searchView2.j(g.HIDDEN, true);
                break;
            case 2:
                boolean g14 = kVar.f33002a.g();
                SearchView searchView3 = kVar.f33002a;
                if (!g14) {
                    searchView3.i();
                }
                searchView3.j(g.SHOWN, true);
                break;
            default:
                kVar.f33004c.setVisibility(8);
                SearchView searchView4 = kVar.f33002a;
                if (!searchView4.g()) {
                    searchView4.f();
                }
                searchView4.j(g.HIDDEN, true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i13 = this.f33000a;
        k kVar = this.f33001b;
        switch (i13) {
            case 0:
                kVar.f33004c.setVisibility(0);
                SearchBar searchBar = kVar.f33016o;
                d3 d3Var = searchBar.f32945a0;
                Animator animator2 = (Animator) d3Var.f123430f;
                if (animator2 != null) {
                    animator2.end();
                }
                Animator animator3 = (Animator) d3Var.f123431g;
                if (animator3 != null) {
                    animator3.end();
                }
                View view = searchBar.f32949e0;
                if (view != null) {
                    view.setAlpha(0.0f);
                    break;
                }
                break;
            case 1:
                kVar.f33002a.j(g.HIDING, true);
                break;
            case 2:
                kVar.f33004c.setVisibility(0);
                kVar.f33002a.j(g.SHOWING, true);
                break;
            default:
                kVar.f33002a.j(g.HIDING, true);
                break;
        }
    }
}
