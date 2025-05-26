package ht1;

import java.nio.ByteBuffer;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 implements mt1.b, mt1.e {

    /* renamed from: a, reason: collision with root package name */
    public nt1.c f70206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mt1.j f70207b;

    /* renamed from: c, reason: collision with root package name */
    public nt1.b f70208c;

    public d0(nt1.c sourceAudioFormat, et1.h0 simpleProducerFactory) {
        Intrinsics.checkNotNullParameter(sourceAudioFormat, "sourceAudioFormat");
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        this.f70206a = sourceAudioFormat;
        simpleProducerFactory.getClass();
        this.f70207b = new mt1.j();
        this.f70208c = ft1.b.a(this.f70206a, false, y0.b(new Pair("pcm-encoding", 2)), 26);
    }

    @Override // mt1.a
    public final void a(Object obj) {
        ft1.a audioPacket = (ft1.a) obj;
        Intrinsics.checkNotNullParameter(audioPacket, "incomingPacket");
        int i13 = 1;
        boolean z13 = !Intrinsics.d(audioPacket.f62934b, this.f70206a);
        nt1.c cVar = audioPacket.f62934b;
        if (z13) {
            this.f70206a = cVar;
            this.f70208c = ft1.b.a(cVar, false, y0.b(new Pair("pcm-encoding", 2)), 26);
        }
        Intrinsics.checkNotNullParameter(audioPacket, "audioPacket");
        ByteBuffer byteBuffer = audioPacket.f62935c;
        int x13 = l3.c.x(byteBuffer.limit() - byteBuffer.position(), cVar);
        Integer h10 = this.f70206a.h();
        Intrinsics.f(h10);
        int intValue = h10.intValue() * x13;
        ft1.a packet = ft1.b.b(x13, this.f70208c, audioPacket.f62937e);
        ByteBuffer byteBuffer2 = packet.f62935c;
        if (1 <= intValue) {
            while (true) {
                byteBuffer2.putShort((short) (ql2.s.f(byteBuffer.getFloat(), -1.0f, 1.0f) * 32767.0f));
                if (i13 == intValue) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        byteBuffer2.rewind();
        Intrinsics.checkNotNullParameter(packet, "packet");
        this.f70207b.e(packet);
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        mt1.j jVar = this.f70207b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        jVar.f88162b = producePacketCallback;
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        mt1.j jVar = this.f70207b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        jVar.f88161a = doneProducingCallback;
    }

    @Override // mt1.e
    public final void e(Object obj) {
        ft1.a packet = (ft1.a) obj;
        Intrinsics.checkNotNullParameter(packet, "packet");
        this.f70207b.e(packet);
    }

    @Override // mt1.e
    public final void f() {
        this.f70207b.f();
    }

    @Override // mt1.a
    public final void g() {
        f();
    }

    public final String toString() {
        return "PCM type converter: float -> short";
    }
}
