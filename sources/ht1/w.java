package ht1;

import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w implements mt1.b, mt1.d {

    /* renamed from: a, reason: collision with root package name */
    public final long f70365a;

    /* renamed from: b, reason: collision with root package name */
    public final mt1.e f70366b;

    public w(long j13, mt1.j producer) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        this.f70365a = j13;
        this.f70366b = producer;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        ft1.a incomingPacket = (ft1.a) obj;
        Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
        String c13 = incomingPacket.f62934b.c();
        if (!Intrinsics.d(c13, "audio/raw")) {
            throw new RuntimeException(a.a.k("PCM audio is required, but found MIME-Type [", c13, "]"));
        }
        long j13 = incomingPacket.f62937e;
        long j14 = this.f70365a;
        mt1.e eVar = this.f70366b;
        if (j13 >= j14) {
            eVar.e(incomingPacket);
            return;
        }
        if (incomingPacket.c() + j13 > j14) {
            long j15 = j14 - j13;
            nt1.c cVar = incomingPacket.f62934b;
            Integer b13 = cVar.b();
            Intrinsics.f(b13);
            int g13 = (int) nt1.d.g(j15, nt1.d.f92294a, new nt1.e(1, b13.intValue()));
            int w13 = l3.c.w(g13, cVar);
            ByteBuffer byteBuffer = incomingPacket.f62935c;
            byteBuffer.position(byteBuffer.position() + w13);
            eVar.e(new ft1.a(incomingPacket.f62933a - g13, incomingPacket.f62934b, byteBuffer, incomingPacket.f62936d, j13 + j15));
        }
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        this.f70366b.c(producePacketCallback);
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        this.f70366b.d(doneProducingCallback);
    }

    @Override // mt1.a
    public final void g() {
        this.f70366b.f();
    }

    public final String toString() {
        return a.a.o(new StringBuilder("DiscardPcmAudioBeforeTime lastPresentationTimeUs=[null] discardBeforeTimeUs=["), this.f70365a, "] discardedPacketCount=[0]");
    }
}
