package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lb implements mb, z40.l {

    /* renamed from: a, reason: collision with root package name */
    public final String f132747a;

    /* renamed from: b, reason: collision with root package name */
    public final kb f132748b;

    public lb(String __typename, kb kbVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132747a = __typename;
        this.f132748b = kbVar;
    }

    @Override // z40.l
    public final z40.k a() {
        return this.f132748b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb)) {
            return false;
        }
        lb lbVar = (lb) obj;
        return Intrinsics.d(this.f132747a, lbVar.f132747a) && Intrinsics.d(this.f132748b, lbVar.f132748b);
    }

    public final int hashCode() {
        int hashCode = this.f132747a.hashCode() * 31;
        kb kbVar = this.f132748b;
        return hashCode + (kbVar == null ? 0 : kbVar.hashCode());
    }

    public final String toString() {
        return "UserUsersConnectionContainerUsers(__typename=" + this.f132747a + ", connection=" + this.f132748b + ")";
    }
}
