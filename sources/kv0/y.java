package kv0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f81025a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81026b;

    public y(String pinId, boolean z13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f81025a = pinId;
        this.f81026b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f81025a, yVar.f81025a) && this.f81026b == yVar.f81026b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f81026b) + (this.f81025a.hashCode() * 31);
    }

    public final String toString() {
        return "ProductTagConfig(pinId=" + this.f81025a + ", isInvisibleTag=" + this.f81026b + ")";
    }
}
