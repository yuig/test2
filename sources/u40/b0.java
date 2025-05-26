package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final t f120295a;

    public b0(t tVar) {
        this.f120295a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f120295a, ((b0) obj).f120295a);
    }

    public final int hashCode() {
        t tVar = this.f120295a;
        if (tVar == null) {
            return 0;
        }
        return tVar.hashCode();
    }

    public final String toString() {
        return "Data(v3GetCurrentUserHandlerQuery=" + this.f120295a + ")";
    }
}
