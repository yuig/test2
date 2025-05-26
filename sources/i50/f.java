package i50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f71545d;

    /* renamed from: e, reason: collision with root package name */
    public final e f71546e;

    public f(String __typename, e eVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f71545d = __typename;
        this.f71546e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f71545d, fVar.f71545d) && Intrinsics.d(this.f71546e, fVar.f71546e);
    }

    public final int hashCode() {
        int hashCode = this.f71545d.hashCode() * 31;
        e eVar = this.f71546e;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "V3DownloadIdeaPinV3DownloadIdeaPinQuery(__typename=" + this.f71545d + ", data=" + this.f71546e + ")";
    }
}
