package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l9 implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final k9 f132726a;

    public l9(k9 k9Var) {
        this.f132726a = k9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9) && Intrinsics.d(this.f132726a, ((l9) obj).f132726a);
    }

    public final int hashCode() {
        k9 k9Var = this.f132726a;
        if (k9Var == null) {
            return 0;
        }
        return k9Var.hashCode();
    }

    public final String toString() {
        return "Data(v3GetConversationQuery=" + this.f132726a + ")";
    }
}
