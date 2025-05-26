package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dc implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final yb f132244a;

    public dc(yb ybVar) {
        this.f132244a = ybVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dc) && Intrinsics.d(this.f132244a, ((dc) obj).f132244a);
    }

    public final int hashCode() {
        yb ybVar = this.f132244a;
        if (ybVar == null) {
            return 0;
        }
        return ybVar.hashCode();
    }

    public final String toString() {
        return "Data(v3GetUserBoardInviteQuery=" + this.f132244a + ")";
    }
}
