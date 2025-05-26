package y30;

import kotlin.jvm.internal.Intrinsics;
import pc.t0;

/* loaded from: classes5.dex */
public final class o implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f136760a;

    public o(d dVar) {
        this.f136760a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f136760a, ((o) obj).f136760a);
    }

    public final int hashCode() {
        d dVar = this.f136760a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public final String toString() {
        return "Data(v3RecommendedTodayArticlesQuery=" + this.f136760a + ")";
    }
}
