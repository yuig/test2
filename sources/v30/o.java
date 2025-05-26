package v30;

import kotlin.jvm.internal.Intrinsics;
import pc.i0;

/* loaded from: classes3.dex */
public final class o implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f123945a;

    public o(l lVar) {
        this.f123945a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f123945a, ((o) obj).f123945a);
    }

    public final int hashCode() {
        l lVar = this.f123945a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public final String toString() {
        return "Data(v3UnfollowUserMethodMutation=" + this.f123945a + ")";
    }
}
