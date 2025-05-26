package com.pinterest.boardAutoCollages;

import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.settings.claimedaccount.handshake.listaccounts.ClaimedAccountItemView;
import com.pinterest.gestalt.button.view.GestaltButton;
import et1.r0;
import kotlin.jvm.internal.Intrinsics;
import ny0.c1;
import o82.i3;

/* loaded from: classes5.dex */
public final /* synthetic */ class l implements o82.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3 f44578b;

    public /* synthetic */ l(i3 i3Var, int i13) {
        this.f44577a = i13;
        this.f44578b = i3Var;
    }

    @Override // o82.c
    public final void e(View view, u50.o oVar) {
        int i13 = this.f44577a;
        int i14 = 11;
        int i15 = 1;
        int i16 = 25;
        int i17 = 0;
        i3 i3Var = this.f44578b;
        switch (i13) {
            case 0:
                q this$0 = (q) i3Var;
                xa0.p view2 = (xa0.p) view;
                xa0.a state = (xa0.a) oVar;
                int i18 = q.T0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(state, "state");
                androidx.lifecycle.z viewLifecycleOwner = this$0.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                view2.L(bf.b.S(viewLifecycleOwner), state, new i1.j(this$0, 12), new mz.c(this$0, i14));
                break;
            case 1:
                w90.p this$02 = (w90.p) i3Var;
                xa0.p view3 = (xa0.p) view;
                xa0.a state2 = (xa0.a) oVar;
                int i19 = w90.p.V0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(state2, "state");
                androidx.lifecycle.z viewLifecycleOwner2 = this$02.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                view3.L(bf.b.S(viewLifecycleOwner2), state2, new w90.m(this$02, i15), xa0.n.f134417i);
                break;
            case 2:
                la0.f0 this$03 = (la0.f0) i3Var;
                xa0.p view4 = (xa0.p) view;
                xa0.a state3 = (xa0.a) oVar;
                int i23 = la0.f0.V0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(view4, "view");
                Intrinsics.checkNotNullParameter(state3, "state");
                androidx.lifecycle.z viewLifecycleOwner3 = this$03.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                view4.L(bf.b.S(viewLifecycleOwner3), state3, new i1.j(this$03, i16), new la0.e0(this$03, i17));
                break;
            case 3:
                ny0.v this$04 = (ny0.v) i3Var;
                FrameLayout buttonWrapper = (FrameLayout) view;
                c1 state4 = (c1) oVar;
                int i24 = ny0.v.T0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(buttonWrapper, "buttonWrapper");
                Intrinsics.checkNotNullParameter(state4, "state");
                View childAt = buttonWrapper.getChildAt(0);
                GestaltButton gestaltButton = childAt instanceof GestaltButton ? (GestaltButton) childAt : null;
                if (gestaltButton != null) {
                    gestaltButton.e(new lq0.o(11, this$04, state4));
                    break;
                }
                break;
            case 4:
                x91.s this$05 = (x91.s) i3Var;
                defpackage.c view5 = (defpackage.c) view;
                x91.v displayState = (x91.v) oVar;
                int i25 = x91.s.L0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                wy0 wy0Var = displayState.f134357a;
                if (wy0Var != null) {
                    view5.T(wy0Var);
                    view5.L(new x91.r(this$05, wy0Var, i17), new x91.r(this$05, wy0Var, i15));
                    break;
                }
                break;
            case 5:
                ba1.y this$06 = (ba1.y) i3Var;
                ClaimedAccountItemView view6 = (ClaimedAccountItemView) view;
                ba1.a displayState2 = (ba1.a) oVar;
                int i26 = ba1.y.M0;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(view6, "view");
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                view6.setOnClickListener(new qv0.d0(25, this$06, displayState2));
                view6.L(displayState2);
                break;
            case 6:
                ma1.n this$07 = (ma1.n) i3Var;
                ma1.c view7 = (ma1.c) view;
                ma1.p displayState3 = (ma1.p) oVar;
                int i27 = ma1.n.K0;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(view7, "view");
                Intrinsics.checkNotNullParameter(displayState3, "displayState");
                view7.a(displayState3);
                view7.b(new p91.v(3, this$07, displayState3));
                break;
            case 7:
                kc1.d0 this$08 = (kc1.d0) i3Var;
                lc1.p view8 = (lc1.p) view;
                kc1.a displayState4 = (kc1.a) oVar;
                int i28 = kc1.d0.L0;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(view8, "view");
                Intrinsics.checkNotNullParameter(displayState4, "displayState");
                view8.a(displayState4);
                view8.setOnClickListener(new qv0.d0(28, displayState4, this$08));
                break;
            default:
                ad2.h this$09 = (ad2.h) i3Var;
                ad2.l view9 = (ad2.l) view;
                ad2.k displayState5 = (ad2.k) oVar;
                int i29 = ad2.h.H0;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(view9, "view");
                Intrinsics.checkNotNullParameter(displayState5, "displayState");
                view9.L(displayState5, new r0(21, this$09, displayState5));
                break;
        }
    }
}
