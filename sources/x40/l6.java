package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l6 implements n6, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132703d;

    /* renamed from: e, reason: collision with root package name */
    public final k6 f132704e;

    public l6(String __typename, k6 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132703d = __typename;
        this.f132704e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132704e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132703d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        return Intrinsics.d(this.f132703d, l6Var.f132703d) && Intrinsics.d(this.f132704e, l6Var.f132704e);
    }

    public final int hashCode() {
        return this.f132704e.hashCode() + (this.f132703d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3DeclineContactRequestsMutation(__typename=" + this.f132703d + ", error=" + this.f132704e + ")";
    }
}
