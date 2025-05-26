package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sb implements q9 {

    /* renamed from: d, reason: collision with root package name */
    public final String f133263d;

    /* renamed from: e, reason: collision with root package name */
    public final r9 f133264e;

    public sb(String __typename, r9 r9Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133263d = __typename;
        this.f133264e = r9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb)) {
            return false;
        }
        sb sbVar = (sb) obj;
        return Intrinsics.d(this.f133263d, sbVar.f133263d) && Intrinsics.d(this.f133264e, sbVar.f133264e);
    }

    public final int hashCode() {
        int hashCode = this.f133263d.hashCode() * 31;
        r9 r9Var = this.f133264e;
        return hashCode + (r9Var == null ? 0 : r9Var.hashCode());
    }

    public final String toString() {
        return "V3GetConversationsV3GetConversationsQuery(__typename=" + this.f133263d + ", data=" + this.f133264e + ")";
    }
}
