package ht1;

import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 implements mt1.b, mt1.e {

    /* renamed from: a, reason: collision with root package name */
    public nt1.c f70171a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70172b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f70173c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mt1.j f70174d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f70175e;

    /* renamed from: f, reason: collision with root package name */
    public int f70176f;

    /* renamed from: g, reason: collision with root package name */
    public nt1.e f70177g;

    /* renamed from: h, reason: collision with root package name */
    public int f70178h;

    /* renamed from: i, reason: collision with root package name */
    public ft1.i f70179i;

    /* renamed from: j, reason: collision with root package name */
    public long f70180j;

    public c0(int i13, et1.h0 simpleProducerFactory, nt1.c audioFormat) {
        Intrinsics.checkNotNullParameter(audioFormat, "audioFormat");
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        this.f70171a = audioFormat;
        this.f70172b = i13;
        this.f70173c = false;
        simpleProducerFactory.getClass();
        this.f70174d = new mt1.j();
        this.f70175e = nt1.d.a(0);
        this.f70177g = new nt1.e(0, 1);
        if (i13 <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // mt1.a
    public final void a(Object obj) {
        ft1.a incomingPacket = (ft1.a) obj;
        Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
        ByteBuffer byteBuffer = incomingPacket.f62935c;
        if (this.f70176f == 0) {
            nt1.c cVar = incomingPacket.f62934b;
            this.f70171a = cVar;
            int w13 = l3.c.w(this.f70172b, cVar);
            this.f70176f = w13;
            this.f70175e = nt1.d.a(w13);
            Integer b13 = cVar.b();
            Intrinsics.f(b13);
            this.f70177g = new nt1.e(1, b13.intValue());
            Integer h10 = this.f70171a.h();
            Intrinsics.f(h10);
            this.f70178h = h10.intValue();
            ft1.i g13 = this.f70171a.g();
            Intrinsics.f(g13);
            this.f70179i = g13;
        }
        ft1.i pcmType = this.f70179i;
        Intrinsics.f(pcmType);
        int position = this.f70175e.position();
        int i13 = this.f70178h;
        Intrinsics.checkNotNullParameter(pcmType, "pcmType");
        int size = (position / pcmType.getSize()) / i13;
        nt1.e clockPeriod = this.f70177g;
        Intrinsics.checkNotNullParameter(clockPeriod, "clockPeriod");
        long c13 = ml2.c.c(clockPeriod.a() * size * 1000000);
        long j13 = incomingPacket.f62937e;
        this.f70180j = j13 - c13;
        int limit = byteBuffer.limit();
        int i14 = 0;
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(this.f70175e.remaining(), byteBuffer.remaining());
            int i15 = this.f70178h;
            Intrinsics.checkNotNullParameter(pcmType, "pcmType");
            int size2 = (min / pcmType.getSize()) / i15;
            byteBuffer.limit(byteBuffer.position() + min);
            nt1.d.f(pcmType.getSize(), this.f70175e, byteBuffer);
            byteBuffer.limit(limit);
            if (this.f70175e.hasRemaining()) {
                return;
            }
            this.f70175e.rewind();
            ft1.a aVar = incomingPacket;
            ft1.a packet = new ft1.a(this.f70172b, incomingPacket.f62934b, this.f70175e, true, this.f70180j);
            Intrinsics.checkNotNullParameter(packet, "packet");
            this.f70174d.e(packet);
            this.f70175e.clear();
            i14 += size2;
            nt1.e clockPeriod2 = this.f70177g;
            Intrinsics.checkNotNullParameter(clockPeriod2, "clockPeriod");
            this.f70180j = ml2.c.c(clockPeriod2.a() * i14 * r4) + j13;
            byteBuffer = byteBuffer;
            incomingPacket = aVar;
        }
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        mt1.j jVar = this.f70174d;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        jVar.f88162b = producePacketCallback;
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        mt1.j jVar = this.f70174d;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        jVar.f88161a = doneProducingCallback;
    }

    @Override // mt1.e
    public final void e(Object obj) {
        ft1.a packet = (ft1.a) obj;
        Intrinsics.checkNotNullParameter(packet, "packet");
        this.f70174d.e(packet);
    }

    @Override // mt1.e
    public final void f() {
        this.f70174d.f();
    }

    @Override // mt1.a
    public final void g() {
        if (this.f70173c && this.f70175e.hasRemaining()) {
            this.f70175e.flip();
            int remaining = this.f70175e.remaining();
            Integer h10 = this.f70171a.h();
            Intrinsics.f(h10);
            int intValue = h10.intValue();
            ft1.i pcmType = this.f70171a.g();
            Intrinsics.f(pcmType);
            Intrinsics.checkNotNullParameter(pcmType, "pcmType");
            ft1.a packet = new ft1.a((remaining / pcmType.getSize()) / intValue, this.f70171a, this.f70175e, true, this.f70180j);
            Intrinsics.checkNotNullParameter(packet, "packet");
            this.f70174d.e(packet);
            this.f70175e.clear();
        }
        f();
    }

    public final String toString() {
        return "SendFixedSizePcmPackets fixedFrameCount=[" + this.f70172b + "] audioFormat=[" + this.f70171a + "] fixedAudioBuffer=[" + this.f70175e + "]";
    }
}
