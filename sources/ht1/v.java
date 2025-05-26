package ht1;

import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v implements mt1.b, mt1.d {

    /* renamed from: a, reason: collision with root package name */
    public final long f70359a;

    /* renamed from: b, reason: collision with root package name */
    public final mt1.e f70360b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f70361c;

    public v(long j13, mt1.j producer) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        this.f70359a = j13;
        this.f70360b = producer;
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
        long j14 = this.f70359a;
        mt1.e eVar = this.f70360b;
        if (j13 >= j14) {
            if (this.f70361c) {
                return;
            }
            this.f70361c = true;
            eVar.f();
            return;
        }
        if (incomingPacket.c() + j13 <= j14) {
            eVar.e(incomingPacket);
            return;
        }
        nt1.c cVar = incomingPacket.f62934b;
        Integer b13 = cVar.b();
        Intrinsics.f(b13);
        int g13 = (int) nt1.d.g(j14 - j13, nt1.d.f92294a, new nt1.e(1, b13.intValue()));
        int w13 = l3.c.w(g13, cVar);
        ByteBuffer byteBuffer = incomingPacket.f62935c;
        byteBuffer.limit(byteBuffer.position() + w13);
        eVar.e(new ft1.a(g13, incomingPacket.f62934b, byteBuffer, incomingPacket.f62936d, incomingPacket.f62937e));
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        this.f70360b.c(producePacketCallback);
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        this.f70360b.d(doneProducingCallback);
    }

    @Override // mt1.a
    public final void g() {
        if (this.f70361c) {
            return;
        }
        this.f70361c = true;
        this.f70360b.f();
    }

    public final String toString() {
        return a.a.o(new StringBuilder("DiscardPcmAudioBeforeTime lastPresentationTimeUs=[null] discardAfterTimeUs=["), this.f70359a, "] discardedPacketCount=[0]");
    }
}
