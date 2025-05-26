package qs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f105069a;

    /* renamed from: b, reason: collision with root package name */
    public final long f105070b;

    public d(String pinId, long j13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f105069a = pinId;
        this.f105070b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f105069a, dVar.f105069a) && this.f105070b == dVar.f105070b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f105070b) + (this.f105069a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImpressionStarted(pinId=");
        sb3.append(this.f105069a);
        sb3.append(", time=");
        return a.a.o(sb3, this.f105070b, ")");
    }
}
