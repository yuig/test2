package wb1;

import com.pinterest.api.model.qv;
import com.pinterest.feature.settings.notifications.y0;
import jk2.j1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import x02.x2;

/* loaded from: classes5.dex */
public final class r extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final x2 f129051k;

    /* renamed from: l, reason: collision with root package name */
    public final yk1.v f129052l;

    /* renamed from: m, reason: collision with root package name */
    public final qv f129053m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x2 userRepository, yk1.a resources, qv group) {
        super(null);
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(group, "group");
        this.f129051k = userRepository;
        this.f129052l = resources;
        this.f129053m = group;
        o(1, new s91.b(15));
        o(17, new s91.b(16));
        o(0, new s91.b(17));
        o(22, new s91.b(18));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return ((n) CollectionsKt.F0(this.f135191h).get(i13)).f129039e;
    }

    @Override // xk1.c
    public final uj2.q k() {
        j1 j1Var = new j1(this.f129051k.f0().f0().Q("me").I(1L), new t81.a(23, new y0(this, 13)), 0);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }
}
