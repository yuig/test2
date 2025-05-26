package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zc implements ic {

    /* renamed from: d, reason: collision with root package name */
    public final String f133821d;

    /* renamed from: e, reason: collision with root package name */
    public final jc f133822e;

    public zc(String __typename, jc jcVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133821d = __typename;
        this.f133822e = jcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc)) {
            return false;
        }
        zc zcVar = (zc) obj;
        return Intrinsics.d(this.f133821d, zcVar.f133821d) && Intrinsics.d(this.f133822e, zcVar.f133822e);
    }

    public final int hashCode() {
        int hashCode = this.f133821d.hashCode() * 31;
        jc jcVar = this.f133822e;
        return hashCode + (jcVar == null ? 0 : jcVar.hashCode());
    }

    public final String toString() {
        return "V3GetUserContactRequestsByUserV3GetUserContactRequestsByUserQuery(__typename=" + this.f133821d + ", data=" + this.f133822e + ")";
    }
}
