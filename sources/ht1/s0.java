package ht1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s0 extends mt1.i {

    /* renamed from: d, reason: collision with root package name */
    public final long f70349d;

    /* renamed from: e, reason: collision with root package name */
    public Long f70350e;

    public s0(long j13) {
        this.f70349d = j13;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        ft1.a incomingPacket = (ft1.a) obj;
        Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
        if (this.f70350e == null) {
            this.f70350e = Long.valueOf(this.f70349d - incomingPacket.f62937e);
        }
        int i13 = incomingPacket.f62933a;
        Long l13 = this.f70350e;
        Intrinsics.f(l13);
        long longValue = l13.longValue() + incomingPacket.f62937e;
        e(new ft1.a(i13, incomingPacket.f62934b, incomingPacket.f62935c, incomingPacket.f62936d, longValue));
    }

    @Override // mt1.i
    public final String toString() {
        return "StartTimeSetterNode startTimeUs=[" + this.f70349d + "] timestampAdjustmentUs=[" + this.f70350e + "]";
    }
}
