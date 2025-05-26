package ru1;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.gestalt.indicator.GestaltIndicator;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes2.dex */
public final class o extends i {
    public boolean A;
    public final xk2.v B;
    public final xk2.v C;
    public final xk2.v D;
    public long E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, r70.i bottomNavTabModel, c tabDisplayState) {
        super(context, bottomNavTabModel);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bottomNavTabModel, "bottomNavTabModel");
        Intrinsics.checkNotNullParameter(tabDisplayState, "tabDisplayState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bottomNavTabModel, "bottomNavTabModel");
        this.B = xk2.m.b(new n(this, 1));
        this.C = xk2.m.b(new n(this, 2));
        this.D = xk2.m.b(new n(this, 0));
        setClipChildren(false);
        setClipToPadding(false);
        o(this.f110055k.getVisibility() == 0);
        a0.k0(this.f110055k);
        if (k()) {
            q(tabDisplayState, bottomNavTabModel.f106380a);
            this.f110057m.setClipChildren(false);
            this.f110057m.setClipToPadding(false);
        }
        o(false);
    }

    public static final View n(o oVar) {
        return !oVar.k() ? oVar : oVar.f110048d.f106380a == u70.a.PROFILE ? oVar.f110060p : oVar.f110056l;
    }

    public final void o(boolean z13) {
        if (!k()) {
            p(z13);
            return;
        }
        GestaltIndicator gestaltIndicator = this.f110053i;
        ViewGroup.LayoutParams layoutParams = gestaltIndicator.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i13 = ks1.a.floating_nav_bar_bottom_indicator_top;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(i13);
        int i14 = ks1.a.floating_nav_bar_bottom_indicator_end;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Intrinsics.checkNotNullParameter(context2, "context");
        marginLayoutParams.setMarginEnd(context2.getResources().getDimensionPixelSize(i14));
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.bottomMargin = 0;
        gestaltIndicator.setLayoutParams(marginLayoutParams);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        xk2.v vVar = this.C;
        xk2.v vVar2 = this.B;
        xk2.v vVar3 = this.D;
        if (action == 0) {
            this.E = System.currentTimeMillis() * 1000000;
            ((g6.h) vVar2.getValue()).a();
            ((g6.h) vVar.getValue()).a();
            this.A = isSelected();
            d(true);
            if (((AnimatorSet) vVar3.getValue()).isRunning()) {
                ((AnimatorSet) vVar3.getValue()).cancel();
            }
            ((AnimatorSet) vVar3.getValue()).start();
        } else if (action == 1) {
            event.getX();
            event.getY();
            if (((AnimatorSet) vVar3.getValue()).isRunning()) {
                ((AnimatorSet) vVar3.getValue()).cancel();
            }
            if ((System.currentTimeMillis() * 1000000) - this.E > 150000000) {
                d(this.A);
            }
            ((g6.h) vVar2.getValue()).e();
            ((g6.h) vVar.getValue()).e();
        } else if (action == 3 && (System.currentTimeMillis() * 1000000) - this.E > 150000000) {
            d(this.A);
        }
        return super.onTouchEvent(event);
    }

    public final void p(boolean z13) {
        GestaltIndicator gestaltIndicator = this.f110054j;
        if (z13) {
            int p13 = kh2.d.p(2);
            ViewGroup.LayoutParams layoutParams = gestaltIndicator.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin += p13;
            marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() - p13);
            gestaltIndicator.setLayoutParams(marginLayoutParams);
            return;
        }
        int p14 = kh2.d.p(4);
        ViewGroup.LayoutParams layoutParams2 = gestaltIndicator.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin -= p14;
        marginLayoutParams2.setMarginStart(marginLayoutParams2.getMarginStart() - p14);
        gestaltIndicator.setLayoutParams(marginLayoutParams2);
    }

    public final void q(c cVar, u70.a aVar) {
        LinearLayout linearLayout = this.f110057m;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        u50.n nVar = cVar.f110022f;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int intValue = nVar.a(context).intValue();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, intValue, 0, cVar.f110023g.a(context2).intValue());
        linearLayout.setLayoutParams(layoutParams);
        FrameLayout frameLayout = this.f110056l;
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        u50.n nVar2 = cVar.f110020d;
        int intValue2 = nVar2.a(context3).intValue();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        u50.n nVar3 = cVar.f110021e;
        int intValue3 = nVar3.a(context4).intValue();
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        u50.n nVar4 = cVar.f110024h;
        ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(intValue2, 0, intValue3, nVar4.a(context5).intValue());
        frameLayout.setLayoutParams(layoutParams2);
        u70.a aVar2 = u70.a.PROFILE;
        GestaltText gestaltText = this.f110055k;
        View view = this.f110060p;
        if (aVar == aVar2 && view.getVisibility() == 0) {
            int i13 = gestaltText.getVisibility() == 0 ? eo1.c.sema_space_negative_50 : eo1.c.sema_space_0;
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            int intValue4 = nVar2.a(context6).intValue();
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            Intrinsics.checkNotNullParameter(context7, "context");
            int dimensionPixelSize = context7.getResources().getDimensionPixelSize(i13);
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
            int intValue5 = nVar3.a(context8).intValue();
            Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams3).setMargins(intValue4, dimensionPixelSize, intValue5, nVar4.a(context9).intValue());
            view.setLayoutParams(layoutParams3);
        }
        dl2.b.z(this.f110058n, new m(cVar, 1));
        Context context10 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        int F0 = dl2.b.F0(context10, rm1.i.LG.getDimenAttrRes());
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams4.width = F0;
        layoutParams4.height = F0;
        view.setLayoutParams(layoutParams4);
        if (aVar == aVar2 && gestaltText.getVisibility() == 0) {
            bs1.c.U1(h());
        }
    }

    public final void r() {
        a0.w1(this.f110055k);
        b20.c cVar = this.f110051g;
        if (cVar == null) {
            Intrinsics.r("bottomNavBarDisplayStateProvider");
            throw null;
        }
        a v13 = cVar.v(j1.E1(), true, k());
        Intrinsics.checkNotNullParameter(v13, "<set-?>");
        this.f110052h = v13;
        if (k()) {
            q(this.f110052h.f110010e, this.f110048d.f106380a);
            LinearLayout linearLayout = this.f110057m;
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
        }
        o(true);
    }
}
