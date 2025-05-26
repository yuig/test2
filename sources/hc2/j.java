package hc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final bc2.q f68763a;

    /* renamed from: b, reason: collision with root package name */
    public final bc2.m f68764b;

    /* renamed from: c, reason: collision with root package name */
    public final String f68765c;

    /* renamed from: d, reason: collision with root package name */
    public int f68766d;

    public j(bc2.q videoTracks, bc2.m videoSurfaceType, String str, int i13) {
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        Intrinsics.checkNotNullParameter(videoSurfaceType, "videoSurfaceType");
        this.f68763a = videoTracks;
        this.f68764b = videoSurfaceType;
        this.f68765c = str;
        this.f68766d = i13;
    }

    public final void a(int i13) {
        this.f68766d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f68763a, jVar.f68763a) && this.f68764b == jVar.f68764b && Intrinsics.d(this.f68765c, jVar.f68765c) && this.f68766d == jVar.f68766d;
    }

    public final int hashCode() {
        int hashCode = (this.f68764b.hashCode() + (this.f68763a.hashCode() * 31)) * 31;
        String str = this.f68765c;
        return Integer.hashCode(this.f68766d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MediaItemTag(videoTracks=" + this.f68763a + ", videoSurfaceType=" + this.f68764b + ", serverSentManifest=" + this.f68765c + ", maxLoops=" + this.f68766d + ")";
    }
}
