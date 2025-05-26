package qi0;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import nx.d0;
import nx.v;
import qa2.f0;
import qa2.h0;
import ti1.o;
import ti1.r;
import uq.w;
import wa2.m;
import yk1.n;

/* loaded from: classes5.dex */
public final class h extends w implements n, v, r, f0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f103992d;

    /* renamed from: e, reason: collision with root package name */
    public final m f103993e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f103994f;

    /* renamed from: g, reason: collision with root package name */
    public lh0.f f103995g;

    /* renamed from: h, reason: collision with root package name */
    public hs.d f103996h;

    /* renamed from: i, reason: collision with root package name */
    public final h0 f103997i;

    /* renamed from: j, reason: collision with root package name */
    public final o f103998j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, j0 scope, d0 pinalytics, int i13, m pinFeatureConfig) {
        super(context, null, 0, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f103992d = i13;
        this.f103993e = pinFeatureConfig;
        this.f103994f = null;
        o oVar = new o(context, pinalytics, scope, pinFeatureConfig, this, null, null, 352);
        this.f103998j = oVar;
        hs.d dVar = this.f103996h;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        boolean b13 = dVar.b();
        oVar.b();
        h0 a13 = oVar.a().a();
        Intrinsics.checkNotNullParameter(a13, "<set-?>");
        this.f103997i = a13;
        Intrinsics.checkNotNullExpressionValue(LayoutInflater.from(context).inflate(pv.b.list_ads_carousel_pin_item, this), "inflate(...)");
        KeyEvent.Callback callback = this.f103997i;
        Intrinsics.g(callback, "null cannot be cast to non-null type android.view.View");
        ((View) callback).setLayoutParams(new FrameLayout.LayoutParams((int) (hf0.b.c().widthPixels / 2.6d), -1));
        View findViewById = findViewById(pv.a.pinContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        KeyEvent.Callback callback2 = this.f103997i;
        Intrinsics.g(callback2, "null cannot be cast to non-null type android.view.View");
        frameLayout.addView((View) callback2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(b13 ? eo1.c.space_0 : eo1.c.lego_brick_quarter);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).topMargin = dimensionPixelSize;
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
    }

    @Override // qa2.f0
    public final h0 getInternalCell() {
        return this.f103997i;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return this.f103998j.markImpressionEnd();
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f103998j.markImpressionStart();
    }

    @Override // ti1.r
    public final boolean o() {
        Boolean bool = this.f103994f;
        if (bool != null) {
            return bool.booleanValue();
        }
        lh0.f fVar = this.f103995g;
        if (fVar == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) fVar.f83340a;
        return g1Var.o("android_pgc_sba_ads_carousel_pin_item_view", "enabled", z3Var) || g1Var.l("android_pgc_sba_ads_carousel_pin_item_view");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0082  */
    @Override // qa2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPin(com.pinterest.api.model.f30 r44, int r45) {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            java.lang.String r2 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            ti1.o r2 = r0.f103998j
            ti1.e r3 = r2.a()
            boolean r4 = r3 instanceof ti1.d
            java.lang.String r5 = "getIsPromoted(...)"
            if (r4 == 0) goto L67
            boolean r20 = n60.o.B(r1, r5)
            r41 = -1
            wa2.m r6 = r0.f103993e
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r42 = 1023(0x3ff, float:1.434E-42)
            wa2.m r3 = wa2.m.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            qi0.c r4 = qi0.c.f103972k
            int r5 = r0.f103992d
            r2.d(r1, r5, r3, r4)
        L64:
            r3 = r45
            goto L7a
        L67:
            boolean r4 = r3 instanceof ti1.c
            if (r4 == 0) goto L64
            ti1.c r3 = (ti1.c) r3
            boolean r4 = n60.o.B(r1, r5)
            com.pinterest.ui.grid.LegoPinGridCellImpl r3 = r3.f117707a
            r3.f52451q = r4
            r3 = r45
            r2.setPin(r1, r3)
        L7a:
            com.pinterest.api.model.d40 r1 = com.pinterest.api.model.b40.x(r44)
            com.pinterest.api.model.d40 r4 = com.pinterest.api.model.d40.COMPLETE_HIDDEN
            if (r1 != r4) goto L86
            bs1.c.X0(r43)
            goto L89
        L86:
            bs1.c.U1(r43)
        L89:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r45)
            r2.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qi0.h.setPin(com.pinterest.api.model.f30, int):void");
    }
}
