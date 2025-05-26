package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements l, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f74612d;

    /* renamed from: e, reason: collision with root package name */
    public final m f74613e;

    public n(String __typename, m error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f74612d = __typename;
        this.f74613e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f74613e;
    }

    @Override // z40.b
    public final String b() {
        return this.f74612d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f74612d, nVar.f74612d) && Intrinsics.d(this.f74613e, nVar.f74613e);
    }

    public final int hashCode() {
        return this.f74613e.hashCode() + (this.f74612d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorData(__typename=" + this.f74612d + ", error=" + this.f74613e + ")";
    }
}
