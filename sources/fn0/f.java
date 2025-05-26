package fn0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    public static final f f62617g = new f(-1, bn0.b.f23562c, 0, 0, 0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f62618a;

    /* renamed from: b, reason: collision with root package name */
    public final bn0.b f62619b;

    /* renamed from: c, reason: collision with root package name */
    public final int f62620c;

    /* renamed from: d, reason: collision with root package name */
    public final long f62621d;

    /* renamed from: e, reason: collision with root package name */
    public final int f62622e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f62623f;

    public f(int i13, bn0.b image, int i14, long j13, int i15, boolean z13) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f62618a = i13;
        this.f62619b = image;
        this.f62620c = i14;
        this.f62621d = j13;
        this.f62622e = i15;
        this.f62623f = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f62618a == fVar.f62618a && Intrinsics.d(this.f62619b, fVar.f62619b) && this.f62620c == fVar.f62620c && this.f62621d == fVar.f62621d && this.f62622e == fVar.f62622e && this.f62623f == fVar.f62623f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62623f) + ep.b.b(this.f62622e, a.a.c(this.f62621d, ep.b.b(this.f62620c, (this.f62619b.hashCode() + (Integer.hashCode(this.f62618a) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "WatermarkVideoFrame(frameIndex=" + this.f62618a + ", image=" + this.f62619b + ", dataSize=" + this.f62620c + ", presentationTimeUs=" + this.f62621d + ", flags=" + this.f62622e + ", isEndOfStream=" + this.f62623f + ")";
    }
}
