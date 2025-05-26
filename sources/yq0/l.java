package yq0;

import h32.f1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l implements se0.k {

    /* renamed from: a, reason: collision with root package name */
    public final se0.k f139714a;

    /* renamed from: b, reason: collision with root package name */
    public final nx.d0 f139715b;

    public l(se0.k listener, nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f139714a = listener;
        this.f139715b = pinalytics;
    }

    @Override // se0.k
    public final void V1() {
        this.f139715b.a(f1.PULL_TO_REFRESH, null, false, true);
        this.f139714a.V1();
    }
}
