package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t6 implements v6, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f133331d;

    /* renamed from: e, reason: collision with root package name */
    public final s6 f133332e;

    public t6(String __typename, s6 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f133331d = __typename;
        this.f133332e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f133332e;
    }

    @Override // z40.b
    public final String b() {
        return this.f133331d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return Intrinsics.d(this.f133331d, t6Var.f133331d) && Intrinsics.d(this.f133332e, t6Var.f133332e);
    }

    public final int hashCode() {
        return this.f133332e.hashCode() + (this.f133331d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3DeclineOrDeleteBoardCollaboratorInviteMutation(__typename=" + this.f133331d + ", error=" + this.f133332e + ")";
    }
}
