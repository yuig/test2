package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ob {

    /* renamed from: a, reason: collision with root package name */
    public final nb f132959a;

    public ob(nb nbVar) {
        this.f132959a = nbVar;
    }

    public final nb a() {
        return this.f132959a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob) && Intrinsics.d(this.f132959a, ((ob) obj).f132959a);
    }

    public final int hashCode() {
        nb nbVar = this.f132959a;
        if (nbVar == null) {
            return 0;
        }
        return nbVar.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.f132959a + ")";
    }
}
