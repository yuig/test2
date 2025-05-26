package l82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f82243a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f82244b;

    public o(u50.o oVar, i0 i0Var) {
        this.f82243a = oVar;
        this.f82244b = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f82243a, oVar.f82243a) && Intrinsics.d(this.f82244b, oVar.f82244b);
    }

    public final int hashCode() {
        Object obj = this.f82243a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f82244b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ScanState(displayState=" + this.f82243a + ", vmState=" + this.f82244b + ")";
    }
}
