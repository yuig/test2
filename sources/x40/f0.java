package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements j0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f132367d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f132368e;

    public f0(String __typename, e0 e0Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132367d = __typename;
        this.f132368e = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f132367d, f0Var.f132367d) && Intrinsics.d(this.f132368e, f0Var.f132368e);
    }

    public final int hashCode() {
        int hashCode = this.f132367d.hashCode() * 31;
        e0 e0Var = this.f132368e;
        return hashCode + (e0Var == null ? 0 : e0Var.hashCode());
    }

    public final String toString() {
        return "ConversationMessageResponseV3AddThreadMessageMutation(__typename=" + this.f132367d + ", data=" + this.f132368e + ")";
    }
}
