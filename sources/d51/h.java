package d51;

import i32.y0;
import j51.d0;
import kotlin.jvm.internal.Intrinsics;
import qz.f0;

/* loaded from: classes5.dex */
public final class h extends com.pinterest.framework.multisection.datasource.pagedlist.c implements c51.d {
    public final c51.e L;
    public final g51.f M;
    public boolean N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String userId, c51.e listener, g51.f environment, nr0.l viewBinderDelegate) {
        super(a.a.p(new StringBuilder("users/"), userId, "/boardless/pins/"), viewBinderDelegate, null, null, null, new ke0.a[]{gh0.b.R(), gh0.b.N()}, null, null, null, 0L, null, 8156);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        this.L = listener;
        this.M = environment;
        f0 f0Var = new f0();
        f0Var.e("page_size", environment.f63606f.d());
        f0Var.e("fields", n00.b.a(n00.c.BASE_PIN_FEED));
        this.f49121k = f0Var;
        o(3128342, new j51.k(this));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        if (i13 == 3128342) {
            return true;
        }
        return this.E.f(i13);
    }

    public final void f0() {
        rg0.s sVar = this.M.f63607g;
        y0 placement = y0.ANDROID_USER_PROFILE_TAKEOVER;
        dh0.d dVar = (dh0.d) sVar;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(placement, "placement");
        rg0.n b13 = dVar.b(placement);
        if (b13 == null) {
            return;
        }
        P(0, new f51.a(b13));
        g51.n nVar = (g51.n) this.L;
        if (nVar.isBound()) {
            ((d0) ((c51.f) nVar.getView())).D8();
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        if (getItem(i13) instanceof f51.a) {
            return 3128342;
        }
        return this.E.getItemViewType(i13);
    }

    @Override // wt1.b
    public final boolean i() {
        g51.n nVar = (g51.n) this.L;
        return nVar.F3() || nVar.K == null;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean n0(int i13) {
        if (getItem(i13) instanceof f51.a) {
            return true;
        }
        return super.n0(i13);
    }
}
