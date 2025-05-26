package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements r0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f133059d;

    public q0(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133059d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && Intrinsics.d(this.f133059d, ((q0) obj).f133059d);
    }

    public final int hashCode() {
        return this.f133059d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3ApproveBoardCollaboratorInviteMutationv2(__typename="), this.f133059d, ")");
    }
}
