package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jb implements z40.j {

    /* renamed from: a, reason: collision with root package name */
    public final ib f132614a;

    public jb(ib ibVar) {
        this.f132614a = ibVar;
    }

    @Override // z40.j
    public final z40.i a() {
        return this.f132614a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jb) && Intrinsics.d(this.f132614a, ((jb) obj).f132614a);
    }

    public final int hashCode() {
        ib ibVar = this.f132614a;
        if (ibVar == null) {
            return 0;
        }
        return ibVar.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.f132614a + ")";
    }
}
