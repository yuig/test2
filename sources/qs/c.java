package qs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f105067a;

    /* renamed from: b, reason: collision with root package name */
    public final long f105068b;

    public c(String pinId, long j13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f105067a = pinId;
        this.f105068b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f105067a, cVar.f105067a) && this.f105068b == cVar.f105068b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f105068b) + (this.f105067a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImpressionEnded(pinId=");
        sb3.append(this.f105067a);
        sb3.append(", endTime=");
        return a.a.o(sb3, this.f105068b, ")");
    }
}
