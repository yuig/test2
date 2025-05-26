package r40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f106167d;

    /* renamed from: e, reason: collision with root package name */
    public final h f106168e;

    public i(String __typename, h hVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f106167d = __typename;
        this.f106168e = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f106167d, iVar.f106167d) && Intrinsics.d(this.f106168e, iVar.f106168e);
    }

    public final int hashCode() {
        int hashCode = this.f106167d.hashCode() * 31;
        h hVar = this.f106168e;
        return hashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public final String toString() {
        return "V3DeleteAddressBookV3DeleteAddressBookMutation(__typename=" + this.f106167d + ", data=" + this.f106168e + ")";
    }
}
