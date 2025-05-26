package jg1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f75897a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.j f75898b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f75899c;

    /* renamed from: d, reason: collision with root package name */
    public final float f75900d;

    /* renamed from: e, reason: collision with root package name */
    public final long f75901e;

    /* renamed from: f, reason: collision with root package name */
    public final long f75902f;

    /* renamed from: g, reason: collision with root package name */
    public final long f75903g;

    public a(String name, et1.j mediaExtractor, boolean z13, float f13, long j13, long j14, long j15) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mediaExtractor, "mediaExtractor");
        this.f75897a = name;
        this.f75898b = mediaExtractor;
        this.f75899c = z13;
        this.f75900d = f13;
        this.f75901e = j13;
        this.f75902f = j14;
        this.f75903g = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f75897a, aVar.f75897a) && Intrinsics.d(this.f75898b, aVar.f75898b) && this.f75899c == aVar.f75899c && Float.compare(this.f75900d, aVar.f75900d) == 0 && this.f75901e == aVar.f75901e && this.f75902f == aVar.f75902f && this.f75903g == aVar.f75903g;
    }

    public final int hashCode() {
        return Long.hashCode(this.f75903g) + a.a.c(this.f75902f, a.a.c(this.f75901e, a.a.a(this.f75900d, ep.b.e(this.f75899c, (this.f75898b.hashCode() + (this.f75897a.hashCode() * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AudioSegment(name=");
        sb3.append(this.f75897a);
        sb3.append(", mediaExtractor=");
        sb3.append(this.f75898b);
        sb3.append(", useSilentAudio=");
        sb3.append(this.f75899c);
        sb3.append(", volume=");
        sb3.append(this.f75900d);
        sb3.append(", inputStartTimeUs=");
        sb3.append(this.f75901e);
        sb3.append(", inputEndTimeUs=");
        sb3.append(this.f75902f);
        sb3.append(", outputStartTimeUs=");
        return a.a.o(sb3, this.f75903g, ")");
    }
}
