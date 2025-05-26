package d51;

import kotlin.jvm.internal.Intrinsics;
import so.h2;
import uj2.b0;
import x02.x0;
import x02.x2;

/* loaded from: classes5.dex */
public final class d extends xk1.c implements nr0.j {

    /* renamed from: k, reason: collision with root package name */
    public final c51.e f53692k;

    /* renamed from: l, reason: collision with root package name */
    public final h51.a f53693l;

    /* renamed from: m, reason: collision with root package name */
    public final uk1.d f53694m;

    /* renamed from: n, reason: collision with root package name */
    public final uj2.q f53695n;

    /* renamed from: o, reason: collision with root package name */
    public final h2 f53696o;

    /* renamed from: p, reason: collision with root package name */
    public final x2 f53697p;

    /* renamed from: q, reason: collision with root package name */
    public final x0 f53698q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f53699r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c51.e listener, h51.a boardInvitesFeedRequest, uk1.d presenterPinalytics, uj2.q networkStateStream, h2 boardInviteProfileCellPresenterFactory, x2 userRepository, x0 boardRepository, boolean z13) {
        super(null);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(boardInvitesFeedRequest, "boardInvitesFeedRequest");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(boardInviteProfileCellPresenterFactory, "boardInviteProfileCellPresenterFactory");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        this.f53692k = listener;
        this.f53693l = boardInvitesFeedRequest;
        this.f53694m = presenterPinalytics;
        this.f53695n = networkStateStream;
        this.f53696o = boardInviteProfileCellPresenterFactory;
        this.f53697p = userRepository;
        this.f53698q = boardRepository;
        this.f53699r = z13;
        o(54, new h90.m(this, 15));
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        if (i13 == 54) {
            return true;
        }
        return this instanceof ah1.a;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 54;
    }

    @Override // wt1.b
    public final boolean i() {
        g51.n nVar = (g51.n) this.f53692k;
        return nVar.G3() && nVar.f63635o.c() && nVar.M;
    }

    @Override // xk1.c
    public final uj2.q k() {
        uj2.q u13 = ((b0) this.f53693l.prepare(new Object[0]).buildRequest()).l(wj2.c.a()).r(tk2.e.f118017c).k(new a(0, c.f53687j)).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }
}
