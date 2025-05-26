package om0;

import kotlin.jvm.internal.Intrinsics;
import ni1.t2;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final ao2.j0 f96485a;

    /* renamed from: b, reason: collision with root package name */
    public final qa2.j0 f96486b;

    /* renamed from: c, reason: collision with root package name */
    public final t2 f96487c;

    /* renamed from: d, reason: collision with root package name */
    public final wa2.m f96488d;

    /* renamed from: e, reason: collision with root package name */
    public final nx.d0 f96489e;

    public e0(androidx.lifecycle.u scope, qa2.j0 cellFactory, t2 viewModelFactory, wa2.m featureConfig, nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(cellFactory, "cellFactory");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f96485a = scope;
        this.f96486b = cellFactory;
        this.f96487c = viewModelFactory;
        this.f96488d = featureConfig;
        this.f96489e = pinalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.f96485a, e0Var.f96485a) && Intrinsics.d(this.f96486b, e0Var.f96486b) && Intrinsics.d(this.f96487c, e0Var.f96487c) && Intrinsics.d(this.f96488d, e0Var.f96488d) && Intrinsics.d(this.f96489e, e0Var.f96489e);
    }

    public final int hashCode() {
        return this.f96489e.hashCode() + ((this.f96488d.hashCode() + ((this.f96487c.hashCode() + ((this.f96486b.hashCode() + (this.f96485a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PinRepCreation(scope=" + this.f96485a + ", cellFactory=" + this.f96486b + ", viewModelFactory=" + this.f96487c + ", featureConfig=" + this.f96488d + ", pinalytics=" + this.f96489e + ")";
    }
}
