package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b9 implements z40.j {

    /* renamed from: a, reason: collision with root package name */
    public final a9 f132036a;

    public b9(a9 a9Var) {
        this.f132036a = a9Var;
    }

    @Override // z40.j
    public final z40.i a() {
        return this.f132036a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9) && Intrinsics.d(this.f132036a, ((b9) obj).f132036a);
    }

    public final int hashCode() {
        a9 a9Var = this.f132036a;
        if (a9Var == null) {
            return 0;
        }
        return a9Var.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.f132036a + ")";
    }
}
