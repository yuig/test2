package ht1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends mt1.i {

    /* renamed from: d, reason: collision with root package name */
    public int f70357d;

    @Override // mt1.a
    public final void a(Object obj) {
        et1.k incomingPacket = (et1.k) obj;
        Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
        int i13 = this.f70357d;
        if (i13 != 2) {
            this.f70357d = i13 + 1;
        } else {
            e(incomingPacket);
        }
    }

    @Override // mt1.i
    public final String toString() {
        return a.a.e("DiscardInitialPackets discardedPacketCount=[", this.f70357d, "] initialPacketCountToDiscard=[2]");
    }
}
