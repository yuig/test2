package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements m, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132625d;

    /* renamed from: e, reason: collision with root package name */
    public final j f132626e;

    public k(String __typename, j error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132625d = __typename;
        this.f132626e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132626e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132625d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f132625d, kVar.f132625d) && Intrinsics.d(this.f132626e, kVar.f132626e);
    }

    public final int hashCode() {
        return this.f132626e.hashCode() + (this.f132625d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3AcceptContactRequestsMutation(__typename=" + this.f132625d + ", error=" + this.f132626e + ")";
    }
}
