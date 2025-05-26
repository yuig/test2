package nx;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a1 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f92374a;

    public a1(e0 pinalyticsEventManager) {
        Intrinsics.checkNotNullParameter(pinalyticsEventManager, "pinalyticsEventManager");
        this.f92374a = pinalyticsEventManager;
    }

    @Override // nx.a
    public final h32.i0 generateLoggingContext() {
        a d2 = ((o0) this.f92374a).d();
        if (d2 != null) {
            return d2.generateLoggingContext();
        }
        return null;
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        a d2 = ((o0) this.f92374a).d();
        if (d2 != null) {
            return d2.getUniqueScreenKey();
        }
        return null;
    }
}
