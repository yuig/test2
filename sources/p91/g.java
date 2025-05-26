package p91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends yk1.t {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f99283a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(uk1.d pinalytics, uj2.q networkStateStream, m60.w eventManager) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f99283a = eventManager;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        l91.c view = (l91.c) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((k91.g) view).f78832l0 = this;
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        l91.c view = (l91.c) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((k91.g) view).f78832l0 = this;
    }
}
