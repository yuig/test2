package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q5 implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final p5 f133106a;

    public q5(p5 p5Var) {
        this.f133106a = p5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5) && Intrinsics.d(this.f133106a, ((q5) obj).f133106a);
    }

    public final int hashCode() {
        p5 p5Var = this.f133106a;
        if (p5Var == null) {
            return 0;
        }
        return p5Var.hashCode();
    }

    public final String toString() {
        return "Data(v3CreateConversationMutation=" + this.f133106a + ")";
    }
}
