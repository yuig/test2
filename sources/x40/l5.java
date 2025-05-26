package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l5 implements p5 {

    /* renamed from: d, reason: collision with root package name */
    public final String f132701d;

    /* renamed from: e, reason: collision with root package name */
    public final k5 f132702e;

    public l5(String __typename, k5 k5Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132701d = __typename;
        this.f132702e = k5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) obj;
        return Intrinsics.d(this.f132701d, l5Var.f132701d) && Intrinsics.d(this.f132702e, l5Var.f132702e);
    }

    public final int hashCode() {
        int hashCode = this.f132701d.hashCode() * 31;
        k5 k5Var = this.f132702e;
        return hashCode + (k5Var == null ? 0 : k5Var.hashCode());
    }

    public final String toString() {
        return "ConversationResponseV3CreateConversationMutation(__typename=" + this.f132701d + ", data=" + this.f132702e + ")";
    }
}
