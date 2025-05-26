package jx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final gx1.e f77685a;

    public h(gx1.e data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f77685a = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f77685a, ((h) obj).f77685a);
    }

    public final int hashCode() {
        return this.f77685a.hashCode();
    }

    public final String toString() {
        return "OnDataFetched(data=" + this.f77685a + ")";
    }
}
