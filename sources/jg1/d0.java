package jg1;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f75957a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.j f75958b;

    /* renamed from: c, reason: collision with root package name */
    public final long f75959c;

    /* renamed from: d, reason: collision with root package name */
    public final long f75960d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f75961e;

    /* renamed from: f, reason: collision with root package name */
    public final int f75962f;

    /* renamed from: g, reason: collision with root package name */
    public final long f75963g;

    /* renamed from: h, reason: collision with root package name */
    public final int f75964h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f75965i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f75966j;

    public d0(String name, et1.j mediaExtractor, long j13, long j14, Size inputResolution, int i13, long j15, int i14, boolean z13) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mediaExtractor, "mediaExtractor");
        Intrinsics.checkNotNullParameter(inputResolution, "inputResolution");
        this.f75957a = name;
        this.f75958b = mediaExtractor;
        this.f75959c = j13;
        this.f75960d = j14;
        this.f75961e = inputResolution;
        this.f75962f = i13;
        this.f75963g = j15;
        this.f75964h = i14;
        this.f75965i = z13;
        this.f75966j = new float[9];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f75957a, d0Var.f75957a) && Intrinsics.d(this.f75958b, d0Var.f75958b) && this.f75959c == d0Var.f75959c && this.f75960d == d0Var.f75960d && Intrinsics.d(this.f75961e, d0Var.f75961e) && this.f75962f == d0Var.f75962f && this.f75963g == d0Var.f75963g && this.f75964h == d0Var.f75964h && this.f75965i == d0Var.f75965i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75965i) + ep.b.b(this.f75964h, a.a.c(this.f75963g, ep.b.b(this.f75962f, (this.f75961e.hashCode() + a.a.c(this.f75960d, a.a.c(this.f75959c, (this.f75958b.hashCode() + (this.f75957a.hashCode() * 31)) * 31, 31), 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoSegment(name=");
        sb3.append(this.f75957a);
        sb3.append(", mediaExtractor=");
        sb3.append(this.f75958b);
        sb3.append(", inputStartTimeUs=");
        sb3.append(this.f75959c);
        sb3.append(", inputEndTimeUs=");
        sb3.append(this.f75960d);
        sb3.append(", inputResolution=");
        sb3.append(this.f75961e);
        sb3.append(", trackIndex=");
        sb3.append(this.f75962f);
        sb3.append(", outputStartTimeUs=");
        sb3.append(this.f75963g);
        sb3.append(", videoRotation=");
        sb3.append(this.f75964h);
        sb3.append(", isFromFrontFacingCamera=");
        return a.a.r(sb3, this.f75965i, ")");
    }
}
