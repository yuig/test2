package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fd {

    /* renamed from: a, reason: collision with root package name */
    public final ed f132411a;

    public fd(ed edVar) {
        this.f132411a = edVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd) && Intrinsics.d(this.f132411a, ((fd) obj).f132411a);
    }

    public final int hashCode() {
        ed edVar = this.f132411a;
        if (edVar == null) {
            return 0;
        }
        return edVar.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.f132411a + ")";
    }
}
