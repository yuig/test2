package qs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f105065a;

    /* renamed from: b, reason: collision with root package name */
    public final long f105066b;

    public b(String pinId, long j13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f105065a = pinId;
        this.f105066b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f105065a, bVar.f105065a) && this.f105066b == bVar.f105066b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f105066b) + (this.f105065a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImpressionBtrReached(pinId=");
        sb3.append(this.f105065a);
        sb3.append(", time=");
        return a.a.o(sb3, this.f105066b, ")");
    }
}
