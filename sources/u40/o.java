package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final n f120409a;

    public o(n nVar) {
        this.f120409a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f120409a, ((o) obj).f120409a);
    }

    public final int hashCode() {
        n nVar = this.f120409a;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    public final String toString() {
        return "Data(v3EditSettingsHandlerMutation=" + this.f120409a + ")";
    }
}
