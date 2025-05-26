package y30;

import kotlin.jvm.internal.Intrinsics;
import pc.t0;

/* loaded from: classes.dex */
public final class v implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final u f136769a;

    public v(u uVar) {
        this.f136769a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f136769a, ((v) obj).f136769a);
    }

    public final int hashCode() {
        u uVar = this.f136769a;
        if (uVar == null) {
            return 0;
        }
        return uVar.hashCode();
    }

    public final String toString() {
        return "Data(v3GetUserStateQuery=" + this.f136769a + ")";
    }
}
