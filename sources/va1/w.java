package va1;

import com.pinterest.api.model.wy0;
import java.util.List;
import jk2.k2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.n3;
import x02.x2;

/* loaded from: classes5.dex */
public final class w extends xk1.c {

    /* renamed from: x, reason: collision with root package name */
    public static final List f125256x = kotlin.collections.f0.j("DE", "AT");

    /* renamed from: k, reason: collision with root package name */
    public final x2 f125257k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f125258l;

    /* renamed from: m, reason: collision with root package name */
    public final n3 f125259m;

    /* renamed from: n, reason: collision with root package name */
    public final yk1.v f125260n;

    /* renamed from: o, reason: collision with root package name */
    public final m60.w f125261o;

    /* renamed from: p, reason: collision with root package name */
    public final nx.d0 f125262p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f125263q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f125264r;

    /* renamed from: s, reason: collision with root package name */
    public final np1.j f125265s;

    /* renamed from: t, reason: collision with root package name */
    public final z82.b f125266t;

    /* renamed from: u, reason: collision with root package name */
    public final k22.m f125267u;

    /* renamed from: v, reason: collision with root package name */
    public final lb0.o f125268v;

    /* renamed from: w, reason: collision with root package name */
    public Boolean f125269w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x2 userRepository, boolean z13, n3 experiments, yk1.v resources, m60.w eventManager, nx.d0 pinalytics, boolean z14, boolean z15, np1.j handshakeManager, z82.b targetHandshakeManager, k22.m userService, lb0.o preferencesManager) {
        super(null);
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
        Intrinsics.checkNotNullParameter(targetHandshakeManager, "targetHandshakeManager");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        this.f125257k = userRepository;
        this.f125258l = z13;
        this.f125259m = experiments;
        this.f125260n = resources;
        this.f125261o = eventManager;
        this.f125262p = pinalytics;
        this.f125263q = z14;
        this.f125264r = z15;
        this.f125265s = handshakeManager;
        this.f125266t = targetHandshakeManager;
        this.f125267u = userService;
        this.f125268v = preferencesManager;
        o(0, new s91.b(7));
        o(8, new s91.b(8));
        o(13, new s91.b(9));
        o(2, new s91.b(10));
        o(19, new h90.m(this, 21));
        o(20, new s91.b(11));
        if (experiments.a()) {
            o(23, new s91.b(12));
        }
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        Object obj = CollectionsKt.F0(this.f135191h).get(i13);
        e1 e1Var = obj instanceof e1 ? (e1) obj : null;
        if (e1Var != null) {
            return e1Var.getViewType();
        }
        throw new IllegalStateException("Item must be of type: ".concat(e1.class.getSimpleName()));
    }

    @Override // xk1.c
    public final uj2.q k() {
        k2 I = this.f125257k.d0().Q("me").I(1L);
        uj2.b0<wy0> D = this.f125267u.D("");
        uj2.a0 a0Var = tk2.e.f118017c;
        k2 I2 = D.r(a0Var).l(wj2.c.a()).u().I(1L);
        jk2.l1 A = new ol1.d(new a.z0(this, 16), 2).H(a0Var).A(wj2.c.a());
        androidx.appcompat.widget.q qVar = new androidx.appcompat.widget.q(new a.z0(v.f125250i, 17), 1);
        int i13 = uj2.h.f122339a;
        ck2.i.c(i13, "bufferSize");
        jk2.j1 j1Var = new jk2.j1(new jk2.h(new uj2.t[]{I, I2, A}, null, qVar, i13, 1), new t81.a(18, new q91.h(this, 25)), 0);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }
}
