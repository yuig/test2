package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f57345a;

    public f1(l lVar) {
        this.f57345a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && Intrinsics.d(this.f57345a, ((f1) obj).f57345a);
    }

    public final int hashCode() {
        l lVar = this.f57345a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public final String toString() {
        return "Data(v3SearchUsersWithStoriesQuery=" + this.f57345a + ")";
    }
}
