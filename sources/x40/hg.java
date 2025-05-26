package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hg implements jg, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132508d;

    /* renamed from: e, reason: collision with root package name */
    public final gg f132509e;

    public hg(String __typename, gg error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132508d = __typename;
        this.f132509e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132509e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132508d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg)) {
            return false;
        }
        hg hgVar = (hg) obj;
        return Intrinsics.d(this.f132508d, hgVar.f132508d) && Intrinsics.d(this.f132509e, hgVar.f132509e);
    }

    public final int hashCode() {
        return this.f132509e.hashCode() + (this.f132508d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3RelatedPinsForConversationQuery(__typename=" + this.f132508d + ", error=" + this.f132509e + ")";
    }
}
