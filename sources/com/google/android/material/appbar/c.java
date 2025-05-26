package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public final class c extends q5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f32190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f32191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f32192f;

    public c(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f32192f = baseBehavior;
        this.f32190d = appBarLayout;
        this.f32191e = coordinatorLayout;
    }

    @Override // q5.b
    public final void d(View view, r5.e eVar) {
        AppBarLayout.BaseBehavior baseBehavior;
        View M;
        this.f102402a.onInitializeAccessibilityNodeInfo(view, eVar.f106231a);
        eVar.r(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f32190d;
        if (appBarLayout.h() == 0 || (M = AppBarLayout.BaseBehavior.M((baseBehavior = this.f32192f), this.f32191e)) == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            if (((AppBarLayout.LayoutParams) appBarLayout.getChildAt(i13).getLayoutParams()).f32134a != 0) {
                if (baseBehavior.D() != (-appBarLayout.h())) {
                    eVar.b(r5.d.f106217k);
                    eVar.C(true);
                }
                if (baseBehavior.D() != 0) {
                    if (!M.canScrollVertically(-1)) {
                        eVar.b(r5.d.f106218l);
                        eVar.C(true);
                        return;
                    } else {
                        if ((-appBarLayout.d()) != 0) {
                            eVar.b(r5.d.f106218l);
                            eVar.C(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // q5.b
    public final boolean g(View view, int i13, Bundle bundle) {
        AppBarLayout appBarLayout = this.f32190d;
        if (i13 == 4096) {
            appBarLayout.getClass();
            WeakHashMap weakHashMap = v0.f102521a;
            appBarLayout.n(false, appBarLayout.isLaidOut(), true);
            return true;
        }
        if (i13 != 8192) {
            return super.g(view, i13, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f32192f;
        if (baseBehavior.D() != 0) {
            View M = AppBarLayout.BaseBehavior.M(baseBehavior, this.f32191e);
            if (!M.canScrollVertically(-1)) {
                appBarLayout.getClass();
                WeakHashMap weakHashMap2 = v0.f102521a;
                appBarLayout.n(true, appBarLayout.isLaidOut(), true);
                return true;
            }
            int i14 = -appBarLayout.d();
            if (i14 != 0) {
                AppBarLayout appBarLayout2 = this.f32190d;
                this.f32192f.q(this.f32191e, appBarLayout2, M, 0, i14, new int[]{0, 0}, 1);
                return true;
            }
        }
        return false;
    }
}
