package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements k, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f74607d;

    /* renamed from: e, reason: collision with root package name */
    public final h f74608e;

    public i(String __typename, h error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f74607d = __typename;
        this.f74608e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f74608e;
    }

    @Override // z40.b
    public final String b() {
        return this.f74607d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f74607d, iVar.f74607d) && Intrinsics.d(this.f74608e, iVar.f74608e);
    }

    public final int hashCode() {
        return this.f74608e.hashCode() + (this.f74607d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3OrientationTopicsQuery(__typename=" + this.f74607d + ", error=" + this.f74608e + ")";
    }
}
