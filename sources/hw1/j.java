package hw1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final gw1.g f70480a;

    /* renamed from: b, reason: collision with root package name */
    public final List f70481b;

    /* renamed from: c, reason: collision with root package name */
    public final ww1.c f70482c;

    public j(gw1.g adapter, List metrics, ww1.c currentMetricType) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(currentMetricType, "currentMetricType");
        this.f70480a = adapter;
        this.f70481b = metrics;
        this.f70482c = currentMetricType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f70480a, jVar.f70480a) && Intrinsics.d(this.f70481b, jVar.f70481b) && this.f70482c == jVar.f70482c;
    }

    public final int hashCode() {
        return this.f70482c.hashCode() + ep.b.c(this.f70481b, this.f70480a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ProductTagsLoaded(adapter=" + this.f70480a + ", metrics=" + this.f70481b + ", currentMetricType=" + this.f70482c + ")";
    }
}
