package ot1;

import kh2.c3;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f97645a;

    /* renamed from: b, reason: collision with root package name */
    public final long f97646b;

    /* renamed from: c, reason: collision with root package name */
    public final long f97647c;

    /* renamed from: d, reason: collision with root package name */
    public final long f97648d;

    /* renamed from: e, reason: collision with root package name */
    public final long f97649e;

    /* renamed from: f, reason: collision with root package name */
    public final long f97650f;

    /* renamed from: g, reason: collision with root package name */
    public final long f97651g;

    public y(boolean z13, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f97645a = z13;
        this.f97646b = j13;
        this.f97647c = j14;
        this.f97648d = j15;
        this.f97649e = j16;
        this.f97650f = j17;
        this.f97651g = j18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f97645a == yVar.f97645a && this.f97646b == yVar.f97646b && this.f97647c == yVar.f97647c && this.f97648d == yVar.f97648d && this.f97649e == yVar.f97649e && this.f97650f == yVar.f97650f && this.f97651g == yVar.f97651g;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f97645a) * 31;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f97651g) + a.a.c(this.f97650f, a.a.c(this.f97649e, a.a.c(this.f97648d, a.a.c(this.f97647c, a.a.c(this.f97646b, hashCode, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        String s03 = c3.s0(this.f97646b);
        String s04 = c3.s0(this.f97647c);
        String s05 = c3.s0(this.f97648d);
        String s06 = c3.s0(this.f97649e);
        String s07 = c3.s0(this.f97650f);
        String s08 = c3.s0(this.f97651g);
        StringBuilder sb3 = new StringBuilder("BitstreamRestrictions(motionVectorsOverPicBoundaries=");
        sb3.append(this.f97645a);
        sb3.append(", maxBytesPerPicDenom=");
        sb3.append(s03);
        sb3.append(", maxBitsPerMbDenom=");
        a.a.B(sb3, s04, ", log2MaxMvLengthHorizontal=", s05, ", log2MaxMvLengthVertical=");
        a.a.B(sb3, s06, ", maxNumReorderFrames=", s07, ", maxDecFrameBuffering=");
        return a.a.p(sb3, s08, ")");
    }
}
