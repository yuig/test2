package nx;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final xu1.y f92485a;

    /* renamed from: b, reason: collision with root package name */
    public final ao2.j0 f92486b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f92487c;

    /* renamed from: d, reason: collision with root package name */
    public xu1.i f92488d;

    public z(xu1.y networkTypeMonitor, ao2.j0 scope, f0 pinalyticsFactory) {
        Intrinsics.checkNotNullParameter(networkTypeMonitor, "networkTypeMonitor");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f92485a = networkTypeMonitor;
        this.f92486b = scope;
        this.f92487c = ((m) pinalyticsFactory).a(new w());
        this.f92488d = xu1.i.NONE;
    }

    public final void a() {
        kotlin.jvm.internal.j.z(this.f92486b, null, null, new y(this, null), 3);
    }
}
