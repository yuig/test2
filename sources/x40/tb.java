package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tb implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final q9 f133359a;

    public tb(q9 q9Var) {
        this.f133359a = q9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tb) && Intrinsics.d(this.f133359a, ((tb) obj).f133359a);
    }

    public final int hashCode() {
        q9 q9Var = this.f133359a;
        if (q9Var == null) {
            return 0;
        }
        return q9Var.hashCode();
    }

    public final String toString() {
        return "Data(v3GetConversationsQuery=" + this.f133359a + ")";
    }
}
