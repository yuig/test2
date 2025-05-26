package j30;

import kotlin.jvm.internal.Intrinsics;
import pc.t0;

/* loaded from: classes.dex */
public final class g implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f74552a;

    public g(d dVar) {
        this.f74552a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f74552a, ((g) obj).f74552a);
    }

    public final int hashCode() {
        d dVar = this.f74552a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public final String toString() {
        return "Data(v3GetUserHandlerQuery=" + this.f74552a + ")";
    }
}
