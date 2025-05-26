package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements m {

    /* renamed from: d, reason: collision with root package name */
    public final String f132514d;

    /* renamed from: e, reason: collision with root package name */
    public final h f132515e;

    public i(String __typename, h hVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132514d = __typename;
        this.f132515e = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f132514d, iVar.f132514d) && Intrinsics.d(this.f132515e, iVar.f132515e);
    }

    public final int hashCode() {
        int hashCode = this.f132514d.hashCode() * 31;
        h hVar = this.f132515e;
        return hashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public final String toString() {
        return "ConversationResponseV3AcceptContactRequestsMutation(__typename=" + this.f132514d + ", data=" + this.f132515e + ")";
    }
}
