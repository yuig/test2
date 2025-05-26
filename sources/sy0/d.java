package sy0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import j40.x;
import kotlin.jvm.internal.Intrinsics;
import pc.q0;
import tk2.e;
import uj2.q;
import vc.f;

/* loaded from: classes5.dex */
public final class d extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final oc.c f115644k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(oc.c apolloClient, wy0.d listener) {
        super(null);
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f115644k = apolloClient;
        o(0, new vy0.b(listener));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 0;
    }

    @Override // xk1.c
    public final q k() {
        oc.a c13 = this.f115644k.c(new x(new q0(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY))));
        d7.b.E(c13, f.NetworkOnly);
        q u13 = com.bumptech.glide.d.u0(c13).r(e.f118017c).k(new wv0.a(11, c.f115643i)).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }
}
