package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f74623a;

    public r(q qVar) {
        this.f74623a = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f74623a, ((r) obj).f74623a);
    }

    public final int hashCode() {
        q qVar = this.f74623a;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.f74623a + ")";
    }
}
