package bx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final String f24107a;

    public i(String metricType) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        this.f24107a = metricType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f24107a, ((i) obj).f24107a);
    }

    public final int hashCode() {
        return this.f24107a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NavigateToGraph(metricType="), this.f24107a, ")");
    }
}
