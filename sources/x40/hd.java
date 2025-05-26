package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hd implements id {

    /* renamed from: a, reason: collision with root package name */
    public final String f132501a;

    /* renamed from: b, reason: collision with root package name */
    public final gd f132502b;

    public hd(String __typename, gd gdVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132501a = __typename;
        this.f132502b = gdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd)) {
            return false;
        }
        hd hdVar = (hd) obj;
        return Intrinsics.d(this.f132501a, hdVar.f132501a) && Intrinsics.d(this.f132502b, hdVar.f132502b);
    }

    public final int hashCode() {
        int hashCode = this.f132501a.hashCode() * 31;
        gd gdVar = this.f132502b;
        return hashCode + (gdVar == null ? 0 : gdVar.hashCode());
    }

    public final String toString() {
        return "UserUsersConnectionContainerUsers(__typename=" + this.f132501a + ", connection=" + this.f132502b + ")";
    }
}
