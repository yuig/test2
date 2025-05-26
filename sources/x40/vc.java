package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vc {

    /* renamed from: a, reason: collision with root package name */
    public final uc f133553a;

    public vc(uc ucVar) {
        this.f133553a = ucVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vc) && Intrinsics.d(this.f133553a, ((vc) obj).f133553a);
    }

    public final int hashCode() {
        uc ucVar = this.f133553a;
        if (ucVar == null) {
            return 0;
        }
        return ucVar.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.f133553a + ")";
    }
}
