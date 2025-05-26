package x81;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends uk1.d {

    /* renamed from: g, reason: collision with root package name */
    public f42.c f134256g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(nx.f0 pinalyticsFactory) {
        super(pinalyticsFactory);
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f134256g = f42.c.LIPCOLOR;
    }

    @Override // uk1.d
    public final h32.g0 f() {
        f42.c cVar = this.f134256g;
        int i13 = cVar == null ? -1 : m.f134253a[cVar.ordinal()];
        if (i13 == 1) {
            return h32.g0.VIRTUAL_TRY_ON_LIPSTICK;
        }
        if (i13 != 2) {
            return null;
        }
        return h32.g0.VIRTUAL_TRY_ON_EYESHADOW;
    }
}
