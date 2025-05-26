package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f131998a;

    public b0(a0 a0Var) {
        this.f131998a = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f131998a, ((b0) obj).f131998a);
    }

    public final int hashCode() {
        a0 a0Var = this.f131998a;
        if (a0Var == null) {
            return 0;
        }
        return a0Var.hashCode();
    }

    public final String toString() {
        return "Data(v3AddConversationPinSeenMutation=" + this.f131998a + ")";
    }
}
