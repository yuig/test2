package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ci implements gi {

    /* renamed from: d, reason: collision with root package name */
    public final String f132172d;

    /* renamed from: e, reason: collision with root package name */
    public final bi f132173e;

    public ci(String __typename, bi biVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132172d = __typename;
        this.f132173e = biVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        return Intrinsics.d(this.f132172d, ciVar.f132172d) && Intrinsics.d(this.f132173e, ciVar.f132173e);
    }

    public final int hashCode() {
        int hashCode = this.f132172d.hashCode() * 31;
        bi biVar = this.f132173e;
        return hashCode + (biVar == null ? 0 : biVar.hashCode());
    }

    public final String toString() {
        return "ContactRequestResponseV3ReportContactRequestsMutation(__typename=" + this.f132172d + ", data=" + this.f132173e + ")";
    }
}
