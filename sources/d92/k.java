package d92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements z {

    /* renamed from: a, reason: collision with root package name */
    public final String f54156a;

    /* renamed from: b, reason: collision with root package name */
    public final long f54157b;

    public k(String pinId, long j13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f54156a = pinId;
        this.f54157b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f54156a, kVar.f54156a) && this.f54157b == kVar.f54157b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f54157b) + (this.f54156a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Initialize(pinId=");
        sb3.append(this.f54156a);
        sb3.append(", startTimeNs=");
        return a.a.o(sb3, this.f54157b, ")");
    }
}
