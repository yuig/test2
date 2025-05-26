package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c6 implements g6 {

    /* renamed from: d, reason: collision with root package name */
    public final String f132100d;

    /* renamed from: e, reason: collision with root package name */
    public final b6 f132101e;

    public c6(String __typename, b6 b6Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132100d = __typename;
        this.f132101e = b6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        return Intrinsics.d(this.f132100d, c6Var.f132100d) && Intrinsics.d(this.f132101e, c6Var.f132101e);
    }

    public final int hashCode() {
        int hashCode = this.f132100d.hashCode() * 31;
        b6 b6Var = this.f132101e;
        return hashCode + (b6Var == null ? 0 : b6Var.hashCode());
    }

    public final String toString() {
        return "ConversationMessageResponseV3CreateThreadMutation(__typename=" + this.f132100d + ", data=" + this.f132101e + ")";
    }
}
