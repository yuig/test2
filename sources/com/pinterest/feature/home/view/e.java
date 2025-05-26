package com.pinterest.feature.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import ao2.j0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.button.view.GestaltButton;
import e0.t;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import ni1.c0;
import ni1.o2;
import nx.d0;
import rq.y;
import xk2.v;

/* loaded from: classes5.dex */
public final class e extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final j0 f45849d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f45850e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f45851f;

    /* renamed from: g, reason: collision with root package name */
    public List f45852g;

    /* renamed from: h, reason: collision with root package name */
    public int f45853h;

    /* renamed from: i, reason: collision with root package name */
    public int f45854i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f45855j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f45856k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f45857l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f45858m;

    /* renamed from: n, reason: collision with root package name */
    public double f45859n;

    /* renamed from: o, reason: collision with root package name */
    public String f45860o;

    public e(j0 scope, d0 pinalytics, h clickThroughFunction) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(clickThroughFunction, "clickThroughFunction");
        this.f45849d = scope;
        this.f45850e = pinalytics;
        this.f45851f = clickThroughFunction;
        this.f45852g = q0.f80391a;
        this.f45853h = -1;
        this.f45854i = 3;
        this.f45858m = true;
        this.f45859n = 2.5d;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return ((this.f45852g.size() >= this.f45854i || this.f45856k) && !this.f45857l) ? this.f45852g.size() + 1 : this.f45852g.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        return i13 == this.f45852g.size() ? p.VIEW_ALL_BUTTON.ordinal() : p.STORY_PIN.ordinal();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        n holder = (n) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i13 > this.f45853h && i13 < this.f45852g.size()) {
            this.f45853h = i13;
        }
        if (g(i13) == p.STORY_PIN.ordinal()) {
            View view = holder.f19717a;
            com.pinterest.feature.todaytab.tab.view.e eVar = view instanceof com.pinterest.feature.todaytab.tab.view.e ? (com.pinterest.feature.todaytab.tab.view.e) view : null;
            if (eVar != null) {
                f30 pin = (f30) this.f45852g.get(i13);
                Intrinsics.checkNotNullParameter(pin, "pin");
                eVar.f48718g = pin;
                v vVar = eVar.f48723l;
                c0 c0Var = (c0) vVar.getValue();
                SbaPinRep sbaPinRep = eVar.f48724m;
                o2 o2Var = eVar.f48725n;
                l3.c.X0(pin, i13, sbaPinRep, o2Var, c0Var);
                ni1.y2 a13 = ((c0) vVar.getValue()).a(i13, pin);
                sbaPinRep.bindDisplayState(o2Var.b(ni1.y2.b(a13, wa2.m.a(a13.f90905c, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, eVar.f48715d, null, false, false, null, null, null, false, null, null, false, false, null, null, false, -1048577, -2, 1023), null, null, false, false, null, null, false, false, false, false, 0, false, false, null, null, null, null, null, null, null, -5, 4194303), false));
                wy0 n13 = b40.n(pin);
                if (n13 != null) {
                    t.g(eVar.f48716e, new y(13, n13));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, android.view.ViewGroup, android.widget.RelativeLayout] */
    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        com.pinterest.feature.todaytab.tab.view.e view;
        GestaltButton smallSecondaryButton;
        Intrinsics.checkNotNullParameter(parent, "parent");
        p.Companion.getClass();
        int i14 = d.f45848a[p.values()[i13].ordinal()];
        if (i14 == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            com.pinterest.feature.todaytab.tab.view.e eVar = new com.pinterest.feature.todaytab.tab.view.e(bs1.c.k0(context), this.f45849d, this.f45850e, this.f45858m);
            Intrinsics.g(parent.getParent(), "null cannot be cast to non-null type android.view.View");
            eVar.setLayoutParams(new ViewGroup.LayoutParams((int) (((View) r8).getWidth() / this.f45859n), -2));
            eVar.f48717f = null;
            view = eVar;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ?? relativeLayout = new RelativeLayout(bs1.c.k0(context2));
            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
            if (this.f45855j) {
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                smallSecondaryButton = new GestaltButton.LargeSecondaryButton(6, bs1.c.k0(context3), (AttributeSet) null);
            } else {
                Context context4 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, bs1.c.k0(context4), (AttributeSet) null);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (this.f45855j) {
                layoutParams.setMarginStart(smallSecondaryButton.getResources().getDimensionPixelOffset(r0.margin));
                layoutParams.setMarginEnd(smallSecondaryButton.getResources().getDimensionPixelOffset(r0.margin_half));
            }
            layoutParams.addRule(this.f45855j ? 15 : 13, -1);
            smallSecondaryButton.setLayoutParams(layoutParams);
            smallSecondaryButton.d(new h(this, 1));
            smallSecondaryButton.e(new np0.h(this, 7));
            relativeLayout.addView(smallSecondaryButton);
            relativeLayout.setOnClickListener(new c(this, 0));
            view = relativeLayout;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        return new n(view);
    }
}
