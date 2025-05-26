package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z6 implements b7, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f133807d;

    /* renamed from: e, reason: collision with root package name */
    public final y6 f133808e;

    public z6(String __typename, y6 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f133807d = __typename;
        this.f133808e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f133808e;
    }

    @Override // z40.b
    public final String b() {
        return this.f133807d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return Intrinsics.d(this.f133807d, z6Var.f133807d) && Intrinsics.d(this.f133808e, z6Var.f133808e);
    }

    public final int hashCode() {
        return this.f133808e.hashCode() + (this.f133807d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetBoardCollaboratorInvitesQuery(__typename=" + this.f133807d + ", error=" + this.f133808e + ")";
    }
}
