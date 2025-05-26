package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 implements r0, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f133014d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f133015e;

    public p0(String __typename, o0 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f133014d = __typename;
        this.f133015e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f133015e;
    }

    @Override // z40.b
    public final String b() {
        return this.f133014d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.f133014d, p0Var.f133014d) && Intrinsics.d(this.f133015e, p0Var.f133015e);
    }

    public final int hashCode() {
        return this.f133015e.hashCode() + (this.f133014d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3ApproveBoardCollaboratorInviteMutationv2(__typename=" + this.f133014d + ", error=" + this.f133015e + ")";
    }
}
