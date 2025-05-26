package jx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final gx1.f f77688a;

    /* renamed from: b, reason: collision with root package name */
    public final gx1.f f77689b;

    public j(gx1.f fVar, gx1.f fVar2) {
        this.f77688a = fVar;
        this.f77689b = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f77688a, jVar.f77688a) && Intrinsics.d(this.f77689b, jVar.f77689b);
    }

    public final int hashCode() {
        gx1.f fVar = this.f77688a;
        int hashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        gx1.f fVar2 = this.f77689b;
        return hashCode + (fVar2 != null ? fVar2.hashCode() : 0);
    }

    public final String toString() {
        return "OnDataProcessed(total=" + this.f77688a + ", engaged=" + this.f77689b + ")";
    }
}
