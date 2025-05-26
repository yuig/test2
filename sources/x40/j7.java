package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j7 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132593a;

    /* renamed from: b, reason: collision with root package name */
    public final i7 f132594b;

    public j7(String __typename, i7 i7Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132593a = __typename;
        this.f132594b = i7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return Intrinsics.d(this.f132593a, j7Var.f132593a) && Intrinsics.d(this.f132594b, j7Var.f132594b);
    }

    public final int hashCode() {
        int hashCode = this.f132593a.hashCode() * 31;
        i7 i7Var = this.f132594b;
        return hashCode + (i7Var == null ? 0 : i7Var.hashCode());
    }

    public final String toString() {
        return "V3GetBoardCollaboratorInvitesDataConnectionContainerData(__typename=" + this.f132593a + ", connection=" + this.f132594b + ")";
    }
}
