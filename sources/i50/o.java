package i50;

import kotlin.jvm.internal.Intrinsics;
import pc.t0;

/* loaded from: classes5.dex */
public final class o implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f71560a;

    public o(l lVar) {
        this.f71560a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f71560a, ((o) obj).f71560a);
    }

    public final int hashCode() {
        l lVar = this.f71560a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public final String toString() {
        return "Data(v3PollDownloadIdeaPinQuery=" + this.f71560a + ")";
    }
}
