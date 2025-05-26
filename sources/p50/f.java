package p50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f98863a;

    public f(e eVar) {
        this.f98863a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f98863a, ((f) obj).f98863a);
    }

    public final int hashCode() {
        e eVar = this.f98863a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.f98863a + ")";
    }
}
