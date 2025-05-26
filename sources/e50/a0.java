package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f57257a;

    public a0(q qVar) {
        this.f57257a = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f57257a, ((a0) obj).f57257a);
    }

    public final int hashCode() {
        q qVar = this.f57257a;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.f57257a + ")";
    }
}
