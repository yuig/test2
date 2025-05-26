package bc2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f22650a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f22651b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22652c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22653d;

    /* renamed from: e, reason: collision with root package name */
    public final c f22654e;

    /* renamed from: f, reason: collision with root package name */
    public final l f22655f;

    /* renamed from: g, reason: collision with root package name */
    public final m f22656g;

    public d(String mediaUid, LinkedHashMap tracks, boolean z13, boolean z14, c maxDimensions, l videoPinType, m videoSurfaceType) {
        Intrinsics.checkNotNullParameter(mediaUid, "mediaUid");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        Intrinsics.checkNotNullParameter(maxDimensions, "maxDimensions");
        Intrinsics.checkNotNullParameter(videoPinType, "videoPinType");
        Intrinsics.checkNotNullParameter(videoSurfaceType, "videoSurfaceType");
        this.f22650a = mediaUid;
        this.f22651b = tracks;
        this.f22652c = z13;
        this.f22653d = z14;
        this.f22654e = maxDimensions;
        this.f22655f = videoPinType;
        this.f22656g = videoSurfaceType;
    }

    public final c a() {
        return this.f22654e;
    }

    public final Map b() {
        return this.f22651b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f22650a, dVar.f22650a) && Intrinsics.d(this.f22651b, dVar.f22651b) && this.f22652c == dVar.f22652c && this.f22653d == dVar.f22653d && Intrinsics.d(this.f22654e, dVar.f22654e) && this.f22655f == dVar.f22655f && this.f22656g == dVar.f22656g;
    }

    public final int hashCode() {
        return this.f22656g.hashCode() + ((this.f22655f.hashCode() + ((this.f22654e.hashCode() + ep.b.e(this.f22653d, ep.b.e(this.f22652c, a.c.e(this.f22651b, this.f22650a.hashCode() * 31, 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TrackSelectorInput(mediaUid=" + this.f22650a + ", tracks=" + this.f22651b + ", isCover=" + this.f22652c + ", isAppStart=" + this.f22653d + ", maxDimensions=" + this.f22654e + ", videoPinType=" + this.f22655f + ", videoSurfaceType=" + this.f22656g + ")";
    }
}
