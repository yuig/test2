package hw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ww1.c f70484a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70485b;

    public l(ww1.c metricType, String id3) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f70484a = metricType;
        this.f70485b = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f70484a == lVar.f70484a && Intrinsics.d(this.f70485b, lVar.f70485b);
    }

    public final int hashCode() {
        return this.f70485b.hashCode() + (this.f70484a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateSelectedMetric(metricType=" + this.f70484a + ", id=" + this.f70485b + ")";
    }
}
