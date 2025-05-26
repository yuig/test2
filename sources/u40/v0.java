package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 implements w0, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f120428d;

    /* renamed from: e, reason: collision with root package name */
    public final u0 f120429e;

    public v0(String __typename, u0 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f120428d = __typename;
        this.f120429e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f120429e;
    }

    @Override // z40.b
    public final String b() {
        return this.f120428d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.d(this.f120428d, v0Var.f120428d) && Intrinsics.d(this.f120429e, v0Var.f120429e);
    }

    public final int hashCode() {
        return this.f120429e.hashCode() + (this.f120428d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorFollowers(__typename=" + this.f120428d + ", error=" + this.f120429e + ")";
    }
}
