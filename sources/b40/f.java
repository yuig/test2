package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f21705a;

    public f(e eVar) {
        this.f21705a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f21705a, ((f) obj).f21705a);
    }

    public final int hashCode() {
        e eVar = this.f21705a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        return "Data(v3DeleteNewsHubBadgeMutation=" + this.f21705a + ")";
    }
}
