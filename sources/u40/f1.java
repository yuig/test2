package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 implements w0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f120325d;

    /* renamed from: e, reason: collision with root package name */
    public final e1 f120326e;

    public f1(String __typename, e1 e1Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120325d = __typename;
        this.f120326e = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return Intrinsics.d(this.f120325d, f1Var.f120325d) && Intrinsics.d(this.f120326e, f1Var.f120326e);
    }

    public final int hashCode() {
        int hashCode = this.f120325d.hashCode() * 31;
        e1 e1Var = this.f120326e;
        return hashCode + (e1Var == null ? 0 : e1Var.hashCode());
    }

    public final String toString() {
        return "UserFollowersConnectionContainerFollowers(__typename=" + this.f120325d + ", connection=" + this.f120326e + ")";
    }
}
