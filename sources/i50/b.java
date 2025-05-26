package i50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f71539d;

    /* renamed from: e, reason: collision with root package name */
    public final a f71540e;

    public b(String __typename, a error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f71539d = __typename;
        this.f71540e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f71540e;
    }

    @Override // z40.b
    public final String b() {
        return this.f71539d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f71539d, bVar.f71539d) && Intrinsics.d(this.f71540e, bVar.f71540e);
    }

    public final int hashCode() {
        return this.f71540e.hashCode() + (this.f71539d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3DownloadIdeaPinQuery(__typename=" + this.f71539d + ", error=" + this.f71540e + ")";
    }
}
