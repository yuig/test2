package v30;

import kotlin.jvm.internal.Intrinsics;
import pc.i0;

/* loaded from: classes3.dex */
public final class g implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f123930a;

    public g(d dVar) {
        this.f123930a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f123930a, ((g) obj).f123930a);
    }

    public final int hashCode() {
        d dVar = this.f123930a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public final String toString() {
        return "Data(v3FollowUserMethodMutation=" + this.f123930a + ")";
    }
}
