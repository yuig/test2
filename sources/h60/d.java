package h60;

import g51.l;
import k22.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import uj2.q;
import zy.q0;

/* loaded from: classes5.dex */
public final class d extends xk1.c implements nr0.j {

    /* renamed from: k, reason: collision with root package name */
    public final m f67787k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f67788l;

    /* renamed from: m, reason: collision with root package name */
    public final String f67789m;

    /* renamed from: n, reason: collision with root package name */
    public final Function0 f67790n;

    /* renamed from: o, reason: collision with root package name */
    public final Function0 f67791o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f67792p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f67793q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m userService, d0 pinalytics, String str, Integer num, l isClusterAvailable, l onLoad, q0 unscopedPinalyticsSEPFactory) {
        super(null);
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(isClusterAvailable, "isClusterAvailable");
        Intrinsics.checkNotNullParameter(onLoad, "onLoad");
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        this.f67787k = userService;
        this.f67788l = pinalytics;
        this.f67789m = str;
        this.f67790n = isClusterAvailable;
        this.f67791o = onLoad;
        this.f67792p = true;
        o(2770202, new c(num, pinalytics, unscopedPinalyticsSEPFactory));
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        return true;
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 2770202;
    }

    @Override // wt1.b
    public final boolean i() {
        return ((Boolean) this.f67790n.invoke()).booleanValue();
    }

    @Override // xk1.c
    public final q k() {
        q u13 = this.f67787k.m(true, 10).r(tk2.e.f118017c).k(new ep.a(24, new mz.c(this, 7))).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }
}
