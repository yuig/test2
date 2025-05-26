package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h5 implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final g5 f132489a;

    public h5(g5 g5Var) {
        this.f132489a = g5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5) && Intrinsics.d(this.f132489a, ((h5) obj).f132489a);
    }

    public final int hashCode() {
        g5 g5Var = this.f132489a;
        if (g5Var == null) {
            return 0;
        }
        return g5Var.hashCode();
    }

    public final String toString() {
        return "Data(v3CreateConversationMutation=" + this.f132489a + ")";
    }
}
