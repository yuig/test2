package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final m f132856a;

    public n(m mVar) {
        this.f132856a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f132856a, ((n) obj).f132856a);
    }

    public final int hashCode() {
        m mVar = this.f132856a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    public final String toString() {
        return "Data(v3AcceptContactRequestsMutation=" + this.f132856a + ")";
    }
}
