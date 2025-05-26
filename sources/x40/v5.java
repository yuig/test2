package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v5 implements x5, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f133539d;

    /* renamed from: e, reason: collision with root package name */
    public final u5 f133540e;

    public v5(String __typename, u5 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f133539d = __typename;
        this.f133540e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f133540e;
    }

    @Override // z40.b
    public final String b() {
        return this.f133539d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj;
        return Intrinsics.d(this.f133539d, v5Var.f133539d) && Intrinsics.d(this.f133540e, v5Var.f133540e);
    }

    public final int hashCode() {
        return this.f133540e.hashCode() + (this.f133539d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3CreateRequestToJoinBoardMutation(__typename=" + this.f133539d + ", error=" + this.f133540e + ")";
    }
}
