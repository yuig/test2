package nl1;

import ac2.o;
import ac2.o1;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.a0;
import com.pinterest.base.LockableViewPager;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.framework.screens.s;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import df.j1;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.w0;
import h32.w3;
import h32.x3;
import hs1.q;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kg.t;
import kh2.c3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.w;
import nx.d0;
import nx.d1;
import nx.f0;
import nx.i1;
import nx.j0;
import nx.n;
import nx.r0;
import nx.t0;
import nx.z0;
import t3.s1;
import u50.r;
import x02.x2;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lnl1/d;", "Ljl1/a;", "Lku1/k;", "Luk1/c;", "Lfo1/i;", "Lnx/i1;", "Lcom/pinterest/framework/screens/b;", "", "<init>", "()V", "ku1/i", "baseFragment_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class d extends jl1.a implements ku1.k, uk1.c, fo1.i, i1, com.pinterest.framework.screens.b {
    public static final /* synthetic */ int W = 0;
    public z70.f A;
    public final v B = m.b(new r0(this, 17));
    public final uk2.d C = s1.h("create(...)");
    public AtomicReference D;
    public int E;
    public rs1.a F;
    public oe0.h G;
    public ms1.b H;
    public Navigation I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f91282J;
    public boolean K;
    public boolean L;
    public boolean M;
    public d0 N;
    public xj2.b O;
    public boolean P;
    public ku1.i Q;
    public nc0.f R;
    public boolean S;
    public final g.b T;
    public final c U;
    public ll.j V;

    /* renamed from: h, reason: collision with root package name */
    public wk2.a f91283h;

    /* renamed from: i, reason: collision with root package name */
    public x2 f91284i;

    /* renamed from: j, reason: collision with root package name */
    public f0 f91285j;

    /* renamed from: k, reason: collision with root package name */
    public r70.b f91286k;

    /* renamed from: l, reason: collision with root package name */
    public q f91287l;

    /* renamed from: m, reason: collision with root package name */
    public bz.i f91288m;

    /* renamed from: n, reason: collision with root package name */
    public lu1.d f91289n;

    /* renamed from: o, reason: collision with root package name */
    public ac2.m f91290o;

    /* renamed from: p, reason: collision with root package name */
    public m60.e f91291p;

    /* renamed from: q, reason: collision with root package name */
    public ku1.a f91292q;

    /* renamed from: r, reason: collision with root package name */
    public s f91293r;

    /* renamed from: s, reason: collision with root package name */
    public ff0.f f91294s;

    /* renamed from: t, reason: collision with root package name */
    public t0 f91295t;

    /* renamed from: u, reason: collision with root package name */
    public d1 f91296u;

    /* renamed from: v, reason: collision with root package name */
    public b60.b f91297v;

    /* renamed from: w, reason: collision with root package name */
    public w f91298w;

    /* renamed from: x, reason: collision with root package name */
    public tb0.h f91299x;

    /* renamed from: y, reason: collision with root package name */
    public uj2.q f91300y;

    /* renamed from: z, reason: collision with root package name */
    public a80.a f91301z;

    public d() {
        xj2.e eVar = new xj2.e(ck2.i.f27922b);
        Intrinsics.checkNotNullExpressionValue(eVar, "empty(...)");
        this.D = eVar;
        this.L = true;
        this.M = true;
        this.S = true;
        g.b registerForActivityResult = registerForActivityResult(new h.g(), new a0(this, 21));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.T = registerForActivityResult;
        this.U = c.f91279j;
    }

    public static void J7() {
        new py.h().i();
    }

    public static Object j7(Context context, Class checkInterface) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(checkInterface, "checkInterface");
        try {
            return checkInterface.cast(context);
        } catch (ClassCastException unused) {
            throw new ClassCastException(context + " must implement " + checkInterface);
        }
    }

    public final x2 A7() {
        x2 x2Var = this.f91284i;
        if (x2Var != null) {
            return x2Var;
        }
        Intrinsics.r("userRepository");
        throw null;
    }

    public final ac2.m B7() {
        ac2.m mVar = this.f91290o;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.r("videoManager");
        throw null;
    }

    public x3 C7(String str) {
        if (str == null || z.j(str)) {
            return null;
        }
        w3 w3Var = new w3();
        w3Var.f67367f = str;
        return w3Var.a();
    }

    public void D5() {
        s sVar = this.f91293r;
        ScreenDescription u73 = u7();
        if (sVar == null || u73 == null) {
            return;
        }
        if (u73 != sVar.k()) {
            W6();
        } else {
            this.C.c(Boolean.TRUE);
        }
    }

    public a4 D7() {
        return getF52978e1();
    }

    public d4 E7() {
        return getF52977d1();
    }

    public void F6(Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        M1(navigation);
        W6();
    }

    public final void F7() {
        ep.b.C(null, f7());
    }

    public final void G7(GestaltToolbarImpl gestaltToolbarImpl) {
        t.W0(gestaltToolbarImpl, this);
        int y73 = y7();
        if (y73 != 0) {
            gestaltToolbarImpl.D(y73);
        }
    }

    public boolean H7() {
        return this instanceof HomeFeedFragment;
    }

    public void I3() {
    }

    public void I7() {
        a4 f52978e1;
        String obj;
        ScreenLocation f49939a;
        if (l7() != null) {
            return;
        }
        HashMap f13 = s7().f();
        if (f13 == null) {
            f13 = new HashMap();
        }
        Navigation navigation = this.I;
        if ((navigation == null || (f49939a = navigation.getF49939a()) == null || (obj = f49939a.getName()) == null) && ((f52978e1 = getF52978e1()) == null || (obj = f52978e1.toString()) == null)) {
            obj = getF52977d1().toString();
        }
        f13.put("nav_target", obj);
        if (!this.L || getClass().isAnnotationPresent(n.class)) {
            return;
        }
        s7().z(f13);
    }

    public void K7() {
        View view = getView();
        if (view != null) {
            LayoutInflater.Factory requireActivity = requireActivity();
            yf0.f fVar = requireActivity instanceof yf0.f ? (yf0.f) requireActivity : null;
            yf0.d edgeToEdgeConfiguration = fVar != null ? fVar.getEdgeToEdgeConfiguration() : null;
            if ((edgeToEdgeConfiguration instanceof yf0.c) && !this.P) {
                this.P = true;
                S6(((yf0.c) edgeToEdgeConfiguration).a(), view);
            }
        }
        View g73 = g7();
        if (g73 != null || U7()) {
            WeakReference weakReference = new WeakReference(g73);
            View view2 = getView();
            if (view2 != null) {
                view2.postDelayed(new a(0, weakReference, this), 500L);
            }
        }
        Object F = this.C.A(wj2.c.a()).F(new com.pinterest.feature.home.model.h(16, new hk1.t(this, 5)), new com.pinterest.feature.home.model.h(17, c.f91280k), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        this.D = (AtomicReference) F;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    public void L7() {
        if (this.S && this.f91287l == null) {
            Intrinsics.r("imageCache");
            throw null;
        }
        c7().f106353c = true;
        if (c7().f106352b && (!(this instanceof PinCloseupFragment))) {
            f7().d(new r70.k());
        }
        this.D.dispose();
        J7();
    }

    public void M1(Navigation navigation) {
        Unit unit;
        s sVar;
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        ku1.a o73 = o7();
        if (((ku1.j) o7()).f80914l != null) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            ((ku1.j) o73).m(navigation);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit != null || (sVar = this.f91293r) == null) {
            return;
        }
        ScreenModel screenDescription = navigation.b1();
        Intrinsics.checkNotNullExpressionValue(screenDescription, "toScreenDescription(...)");
        boolean r13 = navigation.r1();
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        sVar.c(screenDescription, true, false, true, r13);
        Unit unit2 = Unit.f80348a;
    }

    public final void M7() {
        r l73 = l7();
        if (l73 != null) {
            l73.a(ll1.c.f83828a);
        }
    }

    public boolean N7(int i13, KeyEvent keyEvent) {
        return false;
    }

    public void O7() {
        P7();
    }

    public ac2.m P0() {
        return B7();
    }

    public void P7() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            E4.onBackPressed();
        }
    }

    public void Q6(StringBuilder sb3) {
        Intrinsics.checkNotNullParameter(sb3, "sb");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Q7(boolean z13) {
        boolean z14 = this.f91282J != z13;
        this.f91282J = z13;
        if (getView() != null && l7() == null && this.M && ((Boolean) this.B.getValue()).booleanValue() && this.f91282J && z14) {
            w0 e13 = s7().e();
            String str = e13 != null ? e13.G : null;
            HashMap f13 = s7().f();
            qq2.c cVar = new qq2.c(f13 != null ? j1.R1(f13) : new z0(), str);
            i0 p13 = s7().p();
            if (p13 != null) {
                w7().f(p13, cVar);
            }
        }
        if (z14) {
            if (this.f91282J) {
                if (getView() == null) {
                    this.K = true;
                    this.f91282J = false;
                    return;
                }
                K7();
                ((o1) B7()).k(this instanceof oc2.j ? (oc2.j) this : null);
                I7();
                r l73 = l7();
                if (l73 != null) {
                    l73.a(T6());
                    return;
                }
                return;
            }
            new hy.d().i();
            if (getView() != null) {
                L7();
                ac2.m B7 = B7();
                oc2.j jVar = this instanceof oc2.j ? (oc2.j) this : null;
                o1 o1Var = (o1) B7;
                if (jVar instanceof o) {
                    return;
                }
                Objects.toString(jVar);
                if (jVar != null) {
                    o1Var.d(jVar.hashCode());
                }
                bk.f.Y(o1Var.f1999b);
            }
        }
    }

    public final void R6(xj2.c disposable) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        xj2.b bVar = this.O;
        if (bVar != null) {
            bVar.a(disposable);
        }
    }

    public void R7(Navigation navigation) {
        Unit unit;
        this.I = navigation;
        Unit unit2 = null;
        if (E4() == null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                unit = null;
            } else if (arguments.containsKey("NAVIGATION_MODEL_BUNDLE_KEY")) {
                return;
            } else {
                unit = Unit.f80348a;
            }
            if (unit == null) {
                setArguments(new Bundle());
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.putParcelable("NAVIGATION_MODEL_BUNDLE_KEY", navigation);
            }
        }
        Navigation navigation2 = this.I;
        if (navigation2 != null) {
            b6().h("Navigation: " + navigation2.e1());
            unit2 = Unit.f80348a;
        }
        if (unit2 == null) {
            b6().h("Navigation: null");
        }
    }

    public void S6(yf0.h insetMode, View fragmentRootView) {
        Intrinsics.checkNotNullParameter(insetMode, "insetMode");
        Intrinsics.checkNotNullParameter(fragmentRootView, "fragmentRootView");
        c3.l(fragmentRootView, insetMode);
    }

    public void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
    }

    public ll1.a T6() {
        String n73 = n7();
        String q73 = q7();
        if (q73 == null) {
            q73 = "";
        }
        String str = q73;
        HashMap o03 = getO0();
        if (o03 == null) {
            o03 = bs1.c.o(new Pair[0]);
        }
        return new ll1.a(n73, str, o03, null, 8);
    }

    public final void T7(nc0.f fVar) {
        if (fVar instanceof nc0.a) {
            nc0.a simpleToolbarView = (nc0.a) fVar;
            Intrinsics.checkNotNullParameter(simpleToolbarView, "simpleToolbarView");
        } else if (fVar instanceof fo1.a) {
            S7((fo1.a) fVar);
        }
    }

    public final boolean U6() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            return a7().c(E4, lu1.a.MAIN_ACTIVITY) || a7().c(E4, lu1.a.CREATION_ACTIVITY);
        }
        return false;
    }

    public boolean U7() {
        return this instanceof PinCloseupFragment;
    }

    public final boolean V6() {
        oe0.h hVar = this.G;
        if (hVar != null) {
            return hVar.c();
        }
        return false;
    }

    public final void W6() {
        s sVar = this.f91293r;
        ScreenDescription u73 = u7();
        if (sVar == null || u73 == null) {
            return;
        }
        sVar.z(u73);
    }

    public final void X6(String bundleId, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        s sVar = this.f91293r;
        ScreenDescription u73 = u7();
        if (sVar == null || u73 == null) {
            return;
        }
        P6(bundleId, bundle);
        if (u73 != sVar.k()) {
            W6();
        } else {
            this.C.c(Boolean.TRUE);
        }
    }

    public void Y0() {
        getF103154e0();
    }

    public final void Y6(Function1 shouldDismissAt) {
        Intrinsics.checkNotNullParameter(shouldDismissAt, "shouldDismissAt");
        z(new com.pinterest.framework.screens.q(1, shouldDismissAt, this));
    }

    public boolean Z3(int i13) {
        return false;
    }

    public boolean Z6() {
        a80.a aVar = this.f91301z;
        if (aVar == null) {
            Intrinsics.r("inAppBrowserSettings");
            throw null;
        }
        if (!aVar.f1501a) {
            z70.f fVar = this.A;
            if (fVar == null) {
                Intrinsics.r("chromeSettings");
                throw null;
            }
            if (!fVar.f140994c) {
                return true;
            }
        }
        return false;
    }

    public final lu1.d a7() {
        lu1.d dVar = this.f91289n;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("activityIntentFactory");
        throw null;
    }

    @Override // jl1.a, com.pinterest.framework.screens.m
    public void activate() {
        super.activate();
        Q7(true);
    }

    public g0 b2() {
        return null;
    }

    public final tb0.h b6() {
        tb0.h hVar = this.f91299x;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("crashReporting");
        throw null;
    }

    public final f0 b7() {
        f0 f0Var = this.f91285j;
        if (f0Var != null) {
            return f0Var;
        }
        Intrinsics.r("basePinalyticsFactory");
        throw null;
    }

    public final r70.b c7() {
        r70.b bVar = this.f91286k;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("bottomNavBarState");
        throw null;
    }

    public void d2() {
        P7();
    }

    public g0 d7() {
        return null;
    }

    @Override // jl1.a, com.pinterest.framework.screens.m
    public void deactivate() {
        Q7(false);
        super.deactivate();
    }

    public void dismiss() {
        P7();
    }

    public w0 e() {
        return null;
    }

    public ViewStub e7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (ViewStub) mainView.findViewById(o60.a.content_pager_vw_stub);
    }

    public final w f7() {
        w wVar = this.f91298w;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    /* renamed from: g */
    public boolean getF103154e0() {
        J7();
        return false;
    }

    public View g7() {
        return null;
    }

    public i0 generateLoggingContext() {
        String q73 = q7();
        return new i0(E7(), D7(), C7(q73), d7(), null, null);
    }

    public final b60.b getActiveUserManager() {
        b60.b bVar = this.f91297v;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("activeUserManager");
        throw null;
    }

    /* renamed from: getViewType */
    public d4 getF52977d1() {
        return E7();
    }

    public Function1 h7() {
        return this.U;
    }

    public final fo1.a i7() {
        nc0.f fVar = this.R;
        if (fVar instanceof fo1.a) {
            return (fo1.a) fVar;
        }
        return null;
    }

    public View k7() {
        return null;
    }

    public r l7() {
        return null;
    }

    public LockableViewPager m7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        View findViewById = mainView.findViewById(o60.a.content_pager_vw);
        if (findViewById instanceof LockableViewPager) {
            return (LockableViewPager) findViewById;
        }
        return null;
    }

    public final String n7() {
        String obj;
        ScreenLocation f49939a;
        String name;
        Navigation navigation = this.I;
        if (navigation != null && (f49939a = navigation.getF49939a()) != null && (name = f49939a.getName()) != null) {
            return name;
        }
        a4 f52978e1 = getF52978e1();
        return (f52978e1 == null || (obj = f52978e1.toString()) == null) ? getF52977d1().toString() : obj;
    }

    public final ku1.a o7() {
        ku1.a aVar = this.f91292q;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("navigationManager");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.F = (rs1.a) j7(context, rs1.a.class);
        this.H = (ms1.b) j7(context, ms1.b.class);
        oe0.b bVar = (oe0.b) j7(context, oe0.b.class);
        Intrinsics.f(bVar);
        this.G = bVar.getVoiceMessageDispatcher();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle arguments;
        if (this.I == null && (arguments = getArguments()) != null) {
            R7((Navigation) arguments.getParcelable("NAVIGATION_MODEL_BUNDLE_KEY"));
        }
        super.onCreate(bundle);
        setRetainInstance(false);
        s7();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i13 = this.E;
        View frameLayout = i13 == 0 ? new FrameLayout(inflater.getContext()) : inflater.inflate(i13, viewGroup, false);
        Intrinsics.f(frameLayout);
        nc0.f x73 = x7(frameLayout);
        if (x73 != null) {
            this.R = x73;
            if (x73 instanceof GestaltToolbarImpl) {
                G7((GestaltToolbarImpl) x73);
            }
        }
        r l73 = l7();
        if (l73 != null) {
            l73.a(new ll1.b(q7()));
        }
        return frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (l7() != null) {
            M7();
        } else {
            s7().onDestroy();
        }
        ac2.m B7 = B7();
        oc2.j jVar = this instanceof oc2.j ? (oc2.j) this : null;
        o1 o1Var = (o1) B7;
        if (!(jVar instanceof o)) {
            Objects.toString(jVar);
            if (jVar != null) {
                o1Var.e(jVar.hashCode());
            }
        }
        ku1.i iVar = this.Q;
        if (iVar != null) {
            iVar.a();
        }
        this.Q = null;
        if (getContext() != null) {
            super.onDestroy();
        }
        int i13 = at1.d.f20439o;
        nl.b.e();
        Intrinsics.checkNotNullParameter(this, "object");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        xj2.b bVar = this.O;
        if (bVar != null) {
            bVar.dispose();
        }
        this.O = null;
        nc0.f fVar = this.R;
        if (fVar != null) {
            fVar.onDestroy();
        }
        this.R = null;
        this.P = false;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.F = null;
        this.G = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Q7(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rs1.a aVar = this.F;
        View view = getView();
        if (aVar == null || view == null) {
            return;
        }
        String name = getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        aVar.onViewTreeReady(view, name);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.K) {
            b6().h("onStart with pendingOnCreateActive: " + this);
            this.K = false;
            Q7(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        this.O = new xj2.b();
        nc0.f fVar = this.R;
        if (fVar != null) {
            T7(fVar);
        }
        m60.z0 z0Var = ff0.a.f62099a;
        ((m60.d) m60.d.a()).g();
    }

    public final uj2.q p7() {
        uj2.q qVar = this.f91300y;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("networkStateStream");
        throw null;
    }

    public void q6() {
        D5();
    }

    public String q7() {
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.getF49940b();
        }
        return null;
    }

    public List r7() {
        return null;
    }

    public final d0 s7() {
        d0 d0Var = this.N;
        if (d0Var != null) {
            return d0Var;
        }
        j0 a13 = ((nx.m) b7()).a(this);
        this.N = a13;
        return a13;
    }

    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        if (Intrinsics.d(pinalytics, this.N)) {
            return;
        }
        d0 d0Var = this.N;
        if (d0Var != null) {
            d0Var.onDestroy();
        }
        this.N = pinalytics;
    }

    /* renamed from: t5 */
    public HashMap getF63135d0() {
        return null;
    }

    public final t0 t7() {
        t0 t0Var = this.f91295t;
        if (t0Var != null) {
            return t0Var;
        }
        Intrinsics.r("pinalyticsV2");
        throw null;
    }

    public final ScreenDescription u7() {
        ScreenDescription screenDescription;
        s sVar = this.f91293r;
        if (sVar == null || (screenDescription = this.f76937a) == null) {
            return null;
        }
        ScreenDescription n13 = sVar.n(screenDescription);
        return n13 != null ? n13 : screenDescription;
    }

    public y32.f v7() {
        return y32.f.CLOSEUP_LONGPRESS;
    }

    public final bz.i w7() {
        bz.i iVar = this.f91288m;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.r("timeSpentLoggingManager");
        throw null;
    }

    @Override // jl1.a, com.pinterest.framework.screens.m
    public final void x3(Context activity, ScreenDescription screenDescription, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        Bundle f49207c = screenDescription.getF49207c();
        f49207c.setClassLoader(ScreenDescription.class.getClassLoader());
        R7((Navigation) f49207c.getParcelable("NAVIGATION_MODEL_BUNDLE_KEY"));
        super.x3(activity, screenDescription, bundle);
    }

    public nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(o60.a.toolbar);
    }

    public void y1(Function1 shouldStopDismissingAt, String bundleId, Bundle bundle) {
        Intrinsics.checkNotNullParameter(shouldStopDismissingAt, "shouldStopDismissingAt");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        s sVar = this.f91293r;
        ScreenDescription u73 = u7();
        if (sVar == null || u73 == null) {
            return;
        }
        sVar.B(u73, new aw0.j(this, bundleId, bundle, shouldStopDismissingAt, 24));
    }

    public int y7() {
        return 0;
    }

    @Override // ku1.k
    public void z(Function1 shouldStopDismissingAt) {
        Intrinsics.checkNotNullParameter(shouldStopDismissingAt, "shouldStopDismissingAt");
        s sVar = this.f91293r;
        ScreenDescription u73 = u7();
        if (sVar == null || u73 == null) {
            return;
        }
        sVar.B(u73, new al1.j(2, shouldStopDismissingAt));
    }

    public final d1 z7() {
        d1 d1Var = this.f91296u;
        if (d1Var != null) {
            return d1Var;
        }
        Intrinsics.r("trackingParamAttacher");
        throw null;
    }
}
