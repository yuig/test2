package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f98079a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98080b;

    /* renamed from: c, reason: collision with root package name */
    public final String f98081c;

    /* renamed from: d, reason: collision with root package name */
    public final int f98082d;

    /* renamed from: e, reason: collision with root package name */
    public final int f98083e;

    /* renamed from: f, reason: collision with root package name */
    public final int f98084f;

    /* renamed from: g, reason: collision with root package name */
    public final long f98085g;

    /* renamed from: h, reason: collision with root package name */
    public final long f98086h;

    /* renamed from: i, reason: collision with root package name */
    public final String f98087i;

    public i2(String uniqueIdentifier, int i13, String pageId, int i14, int i15, int i16, long j13, long j14, String mediaDetails) {
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(mediaDetails, "mediaDetails");
        this.f98079a = uniqueIdentifier;
        this.f98080b = i13;
        this.f98081c = pageId;
        this.f98082d = i14;
        this.f98083e = i15;
        this.f98084f = i16;
        this.f98085g = j13;
        this.f98086h = j14;
        this.f98087i = mediaDetails;
    }

    public final int a() {
        return this.f98082d;
    }

    public final int b() {
        return this.f98084f;
    }

    public final String c() {
        return this.f98087i;
    }

    public final String d() {
        return this.f98081c;
    }

    public final int e() {
        return this.f98080b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return Intrinsics.d(this.f98079a, i2Var.f98079a) && this.f98080b == i2Var.f98080b && Intrinsics.d(this.f98081c, i2Var.f98081c) && this.f98082d == i2Var.f98082d && this.f98083e == i2Var.f98083e && this.f98084f == i2Var.f98084f && this.f98085g == i2Var.f98085g && this.f98086h == i2Var.f98086h && Intrinsics.d(this.f98087i, i2Var.f98087i);
    }

    public final long f() {
        return this.f98085g;
    }

    public final long g() {
        return this.f98086h;
    }

    public final String h() {
        return this.f98079a;
    }

    public final int hashCode() {
        return this.f98087i.hashCode() + a.a.c(this.f98086h, a.a.c(this.f98085g, ep.b.b(this.f98084f, ep.b.b(this.f98083e, ep.b.b(this.f98082d, cb.d(this.f98081c, ep.b.b(this.f98080b, this.f98079a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final int i() {
        return this.f98083e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StartEvent(uniqueIdentifier=");
        sb3.append(this.f98079a);
        sb3.append(", retryCount=");
        sb3.append(this.f98080b);
        sb3.append(", pageId=");
        sb3.append(this.f98081c);
        sb3.append(", imageCount=");
        sb3.append(this.f98082d);
        sb3.append(", videoCount=");
        sb3.append(this.f98083e);
        sb3.append(", mediaCount=");
        sb3.append(this.f98084f);
        sb3.append(", totalRawFileSize=");
        sb3.append(this.f98085g);
        sb3.append(", totalVideoRawDuration=");
        sb3.append(this.f98086h);
        sb3.append(", mediaDetails=");
        return a.a.p(sb3, this.f98087i, ")");
    }
}
