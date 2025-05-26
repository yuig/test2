package mc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f86917a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86918b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86919c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f86920d;

    public d(Integer num, boolean z13, String url, boolean z14) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f86917a = url;
        this.f86918b = z13;
        this.f86919c = z14;
        this.f86920d = num;
    }

    public final boolean a() {
        return this.f86919c;
    }

    public final String b() {
        return this.f86917a;
    }

    public final boolean c() {
        return this.f86918b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f86917a, dVar.f86917a) && this.f86918b == dVar.f86918b && this.f86919c == dVar.f86919c && Intrinsics.d(this.f86920d, dVar.f86920d);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f86919c, ep.b.e(this.f86918b, this.f86917a.hashCode() * 31, 31), 31);
        Integer num = this.f86920d;
        return e13 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinterestPlaybackSessionMetadata(url=");
        sb3.append(this.f86917a);
        sb3.append(", isCloseup=");
        sb3.append(this.f86918b);
        sb3.append(", shouldEnableAudio=");
        sb3.append(this.f86919c);
        sb3.append(", viewportWidth=");
        return a.c.i(sb3, this.f86920d, ")");
    }
}
