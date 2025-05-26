package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f133221a;

    public s0(r0 r0Var) {
        this.f133221a = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && Intrinsics.d(this.f133221a, ((s0) obj).f133221a);
    }

    public final int hashCode() {
        r0 r0Var = this.f133221a;
        if (r0Var == null) {
            return 0;
        }
        return r0Var.hashCode();
    }

    public final String toString() {
        return "Data(v3ApproveBoardCollaboratorInviteMutationv2=" + this.f133221a + ")";
    }
}
