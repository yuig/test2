package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cc implements yb {

    /* renamed from: d, reason: collision with root package name */
    public final String f132145d;

    /* renamed from: e, reason: collision with root package name */
    public final bc f132146e;

    public cc(String __typename, bc bcVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132145d = __typename;
        this.f132146e = bcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj;
        return Intrinsics.d(this.f132145d, ccVar.f132145d) && Intrinsics.d(this.f132146e, ccVar.f132146e);
    }

    public final int hashCode() {
        int hashCode = this.f132145d.hashCode() * 31;
        bc bcVar = this.f132146e;
        return hashCode + (bcVar == null ? 0 : bcVar.hashCode());
    }

    public final String toString() {
        return "V3GetUserBoardInviteV3GetUserBoardInviteQuery(__typename=" + this.f132145d + ", data=" + this.f132146e + ")";
    }
}
