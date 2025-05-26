package jx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final gx1.e f77681a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f77682b;

    public d(gx1.e data, boolean z13) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f77681a = data;
        this.f77682b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f77681a, dVar.f77681a) && this.f77682b == dVar.f77682b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77682b) + (this.f77681a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(data=" + this.f77681a + ", isDataAvailable=" + this.f77682b + ")";
    }
}
