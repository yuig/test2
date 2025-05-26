package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class le implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final je f132753a;

    public le(je jeVar) {
        this.f132753a = jeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le) && Intrinsics.d(this.f132753a, ((le) obj).f132753a);
    }

    public final int hashCode() {
        je jeVar = this.f132753a;
        if (jeVar == null) {
            return 0;
        }
        return jeVar.hashCode();
    }

    public final String toString() {
        return "Data(v3InviteBoardCollaboratorsMutation=" + this.f132753a + ")";
    }
}
