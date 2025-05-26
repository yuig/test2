package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class re implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final qe f133189a;

    public re(qe qeVar) {
        this.f133189a = qeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof re) && Intrinsics.d(this.f133189a, ((re) obj).f133189a);
    }

    public final int hashCode() {
        qe qeVar = this.f133189a;
        if (qeVar == null) {
            return 0;
        }
        return qeVar.hashCode();
    }

    public final String toString() {
        return "Data(v3LogDeviceScreenStateMutation=" + this.f133189a + ")";
    }
}
