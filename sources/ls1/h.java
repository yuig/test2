package ls1;

import df.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends j1 {

    /* renamed from: i, reason: collision with root package name */
    public final String f84693i;

    /* renamed from: j, reason: collision with root package name */
    public final long f84694j;

    public h(String pinId, long j13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f84693i = pinId;
        this.f84694j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f84693i, hVar.f84693i) && this.f84694j == hVar.f84694j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f84694j) + (this.f84693i.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinClickthroughStartEvent(pinId=");
        sb3.append(this.f84693i);
        sb3.append(", startTimeNs=");
        return a.a.o(sb3, this.f84694j, ")");
    }
}
