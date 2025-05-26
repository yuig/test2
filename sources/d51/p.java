package d51;

import j51.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yk1.v;

/* loaded from: classes5.dex */
public final class p extends xk1.c implements nr0.j {

    /* renamed from: k, reason: collision with root package name */
    public final String f53710k;

    /* renamed from: l, reason: collision with root package name */
    public final k22.m f53711l;

    /* renamed from: m, reason: collision with root package name */
    public final int f53712m;

    /* renamed from: n, reason: collision with root package name */
    public final Function0 f53713n;

    /* renamed from: o, reason: collision with root package name */
    public final Function0 f53714o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String userId, k22.m userService, g51.l userHasUnorganizedIdeas, g51.l totalNumUnorganizedIdeas, g51.l onBound, g51.m onIdeaTapped, v resources, g51.l onCtaTap) {
        super(null);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(userHasUnorganizedIdeas, "userHasUnorganizedIdeas");
        Intrinsics.checkNotNullParameter(totalNumUnorganizedIdeas, "totalNumUnorganizedIdeas");
        Intrinsics.checkNotNullParameter(onBound, "onBound");
        Intrinsics.checkNotNullParameter(onIdeaTapped, "onIdeaTapped");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(onCtaTap, "onCtaTap");
        this.f53710k = userId;
        this.f53711l = userService;
        this.f53712m = 16;
        this.f53713n = userHasUnorganizedIdeas;
        this.f53714o = totalNumUnorganizedIdeas;
        o(7654321, new f0(resources, onBound, onIdeaTapped, onCtaTap));
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
        return 7654321;
    }

    @Override // wt1.b
    public final boolean i() {
        return ((Boolean) this.f53713n.invoke()).booleanValue();
    }

    @Override // xk1.c
    public final uj2.q k() {
        uj2.q u13 = this.f53711l.k(this.f53710k, String.valueOf(this.f53712m), n00.b.a(n00.c.BASE_PIN_FEED)).k(new a(2, new j41.i(this, 6))).r(tk2.e.f118017c).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }
}
