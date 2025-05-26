package q01;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.l2;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import de1.d0;
import de1.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.k2;
import oi.p6;
import v.c1;
import zd1.e0;

/* loaded from: classes5.dex */
public final class l implements ov1.b {

    /* renamed from: a, reason: collision with root package name */
    public final i01.t f101797a;

    /* renamed from: b, reason: collision with root package name */
    public final View f101798b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f101799c;

    /* renamed from: d, reason: collision with root package name */
    public final i01.z f101800d;

    /* renamed from: e, reason: collision with root package name */
    public final ar0.t f101801e;

    /* renamed from: f, reason: collision with root package name */
    public final Activity f101802f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f101803g;

    /* renamed from: h, reason: collision with root package name */
    public final uk1.d f101804h;

    /* renamed from: i, reason: collision with root package name */
    public final uj2.q f101805i;

    /* renamed from: j, reason: collision with root package name */
    public final m60.w f101806j;

    /* renamed from: k, reason: collision with root package name */
    public final int f101807k;

    /* renamed from: l, reason: collision with root package name */
    public final k2 f101808l;

    /* renamed from: m, reason: collision with root package name */
    public final vy.m f101809m;

    /* renamed from: n, reason: collision with root package name */
    public final b60.b f101810n;

    /* renamed from: o, reason: collision with root package name */
    public final lb0.q f101811o;

    /* renamed from: p, reason: collision with root package name */
    public final hs.d f101812p;

    /* renamed from: q, reason: collision with root package name */
    public c1 f101813q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.k f101814r;

    /* renamed from: s, reason: collision with root package name */
    public ov1.k f101815s;

    /* renamed from: t, reason: collision with root package name */
    public String f101816t;

    /* renamed from: u, reason: collision with root package name */
    public d0 f101817u;

    /* renamed from: v, reason: collision with root package name */
    public ov1.d f101818v;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f101819w;

    /* renamed from: x, reason: collision with root package name */
    public OneBarContainer f101820x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f101821y;

    /* renamed from: z, reason: collision with root package name */
    public final xk2.k f101822z;

    public l(i01.t pinCloseupView, View fragmentView, RecyclerView closeupRecyclerView, i01.z pinCloseupScrollObservable, ar0.t recyclerViewScrollObservable, FragmentActivity activity, Context context, uk1.d presenterPinalytics, uj2.q networkStateStream, m60.w eventManager, int i13, k2 oneBarLibraryExperiments, vy.m analyticsApi, b60.b activeUserManager, lb0.q prefsManagerPersisted, hs.d moduleViewabilityHelper) {
        Intrinsics.checkNotNullParameter(pinCloseupView, "pinCloseupView");
        Intrinsics.checkNotNullParameter(fragmentView, "fragmentView");
        Intrinsics.checkNotNullParameter(closeupRecyclerView, "closeupRecyclerView");
        Intrinsics.checkNotNullParameter(pinCloseupScrollObservable, "pinCloseupScrollObservable");
        Intrinsics.checkNotNullParameter(recyclerViewScrollObservable, "recyclerViewScrollObservable");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(oneBarLibraryExperiments, "oneBarLibraryExperiments");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(moduleViewabilityHelper, "moduleViewabilityHelper");
        this.f101797a = pinCloseupView;
        this.f101798b = fragmentView;
        this.f101799c = closeupRecyclerView;
        this.f101800d = pinCloseupScrollObservable;
        this.f101801e = recyclerViewScrollObservable;
        this.f101802f = activity;
        this.f101803g = context;
        this.f101804h = presenterPinalytics;
        this.f101805i = networkStateStream;
        this.f101806j = eventManager;
        this.f101807k = i13;
        this.f101808l = oneBarLibraryExperiments;
        this.f101809m = analyticsApi;
        this.f101810n = activeUserManager;
        this.f101811o = prefsManagerPersisted;
        this.f101812p = moduleViewabilityHelper;
        xk2.n nVar = xk2.n.NONE;
        this.f101814r = xk2.m.a(nVar, new j(this, 0));
        this.f101819w = new Handler(Looper.getMainLooper());
        this.f101822z = xk2.m.a(nVar, new j(this, 1));
    }

    public final void a(String pinId, d0 listener) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ov1.k kVar = this.f101815s;
        if (kVar != null) {
            kVar.b(pinId, listener);
        } else {
            this.f101816t = pinId;
            this.f101817u = listener;
        }
    }

    public final int b() {
        boolean a13 = this.f101812p.a();
        View view = this.f101798b;
        if (!a13) {
            return view.getResources().getDimensionPixelSize(n80.a.related_pins_filters_carousel_height);
        }
        return ((Number) this.f101822z.getValue()).intValue() + view.getResources().getDimensionPixelSize(n80.a.related_pins_filters_carousel_height);
    }

    public final void c() {
        if (this.f101815s == null) {
            View inflate = ((ViewStub) this.f101798b.findViewById(n80.c.pin_closeup_one_bar_view_stub)).inflate();
            Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.oneBarLibrary.container.view.OneBarContainer");
            this.f101820x = (OneBarContainer) inflate;
            ov1.f fVar = new ov1.f(0, null, 7);
            ov1.e eVar = ov1.e.MULTIPLE_DESELECTABLE;
            r0 r0Var = r0.PIN_CLOSEUP;
            ov1.k kVar = new ov1.k(this.f101803g, this.f101798b, fVar, this.f101804h, this.f101805i, this.f101806j, true, this.f101807k, this.f101809m, this.f101810n, this.f101811o, this.f101808l, eVar, r0Var, 237568);
            ov1.d dVar = this.f101818v;
            if (dVar != null) {
                kVar.k(dVar);
            }
            String str = this.f101816t;
            d0 d0Var = this.f101817u;
            if (str != null && d0Var != null) {
                kVar.b(str, d0Var);
            }
            Intrinsics.checkNotNullParameter(this, "listener");
            OneBarContainer oneBarContainer = kVar.f97742j;
            oneBarContainer.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            if (oneBarContainer.f49981e == null) {
                oneBarContainer.f49981e = new ArrayList();
            }
            ArrayList arrayList = oneBarContainer.f49981e;
            if (arrayList != null) {
                arrayList.add(this);
            }
            this.f101815s = kVar;
            k listener = new k(this, 0);
            PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) this.f101800d;
            pinCloseupFragment.getClass();
            Intrinsics.checkNotNullParameter(listener, "listener");
            pinCloseupFragment.N1.add(listener);
            this.f101801e.addScrollListener(listener);
        }
    }

    public final void d() {
        if (this.f101821y && this.f101812p.a() && !pk.a0.q0(this.f101803g)) {
            Window window = this.f101802f.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            pk.a0.i1(window);
        }
    }

    public final void e() {
        i01.t tVar = this.f101797a;
        ((PinCloseupFragment) tVar).G9();
        ((PinCloseupFragment) tVar).J9(yk1.i.LOADING);
        b2 b2Var = this.f101799c.f19240m;
        if ((b2Var instanceof os.f ? (os.f) b2Var : null) != null) {
            hf0.b.d(this.f101802f);
        }
    }

    public final void f(int i13) {
        l2 l2Var = this.f101799c.f19242n;
        PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
        if (pinterestStaggeredGridLayoutManager == null) {
            return;
        }
        pinterestStaggeredGridLayoutManager.Z0();
        RecyclerView recyclerView = this.f101799c;
        q5.x.a(recyclerView, new p6(recyclerView, this, pinterestStaggeredGridLayoutManager, i13, 2));
    }

    public final void g() {
        e0 e0Var;
        ov1.k kVar = this.f101815s;
        if (kVar == null || (e0Var = kVar.f97749q) == null) {
            return;
        }
        e0Var.f141708c.clear();
    }

    public final void h(c1 c1Var) {
        this.f101813q = c1Var;
    }

    public final void i(ov1.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ov1.k kVar = this.f101815s;
        if (kVar == null) {
            this.f101818v = listener;
        } else if (kVar != null) {
            kVar.k(listener);
        }
    }

    public final void j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ov1.k kVar = this.f101815s;
        if (kVar != null) {
            kVar.g(items);
        }
    }

    @Override // ov1.b
    public final void onScrollStarted() {
        this.f101806j.d(new ls1.l(ls1.k.DISABLE));
    }

    @Override // ov1.b
    public final void z1() {
        this.f101806j.d(new ls1.l(ls1.k.ENABLE));
    }
}
