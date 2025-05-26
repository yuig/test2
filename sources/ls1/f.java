package ls1;

import df.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends j1 {

    /* renamed from: i, reason: collision with root package name */
    public final String f84689i;

    /* renamed from: j, reason: collision with root package name */
    public final long f84690j;

    public f(String pinId, long j13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f84689i = pinId;
        this.f84690j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f84689i, fVar.f84689i) && this.f84690j == fVar.f84690j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f84690j) + (this.f84689i.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DirectToOffsitePinClickthroughEndEvent(pinId=");
        sb3.append(this.f84689i);
        sb3.append(", endTimeNs=");
        return a.a.o(sb3, this.f84690j, ")");
    }
}
