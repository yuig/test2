package ht1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x extends mt1.i {

    /* renamed from: d, reason: collision with root package name */
    public final long f70371d;

    /* renamed from: e, reason: collision with root package name */
    public Long f70372e;

    /* renamed from: f, reason: collision with root package name */
    public long f70373f;

    public x(long j13) {
        this.f70371d = j13;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        ft1.a incomingPacket = (ft1.a) obj;
        Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
        if (this.f70372e == null) {
            this.f70372e = Long.valueOf(incomingPacket.f62937e);
        }
        Long l13 = this.f70372e;
        Intrinsics.f(l13);
        long longValue = l13.longValue();
        long j13 = this.f70373f;
        long j14 = longValue + j13;
        this.f70373f = incomingPacket.c() + j13;
        long j15 = incomingPacket.f62937e;
        long j16 = j14 - j15;
        long j17 = this.f70371d;
        if (j17 < 0 || Math.abs(j16) <= j17) {
            e(ft1.a.b(incomingPacket, null, j14, 15));
            return;
        }
        StringBuilder u13 = a.a.u("Timestamp exceeds tolerance. Calculated timestamp [", j14, "]µs Incoming timestamp [");
        u13.append(j15);
        u13.append("]µs required adjustment [");
        u13.append(j16);
        u13.append("]µs");
        throw new RuntimeException(u13.toString());
    }

    @Override // mt1.i
    public final String toString() {
        return "Duration-based timestamp setter: tolerance [" + this.f70371d + "]µs initial time [" + this.f70372e + "]µs sentAudioDuration [" + this.f70373f + "]µs";
    }
}
