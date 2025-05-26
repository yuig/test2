package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f57346a;

    public g(a aVar) {
        this.f57346a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f57346a, ((g) obj).f57346a);
    }

    public final int hashCode() {
        a aVar = this.f57346a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.f57346a + ")";
    }
}
