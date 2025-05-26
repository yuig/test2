package oq;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.activity.pin.view.modules.PinCloseupFavoriteModule;
import com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule;
import com.pinterest.activity.pin.view.modules.PinCloseupUnifiedActionBarModule;
import com.pinterest.activity.pin.view.modules.PinCloseupVideoModule;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.um;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView;
import df.j1;
import h32.a4;
import h32.d4;
import h32.e4;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kh2.n3;
import kh2.p2;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import rq.a2;
import rq.e3;
import rq.g2;
import rq.h1;
import rq.j2;
import rq.j4;
import rq.k3;
import rq.m4;
import rq.r1;
import rq.r3;
import rq.t3;
import rq.u1;
import rq.w1;
import rq.w3;
import rq.w4;
import rq.y2;
import rq.y4;
import sf1.e1;
import so.a6;
import so.bb;
import so.cb;
import so.g6;
import so.jb;
import so.oa;
import so.s8;
import so.w8;
import x02.i2;
import x02.x2;

/* loaded from: classes3.dex */
public final class x0 extends xo.s implements i01.l0, nx.v, j0, e11.a, i01.i0 {
    public static final /* synthetic */ int O0 = 0;
    public ur.a A;
    public boolean A0;
    public pb0.a B;
    public String B0;
    public nx.k C;
    public final qc2.d C0;
    public long D;
    public final xj2.b D0;
    public final long E;
    public final wy0 E0;
    public f30 F;
    public final boolean F0;
    public final LinearLayout G;
    public i01.u G0;
    public final g0 H;
    public final Set H0;
    public ArrayList I;
    public final int[] I0;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f97153J;
    public int J0;
    public w4 K;
    public final int K0;
    public h1 L;
    public final xk2.v L0;
    public PinCloseupVideoModule M;
    public final xk2.v M0;
    public rq.v0 N;
    public final t0 N0;
    public rq.a1 O;
    public rq.p0 P;
    public y4 Q;
    public y2 R;
    public e3 S;
    public e3 T;
    public w01.f0 U;
    public j4 V;
    public w01.m0 W;

    /* renamed from: a0, reason: collision with root package name */
    public PinCloseupLegoActionButtonModule f97154a0;

    /* renamed from: b0, reason: collision with root package name */
    public PinCloseupUnifiedActionBarModule f97155b0;

    /* renamed from: c0, reason: collision with root package name */
    public rq.h f97156c0;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.z f97157d;

    /* renamed from: d0, reason: collision with root package name */
    public rq.d0 f97158d0;

    /* renamed from: e, reason: collision with root package name */
    public final i01.m f97159e;

    /* renamed from: e0, reason: collision with root package name */
    public rq.f f97160e0;

    /* renamed from: f, reason: collision with root package name */
    public uj2.q f97161f;

    /* renamed from: f0, reason: collision with root package name */
    public k3 f97162f0;

    /* renamed from: g, reason: collision with root package name */
    public lh0.a0 f97163g;

    /* renamed from: g0, reason: collision with root package name */
    public g2 f97164g0;

    /* renamed from: h, reason: collision with root package name */
    public x2 f97165h;

    /* renamed from: h0, reason: collision with root package name */
    public r3 f97166h0;

    /* renamed from: i, reason: collision with root package name */
    public i2 f97167i;

    /* renamed from: i0, reason: collision with root package name */
    public w01.c f97168i0;

    /* renamed from: j, reason: collision with root package name */
    public yk1.j f97169j;

    /* renamed from: j0, reason: collision with root package name */
    public w1 f97170j0;

    /* renamed from: k, reason: collision with root package name */
    public m60.w f97171k;

    /* renamed from: k0, reason: collision with root package name */
    public rq.s0 f97172k0;

    /* renamed from: l, reason: collision with root package name */
    public wk2.a f97173l;

    /* renamed from: l0, reason: collision with root package name */
    public nx.d0 f97174l0;

    /* renamed from: m, reason: collision with root package name */
    public wk2.a f97175m;

    /* renamed from: m0, reason: collision with root package name */
    public uk1.d f97176m0;

    /* renamed from: n, reason: collision with root package name */
    public se2.a f97177n;

    /* renamed from: n0, reason: collision with root package name */
    public String f97178n0;

    /* renamed from: o, reason: collision with root package name */
    public wk2.a f97179o;

    /* renamed from: o0, reason: collision with root package name */
    public a11.b f97180o0;

    /* renamed from: p, reason: collision with root package name */
    public wk2.a f97181p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f97182p0;

    /* renamed from: q, reason: collision with root package name */
    public nx.d1 f97183q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f97184q0;

    /* renamed from: r, reason: collision with root package name */
    public b60.b f97185r;

    /* renamed from: r0, reason: collision with root package name */
    public String f97186r0;

    /* renamed from: s, reason: collision with root package name */
    public rf1.d f97187s;

    /* renamed from: s0, reason: collision with root package name */
    public c82.a f97188s0;

    /* renamed from: t, reason: collision with root package name */
    public a11.b0 f97189t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f97190t0;

    /* renamed from: u, reason: collision with root package name */
    public cb f97191u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f97192u0;

    /* renamed from: v, reason: collision with root package name */
    public wk2.a f97193v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f97194v0;

    /* renamed from: w, reason: collision with root package name */
    public uj2.q f97195w;

    /* renamed from: w0, reason: collision with root package name */
    public d4 f97196w0;

    /* renamed from: x, reason: collision with root package name */
    public yk1.a f97197x;

    /* renamed from: x0, reason: collision with root package name */
    public a4 f97198x0;

    /* renamed from: y, reason: collision with root package name */
    public es.a f97199y;

    /* renamed from: y0, reason: collision with root package name */
    public h32.c1 f97200y0;

    /* renamed from: z, reason: collision with root package name */
    public es.h f97201z;

    /* renamed from: z0, reason: collision with root package name */
    public String f97202z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x0(android.content.Context r6, androidx.lifecycle.z r7, com.pinterest.feature.pin.closeup.view.PinCloseupFragment r8) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.x0.<init>(android.content.Context, androidx.lifecycle.z, com.pinterest.feature.pin.closeup.view.PinCloseupFragment):void");
    }

    public final y2 B0() {
        return this.R;
    }

    public final rq.h C(boolean z13) {
        boolean z14;
        f30 f30Var = this.F;
        if (f30Var == null || !Intrinsics.d(f30Var.d5(), Boolean.TRUE)) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new u1(context, this, this);
        }
        f30 f30Var2 = this.F;
        boolean z15 = false;
        if (f30Var2 != null && b40.Q0(f30Var2)) {
            f30 f30Var3 = this.F;
            if ((f30Var3 != null ? f30Var3.s5() : null) != null) {
                z14 = true;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                if (z14 && !z13) {
                    z15 = true;
                }
                return new rq.q(context2, z15, ((es.c) X()).x(this.F), !z13);
            }
        }
        z14 = false;
        Context context22 = getContext();
        Intrinsics.checkNotNullExpressionValue(context22, "getContext(...)");
        if (z14) {
            z15 = true;
        }
        return new rq.q(context22, z15, ((es.c) X()).x(this.F), !z13);
    }

    public final void D() {
        ArrayList arrayList = this.I;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((PinCloseupBaseModule) it.next()).endView();
            }
        }
    }

    public final int F0() {
        r1 t03 = t0();
        if (t03 != null) {
            return t03.getHeight();
        }
        return 0;
    }

    public final i2 G0() {
        i2 i2Var = this.f97167i;
        if (i2Var != null) {
            return i2Var;
        }
        Intrinsics.r("pinRepository");
        throw null;
    }

    public final y4 H0() {
        return this.Q;
    }

    public final void H1(float f13) {
        c0 z03 = z0();
        if (z03 != null) {
            z03.w(z03.i(), f13);
        }
    }

    public final void I0(int i13) {
        g0 g0Var = this.H;
        if (g0Var == null || g0Var.getHeight() <= hf0.b.g(g0Var.getContext())) {
            return;
        }
        int height = g0Var.getHeight();
        r1 r1Var = g0Var.f97038b;
        if (r1Var == null) {
            Intrinsics.r("mediaModule");
            throw null;
        }
        if (height - r1Var.getHeight() > 10) {
            r1 r1Var2 = g0Var.f97038b;
            if (r1Var2 == null) {
                Intrinsics.r("mediaModule");
                throw null;
            }
            int[] iArr = g0Var.f97043g;
            r1Var2.getLocationOnScreen(iArr);
            g0Var.getLocationOnScreen(g0Var.f97044h);
            if (i13 > 0) {
                r1 r1Var3 = g0Var.f97038b;
                if (r1Var3 == null) {
                    Intrinsics.r("mediaModule");
                    throw null;
                }
                float height2 = r1Var3.getHeight();
                r1 r1Var4 = g0Var.f97038b;
                if (r1Var4 == null) {
                    Intrinsics.r("mediaModule");
                    throw null;
                }
                if (r1Var4.getTranslationY() + height2 <= g0Var.getHeight()) {
                    r1 r1Var5 = g0Var.f97038b;
                    if (r1Var5 == null) {
                        Intrinsics.r("mediaModule");
                        throw null;
                    }
                    r1Var5.setTranslationY(r1Var5.getTranslationY() + i13);
                    r1 r1Var6 = g0Var.f97038b;
                    if (r1Var6 == null) {
                        Intrinsics.r("mediaModule");
                        throw null;
                    }
                    float translationY = r1Var6.getTranslationY();
                    int height3 = g0Var.getHeight();
                    if (g0Var.f97038b != null) {
                        r1Var6.setTranslationY(Math.min(translationY, height3 - r0.getHeight()));
                        return;
                    } else {
                        Intrinsics.r("mediaModule");
                        throw null;
                    }
                }
            }
            if (i13 >= 0 || iArr[1] < 52) {
                return;
            }
            r1 r1Var7 = g0Var.f97038b;
            if (r1Var7 == null) {
                Intrinsics.r("mediaModule");
                throw null;
            }
            if (r1Var7.getTranslationY() > 0.0f) {
                r1 r1Var8 = g0Var.f97038b;
                if (r1Var8 == null) {
                    Intrinsics.r("mediaModule");
                    throw null;
                }
                r1Var8.setTranslationY(r1Var8.getTranslationY() + i13);
                r1 r1Var9 = g0Var.f97038b;
                if (r1Var9 != null) {
                    r1Var9.setTranslationY(Math.max(r1Var9.getTranslationY(), 0.0f));
                } else {
                    Intrinsics.r("mediaModule");
                    throw null;
                }
            }
        }
    }

    public final void J1(float f13) {
        c0 z03 = z0();
        if (z03 != null) {
            z03.f96988m = !z03.w(z03.i(), f13);
        }
    }

    public final boolean K0(f30 f30Var) {
        return t1() && (f30Var != null && b40.Q0(f30Var) && !f30Var.d5().booleanValue());
    }

    public final void K1(float f13) {
        c0 z03 = z0();
        if (z03 != null) {
            z03.w(z03.i(), f13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final oq.d1 L(boolean r17) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.x0.L(boolean):oq.d1");
    }

    public final void L0(nx.d0 d0Var, f30 f30Var, h32.c1 c1Var) {
        if (d0Var == null || f30Var == null || Z() == null) {
            return;
        }
        ur.a aVar = this.A;
        if (aVar == null) {
            Intrinsics.r("ads");
            throw null;
        }
        Short o13 = ((es.v) ((ur.b) aVar).f123060c).o(f30Var);
        if (o13 != null) {
            short shortValue = o13.shortValue();
            h32.b1 b1Var = c1Var != null ? new h32.b1(c1Var) : new h32.b1();
            b1Var.f66857d0 = Short.valueOf(shortValue);
            c1Var = b1Var.a();
        }
        d0Var.H(f1.AD_CLOSEUP_RP_VIEW, f30Var.getUid(), c1Var, null, null, false);
    }

    public final void M1(float f13) {
        c0 z03 = z0();
        if (z03 != null) {
            z03.w(z03.i(), f13);
        }
    }

    public final void O1(float f13) {
        e1 e1Var;
        y4 y4Var = this.Q;
        if (y4Var != null && (e1Var = y4Var.f109677f) != null) {
            e1Var.f112559r.o0(f13);
        }
        PinCloseupVideoModule pinCloseupVideoModule = this.M;
        if (pinCloseupVideoModule != null) {
            pinCloseupVideoModule.updateVideoControlsPosition(f13);
        }
    }

    public final void P0(boolean z13) {
        k3 k3Var;
        m0 m0Var;
        this.f97194v0 = z13;
        if (this.f97192u0 || z13 || (k3Var = this.f97162f0) == null || (m0Var = k3Var.f109359v) == null) {
            return;
        }
        bs1.c.X0(m0Var.f97090k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R1() {
        int i13;
        boolean z13;
        int i14;
        ArrayList arrayList;
        int i15;
        boolean z14;
        String s53;
        nx.d0 d0Var;
        LinearLayout linearLayout;
        if (((es.c) X()).x(this.F)) {
            this.D = ((pb0.g) a0()).a();
        }
        if (this.I == null) {
            AttributeSet attributeSet = null;
            int i16 = 7;
            int i17 = 0;
            if (((es.c) X()).U(this.F)) {
                f30 pin = this.F;
                if (pin != null) {
                    this.I = new ArrayList();
                    this.f97153J = new ArrayList();
                    n(false);
                    ArrayList arrayList2 = this.I;
                    if (arrayList2 != null) {
                        wk2.a aVar = this.f97179o;
                        if (aVar == null) {
                            Intrinsics.r("legoPinCreatorAnalyticsModuleProvider");
                            throw null;
                        }
                        Object obj = aVar.get();
                        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        arrayList2.add(obj);
                    }
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Activity k03 = bs1.c.k0(context);
                    es.h hVar = this.f97201z;
                    if (hVar == null) {
                        Intrinsics.r("adsCommonDisplay");
                        throw null;
                    }
                    es.v vVar = (es.v) hVar;
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    vVar.f60013f.getClass();
                    if (hf0.b.m() && vVar.K(pin)) {
                        k(new s());
                        g0 g0Var = this.H;
                        if (g0Var != null) {
                            r1 r1Var = g0Var.f97038b;
                            if (r1Var == null) {
                                Intrinsics.r("mediaModule");
                                throw null;
                            }
                            int id3 = r1Var.getId();
                            Context context2 = g0Var.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            int H = kh2.s0.H(bs1.c.k0(context2));
                            androidx.constraintlayout.widget.p pVar = g0Var.f97042f;
                            pVar.o(id3, H);
                            pVar.l(g0Var.f97039c.getId(), 7, 0, 7);
                            r1 r1Var2 = g0Var.f97038b;
                            if (r1Var2 == null) {
                                Intrinsics.r("mediaModule");
                                throw null;
                            }
                            pVar.l(r1Var2.getId(), 7, 0, 7);
                            pVar.b(g0Var);
                        }
                    } else {
                        es.h hVar2 = this.f97201z;
                        if (hVar2 == null) {
                            Intrinsics.r("adsCommonDisplay");
                            throw null;
                        }
                        if (((es.v) hVar2).K(pin) && (linearLayout = this.G) != null) {
                            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                            layoutParams.width = kh2.s0.H(k03);
                            linearLayout.setLayoutParams(layoutParams);
                        }
                    }
                    q();
                }
            } else {
                this.I = new ArrayList();
                this.f97153J = new ArrayList();
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                boolean e13 = ig1.b.e1(bs1.c.k0(context3));
                xk2.v vVar2 = this.L0;
                int i18 = 6;
                int i19 = 5;
                int i23 = 2;
                if (e13) {
                    es.d Z = Z();
                    i13 = Z != null ? r0.f97133a[Z.ordinal()] : -1;
                    if (i13 == 1) {
                        L0(this.f97174l0, this.F, this.f97200y0);
                        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
                        g0 g0Var2 = this.H;
                        if (g0Var2 != null) {
                            k(new s());
                            l(new w0(g0Var2, 3));
                            i(new w0(g0Var2, 4));
                            w0 w0Var = new w0(g0Var2, i19);
                            if (this.f97160e0 == null) {
                                Context context4 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                rq.f fVar = new rq.f(context4);
                                w0Var.invoke(fVar);
                                this.f97160e0 = fVar;
                            }
                        }
                    } else if (i13 != 2) {
                        Context context5 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        g0 g0Var3 = this.H;
                        if (g0Var3 != null) {
                            k(new s());
                            f30 f30Var = this.F;
                            if (f30Var == null || !Intrinsics.d(f30Var.d5(), Boolean.FALSE)) {
                                PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule = new PinCloseupLegoActionButtonModule(context5, w1());
                                g0Var3.L(pinCloseupLegoActionButtonModule);
                                this.f97154a0 = pinCloseupLegoActionButtonModule;
                            } else {
                                n1 n1Var = a11.o.f334a;
                                if (a11.o.b(this.F)) {
                                    m(new w0(g0Var3, i18));
                                    j(new w0(g0Var3, i16));
                                } else {
                                    PinCloseupUnifiedActionBarModule pinCloseupUnifiedActionBarModule = new PinCloseupUnifiedActionBarModule(context5);
                                    String str = this.f97178n0;
                                    pinCloseupUnifiedActionBarModule.f35039d = str;
                                    UnifiedPinActionBarView unifiedPinActionBarView = pinCloseupUnifiedActionBarModule.f35038c;
                                    if (unifiedPinActionBarView != null) {
                                        unifiedPinActionBarView.f47038e = str;
                                    }
                                    pinCloseupUnifiedActionBarModule.setProductTagParentPinId(this.f97202z0);
                                    g0Var3.L(pinCloseupUnifiedActionBarModule);
                                    this.f97155b0 = pinCloseupUnifiedActionBarModule;
                                }
                            }
                            if (this.f97156c0 == null) {
                                rq.h C = C(true);
                                g0Var3.L(C);
                                this.f97156c0 = C;
                            }
                            f30 f30Var2 = this.F;
                            if (f30Var2 != null && Intrinsics.d(f30Var2.d5(), Boolean.FALSE) && this.f97164g0 == null) {
                                n1 n1Var2 = a11.o.f334a;
                                if (!a11.o.b(this.F)) {
                                    g2 g2Var = new g2(context5);
                                    g0Var3.L(g2Var);
                                    this.f97164g0 = g2Var;
                                }
                            }
                            f30 f30Var3 = this.F;
                            xk2.v vVar3 = sq.i.f114975a;
                            if (f30Var3 != null && (b40.I0(f30Var3) || (b40.p(f30Var3) instanceof s10.a))) {
                                g0Var3.L(new a2(context5));
                            }
                            n1 n1Var3 = a11.o.f334a;
                            if (!a11.o.b(this.F)) {
                                if (this.f97166h0 == null) {
                                    Context context6 = getContext();
                                    Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                                    r3 r3Var = new r3(context6);
                                    g0 g0Var4 = this.H;
                                    if (g0Var4 != null) {
                                        g0Var4.L(r3Var);
                                    }
                                    this.f97166h0 = r3Var;
                                }
                                t();
                            }
                            k3 k3Var = new k3(context5, this, this, false, a11.o.b(this.F));
                            g0Var3.L(k3Var);
                            this.f97162f0 = k3Var;
                            if (((Boolean) vVar2.getValue()).booleanValue()) {
                                g0Var3.L(new rq.f0(context5));
                            }
                            g0Var3.L(new w3(context5, this));
                            if (a11.o.b(this.F)) {
                                rq.s0 s0Var = new rq.s0(context5, this);
                                g0Var3.L(s0Var);
                                this.f97172k0 = s0Var;
                            }
                            if (!((es.c) X()).U(this.F)) {
                                g0Var3.L(new j2(context5));
                            }
                            g0Var3.L(new t3(context5));
                            f30 f30Var4 = this.F;
                            if (f30Var4 != null) {
                                er0.a aVar2 = er0.a.UNIFIED;
                                wy0 wy0Var = this.E0;
                                if (p2.Z0(f30Var4, wy0Var, aVar2)) {
                                    if (wy0Var == null || !Intrinsics.d(wy0Var.G3(), Boolean.TRUE)) {
                                        wk2.a aVar3 = this.f97181p;
                                        if (aVar3 == null) {
                                            Intrinsics.r("legoPinNonCreatorAnalyticsModuleProvider");
                                            throw null;
                                        }
                                        Object obj2 = aVar3.get();
                                        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                        g0Var3.L((PinCloseupBaseModule) obj2);
                                    } else {
                                        wk2.a aVar4 = this.f97179o;
                                        if (aVar4 == null) {
                                            Intrinsics.r("legoPinCreatorAnalyticsModuleProvider");
                                            throw null;
                                        }
                                        Object obj3 = aVar4.get();
                                        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                                        g0Var3.L((PinCloseupBaseModule) obj3);
                                    }
                                }
                            }
                            g0Var3.L(new PinCloseupFavoriteModule(i18, context5, attributeSet));
                            if (g4.u.z0(this.F, this.f97178n0, k0())) {
                                String str2 = this.f97178n0;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                g0Var3.L(new rq.k0(context5, str2));
                            }
                            nx.d0 d0Var2 = this.f97174l0;
                            if (d0Var2 != null) {
                                e3 e3Var = new e3(context5, d0Var2, bf.b.S(this.f97157d), this.f97159e);
                                g0Var3.L(e3Var);
                                this.S = e3Var;
                                if (this.U == null) {
                                    se2.a aVar5 = this.f97177n;
                                    if (aVar5 == null) {
                                        Intrinsics.r("presenterPinalyticsFactory");
                                        throw null;
                                    }
                                    uk1.d g13 = ((uk1.a) ((uk1.e) ((bf2.b) aVar5).get())).g();
                                    g13.c(a4.PIN_OTHER, d4.PIN, null);
                                    nx.d0 d0Var3 = this.f97174l0;
                                    nx.d0 d0Var4 = g13.f122379a;
                                    if (d0Var3 == null) {
                                        Intrinsics.checkNotNullExpressionValue(d0Var4, "getPinalytics(...)");
                                        d0Var = d0Var4;
                                    } else {
                                        d0Var = d0Var3;
                                    }
                                    wk2.a aVar6 = this.f97193v;
                                    if (aVar6 == null) {
                                        Intrinsics.r("shoppingModulePresenterFactory");
                                        throw null;
                                    }
                                    w01.g0 g0Var5 = (w01.g0) aVar6.get();
                                    f30 f30Var5 = this.F;
                                    String uid = f30Var5 != null ? f30Var5.getUid() : null;
                                    String str3 = uid != null ? uid : "";
                                    i2 G0 = G0();
                                    se2.a aVar7 = this.f97177n;
                                    if (aVar7 == null) {
                                        Intrinsics.r("presenterPinalyticsFactory");
                                        throw null;
                                    }
                                    nx.f0 f0Var = ((uk1.a) ((uk1.e) ((bf2.b) aVar7).get())).f122378a;
                                    ze1.c cVar = new ze1.c((String) null, 3);
                                    uj2.q qVar = this.f97195w;
                                    if (qVar == null) {
                                        Intrinsics.r("networkStream");
                                        throw null;
                                    }
                                    yk1.a aVar8 = this.f97197x;
                                    if (aVar8 == null) {
                                        Intrinsics.r("viewResources");
                                        throw null;
                                    }
                                    w01.f0 a13 = ((g6) g0Var5).a(str3, G0, g13, f0Var, cVar, qVar, aVar8, new xo0.o(d0Var, new pb0.g(), null, null, 60), a.f96942k, false);
                                    f30 f30Var6 = this.F;
                                    if (f30Var6 != null) {
                                        a13.r3(f30Var6, true);
                                    }
                                    this.U = a13;
                                    e3 e3Var2 = this.S;
                                    if (e3Var2 != null) {
                                        e3Var2.updatePinalytics(d0Var4);
                                        d4 j13 = g13.j();
                                        Intrinsics.checkNotNullExpressionValue(j13, "getViewTypeForLogging(...)");
                                        e3Var2.updateViewType(j13);
                                        e3Var2.updateViewParameterType(g13.i());
                                        e3Var2.setFullPinLoaded(this.f97190t0);
                                        f30 pin2 = e3Var2.getPin();
                                        if (pin2 != null) {
                                            e3Var2.updatePin(pin2);
                                        }
                                        ArrayList arrayList3 = this.I;
                                        if (arrayList3 != null) {
                                            arrayList3.add(e3Var2);
                                        }
                                    }
                                } else {
                                    f30 updatedPin = this.F;
                                    if (updatedPin != null) {
                                        Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
                                    }
                                }
                                w01.f0 f0Var2 = this.U;
                                if (f0Var2 != null) {
                                    s(this.S, f0Var2);
                                }
                            }
                            if (this.F0) {
                                Intrinsics.checkNotNullParameter(context5, "context");
                                j4 j4Var = new j4(context5, true);
                                g0Var3.L(j4Var);
                                this.V = j4Var;
                                x();
                                m4 m4Var = new m4(context5);
                                m4Var.f109380c = this.f97178n0;
                                g0Var3.L(m4Var);
                            }
                        }
                    } else {
                        L0(this.f97174l0, this.F, this.f97200y0);
                        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
                        g0 g0Var6 = this.H;
                        if (g0Var6 != null) {
                            k(new s());
                            l(new w0(g0Var6, i17));
                            i(new w0(g0Var6, 1));
                            w0 w0Var2 = new w0(g0Var6, i23);
                            if (this.f97172k0 == null) {
                                Context context7 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                                rq.s0 s0Var2 = new rq.s0(context7, this);
                                w0Var2.invoke(s0Var2);
                                this.f97172k0 = s0Var2;
                            }
                        }
                    }
                } else {
                    es.d Z2 = Z();
                    i13 = Z2 != null ? r0.f97133a[Z2.ordinal()] : -1;
                    if (i13 == 1) {
                        L0(this.f97174l0, this.F, this.f97200y0);
                        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
                        k(new s());
                        l(new s0(this, i19));
                        i(new s0(this, i18));
                        s0 s0Var3 = new s0(this, i16);
                        if (this.f97160e0 == null) {
                            Context context8 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                            rq.f fVar2 = new rq.f(context8);
                            s0Var3.invoke(fVar2);
                            this.f97160e0 = fVar2;
                        }
                    } else if (i13 != 2) {
                        Context context9 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                        k(new s());
                        f30 f30Var7 = this.F;
                        boolean z15 = f30Var7 != null && kh2.g0.d0(f30Var7);
                        if (!z15) {
                            n1 n1Var4 = a11.o.f334a;
                            if (a11.o.b(this.F) || a11.o.a(this.F)) {
                                m(new s0(this, 10));
                            }
                        }
                        f30 f30Var8 = this.F;
                        if (f30Var8 == null || (((s53 = f30Var8.s5()) != null && !kotlin.text.z.j(s53)) || f30Var8.d5().booleanValue() || f30Var8.u6() != null || !k0().T("enabled_none", z3.DO_NOT_ACTIVATE_EXPERIMENT))) {
                            if (!((es.c) X()).x(this.F)) {
                                n1 n1Var5 = a11.o.f334a;
                                if (a11.o.b(this.F) || a11.o.a(this.F)) {
                                    j(new s0(this, 11));
                                } else {
                                    if (this.f97166h0 == null) {
                                        Context context10 = getContext();
                                        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                                        r3 r3Var2 = new r3(context10);
                                        ArrayList arrayList4 = this.I;
                                        if (arrayList4 != null) {
                                            arrayList4.add(r3Var2);
                                        }
                                        this.f97166h0 = r3Var2;
                                    }
                                    t();
                                }
                            }
                        }
                        if (this.f97170j0 == null) {
                            Context context11 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                            w1 w1Var = new w1(context11);
                            ArrayList arrayList5 = this.I;
                            if (arrayList5 != null) {
                                arrayList5.add(w1Var);
                            }
                            this.f97170j0 = w1Var;
                        }
                        f30 f30Var9 = this.F;
                        if (f30Var9 != null) {
                            String s54 = f30Var9.s5();
                            if ((s54 == null || kotlin.text.z.j(s54)) && !f30Var9.d5().booleanValue() && f30Var9.u6() == null) {
                                lh0.a0 k04 = k0();
                                z3 z3Var = lh0.a4.f83298b;
                                g1 g1Var = (g1) k04.f83294a;
                                if (g1Var.o("android_closeup_linkless_pin_metadata_removal", "enabled", z3Var) || g1Var.l("android_closeup_linkless_pin_metadata_removal")) {
                                    z14 = true;
                                    z13 = z14;
                                }
                            }
                            z14 = false;
                            z13 = z14;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            if (this.f97156c0 == null) {
                                rq.h C2 = C(false);
                                ArrayList arrayList6 = this.I;
                                if (arrayList6 != null) {
                                    arrayList6.add(C2);
                                }
                                this.f97156c0 = C2;
                            }
                            f30 f30Var10 = this.F;
                            if (f30Var10 != null && Intrinsics.d(f30Var10.d5(), Boolean.FALSE) && this.f97164g0 == null) {
                                n1 n1Var6 = a11.o.f334a;
                                if (!a11.o.a(this.F) && !a11.o.b(this.F)) {
                                    Context context12 = getContext();
                                    Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                                    g2 g2Var2 = new g2(context12);
                                    ArrayList arrayList7 = this.I;
                                    if (arrayList7 != null) {
                                        arrayList7.add(g2Var2);
                                    }
                                    this.f97164g0 = g2Var2;
                                }
                            }
                        }
                        f30 f30Var11 = this.F;
                        xk2.v vVar4 = sq.i.f114975a;
                        if (f30Var11 == null || !(b40.I0(f30Var11) || (b40.p(f30Var11) instanceof s10.a))) {
                            i14 = 1;
                        } else {
                            i14 = 1;
                            if (!((es.c) X()).w(this.F, new u0(this, i14))) {
                                a2 a2Var = new a2(context9);
                                ArrayList arrayList8 = this.I;
                                if (arrayList8 != null) {
                                    arrayList8.add(a2Var);
                                }
                            }
                        }
                        if (!z13) {
                            f30 f30Var12 = this.F;
                            Set set = b40.f35967a;
                            if (f30Var12 != null) {
                                i15 = (j1.U0(f30Var12.c4()) || j1.U0(f30Var12.M3()) || j1.U0(f30Var12.N3())) ? i14 : 0;
                            } else {
                                i15 = 0;
                            }
                            n1 n1Var7 = a11.o.f334a;
                            k3 k3Var2 = new k3(context9, this, this, i15, (a11.o.a(this.F) || a11.o.b(this.F)) ? i14 : 0);
                            ArrayList arrayList9 = this.I;
                            if (arrayList9 != null) {
                                arrayList9.add(k3Var2);
                            }
                            this.f97162f0 = k3Var2;
                        }
                        if (!z13) {
                            w3 w3Var = new w3(context9, this);
                            ArrayList arrayList10 = this.I;
                            if (arrayList10 != null) {
                                arrayList10.add(w3Var);
                            }
                        }
                        if (((Boolean) vVar2.getValue()).booleanValue() && (arrayList = this.I) != null) {
                            arrayList.add((rq.f0) this.M0.getValue());
                        }
                        if (z15) {
                            PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule2 = new PinCloseupLegoActionButtonModule(context9, w1());
                            pinCloseupLegoActionButtonModule2.f35030u = this.f97178n0;
                            ArrayList arrayList11 = this.I;
                            if (arrayList11 != null) {
                                arrayList11.add(pinCloseupLegoActionButtonModule2);
                            }
                            this.f97154a0 = pinCloseupLegoActionButtonModule2;
                        } else {
                            n1 n1Var8 = a11.o.f334a;
                            if (!a11.o.a(this.F) && !a11.o.b(this.F)) {
                                PinCloseupUnifiedActionBarModule pinCloseupUnifiedActionBarModule2 = new PinCloseupUnifiedActionBarModule(context9);
                                String str4 = this.f97178n0;
                                pinCloseupUnifiedActionBarModule2.f35039d = str4;
                                UnifiedPinActionBarView unifiedPinActionBarView2 = pinCloseupUnifiedActionBarModule2.f35038c;
                                if (unifiedPinActionBarView2 != null) {
                                    unifiedPinActionBarView2.f47038e = str4;
                                }
                                pinCloseupUnifiedActionBarModule2.setProductTagParentPinId(this.f97202z0);
                                ArrayList arrayList12 = this.I;
                                if (arrayList12 != null) {
                                    arrayList12.add(pinCloseupUnifiedActionBarModule2);
                                }
                                this.f97155b0 = pinCloseupUnifiedActionBarModule2;
                            }
                        }
                    } else {
                        L0(this.f97174l0, this.F, this.f97200y0);
                        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
                        k(new s());
                        l(new s0(this, 8));
                        i(new s0(this, 9));
                    }
                }
                q();
            }
        }
        if (t1()) {
            g0 g0Var7 = this.H;
            f30 pin3 = this.F;
            if (g0Var7 != null && pin3 != null) {
                boolean z16 = this.f97190t0;
                ArrayList arrayList13 = g0Var7.f97037a;
                Iterator it = arrayList13.iterator();
                while (it.hasNext()) {
                    ((PinCloseupBaseModule) it.next()).setFullPinLoaded(z16);
                }
                Intrinsics.checkNotNullParameter(pin3, "pin");
                Iterator it2 = arrayList13.iterator();
                while (it2.hasNext()) {
                    ((PinCloseupBaseModule) it2.next()).updatePin(pin3);
                }
            }
        }
        ArrayList arrayList14 = this.I;
        f30 f30Var13 = this.F;
        if (arrayList14 != null && f30Var13 != null) {
            Iterator it3 = arrayList14.iterator();
            while (it3.hasNext()) {
                PinCloseupBaseModule pinCloseupBaseModule = (PinCloseupBaseModule) it3.next();
                pinCloseupBaseModule.setFullPinLoaded(this.f97190t0);
                pinCloseupBaseModule.updatePin(f30Var13);
            }
        }
        ArrayList arrayList15 = this.f97153J;
        f30 f30Var14 = this.F;
        if (arrayList15 == null || f30Var14 == null) {
            return;
        }
        Iterator it4 = arrayList15.iterator();
        while (it4.hasNext()) {
            ((i01.c) it4.next()).updatePin(f30Var14);
        }
    }

    public final void S0() {
        HashMap hashMap;
        if (this.f97192u0 || this.f97194v0) {
            rq.h hVar = this.f97156c0;
            if (hVar != null) {
                hVar.b();
            }
            k3 k3Var = this.f97162f0;
            if (k3Var != null) {
                f30 pin = k3Var.getPin();
                if (pin != null) {
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("pin_closeup_title_length", String.valueOf(sq.i.b(pin).length()));
                    String N3 = pin.N3();
                    pairArr[1] = new Pair("pin_closeup_description_length", String.valueOf(N3 != null ? N3.length() : 0));
                    hashMap = bs1.c.o(pairArr);
                } else {
                    hashMap = null;
                }
                m0 m0Var = k3Var.f109359v;
                if (m0Var != null) {
                    m0Var.c(hashMap);
                }
            }
        }
    }

    public final PinCloseupBaseModule T() {
        f30 f30Var = this.F;
        return (f30Var == null || !Intrinsics.d(f30Var.d5(), Boolean.FALSE)) ? this.f97154a0 : this.f97155b0;
    }

    public final void T0(vh story) {
        f30 f30Var;
        r1 t03;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(story, "story");
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new v0(this, this, story, 0));
            return;
        }
        e3 e3Var = this.T;
        if (e3Var != null) {
            e3Var.l(story);
            return;
        }
        nx.d0 d0Var = this.f97174l0;
        if (d0Var == null || (f30Var = this.F) == null || (t03 = t0()) == null || (arrayList = this.I) == null) {
            return;
        }
        int indexOf = arrayList.indexOf(t03);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        e3 e3Var2 = new e3(context, d0Var, bf.b.S(this.f97157d), this.f97159e);
        if (indexOf != -1) {
            ArrayList arrayList2 = this.I;
            if (arrayList2 != null) {
                arrayList2.add(indexOf + 1, e3Var2);
            }
            e3Var2.updatePin(f30Var);
            addView(e3Var2, indexOf + 1);
            e3Var2.l(story);
        }
        this.T = e3Var2;
    }

    @Override // i01.i0
    public final int W2() {
        r1 t03 = t0();
        if (t03 != null) {
            return t03.getWidth();
        }
        return 0;
    }

    public final es.a X() {
        es.a aVar = this.f97199y;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adFormats");
        throw null;
    }

    public final void Y0(boolean z13) {
        if (t1()) {
            g0 g0Var = this.H;
            if (g0Var != null) {
                Iterator it = g0Var.f97037a.iterator();
                while (it.hasNext()) {
                    ((PinCloseupBaseModule) it.next()).updateActive(z13);
                }
                return;
            }
            return;
        }
        ArrayList arrayList = this.I;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((PinCloseupBaseModule) it2.next()).updateActive(z13);
            }
        }
    }

    public final es.d Z() {
        f30 f30Var = this.F;
        if (f30Var == null || !Intrinsics.d(f30Var.d5(), Boolean.TRUE) || this.f97180o0 == a11.b.Swipe) {
            return null;
        }
        ur.a aVar = this.A;
        if (aVar == null) {
            Intrinsics.r("ads");
            throw null;
        }
        f30 f30Var2 = this.F;
        es.v vVar = (es.v) ((ur.b) aVar).f123060c;
        return vVar.j(vVar.m(f30Var2, true));
    }

    public final pb0.a a0() {
        pb0.a aVar = this.B;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("clock");
        throw null;
    }

    public final PinCloseupVideoModule d0() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        try {
            if (ev2.getPointerCount() >= 2) {
                requestDisallowInterceptTouchEvent(true);
            }
        } catch (IllegalArgumentException e13) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.q(e13, "Exception occurred getting pointer count in PinCloseupView.dispatchTouchEvent for getPointerCount()", tb0.p.CLOSEUP);
        }
        return super.dispatchTouchEvent(ev2);
    }

    @Override // i01.i0
    public final int e6() {
        return F0();
    }

    public final w4 g0() {
        return this.K;
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        ArrayList arrayList = this.I;
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((PinCloseupBaseModule) obj) instanceof nx.v) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final void i(Function1 function1) {
        if (this.f97158d0 == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            rq.d0 d0Var = new rq.d0(context);
            d0Var.inject();
            function1.invoke(d0Var);
            this.f97158d0 = d0Var;
        }
    }

    public final void j(Function1 function1) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rq.y0 y0Var = new rq.y0(context, this);
        function1.invoke(y0Var);
        f30 f30Var = this.F;
        x2 x2Var = this.f97165h;
        if (x2Var == null) {
            Intrinsics.r("userRepository");
            throw null;
        }
        nx.d0 E = n3.E(this.f97174l0, tb0.p.CLOSEUP);
        a11.b bVar = this.f97180o0;
        lh0.a0 k03 = k0();
        rf1.d dVar = this.f97187s;
        if (dVar != null) {
            s(y0Var, new w01.d(f30Var, x2Var, E, bVar, k03, dVar, X()));
        } else {
            Intrinsics.r("attributionMetadataBuilder");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03a2 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(oq.s r27) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.x0.k(oq.s):void");
    }

    public final lh0.a0 k0() {
        lh0.a0 a0Var = this.f97163g;
        if (a0Var != null) {
            return a0Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final void l(Function1 addModuleToContainer) {
        Intrinsics.checkNotNullParameter(addModuleToContainer, "addModuleToContainer");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rq.b0 b0Var = new rq.b0(context);
        addModuleToContainer.invoke(b0Var);
        f30 f30Var = this.F;
        x2 x2Var = this.f97165h;
        if (x2Var == null) {
            Intrinsics.r("userRepository");
            throw null;
        }
        rf1.d dVar = this.f97187s;
        if (dVar != null) {
            s(b0Var, new w01.c(f30Var, x2Var, dVar, this.f97180o0, k0(), X(), 0));
        } else {
            Intrinsics.r("attributionMetadataBuilder");
            throw null;
        }
    }

    public final void m(Function1 function1) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        y2 y2Var = new y2(context, b11.n0.EMBEDDED, this);
        y2Var.f109672e = this.f97178n0;
        y2Var.setProductTagParentPinId(this.f97202z0);
        function1.invoke(y2Var);
        this.R = y2Var;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return null;
    }

    public final void n(boolean z13) {
        if (this.Q == null) {
            cb cbVar = this.f97191u;
            if (cbVar == null) {
                Intrinsics.r("storyPinExpressiveCloseupModuleFactory");
                throw null;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            d1 L = L(z13);
            w8 w8Var = cbVar.f113374a;
            jb jbVar = (jb) w8Var.f114692e;
            y4 y4Var = new y4(context, L, (yk1.j) w8Var.f114689b.Qc.get(), (bb) ((jb) w8Var.f114692e).f113486d.get(), w8Var.f114690c.a6());
            oa oaVar = jbVar.f113483a;
            y4Var.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
            y4Var.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
            s8 s8Var = jbVar.f113485c;
            y4Var.closeupActionController = s8Var.h5();
            y4Var.bidiFormatter = a02.e.I1();
            y4Var.baseCloseupLibraryExperiments = s8Var.k5();
            y4Var.pinAuxHelper = (nx.b0) oaVar.R8.get();
            this.Q = y4Var;
        }
        y4 y4Var2 = this.Q;
        ArrayList arrayList = this.I;
        if (y4Var2 == null || arrayList == null) {
            return;
        }
        arrayList.add(y4Var2);
    }

    public final void n1(PinCloseupBaseModule pinCloseupBaseModule) {
        c82.a aVar = this.f97188s0;
        if (pinCloseupBaseModule == null || aVar == null || aVar.a()) {
            return;
        }
        pinCloseupBaseModule.updatePinSpamParams(this.f97188s0);
    }

    public final void o(e4 visibleEvent) {
        xk2.v vVar;
        b bVar;
        xk2.v vVar2;
        b bVar2;
        xk2.v vVar3;
        b bVar3;
        xk2.k closeupImpressionHelper;
        b bVar4;
        Intrinsics.checkNotNullParameter(visibleEvent, "visibleEvent");
        f30 f30Var = this.F;
        if (f30Var == null || !Intrinsics.d(f30Var.d5(), Boolean.TRUE)) {
            return;
        }
        PinCloseupVideoModule pinCloseupVideoModule = this.M;
        if (pinCloseupVideoModule != null && (closeupImpressionHelper = pinCloseupVideoModule.getCloseupImpressionHelper()) != null && (bVar4 = (b) closeupImpressionHelper.getValue()) != null) {
            bVar4.a(visibleEvent);
        }
        rq.p0 p0Var = this.P;
        if (p0Var != null && (vVar3 = p0Var.E) != null && (bVar3 = (b) vVar3.getValue()) != null) {
            bVar3.a(visibleEvent);
        }
        w4 w4Var = this.K;
        if (w4Var != null && (vVar2 = w4Var.f109640p) != null && (bVar2 = (b) vVar2.getValue()) != null) {
            bVar2.a(visibleEvent);
        }
        h1 h1Var = this.L;
        if (h1Var == null || (vVar = h1Var.f109237s) == null || (bVar = (b) vVar.getValue()) == null) {
            return;
        }
        bVar.a(visibleEvent);
    }

    public final int o0() {
        r1 t03 = t0();
        if (t03 != null) {
            return (int) this.C0.d(t03, this, this.H0);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
        x();
        m60.w wVar = this.f97171k;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.h(this.N0);
        int i13 = 2;
        this.D0.a(new jk2.x(G0().B(), new com.pinterest.framework.multisection.datasource.pagedlist.h(0, new s0(this, i13)), i13).F(new zp.n0(24, new s0(this, 3)), new zp.n0(25, new s0(this, 4)), ck2.i.f27923c, ck2.i.f27924d));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        nx.d0 d0Var = this.f97174l0;
        f30 f30Var = this.F;
        h32.c1 c1Var = this.f97200y0;
        boolean x13 = ((es.c) X()).x(f30Var);
        if (d0Var != null && f30Var != null) {
            Boolean M4 = f30Var.M4();
            Intrinsics.checkNotNullExpressionValue(M4, "getIsEligibleForPdp(...)");
            if ((M4.booleanValue() && c1Var != null) || x13) {
                f1 f1Var = f1.PIN_CLICKTHROUGH_END;
                String uid = f30Var.getUid();
                h32.v0 v0Var = new h32.v0();
                v0Var.C = Long.valueOf(((pb0.g) a0()).a() - this.D);
                d0Var.H(f1Var, uid, c1Var, null, x13 ? v0Var : null, false);
            }
        }
        m60.w wVar = this.f97171k;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.j(this.N0);
        this.D0.d();
        r3 r3Var = this.f97166h0;
        if (r3Var != null) {
            yk1.j jVar = this.f97169j;
            if (jVar == null) {
                Intrinsics.r("mvpBinder");
                throw null;
            }
            jVar.e(r3Var);
        }
        this.f97168i0 = null;
        j4 j4Var = this.V;
        if (j4Var != null) {
            yk1.j jVar2 = this.f97169j;
            if (jVar2 == null) {
                Intrinsics.r("mvpBinder");
                throw null;
            }
            jVar2.e(j4Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        y4 y4Var = this.Q;
        if (y4Var != null) {
            return y4Var.onKeyDown(i13, event);
        }
        PinCloseupVideoModule pinCloseupVideoModule = this.M;
        return pinCloseupVideoModule != null ? pinCloseupVideoModule.onKeyDown(i13, event) : super.onKeyDown(i13, event);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        kh2.r.u(this, "PinCloseupView");
    }

    public final void p1(f30 f30Var) {
        if (f30Var == null) {
            return;
        }
        this.F = f30Var;
        String str = this.B0;
        if ((str == null || str.length() <= 0) && Intrinsics.d(this.f97178n0, "pin") && this.f97190t0) {
            this.B0 = f30Var.E6();
            nx.d0 d0Var = this.f97174l0;
            if (d0Var != null) {
                nx.d1 d1Var = this.f97183q;
                if (d1Var == null) {
                    Intrinsics.r("trackingParamAttacher");
                    throw null;
                }
                d1Var.h(d0Var, f30Var);
            }
        }
        R1();
    }

    public final void q() {
        g0 g0Var;
        if (t1()) {
            d4 d4Var = this.f97196w0;
            if (d4Var == null || (g0Var = this.H) == null) {
                return;
            }
            f0 metadata = new f0(this.f97174l0, d4Var, this.f97198x0);
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Iterator it = g0Var.f97037a.iterator();
            while (it.hasNext()) {
                PinCloseupBaseModule pinCloseupBaseModule = (PinCloseupBaseModule) it.next();
                pinCloseupBaseModule.updatePinalytics(metadata.f97030a);
                pinCloseupBaseModule.updateViewType(metadata.f97031b);
                pinCloseupBaseModule.updateViewParameterType(metadata.f97032c);
            }
            return;
        }
        ArrayList<PinCloseupBaseModule> arrayList = this.I;
        if (arrayList != null) {
            for (PinCloseupBaseModule pinCloseupBaseModule2 : arrayList) {
                nx.d0 d0Var = this.f97174l0;
                if (d0Var != null) {
                    pinCloseupBaseModule2.updatePinalytics(d0Var);
                }
                d4 d4Var2 = this.f97196w0;
                if (d4Var2 != null) {
                    pinCloseupBaseModule2.updateViewType(d4Var2);
                }
                pinCloseupBaseModule2.updateViewParameterType(this.f97198x0);
                if (hf0.b.p()) {
                    LinearLayout linearLayout = this.G;
                    if (linearLayout != null) {
                        linearLayout.addView(pinCloseupBaseModule2);
                    }
                } else {
                    addView(pinCloseupBaseModule2);
                }
            }
        }
    }

    public final sq.g r0() {
        a11.b bVar = this.f97180o0;
        return new sq.g(bVar != null ? bVar.getNavigationType() : null, this.B0, this);
    }

    public final void r1(c82.a aVar) {
        if (aVar != null) {
            this.f97188s0 = aVar;
            n1(this.L);
            n1(this.M);
            n1(this.f97154a0);
            n1(this.f97155b0);
        }
    }

    public final void s(PinCloseupBaseModule pinCloseupBaseModule, i01.c cVar) {
        if (pinCloseupBaseModule == null || cVar.isBound()) {
            return;
        }
        yk1.j jVar = this.f97169j;
        if (jVar == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        jVar.d(pinCloseupBaseModule, cVar);
        ArrayList arrayList = this.f97153J;
        if (arrayList != null) {
            arrayList.add(cVar);
        }
    }

    public final void s1(jq.j jVar) {
        um umVar;
        jq.j jVar2;
        c0 c0Var;
        r1 t03 = t0();
        h1 h1Var = t03 instanceof h1 ? (h1) t03 : null;
        if (h1Var != null) {
            h1Var.f109240v = jVar;
            if (h1Var.f109238t != null) {
                ArrayList arrayList = h1Var.f109239u;
                if (!(!arrayList.isEmpty()) || (umVar = (um) CollectionsKt.U(0, arrayList)) == null || (jVar2 = h1Var.f109240v) == null || (c0Var = h1Var.f109238t) == null) {
                    return;
                }
                c0Var.u(jVar2, umVar.f42588e);
            }
        }
    }

    public final void t() {
        if (this.f97168i0 == null) {
            f30 f30Var = this.F;
            x2 x2Var = this.f97165h;
            if (x2Var == null) {
                Intrinsics.r("userRepository");
                throw null;
            }
            rf1.d dVar = this.f97187s;
            if (dVar == null) {
                Intrinsics.r("attributionMetadataBuilder");
                throw null;
            }
            this.f97168i0 = new w01.c(f30Var, x2Var, dVar, this.f97180o0, k0(), X(), 1);
        }
        w01.c cVar = this.f97168i0;
        if (cVar != null) {
            s(this.f97166h0, cVar);
        }
    }

    public final r1 t0() {
        rq.v0 v0Var = this.N;
        if (v0Var != null) {
            return v0Var;
        }
        rq.a1 a1Var = this.O;
        if (a1Var != null) {
            return a1Var;
        }
        PinCloseupVideoModule pinCloseupVideoModule = this.M;
        if (pinCloseupVideoModule != null) {
            return pinCloseupVideoModule;
        }
        rq.p0 p0Var = this.P;
        if (p0Var != null) {
            return p0Var;
        }
        y4 y4Var = this.Q;
        if (y4Var != null) {
            return y4Var;
        }
        w4 w4Var = this.K;
        return w4Var != null ? w4Var : this.L;
    }

    public final boolean t1() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return this.H != null && ig1.b.e1(bs1.c.k0(context));
    }

    public final boolean w1() {
        f30 f30Var = this.F;
        return (f30Var == null || b40.P0(f30Var) || a11.o.a(f30Var) || a11.o.b(f30Var)) ? false : true;
    }

    @Override // e11.a
    public final void w6(int i13) {
        n1 n1Var = a11.o.f334a;
        if (a11.o.c(this.F)) {
            int i14 = this.J0 + i13;
            this.J0 = i14;
            int i15 = this.K0 - i14;
            r1 t03 = t0();
            if (t03 != null) {
                t03.updateModuleSize$closeup_release(i15);
            }
        }
    }

    public final void x() {
        w01.m0 m0Var = this.W;
        if (m0Var == null) {
            wk2.a aVar = this.f97173l;
            if (aVar == null) {
                Intrinsics.r("unifiedCommentsModulePresenterFactory");
                throw null;
            }
            w01.n0 n0Var = (w01.n0) aVar.get();
            f30 f30Var = this.F;
            String uid = f30Var != null ? f30Var.getUid() : null;
            f30 f30Var2 = this.F;
            i2 G0 = G0();
            nx.d0 d0Var = this.f97174l0;
            se2.a aVar2 = this.f97177n;
            if (aVar2 == null) {
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            }
            Object obj = ((bf2.b) aVar2).get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            this.W = ((a6) n0Var).a(uid, f30Var2, G0, null, d0Var, (uk1.e) obj, false);
        } else {
            f30 f30Var3 = this.F;
            if (f30Var3 != null) {
                m0Var.updatePin(f30Var3);
            }
        }
        w01.m0 m0Var2 = this.W;
        if (m0Var2 != null) {
            s(this.V, m0Var2);
        }
    }

    public final void y1() {
        float o03 = o0();
        h1 h1Var = this.L;
        if (h1Var != null) {
            if (o03 >= 50.0f) {
                h1Var.e();
                return;
            }
            if (((es.c) h1Var.getAdFormats()).w(h1Var.getPin(), new rq.g1(h1Var, 2))) {
                ps.k kVar = h1Var.f109227i;
                if (kVar != null) {
                    kVar.e();
                } else {
                    Intrinsics.r("pinChipLooper");
                    throw null;
                }
            }
        }
    }

    public final c0 z0() {
        c0 c0Var;
        h1 h1Var = this.L;
        if (h1Var != null && (c0Var = h1Var.f109238t) != null) {
            return c0Var;
        }
        w4 w4Var = this.K;
        if (w4Var != null) {
            return w4Var.f109637m;
        }
        return null;
    }

    public final void z1() {
        rq.v0 v0Var = this.N;
        if (v0Var != null) {
            if (v0Var.f109598r == null && v0Var.f109597q == null) {
                return;
            }
            v0Var.getLocationOnScreen(new int[2]);
            float min = Math.min(hf0.b.g(v0Var.getContext()) - (r1[1] + v0Var.getHeight()), 0.0f);
            if (Math.abs(min) > v0Var.getHeight()) {
                return;
            }
            s71.l lVar = v0Var.f109598r;
            if (lVar != null) {
                lVar.setTranslationY(min);
            }
            pq.d dVar = v0Var.f109597q;
            if (dVar == null) {
                return;
            }
            dVar.setTranslationY(min);
        }
    }
}
