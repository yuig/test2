package we1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.feature.pincarouselads.view.CarouselIndexView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.f4;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes5.dex */
public final class y0 extends LinearLayout implements re1.h, ky.h, eb2.l, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f129683a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f129684b;

    /* renamed from: c, reason: collision with root package name */
    public final x02.i2 f129685c;

    /* renamed from: d, reason: collision with root package name */
    public final m60.w f129686d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f129687e;

    /* renamed from: f, reason: collision with root package name */
    public final gi2.b f129688f;

    /* renamed from: g, reason: collision with root package name */
    public final pb0.d f129689g;

    /* renamed from: h, reason: collision with root package name */
    public final nx.d1 f129690h;

    /* renamed from: i, reason: collision with root package name */
    public final f4 f129691i;

    /* renamed from: j, reason: collision with root package name */
    public final xu1.g f129692j;

    /* renamed from: k, reason: collision with root package name */
    public final com.pinterest.feature.pin.j f129693k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.appcompat.widget.c2 f129694l;

    /* renamed from: m, reason: collision with root package name */
    public final com.pinterest.feature.pin.r f129695m;

    /* renamed from: n, reason: collision with root package name */
    public final is1.s f129696n;

    /* renamed from: o, reason: collision with root package name */
    public final a82.b f129697o;

    /* renamed from: p, reason: collision with root package name */
    public final nx.b0 f129698p;

    /* renamed from: q, reason: collision with root package name */
    public final g70.h f129699q;

    /* renamed from: r, reason: collision with root package name */
    public n2 f129700r;

    /* renamed from: s, reason: collision with root package name */
    public final CarouselIndexView f129701s;

    /* renamed from: t, reason: collision with root package name */
    public int f129702t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f129684b) {
            this.f129684b = true;
            jb jbVar = (jb) ((c1) generatedComponent());
            s8 s8Var = jbVar.f113485c;
            oa oaVar = jbVar.f113483a;
            this.f129685c = (x02.i2) oaVar.F3.get();
            this.f129686d = (m60.w) oaVar.f113885r0.get();
            this.f129687e = (b60.b) oaVar.f113850p0.get();
            this.f129688f = new gi2.b();
            this.f129689g = oaVar.j2();
            this.f129690h = (nx.d1) oaVar.f113730i2.get();
            this.f129691i = s8Var.J6();
            this.f129692j = (xu1.g) oaVar.f113929t9.get();
            this.f129693k = (com.pinterest.feature.pin.j) s8Var.E.get();
            this.f129694l = s8Var.o6();
            this.f129695m = s8Var.k6();
            this.f129696n = oaVar.S2();
            this.f129697o = (a82.b) s8Var.A0.get();
            this.f129698p = (nx.b0) oaVar.R8.get();
            this.f129699q = s8Var.e5();
        }
        CarouselIndexView carouselIndexView = new CarouselIndexView(6, context, (AttributeSet) null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelOffset = carouselIndexView.getResources().getDimensionPixelOffset(eo1.c.space_200);
        com.bumptech.glide.c.a1(marginLayoutParams, dimensionPixelOffset, carouselIndexView.getResources().getDimensionPixelSize(eo1.c.space_400), dimensionPixelOffset, 0);
        carouselIndexView.setLayoutParams(marginLayoutParams);
        pk.a0.k1(carouselIndexView, carouselIndexView.getResources().getDimensionPixelSize(eo1.c.space_200));
        carouselIndexView.c(eo1.b.color_themed_dark_gray, eo1.b.color_themed_background_secondary_strong);
        setGravity(17);
        carouselIndexView.setVisibility(8);
        this.f129701s = carouselIndexView;
        setVisibility(8);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    @Override // re1.c
    public final List C() {
        n2 n2Var = this.f129700r;
        if (n2Var != null) {
            return kotlin.collections.e0.b(n2Var);
        }
        return null;
    }

    @Override // re1.h
    public final void a(re1.f carouselModel) {
        t2 t2Var;
        Intrinsics.checkNotNullParameter(carouselModel, "carouselModel");
        n2 n2Var = this.f129700r;
        if (n2Var != null) {
            yk1.j.a().e(n2Var);
        }
        ue1.l lVar = carouselModel.f107581b;
        if (lVar.f122030e) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            setLayoutParams(layoutParams);
        } else {
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
        setVisibility(0);
        xu1.g gVar = this.f129692j;
        if (gVar == null) {
            Intrinsics.r("networkStateMonitor");
            throw null;
        }
        uj2.q a13 = gVar.a();
        b60.b bVar = this.f129687e;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        m60.w wVar = this.f129686d;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        gi2.b bVar2 = this.f129688f;
        if (bVar2 == null) {
            Intrinsics.r("boardRepItemViewBinderProvider");
            throw null;
        }
        pb0.d dVar = this.f129689g;
        if (dVar == null) {
            Intrinsics.r("fuzzyDateFormatter");
            throw null;
        }
        x02.i2 i2Var = this.f129685c;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        nx.d1 d1Var = this.f129690h;
        if (d1Var == null) {
            Intrinsics.r("trackingParamAttacher");
            throw null;
        }
        com.pinterest.feature.pin.r rVar = this.f129695m;
        if (rVar == null) {
            Intrinsics.r("repinAnimationUtil");
            throw null;
        }
        com.pinterest.feature.pin.j jVar = this.f129693k;
        if (jVar == null) {
            Intrinsics.r("pinAction");
            throw null;
        }
        androidx.appcompat.widget.c2 c2Var = this.f129694l;
        if (c2Var == null) {
            Intrinsics.r("repinToastHelper");
            throw null;
        }
        oj0.h hVar = new oj0.h(lVar.f122028c, d1Var, rVar, jVar, null, c2Var);
        is1.s sVar = this.f129696n;
        if (sVar == null) {
            Intrinsics.r("pinSwipePreferences");
            throw null;
        }
        nx.b0 b0Var = this.f129698p;
        if (b0Var == null) {
            Intrinsics.r("pinAuxHelper");
            throw null;
        }
        f4 f4Var = this.f129691i;
        if (f4Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        g70.h hVar2 = this.f129699q;
        if (hVar2 == null) {
            Intrinsics.r("boardNavigator");
            throw null;
        }
        t2 t2Var2 = new t2(lVar.f122028c, a13, bVar, wVar, bVar2, dVar, i2Var, carouselModel.f107592m, hVar, sVar, carouselModel.f107598s, b0Var, f4Var, hVar2);
        re1.g gVar2 = carouselModel.f107585f;
        u50.n nVar = gVar2.f107599a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int intValue = nVar.a(context).intValue();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int intValue2 = gVar2.f107600b.a(context2).intValue();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int intValue3 = gVar2.f107601c.a(context3).intValue();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        i2 i2Var2 = new i2(new j21.b(intValue, intValue2, intValue3, gVar2.f107602d.a(context4).intValue()), lVar.f122030e, lVar.f122027b, carouselModel.f107584e, carouselModel.f107587h, carouselModel.f107588i, carouselModel.f107589j, carouselModel.f107582c, carouselModel.f107583d, carouselModel.f107591l, carouselModel.f107593n, carouselModel.f107594o);
        m60.w wVar2 = this.f129686d;
        if (wVar2 == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        nx.d1 d1Var2 = this.f129690h;
        if (d1Var2 == null) {
            Intrinsics.r("trackingParamAttacher");
            throw null;
        }
        p2 p2Var = new p2(lVar.f122028c, i2Var2, wVar2, d1Var2, lVar.f122029d, carouselModel.f107598s);
        n2 n2Var2 = this.f129700r;
        if (n2Var2 != null) {
            n2Var2.e(p2Var);
        } else {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            a82.b bVar3 = this.f129697o;
            if (bVar3 == null) {
                Intrinsics.r("offscreenRenderer");
                throw null;
            }
            n2 n2Var3 = new n2(context5, bVar3);
            n2Var3.e(p2Var);
            addView(n2Var3);
            this.f129700r = n2Var3;
        }
        n2 n2Var4 = this.f129700r;
        if (n2Var4 != null) {
            t2Var = t2Var2;
            yk1.j.a().d(n2Var4, t2Var);
        } else {
            t2Var = t2Var2;
        }
        t2Var.G3(lVar.f122026a);
    }

    public final void b(int i13, int i14, boolean z13, boolean z14) {
        eb2.m mVar;
        eb2.m mVar2;
        n2 n2Var = this.f129700r;
        if (n2Var != null) {
            n2Var.b(i13, z13, z14);
        }
        this.f129702t = i13;
        CarouselIndexView carouselIndexView = this.f129701s;
        if (!z13 || z14) {
            carouselIndexView.setVisibility(8);
            n2 n2Var2 = this.f129700r;
            if (n2Var2 == null || (mVar = n2Var2.f129507n) == null) {
                return;
            }
            mVar.f58273i = null;
            return;
        }
        carouselIndexView.setVisibility(0);
        carouselIndexView.d(i14);
        carouselIndexView.e(0);
        if (!Intrinsics.d(carouselIndexView.getParent(), this)) {
            addView(carouselIndexView);
        }
        n2 n2Var3 = this.f129700r;
        if (n2Var3 != null && (mVar2 = n2Var3.f129507n) != null) {
            mVar2.f58273i = this;
        }
        carouselIndexView.requestLayout();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f129683a == null) {
            this.f129683a = new ye2.o(this);
        }
        return this.f129683a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129683a == null) {
            this.f129683a = new ye2.o(this);
        }
        return this.f129683a.generatedComponent();
    }

    @Override // eb2.l
    public final void i(int i13) {
        this.f129701s.e(ve.h.t(i13, this.f129702t));
    }

    @Override // eb2.l
    public final void j(int i13) {
        this.f129701s.e(ve.h.t(i13, this.f129702t));
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
