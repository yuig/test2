package jx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final gx1.f f77694a;

    /* renamed from: b, reason: collision with root package name */
    public final gx1.f f77695b;

    public q(gx1.f fVar, gx1.f fVar2) {
        this.f77694a = fVar;
        this.f77695b = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f77694a, qVar.f77694a) && Intrinsics.d(this.f77695b, qVar.f77695b);
    }

    public final int hashCode() {
        gx1.f fVar = this.f77694a;
        int hashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        gx1.f fVar2 = this.f77695b;
        return hashCode + (fVar2 != null ? fVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ProcessedDataSideEffectRequest(total=" + this.f77694a + ", engaged=" + this.f77695b + ")";
    }
}
