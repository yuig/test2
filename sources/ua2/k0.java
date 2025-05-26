package ua2;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.webkit.URLUtil;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import ey.g3;
import ey.m2;
import ey.n2;
import h32.d4;
import h32.z1;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.r2;

/* loaded from: classes4.dex */
public final class k0 extends g0 {
    public final es.a A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public long F;
    public long G;
    public z1 H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public final wa2.s f121531J;
    public int K;

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f121532j;

    /* renamed from: k, reason: collision with root package name */
    public final Function0 f121533k;

    /* renamed from: l, reason: collision with root package name */
    public final Function0 f121534l;

    /* renamed from: m, reason: collision with root package name */
    public final Function0 f121535m;

    /* renamed from: n, reason: collision with root package name */
    public final Function0 f121536n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f121537o;

    /* renamed from: p, reason: collision with root package name */
    public final int f121538p;

    /* renamed from: q, reason: collision with root package name */
    public final g1 f121539q;

    /* renamed from: r, reason: collision with root package name */
    public final a1 f121540r;

    /* renamed from: s, reason: collision with root package name */
    public final h1 f121541s;

    /* renamed from: t, reason: collision with root package name */
    public final h32.u0 f121542t;

    /* renamed from: u, reason: collision with root package name */
    public final String f121543u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f121544v;

    /* renamed from: w, reason: collision with root package name */
    public final g3 f121545w;

    /* renamed from: x, reason: collision with root package name */
    public final m60.g0 f121546x;

    /* renamed from: y, reason: collision with root package name */
    public final r2 f121547y;

    /* renamed from: z, reason: collision with root package name */
    public final ur.a f121548z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(LegoPinGridCell legoGridCell, qa2.x fixedHeightImageSpec, qa2.x isRenderImageOnly, qa2.x isInAdsOnlyModule, qa2.x isFullWidth, qa2.x pinSpec, boolean z13, int i13, g1 trackingDataProvider, a1 navigationManager, h1 utilsProvider, h32.u0 u0Var, String str, boolean z14, g3 perfLogApplicationUtils, m60.g0 pageSizeProvider, r2 experiments, ur.a adsCoreDependencies, hs1.q imageCache, es.a adFormats) {
        super(legoGridCell);
        String pinUid;
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(fixedHeightImageSpec, "fixedHeightImageSpec");
        Intrinsics.checkNotNullParameter(isRenderImageOnly, "isRenderImageOnly");
        Intrinsics.checkNotNullParameter(isInAdsOnlyModule, "isInAdsOnlyModule");
        Intrinsics.checkNotNullParameter(isFullWidth, "isFullWidth");
        Intrinsics.checkNotNullParameter(pinSpec, "pinSpec");
        Intrinsics.checkNotNullParameter(trackingDataProvider, "trackingDataProvider");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(utilsProvider, "utilsProvider");
        Intrinsics.checkNotNullParameter(perfLogApplicationUtils, "perfLogApplicationUtils");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f121532j = fixedHeightImageSpec;
        this.f121533k = isRenderImageOnly;
        this.f121534l = isInAdsOnlyModule;
        this.f121535m = isFullWidth;
        this.f121536n = pinSpec;
        this.f121537o = false;
        this.f121538p = i13;
        this.f121539q = trackingDataProvider;
        this.f121540r = navigationManager;
        this.f121541s = utilsProvider;
        this.f121542t = u0Var;
        this.f121543u = str;
        this.f121544v = z14;
        this.f121545w = perfLogApplicationUtils;
        this.f121546x = pageSizeProvider;
        this.f121547y = experiments;
        this.f121548z = adsCoreDependencies;
        this.A = adFormats;
        this.I = -1L;
        ul0.a listener = new ul0.a(this, 1);
        wa2.s sVar = new wa2.s(legoGridCell, ((ur.b) adsCoreDependencies).f123060c, adFormats, imageCache);
        sVar.f128904a0 = false;
        sVar.f128905b0 = z13;
        Intrinsics.checkNotNullParameter(legoGridCell, "<this>");
        f30 c03 = legoGridCell.getC0();
        if (c03 != null && (pinUid = c03.getUid()) != null) {
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            sVar.I = pinUid;
        }
        Intrinsics.checkNotNullParameter(listener, "listener");
        qa2.c cVar = sVar.f128923t;
        if (cVar != null) {
            cVar.f103242k = new wa2.r(listener, sVar);
        }
        this.f121531J = sVar;
    }

    @Override // ua2.h0
    public final boolean B() {
        LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) this.f121539q;
        HashMap I0 = legoPinGridCellImpl.I0();
        h32.c1 t13 = legoPinGridCellImpl.t(legoPinGridCellImpl.getPinUid());
        h32.u0 u0Var = this.f121542t;
        if (u0Var == null) {
            u0Var = h32.u0.PIN_SOURCE_IMAGE;
        }
        h32.u0 u0Var2 = u0Var;
        h32.g0 Y = legoPinGridCellImpl.Y();
        f30 f30Var = legoPinGridCellImpl.C0;
        legoPinGridCellImpl.W1.o(h32.f1.TAP, (r19 & 2) != 0 ? null : u0Var2, (r19 & 4) != 0 ? null : Y, (r19 & 8) != 0 ? null : f30Var != null ? f30Var.getUid() : null, (r19 & 32) != 0 ? null : I0, null, t13, null, false);
        return ((LegoPinGridCellImpl) this.f121540r).f2();
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return this.f121531J.getBounds().contains(i13, i14);
    }

    @Override // ua2.h0
    public final Integer D() {
        return 0;
    }

    public final void E(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.F = SystemClock.elapsedRealtime();
        this.G = -1L;
        this.D = false;
        sr m13 = b40.m(pin);
        List list = null;
        String D0 = m13 != null ? bs1.c.D0(m13) : null;
        if ((D0 == null || D0.length() == 0) && ((!this.C && !((Boolean) this.f121535m.invoke()).booleanValue()) || (D0 = bs1.c.y0(pin)) == null || D0.length() == 0)) {
            D0 = bs1.c.B0(pin);
        }
        if (D0 == null) {
            D0 = b40.a1(pin, this.f121547y.T()) ? "" : null;
        }
        this.E = D0;
        if (D0 != null) {
            int i13 = b40.s0(pin) ? this.K : 0;
            Context context = this.f121502f.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f121545w.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            d4 N1 = bs1.c.N1(context);
            boolean s03 = b40.s0(pin);
            int i14 = this.f121538p;
            n2 pinCellImageLoadStartEventParameters = new n2(D0, i14, N1, s03, i13, i13);
            wa2.s sVar = this.f121531J;
            sVar.getClass();
            Intrinsics.checkNotNullParameter(pinCellImageLoadStartEventParameters, "pinCellImageLoadStartEventParameters");
            qa2.c cVar = sVar.f128923t;
            if (cVar == null) {
                return;
            }
            if (cVar.c() == null || Intrinsics.d(cVar.f103239h, D0)) {
                boolean isValidUrl = URLUtil.isValidUrl(D0);
                View view = sVar.f128915l;
                if (!isValidUrl) {
                    try {
                        Integer.parseInt(D0);
                        cVar.f103243l = 0;
                        cVar.f103237f = BitmapFactory.decodeResource(view.getResources(), Integer.parseInt(D0));
                        return;
                    } catch (NumberFormatException unused) {
                        return;
                    }
                }
                new m2(pinCellImageLoadStartEventParameters).i();
                Boolean valueOf = Boolean.valueOf(s03);
                if (s03) {
                    Context context2 = view.getContext();
                    int i15 = m60.q0.collages_feed_cutout_border;
                    Object obj = d5.a.f53679a;
                    list = kotlin.collections.e0.b(new u72.a(D0, context2.getColor(i15)));
                }
                hs1.q.a(sVar.f128918o, cVar, D0, i13, i13, null, valueOf, list, 588);
                String str = sVar.I;
                if (str != null) {
                    new py.f(str, N1, i14, q92.c.PIN).i();
                }
            }
        }
    }

    public final void F(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        String i43 = pin.i4();
        if (i43 != null) {
            this.f121531J.i(Color.parseColor(i43));
        }
        E(pin);
    }

    public final void G(int i13) {
        wa2.s sVar = this.f121531J;
        sVar.f128927x = i13;
        qa2.c cVar = sVar.f128923t;
        if (cVar != null) {
            cVar.f103232a = i13;
        }
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121531J;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f121531J.draw(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        int i15;
        LegoPinGridCell legoPinGridCell = this.f121502f;
        f30 S = com.bumptech.glide.d.S(legoPinGridCell);
        qa2.d1 d1Var = (qa2.d1) this.f121536n.invoke();
        es.c cVar = (es.c) this.A;
        cs.c a13 = cVar.a(S);
        cs.c cVar2 = cs.c.TWO_BY_TWO;
        Function0 function0 = this.f121533k;
        Function0 function02 = this.f121534l;
        wa2.s sVar = this.f121531J;
        if (a13 == cVar2) {
            int dimensionPixelSize = (i13 - legoPinGridCell.getResources().getDimensionPixelSize(m60.r0.lego_grid_cell_chips_spacing_dpa)) / 2;
            float v03 = bs1.c.v0(S);
            int i16 = (int) (dimensionPixelSize / v03);
            int i17 = d1Var.f103248a;
            int i18 = d1Var.f103249b;
            Float f13 = d1Var.f103250c;
            float f14 = d1Var.f103251d;
            qa2.c1 pinLevelingResizeType = d1Var.f103254g;
            float f15 = d1Var.f103255h;
            Intrinsics.checkNotNullParameter(pinLevelingResizeType, "pinLevelingResizeType");
            qa2.d1 d1Var2 = new qa2.d1(i17, i18, f13, f14, dimensionPixelSize, i16, pinLevelingResizeType, f15);
            bb2.e fixedHeightImageSpec = new bb2.e(1.0f / v03, (bb2.f) null, 6);
            sVar.getClass();
            Intrinsics.checkNotNullParameter(fixedHeightImageSpec, "fixedHeightImageSpec");
            sVar.f128906c0 = fixedHeightImageSpec;
            sVar.p(S, d1Var2, ((Boolean) function02.invoke()).booleanValue());
            ((Boolean) function0.invoke()).getClass();
            sVar.f(dimensionPixelSize);
            sVar.o();
            return new z0(i13, i16);
        }
        Function0 function03 = this.f121532j;
        bb2.e fixedHeightImageSpec2 = (bb2.e) function03.invoke();
        if (fixedHeightImageSpec2 != null) {
            sVar.getClass();
            Intrinsics.checkNotNullParameter(fixedHeightImageSpec2, "fixedHeightImageSpec");
            sVar.f128906c0 = fixedHeightImageSpec2;
        }
        sVar.O = ((Boolean) this.f121535m.invoke()).booleanValue();
        sVar.p(S, d1Var, ((Boolean) function02.invoke()).booleanValue());
        ((Boolean) function0.invoke()).getClass();
        if (this.f121544v) {
            sVar.f128910g0 = i14;
        } else if (this.f121537o) {
            sVar.f128910g0 = legoPinGridCell.getResources().getDimensionPixelSize(m60.r0.lego_grid_cell_banner_height_ce);
        } else {
            sVar.f128910g0 = 0;
        }
        sVar.f(i13);
        sVar.o();
        if (b40.s0(S)) {
            i15 = d1Var.f103253f;
        } else {
            Float q13 = cVar.q(S, new c72.o(this, 14));
            float f16 = i13;
            Float S0 = bs1.c.S0(f16, q13);
            if (S0 != null) {
                i15 = (int) S0.floatValue();
            } else {
                bb2.e eVar = (bb2.e) function03.invoke();
                i15 = eVar != null ? (int) ((f16 * eVar.f22604a) + eVar.f22605b) : sVar.f128842e;
            }
        }
        return new z0(i13, i15);
    }
}
