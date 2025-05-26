package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 implements x0, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f133522d;

    /* renamed from: e, reason: collision with root package name */
    public final u0 f133523e;

    public v0(String __typename, u0 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f133522d = __typename;
        this.f133523e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f133523e;
    }

    @Override // z40.b
    public final String b() {
        return this.f133522d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.d(this.f133522d, v0Var.f133522d) && Intrinsics.d(this.f133523e, v0Var.f133523e);
    }

    public final int hashCode() {
        return this.f133523e.hashCode() + (this.f133522d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3BatchDeclineContactRequestsMutation(__typename=" + this.f133522d + ", error=" + this.f133523e + ")";
    }
}
