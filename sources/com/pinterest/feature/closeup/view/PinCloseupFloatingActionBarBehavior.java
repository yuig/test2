package com.pinterest.feature.closeup.view;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.ui.h;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import bs1.c;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku1.j;
import m60.w;
import np0.k;
import np0.l;
import pk.a0;
import q5.a2;
import rq.y2;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/closeup/view/PinCloseupFloatingActionBarBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/view/View;", "", "closeupLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinCloseupFloatingActionBarBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a, reason: collision with root package name */
    public final View f45460a;

    /* renamed from: b, reason: collision with root package name */
    public final View f45461b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f45462c;

    /* renamed from: d, reason: collision with root package name */
    public final View f45463d;

    /* renamed from: e, reason: collision with root package name */
    public final j f45464e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f45465f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f45466g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f45467h;

    /* renamed from: i, reason: collision with root package name */
    public int f45468i;

    /* renamed from: j, reason: collision with root package name */
    public final v f45469j;

    /* renamed from: k, reason: collision with root package name */
    public int f45470k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f45471l;

    /* renamed from: m, reason: collision with root package name */
    public View f45472m;

    /* renamed from: n, reason: collision with root package name */
    public View f45473n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f45474o;

    public PinCloseupFloatingActionBarBehavior(ViewGroup viewGroup, LinearLayout bottomNavBar, RecyclerView recyclerView, y2 y2Var, j navigationManager) {
        int i13;
        Intrinsics.checkNotNullParameter(bottomNavBar, "bottomNavBar");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        this.f45460a = viewGroup;
        this.f45461b = bottomNavBar;
        this.f45462c = recyclerView;
        this.f45463d = y2Var;
        this.f45464e = navigationManager;
        this.f45465f = new int[2];
        this.f45466g = new int[2];
        this.f45467h = new int[2];
        this.f45469j = m.b(l.f91757j);
        Resources resources = bottomNavBar.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.f45470k = a0.L(resources, 108.0f);
        if (viewGroup != null) {
            if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
                viewGroup.addOnLayoutChangeListener(new k(this, 1));
            } else {
                this.f45470k = viewGroup.getHeight();
            }
            viewGroup.addOnLayoutChangeListener(new h(this, 2));
        }
        if (y2Var != null) {
            a2 l03 = k3.l0(y2Var.getContext());
            if (l03 != null) {
                l03.f102400a.f(7);
            }
            if (!y2Var.isLaidOut() || y2Var.isLayoutRequested()) {
                y2Var.addOnLayoutChangeListener(new k(this, 0));
            } else {
                this.f45468i = y2Var.getHeight();
            }
        }
        D(false);
        l2 l2Var = recyclerView != null ? recyclerView.f19242n : null;
        if (l2Var != null) {
            vb0.j.f125466a.T(l2Var instanceof PinterestStaggeredGridLayoutManager, "Closeup is not using PinterestStaggeredGriLayoutManager, please update the PinCloseupFloatingActionBarBehavior accordingly", new Object[0]);
            i13 = ((PinterestStaggeredGridLayoutManager) l2Var).getF19177u();
        } else {
            i13 = 4;
        }
        this.f45471l = new int[i13];
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.closeup.view.PinCloseupFloatingActionBarBehavior.C(android.view.View):void");
    }

    public final void D(boolean z13) {
        if (z13 != c.o1(this.f45461b) && this.f45474o) {
            Object value = this.f45469j.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((w) value).d(new r70.h(z13, true));
        }
    }

    public final void E(boolean z13) {
        View view;
        this.f45474o = z13;
        if (!z13 || (view = this.f45472m) == null) {
            return;
        }
        if (view != null) {
            C(view);
        } else {
            Intrinsics.r("floatingActionBarModule");
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout parent, View child, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        this.f45472m = child;
        if (this.f45463d != null && this.f45473n == null) {
            ViewGroup viewGroup = child instanceof ViewGroup ? (ViewGroup) child : null;
            vb0.j.f125466a.T(viewGroup != null && viewGroup.getChildCount() == 2, "We don't have the 2 required action bars to check for the SAB, please update the PinCloseupFloatingActionBarBehavior accordingly", new Object[0]);
            this.f45473n = viewGroup != null ? viewGroup.getChildAt(0) : null;
        }
        C(child);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void s(CoordinatorLayout coordinatorLayout, View child, View target, int i13, int i14, int i15, int i16, int i17) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        C(child);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean y(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int i13, int i14) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
        Intrinsics.checkNotNullParameter(target, "target");
        return true;
    }
}
