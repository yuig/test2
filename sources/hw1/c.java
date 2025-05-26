package hw1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final gw1.g f70472a;

    /* renamed from: b, reason: collision with root package name */
    public final List f70473b;

    /* renamed from: c, reason: collision with root package name */
    public final ww1.c f70474c;

    public c(gw1.g adapter, List metrics, ww1.c currentMetricType) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(currentMetricType, "currentMetricType");
        this.f70472a = adapter;
        this.f70473b = metrics;
        this.f70474c = currentMetricType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f70472a, cVar.f70472a) && Intrinsics.d(this.f70473b, cVar.f70473b) && this.f70474c == cVar.f70474c;
    }

    public final int hashCode() {
        return this.f70474c.hashCode() + ep.b.c(this.f70473b, this.f70472a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MetricsLoaded(adapter=" + this.f70472a + ", metrics=" + this.f70473b + ", currentMetricType=" + this.f70474c + ")";
    }
}
