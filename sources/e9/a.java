package e9;

import a7.m0;

/* loaded from: classes3.dex */
public final class a implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f57898a;

    /* renamed from: b, reason: collision with root package name */
    public final long f57899b;

    /* renamed from: c, reason: collision with root package name */
    public final long f57900c;

    /* renamed from: d, reason: collision with root package name */
    public final long f57901d;

    /* renamed from: e, reason: collision with root package name */
    public final long f57902e;

    public a(long j13, long j14, long j15, long j16, long j17) {
        this.f57898a = j13;
        this.f57899b = j14;
        this.f57900c = j15;
        this.f57901d = j16;
        this.f57902e = j17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f57898a == aVar.f57898a && this.f57899b == aVar.f57899b && this.f57900c == aVar.f57900c && this.f57901d == aVar.f57901d && this.f57902e == aVar.f57902e;
    }

    public final int hashCode() {
        return bs1.c.W0(this.f57902e) + ((bs1.c.W0(this.f57901d) + ((bs1.c.W0(this.f57900c) + ((bs1.c.W0(this.f57899b) + ((bs1.c.W0(this.f57898a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f57898a + ", photoSize=" + this.f57899b + ", photoPresentationTimestampUs=" + this.f57900c + ", videoStartPosition=" + this.f57901d + ", videoSize=" + this.f57902e;
    }
}
