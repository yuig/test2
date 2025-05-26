package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rh implements jg {

    /* renamed from: d, reason: collision with root package name */
    public final String f133216d;

    /* renamed from: e, reason: collision with root package name */
    public final kg f133217e;

    public rh(String __typename, kg kgVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133216d = __typename;
        this.f133217e = kgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh)) {
            return false;
        }
        rh rhVar = (rh) obj;
        return Intrinsics.d(this.f133216d, rhVar.f133216d) && Intrinsics.d(this.f133217e, rhVar.f133217e);
    }

    public final int hashCode() {
        int hashCode = this.f133216d.hashCode() * 31;
        kg kgVar = this.f133217e;
        return hashCode + (kgVar == null ? 0 : kgVar.hashCode());
    }

    public final String toString() {
        return "V3RelatedPinsForConversationV3RelatedPinsForConversationQuery(__typename=" + this.f133216d + ", data=" + this.f133217e + ")";
    }
}
