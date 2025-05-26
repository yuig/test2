package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t9 implements r9, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f133337d;

    /* renamed from: e, reason: collision with root package name */
    public final s9 f133338e;

    public t9(String __typename, s9 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f133337d = __typename;
        this.f133338e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f133338e;
    }

    @Override // z40.b
    public final String b() {
        return this.f133337d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj;
        return Intrinsics.d(this.f133337d, t9Var.f133337d) && Intrinsics.d(this.f133338e, t9Var.f133338e);
    }

    public final int hashCode() {
        return this.f133338e.hashCode() + (this.f133337d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorData(__typename=" + this.f133337d + ", error=" + this.f133338e + ")";
    }
}
