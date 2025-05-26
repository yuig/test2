package bc2;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Map f22672a;

    /* renamed from: b, reason: collision with root package name */
    public final o f22673b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22674c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22675d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f22676e;

    /* renamed from: f, reason: collision with root package name */
    public final c f22677f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f22678g;

    /* renamed from: h, reason: collision with root package name */
    public final l f22679h;

    /* renamed from: i, reason: collision with root package name */
    public int f22680i;

    public q(Map tracks, o selectedTrack, long j13, String str, Map captionsUrls, c maxDimensions, Integer num, l videoPinType, int i13) {
        str = (i13 & 8) != 0 ? null : str;
        captionsUrls = (i13 & 16) != 0 ? z0.d() : captionsUrls;
        num = (i13 & 64) != 0 ? null : num;
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        Intrinsics.checkNotNullParameter(selectedTrack, "selectedTrack");
        Intrinsics.checkNotNullParameter(captionsUrls, "captionsUrls");
        Intrinsics.checkNotNullParameter(maxDimensions, "maxDimensions");
        Intrinsics.checkNotNullParameter(videoPinType, "videoPinType");
        this.f22672a = tracks;
        this.f22673b = selectedTrack;
        this.f22674c = j13;
        this.f22675d = str;
        this.f22676e = captionsUrls;
        this.f22677f = maxDimensions;
        this.f22678g = num;
        this.f22679h = videoPinType;
        this.f22680i = -1;
    }

    public final float a() {
        c cVar;
        int i13;
        int i14;
        c cVar2 = this.f22673b.f22667d;
        if ((cVar2 == null || (i13 = cVar2.f22648a) == 0 || (i14 = cVar2.f22649b) == 0) && ((i13 = (cVar = this.f22677f).f22648a) == 0 || (i14 = cVar.f22649b) == 0)) {
            return 1.0f;
        }
        return i13 / i14;
    }

    public final boolean b() {
        String str = (String) CollectionsKt.T(this.f22676e.values());
        return !(str == null || z.j(str));
    }

    public final boolean c() {
        int i13 = p.f22671a[this.f22679h.ordinal()];
        return i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f22672a, qVar.f22672a) && Intrinsics.d(this.f22673b, qVar.f22673b) && this.f22674c == qVar.f22674c && Intrinsics.d(this.f22675d, qVar.f22675d) && Intrinsics.d(this.f22676e, qVar.f22676e) && Intrinsics.d(this.f22677f, qVar.f22677f) && Intrinsics.d(this.f22678g, qVar.f22678g) && this.f22679h == qVar.f22679h && this.f22680i == qVar.f22680i;
    }

    public final int hashCode() {
        int c13 = a.a.c(this.f22674c, (this.f22673b.hashCode() + (this.f22672a.hashCode() * 31)) * 31, 31);
        String str = this.f22675d;
        int hashCode = (this.f22677f.hashCode() + a.c.e(this.f22676e, (c13 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        Integer num = this.f22678g;
        int hashCode2 = num != null ? num.hashCode() : 0;
        return Integer.hashCode(this.f22680i) + ((this.f22679h.hashCode() + ((hashCode + hashCode2) * 31)) * 31);
    }

    public final String toString() {
        return "VideoTracks(tracks=" + this.f22672a + ", selectedTrack=" + this.f22673b + ", durationMs=" + this.f22674c + ", thumbnailUrl=" + this.f22675d + ", captionsUrls=" + this.f22676e + ", maxDimensions=" + this.f22677f + ", slotIndex=" + this.f22678g + ", videoPinType=" + this.f22679h + ", maxLoops=" + this.f22680i + ")";
    }
}
