package mc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f86930a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86931b;

    public f(String url, boolean z13) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f86930a = url;
        this.f86931b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f86930a, fVar.f86930a) && this.f86931b == fVar.f86931b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86931b) + (this.f86930a.hashCode() * 31);
    }

    public final String toString() {
        return "CacheKey(url=" + this.f86930a + ", isCloseup=" + this.f86931b + ")";
    }
}
