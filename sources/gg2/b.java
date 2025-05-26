package gg2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Long f64973a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f64974b;

    public b(Long l13, Long l14) {
        this.f64973a = l13;
        this.f64974b = l14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f64973a, bVar.f64973a) && Intrinsics.d(this.f64974b, bVar.f64974b);
    }

    public final int hashCode() {
        Long l13 = this.f64973a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        Long l14 = this.f64974b;
        return hashCode + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        return "DiskUsage(appDiskUsage=" + this.f64973a + ", deviceDiskFree=" + this.f64974b + ')';
    }
}
