package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yc implements jc {

    /* renamed from: d, reason: collision with root package name */
    public final String f133738d;

    /* renamed from: e, reason: collision with root package name */
    public final xc f133739e;

    public yc(String __typename, xc xcVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133738d = __typename;
        this.f133739e = xcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc)) {
            return false;
        }
        yc ycVar = (yc) obj;
        return Intrinsics.d(this.f133738d, ycVar.f133738d) && Intrinsics.d(this.f133739e, ycVar.f133739e);
    }

    public final int hashCode() {
        int hashCode = this.f133738d.hashCode() * 31;
        xc xcVar = this.f133739e;
        return hashCode + (xcVar == null ? 0 : xcVar.hashCode());
    }

    public final String toString() {
        return "V3GetUserContactRequestsByUserDataConnectionContainerData(__typename=" + this.f133738d + ", connection=" + this.f133739e + ")";
    }
}
