package qi0;

import a.m2;
import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ao2.j0;
import b10.z;
import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.LegoPinGridCell;
import h32.f1;
import h32.g0;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import nt.c2;
import nx.d0;
import nx.d1;
import qa2.f0;
import qa2.h0;
import ti1.o;
import ti1.r;
import uq.w;
import wa2.m;
import xk2.v;
import yk1.n;

/* loaded from: classes5.dex */
public final class d extends w implements n, r, f0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f103974u = 0;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f103975d;

    /* renamed from: e, reason: collision with root package name */
    public final int f103976e;

    /* renamed from: f, reason: collision with root package name */
    public final m f103977f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f103978g;

    /* renamed from: h, reason: collision with root package name */
    public final String f103979h;

    /* renamed from: i, reason: collision with root package name */
    public lh0.f f103980i;

    /* renamed from: j, reason: collision with root package name */
    public d1 f103981j;

    /* renamed from: k, reason: collision with root package name */
    public l51.a f103982k;

    /* renamed from: l, reason: collision with root package name */
    public m60.w f103983l;

    /* renamed from: m, reason: collision with root package name */
    public final o f103984m;

    /* renamed from: n, reason: collision with root package name */
    public final b f103985n;

    /* renamed from: o, reason: collision with root package name */
    public final v f103986o;

    /* renamed from: p, reason: collision with root package name */
    public final LegoPinGridCell f103987p;

    /* renamed from: q, reason: collision with root package name */
    public final int f103988q;

    /* renamed from: r, reason: collision with root package name */
    public final int f103989r;

    /* renamed from: s, reason: collision with root package name */
    public f30 f103990s;

    /* renamed from: t, reason: collision with root package name */
    public Function0 f103991t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, d0 pinalytics, int i13, m pinFeatureConfig, j0 scope, int i14, String str) {
        super(context, null, 0, 5, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f103975d = pinalytics;
        this.f103976e = i13;
        this.f103977f = pinFeatureConfig;
        this.f103978g = null;
        this.f103979h = str;
        o oVar = new o(context, pinalytics, scope, pinFeatureConfig, this, null, null, 352);
        this.f103984m = oVar;
        this.f103985n = new b(this, 0);
        this.f103986o = xk2.m.b(new z(21, context, this));
        oVar.b();
        KeyEvent.Callback a13 = oVar.a().a();
        this.f103987p = (LegoPinGridCell) a13;
        this.f103988q = ViewConfiguration.getTapTimeout();
        this.f103989r = ViewConfiguration.getPressedStateDuration();
        float f13 = i14 > 4 ? 4.3f : i14 >= 4 ? 4.0f : 3.0f;
        View inflate = LayoutInflater.from(context).inflate(pv.b.list_ads_carousel_pin_item, this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        Intrinsics.g(a13, "null cannot be cast to non-null type android.view.View");
        View view = (View) a13;
        view.setLayoutParams(new FrameLayout.LayoutParams((int) ((hf0.b.c().widthPixels - ((dl2.b.G0(this, eo1.a.item_horizontal_spacing) * 2) * f13)) / f13), -1));
        View findViewById = findViewById(pv.a.pinContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((FrameLayout) findViewById).addView(view);
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        inflate.setOnTouchListener(new m2(this, 6));
    }

    public final void L() {
        postDelayed(new c2(this, 13), this.f103989r);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.pinterest.ui.grid.LegoPinGridCell, qa2.h0] */
    @Override // qa2.f0
    public final h0 getInternalCell() {
        return this.f103987p;
    }

    @Override // ti1.r
    public final boolean o() {
        Boolean bool = this.f103978g;
        if (bool != null) {
            return bool.booleanValue();
        }
        lh0.f fVar = this.f103980i;
        if (fVar == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) fVar.f83340a;
        return g1Var.o("android_pgc_sba_ads_carousel_pin_item_view", "enabled", z3Var) || g1Var.l("android_pgc_sba_ads_carousel_pin_item_view");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f1 f1Var = f1.QCM_PIN_IMPRESSION_ONE_PIXEL;
        g0 g0Var = g0.PIN_CLOSEUP_ADS_QCM_MODULE;
        if (this.f103982k == null) {
            Intrinsics.r("adsQcmAnalytics");
            throw null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", String.valueOf(this.f103976e));
        hashMap.put("story_type", "related_pins_3p_ads_module_qcm");
        hashMap.put("is_third_party_ad", "true");
        f30 f30Var = this.f103990s;
        d0.B(this.f103975d, f1Var, g0Var, f30Var != null ? f30Var.getUid() : null, hashMap, 16);
        l51.a aVar = this.f103982k;
        if (aVar != null) {
            aVar.b("STLV3_CLOSEUP_ITEM_IMPRESSION");
        } else {
            Intrinsics.r("adsQcmAnalytics");
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
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
            r0.f103990s = r1
            ti1.o r2 = r0.f103984m
            ti1.e r3 = r2.a()
            boolean r4 = r3 instanceof ti1.d
            java.lang.String r5 = "getIsPromoted(...)"
            if (r4 == 0) goto L69
            boolean r20 = n60.o.B(r1, r5)
            r41 = -1
            wa2.m r6 = r0.f103977f
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
            qi0.c r4 = qi0.c.f103971j
            int r5 = r0.f103976e
            r2.d(r1, r5, r3, r4)
        L66:
            r3 = r45
            goto L7c
        L69:
            boolean r4 = r3 instanceof ti1.c
            if (r4 == 0) goto L66
            ti1.c r3 = (ti1.c) r3
            boolean r4 = n60.o.B(r1, r5)
            com.pinterest.ui.grid.LegoPinGridCellImpl r3 = r3.f117707a
            r3.f52451q = r4
            r3 = r45
            r2.setPin(r1, r3)
        L7c:
            com.pinterest.api.model.d40 r1 = com.pinterest.api.model.b40.x(r44)
            com.pinterest.api.model.d40 r4 = com.pinterest.api.model.d40.COMPLETE_HIDDEN
            if (r1 != r4) goto L88
            bs1.c.X0(r43)
            goto L8b
        L88:
            bs1.c.U1(r43)
        L8b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r45)
            r2.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qi0.d.setPin(com.pinterest.api.model.f30, int):void");
    }
}
