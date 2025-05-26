package ht1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 extends mt1.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f70226d;

    /* renamed from: e, reason: collision with root package name */
    public Long f70227e;

    public g0(int i13) {
        this.f70226d = i13;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        switch (this.f70226d) {
            case 0:
                ft1.a incomingPacket = (ft1.a) obj;
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                Long l13 = this.f70227e;
                if (l13 != null) {
                    long longValue = l13.longValue();
                    long j13 = incomingPacket.f62937e;
                    if (longValue >= j13) {
                        throw new RuntimeException(a.a.o(a.a.u("Non-increasing timestamp. Previous time [", longValue, "] current time ["), j13, "]"));
                    }
                }
                this.f70227e = Long.valueOf(incomingPacket.f62937e);
                e(incomingPacket);
                return;
            default:
                et1.k incomingPacket2 = (et1.k) obj;
                Intrinsics.checkNotNullParameter(incomingPacket2, "incomingPacket");
                Long l14 = this.f70227e;
                if (l14 != null) {
                    long longValue2 = l14.longValue();
                    long j14 = incomingPacket2.f60040d;
                    if (longValue2 >= j14) {
                        throw new RuntimeException(a.a.o(a.a.u("Non-increasing timestamp. Previous time [", longValue2, "] current time ["), j14, "]"));
                    }
                }
                this.f70227e = Long.valueOf(incomingPacket2.f60040d);
                e(incomingPacket2);
                return;
        }
    }

    @Override // mt1.i
    public final String toString() {
        switch (this.f70226d) {
            case 0:
                return "IncreasingAudioPacketTimestampChecker lastTimestamp=[" + this.f70227e + "]";
            default:
                return "IncreasingMediaPacketTimestampChecker lastTimestamp=[" + this.f70227e + "]";
        }
    }
}
