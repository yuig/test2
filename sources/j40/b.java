package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f74594d;

    /* renamed from: e, reason: collision with root package name */
    public final a f74595e;

    public b(String __typename, a error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f74594d = __typename;
        this.f74595e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f74595e;
    }

    @Override // z40.b
    public final String b() {
        return this.f74594d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f74594d, bVar.f74594d) && Intrinsics.d(this.f74595e, bVar.f74595e);
    }

    public final int hashCode() {
        return this.f74595e.hashCode() + (this.f74594d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3OrientationSignalsMutation(__typename=" + this.f74594d + ", error=" + this.f74595e + ")";
    }
}
