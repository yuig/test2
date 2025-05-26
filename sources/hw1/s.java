package hw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final ww1.c f70490a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70491b;

    public s(ww1.c metricType, String id3) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f70490a = metricType;
        this.f70491b = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f70490a == sVar.f70490a && Intrinsics.d(this.f70491b, sVar.f70491b);
    }

    public final int hashCode() {
        return this.f70491b.hashCode() + (this.f70490a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateSelectedMetric(metricType=" + this.f70490a + ", id=" + this.f70491b + ")";
    }
}
