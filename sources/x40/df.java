package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class df implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final cf f132249a;

    public df(cf cfVar) {
        this.f132249a = cfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df) && Intrinsics.d(this.f132249a, ((df) obj).f132249a);
    }

    public final int hashCode() {
        cf cfVar = this.f132249a;
        if (cfVar == null) {
            return 0;
        }
        return cfVar.hashCode();
    }

    public final String toString() {
        return "Data(v3MarkContactRequestReadMutation=" + this.f132249a + ")";
    }
}
