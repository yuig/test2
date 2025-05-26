package hc2;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f68735a;

    /* renamed from: b, reason: collision with root package name */
    public final bc2.q f68736b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f68737c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68738d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68739e;

    /* renamed from: f, reason: collision with root package name */
    public final q f68740f;

    public c(String mediaUid, bc2.q videoTracks, Size dimensions, boolean z13, int i13, q trigger) {
        Intrinsics.checkNotNullParameter(mediaUid, "mediaUid");
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        this.f68735a = mediaUid;
        this.f68736b = videoTracks;
        this.f68737c = dimensions;
        this.f68738d = z13;
        this.f68739e = i13;
        this.f68740f = trigger;
    }

    public final Size a() {
        return this.f68737c;
    }

    public final String b() {
        return this.f68735a;
    }

    public final int c() {
        return this.f68739e;
    }

    public final boolean d() {
        return this.f68738d;
    }

    public final q e() {
        return this.f68740f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f68735a, cVar.f68735a) && Intrinsics.d(this.f68736b, cVar.f68736b) && Intrinsics.d(this.f68737c, cVar.f68737c) && this.f68738d == cVar.f68738d && this.f68739e == cVar.f68739e && this.f68740f == cVar.f68740f;
    }

    public final String f() {
        return this.f68736b.f22673b.f22665b;
    }

    public final bc2.q g() {
        return this.f68736b;
    }

    public final int hashCode() {
        return this.f68740f.hashCode() + ep.b.b(this.f68739e, ep.b.e(this.f68738d, (this.f68737c.hashCode() + ((this.f68736b.hashCode() + (this.f68735a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "PrefetchItem(mediaUid=" + this.f68735a + ", videoTracks=" + this.f68736b + ", dimensions=" + this.f68737c + ", shouldEnableAudio=" + this.f68738d + ", pinPosition=" + this.f68739e + ", trigger=" + this.f68740f + ")";
    }
}
