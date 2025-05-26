package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23231a;

    /* renamed from: b, reason: collision with root package name */
    public final bc2.q f23232b;

    /* renamed from: c, reason: collision with root package name */
    public final bc2.m f23233c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23234d;

    public h1(String mediaUid, bc2.q videoTracks, bc2.m videoSurfaceType, boolean z13) {
        Intrinsics.checkNotNullParameter(mediaUid, "mediaUid");
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        Intrinsics.checkNotNullParameter(videoSurfaceType, "videoSurfaceType");
        this.f23231a = mediaUid;
        this.f23232b = videoTracks;
        this.f23233c = videoSurfaceType;
        this.f23234d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.d(this.f23231a, h1Var.f23231a) && Intrinsics.d(this.f23232b, h1Var.f23232b) && this.f23233c == h1Var.f23233c && this.f23234d == h1Var.f23234d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23234d) + ((this.f23233c.hashCode() + ((this.f23232b.hashCode() + (this.f23231a.hashCode() * 31)) * 31)) * 31);
    }

    public final String j() {
        return this.f23231a;
    }

    public final bc2.m k() {
        return this.f23233c;
    }

    public final bc2.q l() {
        return this.f23232b;
    }

    public final String toString() {
        return "WarmupVideoPinCloseup(mediaUid=" + this.f23231a + ", videoTracks=" + this.f23232b + ", videoSurfaceType=" + this.f23233c + ", isStoryPin=" + this.f23234d + ")";
    }
}
