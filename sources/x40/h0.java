package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements j0, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132460d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f132461e;

    public h0(String __typename, g0 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132460d = __typename;
        this.f132461e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132461e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132460d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.f132460d, h0Var.f132460d) && Intrinsics.d(this.f132461e, h0Var.f132461e);
    }

    public final int hashCode() {
        return this.f132461e.hashCode() + (this.f132460d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3AddThreadMessageMutation(__typename=" + this.f132460d + ", error=" + this.f132461e + ")";
    }
}
