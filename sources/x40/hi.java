package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hi implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final gi f132513a;

    public hi(gi giVar) {
        this.f132513a = giVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hi) && Intrinsics.d(this.f132513a, ((hi) obj).f132513a);
    }

    public final int hashCode() {
        gi giVar = this.f132513a;
        if (giVar == null) {
            return 0;
        }
        return giVar.hashCode();
    }

    public final String toString() {
        return "Data(v3ReportContactRequestsMutation=" + this.f132513a + ")";
    }
}
