package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g9 implements k9 {

    /* renamed from: d, reason: collision with root package name */
    public final String f132440d;

    /* renamed from: e, reason: collision with root package name */
    public final f9 f132441e;

    public g9(String __typename, f9 f9Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132440d = __typename;
        this.f132441e = f9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9)) {
            return false;
        }
        g9 g9Var = (g9) obj;
        return Intrinsics.d(this.f132440d, g9Var.f132440d) && Intrinsics.d(this.f132441e, g9Var.f132441e);
    }

    public final int hashCode() {
        int hashCode = this.f132440d.hashCode() * 31;
        f9 f9Var = this.f132441e;
        return hashCode + (f9Var == null ? 0 : f9Var.hashCode());
    }

    public final String toString() {
        return "ConversationResponseV3GetConversationQuery(__typename=" + this.f132440d + ", data=" + this.f132441e + ")";
    }
}
