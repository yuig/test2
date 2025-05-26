package jg1;

import et1.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final et1.j f75914a;

    /* renamed from: b, reason: collision with root package name */
    public final long f75915b;

    /* renamed from: c, reason: collision with root package name */
    public final long f75916c;

    /* renamed from: d, reason: collision with root package name */
    public final long f75917d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f75918e;

    /* renamed from: f, reason: collision with root package name */
    public final int f75919f;

    public b0(et1.j mediaExtractor, long j13, long j14, long j15, j0 sampleType) {
        Intrinsics.checkNotNullParameter(mediaExtractor, "mediaExtractor");
        Intrinsics.checkNotNullParameter(sampleType, "sampleType");
        this.f75914a = mediaExtractor;
        this.f75915b = j13;
        this.f75916c = j14;
        this.f75917d = j15;
        this.f75918e = sampleType;
        this.f75919f = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f75914a, b0Var.f75914a) && this.f75915b == b0Var.f75915b && this.f75916c == b0Var.f75916c && this.f75917d == b0Var.f75917d && this.f75918e == b0Var.f75918e && this.f75919f == b0Var.f75919f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f75919f) + ((this.f75918e.hashCode() + a.a.c(this.f75917d, a.a.c(this.f75916c, a.a.c(this.f75915b, this.f75914a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrackCopyComposerInput(mediaExtractor=");
        sb3.append(this.f75914a);
        sb3.append(", presentationTimeOffsetUs=");
        sb3.append(this.f75915b);
        sb3.append(", inputStartTimeUs=");
        sb3.append(this.f75916c);
        sb3.append(", inputEndTimeUs=");
        sb3.append(this.f75917d);
        sb3.append(", sampleType=");
        sb3.append(this.f75918e);
        sb3.append(", trackIndexForSampleType=");
        return a.a.n(sb3, this.f75919f, ")");
    }
}
