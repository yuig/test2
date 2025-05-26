package ht1;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 implements mt1.b, mt1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70266a;

    /* renamed from: b, reason: collision with root package name */
    public nt1.c f70267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mt1.j f70268c;

    /* renamed from: d, reason: collision with root package name */
    public nt1.b f70269d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f70270e;

    public l0(nt1.c sourceAudioFormat, et1.h0 simpleProducerFactory, int i13) {
        this.f70266a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(sourceAudioFormat, "sourceAudioFormat");
            Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
            this.f70267b = sourceAudioFormat;
            simpleProducerFactory.getClass();
            this.f70268c = new mt1.j();
            this.f70269d = h(this.f70267b);
            return;
        }
        Intrinsics.checkNotNullParameter(sourceAudioFormat, "sourceAudioFormat");
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        this.f70267b = sourceAudioFormat;
        simpleProducerFactory.getClass();
        this.f70268c = new mt1.j();
        this.f70269d = ft1.b.a(this.f70267b, false, y0.b(new Pair("pcm-encoding", 4)), 26);
        this.f70270e = this.f70267b.g() == ft1.i.Float;
    }

    public static nt1.b h(nt1.c cVar) {
        return ft1.b.a(cVar, false, z0.g(new Pair("channel-count", 2), new Pair("channel-mask", 12)), 26);
    }

    @Override // mt1.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f70266a) {
            case 0:
                i((ft1.a) obj);
                break;
            default:
                i((ft1.a) obj);
                break;
        }
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        int i13 = this.f70266a;
        mt1.j jVar = this.f70268c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
                jVar.getClass();
                Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
                jVar.f88162b = producePacketCallback;
                break;
            default:
                Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
                jVar.getClass();
                Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
                jVar.f88162b = producePacketCallback;
                break;
        }
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        int i13 = this.f70266a;
        mt1.j jVar = this.f70268c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
                jVar.getClass();
                Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
                jVar.f88161a = doneProducingCallback;
                break;
            default:
                Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
                jVar.getClass();
                Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
                jVar.f88161a = doneProducingCallback;
                break;
        }
    }

    @Override // mt1.e
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        switch (this.f70266a) {
            case 0:
                j((ft1.a) obj);
                break;
            default:
                j((ft1.a) obj);
                break;
        }
    }

    @Override // mt1.e
    public final void f() {
        int i13 = this.f70266a;
        mt1.j jVar = this.f70268c;
        switch (i13) {
            case 0:
                jVar.f();
                break;
            default:
                jVar.f();
                break;
        }
    }

    @Override // mt1.a
    public final void g() {
        switch (this.f70266a) {
            case 0:
                f();
                break;
            default:
                f();
                break;
        }
    }

    public final void i(ft1.a incomingPacket) {
        Unit unit;
        int i13 = 1;
        switch (this.f70266a) {
            case 0:
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                Integer h10 = incomingPacket.f62934b.h();
                boolean z13 = this.f70270e;
                nt1.c cVar = incomingPacket.f62934b;
                if (!z13) {
                    this.f70270e = true;
                    this.f70267b = cVar;
                    this.f70269d = h(cVar);
                }
                if (h10 != null && h10.intValue() == 2) {
                    j(incomingPacket);
                    return;
                }
                if (h10 == null || h10.intValue() != 1) {
                    throw new RuntimeException("Mono input is required, but the source has [" + h10 + "] channels");
                }
                nt1.b bVar = this.f70269d;
                int i14 = incomingPacket.f62933a;
                ft1.a b13 = ft1.b.b(i14, bVar, incomingPacket.f62937e);
                ft1.i g13 = cVar.g();
                Intrinsics.f(g13);
                int i15 = k0.f70264a[g13.ordinal()];
                ByteBuffer byteBuffer = incomingPacket.f62935c;
                ByteBuffer byteBuffer2 = b13.f62935c;
                if (i15 == 1) {
                    if (1 <= i14) {
                        while (true) {
                            byte b14 = byteBuffer.get();
                            byteBuffer2.put(b14);
                            byteBuffer2.put(b14);
                            if (i13 != i14) {
                                i13++;
                            }
                        }
                    }
                    unit = Unit.f80348a;
                } else if (i15 == 2) {
                    if (1 <= i14) {
                        while (true) {
                            short s13 = byteBuffer.getShort();
                            byteBuffer2.putShort(s13);
                            byteBuffer2.putShort(s13);
                            if (i13 != i14) {
                                i13++;
                            }
                        }
                    }
                    unit = Unit.f80348a;
                } else if (i15 == 3) {
                    if (1 <= i14) {
                        while (true) {
                            byte b15 = byteBuffer.get();
                            byte b16 = byteBuffer.get();
                            byte b17 = byteBuffer.get();
                            byteBuffer2.put(b15).put(b16).put(b17);
                            byteBuffer2.put(b15).put(b16).put(b17);
                            if (i13 != i14) {
                                i13++;
                            }
                        }
                    }
                    unit = Unit.f80348a;
                } else if (i15 == 4) {
                    if (1 <= i14) {
                        while (true) {
                            int i16 = byteBuffer.getInt();
                            byteBuffer2.putInt(i16);
                            byteBuffer2.putInt(i16);
                            if (i13 != i14) {
                                i13++;
                            }
                        }
                    }
                    unit = Unit.f80348a;
                } else {
                    if (i15 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (1 <= i14) {
                        while (true) {
                            float f13 = byteBuffer.getFloat();
                            byteBuffer2.putFloat(f13);
                            byteBuffer2.putFloat(f13);
                            if (i13 != i14) {
                                i13++;
                            }
                        }
                    }
                    unit = Unit.f80348a;
                }
                el.a.B(unit);
                byteBuffer2.rewind();
                j(b13);
                return;
            default:
                Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
                boolean d2 = Intrinsics.d(incomingPacket.f62934b, this.f70267b);
                nt1.c cVar2 = incomingPacket.f62934b;
                if (!d2) {
                    this.f70267b = cVar2;
                    this.f70269d = ft1.b.a(cVar2, false, y0.b(new Pair("pcm-encoding", 4)), 26);
                    this.f70270e = this.f70267b.g() == ft1.i.Float;
                }
                Intrinsics.checkNotNullParameter(incomingPacket, "audioPacket");
                ByteBuffer byteBuffer3 = incomingPacket.f62935c;
                int x13 = l3.c.x(byteBuffer3.limit() - byteBuffer3.position(), cVar2);
                Integer h13 = this.f70267b.h();
                Intrinsics.f(h13);
                int intValue = h13.intValue() * x13;
                ft1.a b18 = ft1.b.b(x13, this.f70269d, incomingPacket.f62937e);
                ByteBuffer byteBuffer4 = b18.f62935c;
                if (1 <= intValue) {
                    while (true) {
                        byteBuffer4.putFloat(ql2.s.a(byteBuffer3.getShort() * 3.051851E-5f, -1.0f));
                        if (i13 != intValue) {
                            i13++;
                        }
                    }
                }
                byteBuffer4.rewind();
                j(b18);
                return;
        }
    }

    public final void j(ft1.a packet) {
        int i13 = this.f70266a;
        mt1.j jVar = this.f70268c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(packet, "packet");
                jVar.e(packet);
                break;
            default:
                Intrinsics.checkNotNullParameter(packet, "packet");
                jVar.e(packet);
                break;
        }
    }

    public final String toString() {
        switch (this.f70266a) {
            case 0:
                return "Channel converter: mono -> stereo";
            default:
                return "PCM type converter: short -> float";
        }
    }
}
