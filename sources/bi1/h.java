package bi1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final bc2.q f22845a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22846b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22847c;

    /* renamed from: d, reason: collision with root package name */
    public final List f22848d;

    public h(bc2.q videoTracks, boolean z13, boolean z14, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        this.f22845a = videoTracks;
        this.f22846b = z13;
        this.f22847c = z14;
        this.f22848d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f22845a, hVar.f22845a) && this.f22846b == hVar.f22846b && this.f22847c == hVar.f22847c && Intrinsics.d(this.f22848d, hVar.f22848d);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f22847c, ep.b.e(this.f22846b, this.f22845a.hashCode() * 31, 31), 31);
        List list = this.f22848d;
        return e13 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "VideoTracksSelected(videoTracks=" + this.f22845a + ", forceMute=" + this.f22846b + ", pinShouldMute=" + this.f22847c + ", musicAttributions=" + this.f22848d + ")";
    }
}
