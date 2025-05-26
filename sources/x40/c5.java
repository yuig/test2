package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c5 implements g5 {

    /* renamed from: d, reason: collision with root package name */
    public final String f132098d;

    /* renamed from: e, reason: collision with root package name */
    public final b5 f132099e;

    public c5(String __typename, b5 b5Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132098d = __typename;
        this.f132099e = b5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return Intrinsics.d(this.f132098d, c5Var.f132098d) && Intrinsics.d(this.f132099e, c5Var.f132099e);
    }

    public final int hashCode() {
        int hashCode = this.f132098d.hashCode() * 31;
        b5 b5Var = this.f132099e;
        return hashCode + (b5Var == null ? 0 : b5Var.hashCode());
    }

    public final String toString() {
        return "ConversationResponseV3CreateConversationMutation(__typename=" + this.f132098d + ", data=" + this.f132099e + ")";
    }
}
