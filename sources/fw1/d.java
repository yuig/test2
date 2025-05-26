package fw1;

import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes4.dex */
public final class d extends t {

    /* renamed from: a, reason: collision with root package name */
    public final px.a f63050a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(px.c analyticsRepository, uk1.d presenterPinalytics, q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f63050a = analyticsRepository;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        c view = (c) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((i) view).f63060m = this;
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        c view = (c) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((i) view).f63060m = this;
    }
}
