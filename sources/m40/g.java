package m40;

import kotlin.jvm.internal.Intrinsics;
import pc.t0;

/* loaded from: classes5.dex */
public final class g implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f85825a;

    public g(d dVar) {
        this.f85825a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f85825a, ((g) obj).f85825a);
    }

    public final int hashCode() {
        d dVar = this.f85825a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public final String toString() {
        return "Data(v3GetCountriesListQuery=" + this.f85825a + ")";
    }
}
