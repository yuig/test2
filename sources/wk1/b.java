package wk1;

import is1.s;
import is1.t;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import m60.h0;
import m60.u;
import m60.w;
import nx.d1;
import nx.o0;
import x02.i2;
import yk1.v;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public qa2.n f130114a;

    /* renamed from: b, reason: collision with root package name */
    public uk1.d f130115b;

    /* renamed from: c, reason: collision with root package name */
    public o0 f130116c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f130117d;

    /* renamed from: e, reason: collision with root package name */
    public w f130118e;

    /* renamed from: f, reason: collision with root package name */
    public hs1.q f130119f;

    /* renamed from: g, reason: collision with root package name */
    public ky.e f130120g;

    /* renamed from: h, reason: collision with root package name */
    public final v f130121h;

    /* renamed from: i, reason: collision with root package name */
    public sq0.f f130122i;

    /* renamed from: j, reason: collision with root package name */
    public sq0.m f130123j;

    /* renamed from: k, reason: collision with root package name */
    public i2 f130124k;

    /* renamed from: l, reason: collision with root package name */
    public final uj2.q f130125l;

    /* renamed from: m, reason: collision with root package name */
    public final es.h f130126m;

    /* renamed from: n, reason: collision with root package name */
    public final vr.a f130127n;

    /* renamed from: o, reason: collision with root package name */
    public final es.a f130128o;

    /* renamed from: p, reason: collision with root package name */
    public final s f130129p;

    public b(yk1.a viewResources, uj2.q connectivityObservable, uk1.d presenterPinalytics, d1 trackingParamAttacher, es.a adFormats, es.h adsCommonDisplay, vr.a adsCommonAnalytics, t pinSwipePreferences) {
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(connectivityObservable, "connectivityObservable");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
        Intrinsics.checkNotNullParameter(pinSwipePreferences, "pinSwipePreferences");
        this.f130121h = viewResources;
        Intrinsics.checkNotNullParameter(connectivityObservable, "<set-?>");
        this.f130125l = connectivityObservable;
        this.f130115b = presenterPinalytics;
        this.f130117d = trackingParamAttacher;
        Intrinsics.checkNotNullParameter(adFormats, "<set-?>");
        this.f130128o = adFormats;
        this.f130126m = adsCommonDisplay;
        this.f130127n = adsCommonAnalytics;
        Intrinsics.checkNotNullParameter(pinSwipePreferences, "<set-?>");
        this.f130129p = pinSwipePreferences;
    }

    public static void i(Class cls) {
        throw new IllegalStateException("DynamicGridPresenterParams REQUIRES a valid, non-null ".concat(cls.getSimpleName()));
    }

    public final c a() {
        if (this.f130119f == null) {
            this.f130119f = hs1.t.a();
        }
        if (this.f130118e == null) {
            this.f130118e = u.f85943a;
        }
        if (this.f130116c == null) {
            this.f130116c = o0.f92437i;
        }
        if (this.f130120g == null) {
            this.f130120g = new ky.f();
        }
        if (this.f130122i == null) {
            hs1.q qVar = this.f130119f;
            Intrinsics.f(qVar);
            this.f130122i = new sq0.f(qVar, new hf0.b(), new h0(hf0.b.q()), e0.b(new xq0.b(b(), this.f130126m)), 8);
        }
        if (this.f130114a == null) {
            i(qa2.n.class);
            throw null;
        }
        if (this.f130121h == null) {
            i(v.class);
            throw null;
        }
        if (this.f130124k == null) {
            i(i2.class);
            throw null;
        }
        if (this.f130115b == null) {
            i(uk1.d.class);
            throw null;
        }
        if (this.f130117d != null) {
            return new c(this);
        }
        i(d1.class);
        throw null;
    }

    public final es.a b() {
        es.a aVar = this.f130128o;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adFormats");
        throw null;
    }

    public final void c(w wVar) {
        this.f130118e = wVar;
    }

    public final void d(qa2.n nVar) {
        this.f130114a = nVar;
    }

    public final void e(ky.e eVar) {
        this.f130120g = eVar;
    }

    public final void f(i2 i2Var) {
        this.f130124k = i2Var;
    }

    public final void g(uk1.d dVar) {
        this.f130115b = dVar;
    }

    public final void h(sq0.m mVar) {
        this.f130123j = mVar;
    }
}
