package f9;

import d7.d0;

/* loaded from: classes3.dex */
public final class h extends b {

    /* renamed from: a, reason: collision with root package name */
    public final long f61434a;

    /* renamed from: b, reason: collision with root package name */
    public final long f61435b;

    public h(long j13, long j14) {
        this.f61434a = j13;
        this.f61435b = j14;
    }

    public static long d(long j13, d0 d0Var) {
        long y13 = d0Var.y();
        if ((128 & y13) != 0) {
            return 8589934591L & ((((y13 & 1) << 32) | d0Var.A()) + j13);
        }
        return -9223372036854775807L;
    }

    @Override // f9.b
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb3.append(this.f61434a);
        sb3.append(", playbackPositionUs= ");
        return a.a.o(sb3, this.f61435b, " }");
    }
}
