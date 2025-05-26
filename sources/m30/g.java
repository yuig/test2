package m30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f85752d;

    /* renamed from: e, reason: collision with root package name */
    public final f f85753e;

    public g(String __typename, f fVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f85752d = __typename;
        this.f85753e = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f85752d, gVar.f85752d) && Intrinsics.d(this.f85753e, gVar.f85753e);
    }

    public final int hashCode() {
        int hashCode = this.f85752d.hashCode() * 31;
        f fVar = this.f85753e;
        return hashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "V3GetPinV3GetPinQuery(__typename=" + this.f85752d + ", data=" + this.f85753e + ")";
    }
}
