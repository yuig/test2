package tq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.y2;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.activity.pin.view.modules.PinCloseupFavoriteModule;
import com.pinterest.activity.pin.view.modules.PinCloseupUnifiedActionBarModule;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.gestalt.divider.GestaltDivider;
import df.j1;
import h32.a4;
import h32.c1;
import h32.d4;
import h32.e4;
import h32.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.g1;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import lh0.z3;
import nx.d1;
import oq.v0;
import rq.e3;
import rq.j4;
import rq.p2;
import rq.r3;
import rq.s0;
import rq.w1;
import so.a6;
import so.f6;
import so.g6;
import so.jb;
import so.oa;
import so.s8;
import w01.m0;
import w01.n0;
import x02.i2;
import x02.x2;

/* loaded from: classes3.dex */
public final class y extends LinearLayout implements v01.a, nx.v, h, i01.i0, e11.a, af2.c {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f118942r0 = 0;
    public boolean A;
    public final boolean B;
    public String C;
    public c82.a D;
    public final xj2.b E;
    public c1 F;
    public final qc2.d G;
    public a11.b H;
    public String I;

    /* renamed from: J, reason: collision with root package name */
    public w01.c f118943J;
    public w01.x K;
    public w01.f0 L;
    public final LinearLayout M;
    public e3 N;
    public final xk2.v O;
    public final Set P;
    public final boolean Q;
    public final xk2.v R;
    public final xk2.v S;
    public final xk2.v T;
    public final xk2.v U;
    public final xk2.v V;
    public final xk2.v W;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f118944a;

    /* renamed from: a0, reason: collision with root package name */
    public final xk2.v f118945a0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f118946b;

    /* renamed from: b0, reason: collision with root package name */
    public final xk2.v f118947b0;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.z f118948c;

    /* renamed from: c0, reason: collision with root package name */
    public final xk2.v f118949c0;

    /* renamed from: d, reason: collision with root package name */
    public final i01.m f118950d;

    /* renamed from: d0, reason: collision with root package name */
    public final xk2.v f118951d0;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f118952e;

    /* renamed from: e0, reason: collision with root package name */
    public final xk2.v f118953e0;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f118954f;

    /* renamed from: f0, reason: collision with root package name */
    public final xk2.v f118955f0;

    /* renamed from: g, reason: collision with root package name */
    public final x2 f118956g;

    /* renamed from: g0, reason: collision with root package name */
    public final xk2.v f118957g0;

    /* renamed from: h, reason: collision with root package name */
    public final yk1.j f118958h;

    /* renamed from: h0, reason: collision with root package name */
    public final xk2.v f118959h0;

    /* renamed from: i, reason: collision with root package name */
    public final lh0.a0 f118960i;

    /* renamed from: i0, reason: collision with root package name */
    public final xk2.v f118961i0;

    /* renamed from: j, reason: collision with root package name */
    public final uj2.q f118962j;

    /* renamed from: j0, reason: collision with root package name */
    public final xk2.v f118963j0;

    /* renamed from: k, reason: collision with root package name */
    public final wk2.a f118964k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f118965k0;

    /* renamed from: l, reason: collision with root package name */
    public final wk2.a f118966l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f118967l0;

    /* renamed from: m, reason: collision with root package name */
    public final wk2.a f118968m;

    /* renamed from: m0, reason: collision with root package name */
    public f30 f118969m0;

    /* renamed from: n, reason: collision with root package name */
    public final se2.a f118970n;

    /* renamed from: n0, reason: collision with root package name */
    public int f118971n0;

    /* renamed from: o, reason: collision with root package name */
    public final nx.f0 f118972o;

    /* renamed from: o0, reason: collision with root package name */
    public final int f118973o0;

    /* renamed from: p, reason: collision with root package name */
    public final yk1.a f118974p;

    /* renamed from: p0, reason: collision with root package name */
    public final LinearLayout f118975p0;

    /* renamed from: q, reason: collision with root package name */
    public final rf1.d f118976q;

    /* renamed from: q0, reason: collision with root package name */
    public final LinearLayout f118977q0;

    /* renamed from: r, reason: collision with root package name */
    public final es.a f118978r;

    /* renamed from: s, reason: collision with root package name */
    public final hs.d f118979s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f118980t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f118981u;

    /* renamed from: v, reason: collision with root package name */
    public nx.d0 f118982v;

    /* renamed from: w, reason: collision with root package name */
    public d4 f118983w;

    /* renamed from: x, reason: collision with root package name */
    public String f118984x;

    /* renamed from: y, reason: collision with root package name */
    public String f118985y;

    /* renamed from: z, reason: collision with root package name */
    public a4 f118986z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, androidx.lifecycle.z lifecycleOwner, PinCloseupFragment fragmentActiveStateProvider) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(fragmentActiveStateProvider, "fragmentActiveStateProvider");
        int i13 = 1;
        if (!this.f118946b) {
            this.f118946b = true;
            jb jbVar = (jb) ((z) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f118952e = (d1) oaVar.f113730i2.get();
            this.f118954f = (i2) oaVar.F3.get();
            this.f118956g = (x2) oaVar.f113800m3.get();
            this.f118958h = (yk1.j) oaVar.Qc.get();
            s8 s8Var = jbVar.f113485c;
            this.f118960i = s8Var.j5();
            this.f118962j = (uj2.q) oaVar.f113947u9.get();
            this.f118964k = s8Var.R1;
            this.f118966l = s8Var.T1;
            this.f118968m = s8Var.S1;
            this.f118970n = bf2.b.a(oaVar.f113702ga);
            this.f118972o = (nx.f0) oaVar.f113747j2.get();
            this.f118974p = (yk1.a) s8Var.B.get();
            this.f118976q = (rf1.d) jbVar.f113488f.get();
            this.f118978r = (es.a) oaVar.P6.get();
            this.f118979s = s8Var.a6();
        }
        this.f118948c = lifecycleOwner;
        this.f118950d = fragmentActiveStateProvider;
        this.f118980t = new ArrayList();
        this.f118981u = new ArrayList();
        boolean n13 = hf0.b.n();
        this.B = n13;
        this.E = new xj2.b();
        this.G = new qc2.d();
        int i14 = 0;
        this.O = xk2.m.b(new w(this, i14));
        this.P = g1.b(new qc2.b(0, 0, hf0.b.f69002b, hf0.b.f()));
        this.Q = !hf0.b.q();
        this.R = xk2.m.b(new w(this, i13));
        int i15 = 5;
        this.S = xk2.m.b(new v(context, this, i15));
        this.T = xk2.m.b(new ba.q(context, 8));
        int i16 = 2;
        this.U = xk2.m.b(new v(context, this, i16));
        int i17 = 6;
        this.V = xk2.m.b(new ba.q(context, i17));
        this.W = xk2.m.b(new ba.q(context, i15));
        int i18 = 4;
        this.f118945a0 = xk2.m.b(new v(context, this, i18));
        this.f118947b0 = xk2.m.b(new ba.q(context, 7));
        int i19 = 3;
        this.f118949c0 = xk2.m.b(new ba.q(context, i19));
        this.f118951d0 = xk2.m.b(new v(context, this, i14));
        this.f118953e0 = xk2.m.b(new ba.q(context, i18));
        this.f118955f0 = xk2.m.b(new ba.q(context, 9));
        this.f118957g0 = xk2.m.b(new v(this, context));
        this.f118959h0 = xk2.m.b(new v(context, this, i17));
        this.f118961i0 = xk2.m.b(new ba.q(context, 10));
        this.f118963j0 = xk2.m.b(new v(context, this, i19));
        this.f118973o0 = (hf0.b.d(bs1.c.m0(this)) - hf0.b.f()) - ((Number) xk2.m.b(new w(this, i16)).getValue()).intValue();
        this.A = false;
        setId(n80.c.pdp_closeup_view);
        setOrientation(1);
        setImportantForAccessibility(2);
        setFocusable(false);
        if (hf0.b.q()) {
            if (!n13) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                this.M = linearLayout;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(com.bumptech.glide.c.G(), -2);
                layoutParams.gravity = 1;
                addView(this.M, layoutParams);
                return;
            }
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.setOrientation(0);
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout3.setOrientation(1);
            this.f118975p0 = linearLayout3;
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout4.setOrientation(1);
            this.f118977q0 = linearLayout4;
            addView(linearLayout2);
            linearLayout2.addView(this.f118975p0);
            linearLayout2.addView(this.f118977q0);
        }
    }

    public final void C(float f13) {
        n k13 = k();
        if (k13.f118909s == null) {
            return;
        }
        pq.d i13 = k13.i();
        k13.getLocationOnScreen(k13.f118915y);
        float min = Math.min(f13 - (r2[1] + k13.getHeight()), 0.0f);
        if (Math.abs(min) > k13.getHeight()) {
            return;
        }
        i13.setTranslationY(min);
    }

    @Override // tq.h
    public final void R2() {
    }

    @Override // i01.i0
    public final int W2() {
        return k().getWidth();
    }

    public final void a(e4 visibleEvent) {
        Intrinsics.checkNotNullParameter(visibleEvent, "visibleEvent");
        Boolean d53 = getPin().d5();
        Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
        if (d53.booleanValue()) {
            ((oq.b) k().B.getValue()).a(visibleEvent);
        }
    }

    public final void b() {
        Iterator it = this.f118980t.iterator();
        while (it.hasNext()) {
            ((PinCloseupBaseModule) it.next()).endView();
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f118944a == null) {
            this.f118944a = new ye2.o(this);
        }
        return this.f118944a;
    }

    public final lh0.a0 e() {
        lh0.a0 a0Var = this.f118960i;
        if (a0Var != null) {
            return a0Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    @Override // i01.i0
    public final int e6() {
        return m();
    }

    public final com.pinterest.feature.pincarouselads.view.l g() {
        RecyclerView recyclerView = k().b().getPinterestRecyclerView().f52531a;
        l2 l2Var = recyclerView.f19242n;
        if (l2Var == null) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = l2Var instanceof LinearLayoutManager ? (LinearLayoutManager) l2Var : null;
        if (linearLayoutManager == null) {
            return null;
        }
        y2 S0 = recyclerView.S0(linearLayoutManager.k1());
        View view = S0 != null ? S0.f19717a : null;
        if (view instanceof com.pinterest.feature.pincarouselads.view.l) {
            return (com.pinterest.feature.pincarouselads.view.l) view;
        }
        return null;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f118944a == null) {
            this.f118944a = new ye2.o(this);
        }
        return this.f118944a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f118980t.iterator();
        while (it.hasNext()) {
            PinCloseupBaseModule pinCloseupBaseModule = (PinCloseupBaseModule) it.next();
            if (pinCloseupBaseModule instanceof nx.v) {
                arrayList.add(pinCloseupBaseModule);
            }
        }
        return arrayList;
    }

    public final f30 getPin() {
        f30 f30Var = this.f118969m0;
        if (f30Var != null) {
            return f30Var;
        }
        Intrinsics.r("_pin");
        throw null;
    }

    public final int i() {
        return (int) this.G.d(k(), this, this.P);
    }

    public final PinCloseupUnifiedActionBarModule j() {
        return (PinCloseupUnifiedActionBarModule) this.f118951d0.getValue();
    }

    @Override // tq.h
    public final void j3(int i13) {
    }

    public final n k() {
        return (n) this.S.getValue();
    }

    public final rq.y2 l() {
        return (rq.y2) this.f118963j0.getValue();
    }

    public final int m() {
        return k().getHeight();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return null;
    }

    public final i2 n() {
        i2 i2Var = this.f118954f;
        if (i2Var != null) {
            return i2Var;
        }
        Intrinsics.r("pinRepository");
        throw null;
    }

    public final void o(vh story) {
        Intrinsics.checkNotNullParameter(story, "story");
        int i13 = 1;
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new v0(this, this, story, i13));
            return;
        }
        e3 e3Var = this.N;
        if (e3Var != null) {
            e3Var.l(story);
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        nx.d0 d0Var = this.f118982v;
        if (d0Var == null) {
            Intrinsics.r("pinalytics");
            throw null;
        }
        e3 e3Var2 = new e3(context, d0Var, bf.b.S(this.f118948c), this.f118950d);
        ArrayList arrayList = this.f118980t;
        int indexOf = arrayList.indexOf(k());
        if (indexOf != -1) {
            int i14 = indexOf + 1;
            arrayList.add(i14, e3Var2);
            e3Var2.updatePin(getPin());
            addView(e3Var2, i14);
            e3Var2.l(story);
        }
        this.N = e3Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.a(new jk2.x(n().B(), new com.pinterest.framework.multisection.datasource.pagedlist.h(1, new x(this, 0)), 2).F(new rq.a4(10, new x(this, 1)), new rq.a4(11, g.f118837k), ck2.i.f27923c, ck2.i.f27924d));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.F != null) {
            nx.d0 d0Var = this.f118982v;
            if (d0Var == null) {
                Intrinsics.r("pinalytics");
                throw null;
            }
            f1 f1Var = f1.PIN_CLICKTHROUGH_END;
            f30 f30Var = this.f118969m0;
            if (f30Var == null) {
                Intrinsics.r("_pin");
                throw null;
            }
            d0Var.u(f1Var, f30Var.getUid(), this.F, null, false);
        }
        this.E.d();
        super.onDetachedFromWindow();
    }

    public final void q(List list, boolean z13) {
        float m13;
        Intrinsics.checkNotNullParameter("", "requestParams");
        f30 f30Var = this.f118969m0;
        if (f30Var == null) {
            Intrinsics.r("_pin");
            throw null;
        }
        com.pinterest.feature.pincarouselads.view.l g13 = g();
        if (g13 != null) {
            m13 = g13.f47400n * Math.max(1.0f, hf0.b.f69002b / g13.f47399m);
        } else {
            m13 = m();
        }
        s71.o.h(f30Var, (int) m13, list, 0, (r14 & 16) != 0 ? false : true, "", (r14 & 64) != 0 ? false : z13);
    }

    public final void s(boolean z13) {
        w01.f0 f0Var;
        Iterator it = this.f118980t.iterator();
        while (it.hasNext()) {
            ((PinCloseupBaseModule) it.next()).updateActive(z13);
        }
        lh0.a0 e13 = e();
        z3 z3Var = lh0.a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) e13.f83294a;
        if (g1Var.o("android_pdp_shopping_module_preloading_kill_switch", "enabled", z3Var) || g1Var.l("android_pdp_shopping_module_preloading_kill_switch") || !z13 || (f0Var = this.L) == null) {
            return;
        }
        xk2.v vVar = this.f118945a0;
        f0Var.bind((e3) vVar.getValue());
        yk1.j jVar = this.f118958h;
        if (jVar != null) {
            jVar.d((e3) vVar.getValue(), f0Var);
        } else {
            Intrinsics.r("mvpBinder");
            throw null;
        }
    }

    @Override // tq.h
    public final void s2(int i13) {
        h hVar = k().f118912v;
        if (hVar != null) {
            hVar.s2(i13);
        }
    }

    public final void t(PinCloseupBaseModule pinCloseupBaseModule) {
        c82.a aVar;
        if (pinCloseupBaseModule == null || (aVar = this.D) == null) {
            return;
        }
        Intrinsics.f(aVar);
        if (aVar.a()) {
            return;
        }
        pinCloseupBaseModule.updatePinSpamParams(this.D);
    }

    @Override // e11.a
    public final void w6(int i13) {
        n1 n1Var = a11.o.f334a;
        if (a11.o.c(getPin())) {
            int i14 = this.f118971n0 + i13;
            this.f118971n0 = i14;
            k().updateModuleSize$closeup_release(this.f118973o0 - i14);
        }
    }

    public final void x(f30 pin) {
        String str;
        w01.f0 f0Var;
        xk2.v vVar;
        xk2.v vVar2;
        boolean z13;
        LinearLayout linearLayout;
        p2 p2Var;
        r3 r3Var;
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f118969m0 = pin;
        if (pin == null) {
            Intrinsics.r("_pin");
            throw null;
        }
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        this.f118984x = uid;
        String str2 = this.I;
        if ((str2 == null || str2.length() == 0) && Intrinsics.d(this.C, "pin") && this.A) {
            f30 f30Var = this.f118969m0;
            if (f30Var == null) {
                Intrinsics.r("_pin");
                throw null;
            }
            this.I = f30Var.E6();
            d1 d1Var = this.f118952e;
            if (d1Var == null) {
                Intrinsics.r("trackingParamAttacher");
                throw null;
            }
            nx.d0 d0Var = this.f118982v;
            if (d0Var == null) {
                Intrinsics.r("pinalytics");
                throw null;
            }
            f30 f30Var2 = this.f118969m0;
            if (f30Var2 == null) {
                Intrinsics.r("_pin");
                throw null;
            }
            d1Var.h(d0Var, f30Var2);
        }
        ArrayList arrayList = this.f118980t;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f118981u;
        if (isEmpty) {
            arrayList.add(k());
            boolean d03 = kh2.g0.d0(getPin());
            xk2.v vVar3 = this.f118947b0;
            if (d03) {
                arrayList.add((r3) vVar3.getValue());
            } else {
                arrayList.add((rq.y2) this.f118963j0.getValue());
                arrayList.add((c0) this.U.getValue());
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            nx.d0 d0Var2 = this.f118982v;
            if (d0Var2 == null) {
                Intrinsics.r("pinalytics");
                throw null;
            }
            hs.d dVar = this.f118979s;
            if (dVar == null) {
                Intrinsics.r("moduleViewabilityHelper");
                throw null;
            }
            arrayList.add(new j0(context, d0Var2, this, dVar));
            arrayList.add((w1) this.W.getValue());
            if (((Boolean) this.R.getValue()).booleanValue()) {
                arrayList.add((rq.f0) this.f118955f0.getValue());
            }
            xk2.v vVar4 = this.f118959h0;
            xk2.v vVar5 = this.f118961i0;
            boolean z14 = this.B;
            if (z14) {
                arrayList.add((s0) vVar4.getValue());
            } else {
                if (this.Q) {
                    arrayList.add((p2) vVar5.getValue());
                }
                arrayList.add((s0) vVar4.getValue());
            }
            arrayList.add((PinCloseupFavoriteModule) this.f118953e0.getValue());
            if (g4.u.z0(getPin(), this.C, e())) {
                arrayList.add((rq.k0) this.f118957g0.getValue());
            }
            if (this.f118965k0) {
                str = "_pin";
                vVar = vVar3;
                vVar2 = vVar5;
                z13 = z14;
            } else {
                se2.a aVar = this.f118970n;
                if (aVar == null) {
                    Intrinsics.r("presenterPinalyticsFactory");
                    throw null;
                }
                uk1.d g13 = ((uk1.a) ((uk1.e) ((bf2.b) aVar).get())).g();
                g13.c(a4.PIN_OTHER, d4.PIN, null);
                wk2.a aVar2 = this.f118966l;
                if (aVar2 == null) {
                    Intrinsics.r("shoppingModulePresenterFactory");
                    throw null;
                }
                w01.g0 g0Var = (w01.g0) aVar2.get();
                String str3 = this.f118984x;
                if (str3 == null) {
                    Intrinsics.r("pinUid");
                    throw null;
                }
                i2 n13 = n();
                nx.f0 f0Var2 = this.f118972o;
                if (f0Var2 == null) {
                    Intrinsics.r("pinalyticsFactory");
                    throw null;
                }
                str = "_pin";
                z13 = z14;
                vVar2 = vVar5;
                ze1.c cVar = new ze1.c((String) null, 3);
                uj2.q qVar = this.f118962j;
                if (qVar == null) {
                    Intrinsics.r("networkStream");
                    throw null;
                }
                yk1.a aVar3 = this.f118974p;
                if (aVar3 == null) {
                    Intrinsics.r("viewResources");
                    throw null;
                }
                vVar = vVar3;
                w01.f0 a13 = ((g6) g0Var).a(str3, n13, g13, f0Var2, cVar, qVar, aVar3, (xo0.o) this.O.getValue(), t.f118933k, this.f118965k0);
                a13.r3(getPin(), this.A);
                lh0.a0 e13 = e();
                z3 z3Var = lh0.a4.f83298b;
                lh0.g1 g1Var = (lh0.g1) e13.f83294a;
                boolean o13 = g1Var.o("android_pdp_shopping_module_preloading_kill_switch", "enabled", z3Var);
                xk2.v vVar6 = this.f118945a0;
                if (o13 || g1Var.l("android_pdp_shopping_module_preloading_kill_switch")) {
                    a13.bind((e3) vVar6.getValue());
                    yk1.j jVar = this.f118958h;
                    if (jVar == null) {
                        Intrinsics.r("mvpBinder");
                        throw null;
                    }
                    jVar.d((e3) vVar6.getValue(), a13);
                }
                arrayList2.add(a13);
                this.L = a13;
                e3 e3Var = (e3) vVar6.getValue();
                e3Var.updatePinalytics(g13.f122379a);
                d4 j13 = g13.j();
                Intrinsics.checkNotNullExpressionValue(j13, "getViewTypeForLogging(...)");
                e3Var.updateViewType(j13);
                e3Var.updateViewParameterType(g13.i());
                e3Var.setFullPinLoaded(this.A);
                f30 pin2 = e3Var.getPin();
                if (pin2 != null) {
                    e3Var.updatePin(pin2);
                }
                arrayList.add(e3Var);
            }
            if (!this.f118967l0 && hf0.b.q()) {
                hs.d dVar2 = this.f118979s;
                if (dVar2 == null) {
                    Intrinsics.r("moduleViewabilityHelper");
                    throw null;
                }
                if (!dVar2.c()) {
                    wk2.a aVar4 = this.f118964k;
                    if (aVar4 == null) {
                        Intrinsics.r("unifiedCommentsModulePresenterFactory");
                        throw null;
                    }
                    n0 n0Var = (n0) aVar4.get();
                    String uid2 = getPin().getUid();
                    f30 pin3 = getPin();
                    i2 n14 = n();
                    nx.d0 d0Var3 = this.f118982v;
                    if (d0Var3 == null) {
                        Intrinsics.r("pinalytics");
                        throw null;
                    }
                    se2.a aVar5 = this.f118970n;
                    if (aVar5 == null) {
                        Intrinsics.r("presenterPinalyticsFactory");
                        throw null;
                    }
                    Object obj = ((bf2.b) aVar5).get();
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    m0 a14 = ((a6) n0Var).a(uid2, pin3, n14, null, d0Var3, (uk1.e) obj, this.f118967l0);
                    a14.updatePin(getPin());
                    xk2.v vVar7 = this.f118949c0;
                    a14.bind((j4) vVar7.getValue());
                    yk1.j jVar2 = this.f118958h;
                    if (jVar2 == null) {
                        Intrinsics.r("mvpBinder");
                        throw null;
                    }
                    jVar2.d((j4) vVar7.getValue(), a14);
                    arrayList2.add(a14);
                    j4 j4Var = (j4) vVar7.getValue();
                    nx.d0 d0Var4 = this.f118982v;
                    if (d0Var4 == null) {
                        Intrinsics.r("pinalytics");
                        throw null;
                    }
                    j4Var.updatePinalytics(d0Var4);
                    d4 d4Var = this.f118983w;
                    if (d4Var == null) {
                        Intrinsics.r("containerViewType");
                        throw null;
                    }
                    j4Var.updateViewType(d4Var);
                    j4Var.updateViewParameterType(this.f118986z);
                    j4Var.setFullPinLoaded(this.A);
                    f30 pin4 = j4Var.getPin();
                    if (pin4 != null) {
                        j4Var.updatePin(pin4);
                    }
                    hs.d dVar3 = j4Var.f109308h;
                    if (dVar3 == null) {
                        Intrinsics.r("moduleViewabilityHelper");
                        throw null;
                    }
                    if (!dVar3.b()) {
                        View findViewById = j4Var.findViewById(n80.c.bottom_divider);
                        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                        j1.W1((GestaltDivider) findViewById);
                    }
                    arrayList.add(j4Var);
                }
            }
            if (this.f118943J == null) {
                f30 pin5 = getPin();
                x2 x2Var = this.f118956g;
                if (x2Var == null) {
                    Intrinsics.r("userRepository");
                    throw null;
                }
                rf1.d dVar4 = this.f118976q;
                if (dVar4 == null) {
                    Intrinsics.r("attributionMetadataBuilder");
                    throw null;
                }
                a11.b bVar = this.H;
                lh0.a0 e14 = e();
                es.a aVar6 = this.f118978r;
                if (aVar6 == null) {
                    Intrinsics.r("adFormats");
                    throw null;
                }
                this.f118943J = new w01.c(pin5, x2Var, dVar4, bVar, e14, aVar6, 1);
            }
            w01.c cVar2 = this.f118943J;
            if (cVar2 != null && (r3Var = (r3) vVar.getValue()) != null && !cVar2.isBound()) {
                yk1.j jVar3 = this.f118958h;
                if (jVar3 == null) {
                    Intrinsics.r("mvpBinder");
                    throw null;
                }
                jVar3.d(r3Var, cVar2);
                this.f118981u.add(cVar2);
            }
            if (this.K == null) {
                wk2.a aVar7 = this.f118968m;
                if (aVar7 == null) {
                    Intrinsics.r("pinCloseupRedesignedCommentsModulePresenterFactory");
                    throw null;
                }
                w01.y yVar = (w01.y) aVar7.get();
                i2 n15 = n();
                nx.d0 d0Var5 = this.f118982v;
                if (d0Var5 == null) {
                    Intrinsics.r("pinalytics");
                    throw null;
                }
                se2.a aVar8 = this.f118970n;
                if (aVar8 == null) {
                    Intrinsics.r("presenterPinalyticsFactory");
                    throw null;
                }
                Object obj2 = ((bf2.b) aVar8).get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                this.K = ((f6) yVar).a(n15, d0Var5, (uk1.e) obj2);
            }
            w01.x xVar = this.K;
            if (xVar != null && (p2Var = (p2) vVar2.getValue()) != null && !xVar.isBound()) {
                yk1.j jVar4 = this.f118958h;
                if (jVar4 == null) {
                    Intrinsics.r("mvpBinder");
                    throw null;
                }
                jVar4.d(p2Var, xVar);
                this.f118981u.add(xVar);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                PinCloseupBaseModule pinCloseupBaseModule = (PinCloseupBaseModule) it.next();
                nx.d0 d0Var6 = this.f118982v;
                if (d0Var6 == null) {
                    Intrinsics.r("pinalytics");
                    throw null;
                }
                pinCloseupBaseModule.updatePinalytics(d0Var6);
                d4 d4Var2 = this.f118983w;
                if (d4Var2 == null) {
                    Intrinsics.r("containerViewType");
                    throw null;
                }
                pinCloseupBaseModule.updateViewType(d4Var2);
                pinCloseupBaseModule.updateViewParameterType(this.f118986z);
                if (z13) {
                    if (pinCloseupBaseModule instanceof n) {
                        LinearLayout linearLayout2 = this.f118975p0;
                        if (linearLayout2 != null) {
                            linearLayout2.addView(pinCloseupBaseModule);
                        }
                        n1 n1Var = a11.o.f334a;
                        if (a11.o.b(getPin()) && (linearLayout = this.f118975p0) != null) {
                            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.setMarginStart(bs1.c.W(this, eo1.c.space_100));
                            linearLayout.setLayoutParams(marginLayoutParams);
                        }
                    } else {
                        LinearLayout linearLayout3 = this.f118977q0;
                        if (linearLayout3 != null) {
                            linearLayout3.addView(pinCloseupBaseModule);
                        }
                    }
                } else if (hf0.b.p()) {
                    LinearLayout linearLayout4 = this.M;
                    if (linearLayout4 != null) {
                        linearLayout4.addView(pinCloseupBaseModule);
                    }
                } else {
                    addView(pinCloseupBaseModule);
                }
            }
        } else {
            str = "_pin";
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            PinCloseupBaseModule pinCloseupBaseModule2 = (PinCloseupBaseModule) it2.next();
            pinCloseupBaseModule2.setFullPinLoaded(this.A);
            f30 f30Var3 = this.f118969m0;
            if (f30Var3 == null) {
                Intrinsics.r(str);
                throw null;
            }
            pinCloseupBaseModule2.updatePin(f30Var3);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            i01.c cVar3 = (i01.c) it3.next();
            f30 f30Var4 = this.f118969m0;
            if (f30Var4 == null) {
                Intrinsics.r(str);
                throw null;
            }
            cVar3.updatePin(f30Var4);
        }
        lh0.a0 e15 = e();
        z3 z3Var2 = lh0.a4.f83297a;
        lh0.g1 g1Var2 = (lh0.g1) e15.f83294a;
        if (g1Var2.o("android_closeup_optimize_shopping_module_load", "enabled", z3Var2) || g1Var2.l("android_closeup_optimize_shopping_module_load") || (f0Var = this.L) == null) {
            return;
        }
        boolean z15 = this.A;
        f30 f30Var5 = this.f118969m0;
        if (f30Var5 != null) {
            f0Var.r3(f30Var5, z15);
        } else {
            Intrinsics.r(str);
            throw null;
        }
    }

    public final void z(c82.a pinSpamParams) {
        Intrinsics.checkNotNullParameter(pinSpamParams, "pinSpamParams");
        this.D = pinSpamParams;
        t(k());
        t((k0) this.T.getValue());
        t((g0) this.V.getValue());
        t((PinCloseupUnifiedActionBarModule) this.f118951d0.getValue());
    }
}
