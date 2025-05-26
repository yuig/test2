package ls1;

import df.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends j1 {

    /* renamed from: i, reason: collision with root package name */
    public final String f84691i;

    /* renamed from: j, reason: collision with root package name */
    public final long f84692j;

    public g(String pinId, long j13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f84691i = pinId;
        this.f84692j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f84691i, gVar.f84691i) && this.f84692j == gVar.f84692j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f84692j) + (this.f84691i.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinClickthroughEndEvent(pinId=");
        sb3.append(this.f84691i);
        sb3.append(", endTimeNs=");
        return a.a.o(sb3, this.f84692j, ")");
    }
}
