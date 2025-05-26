package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pd implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final od f133041a;

    public pd(od odVar) {
        this.f133041a = odVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd) && Intrinsics.d(this.f133041a, ((pd) obj).f133041a);
    }

    public final int hashCode() {
        od odVar = this.f133041a;
        if (odVar == null) {
            return 0;
        }
        return odVar.hashCode();
    }

    public final String toString() {
        return "Data(v3GetConversationQuery=" + this.f133041a + ")";
    }
}
