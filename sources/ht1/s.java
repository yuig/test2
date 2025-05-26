package ht1;

import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements mt1.b {

    /* renamed from: a, reason: collision with root package name */
    public final nt1.c f70336a;

    /* renamed from: b, reason: collision with root package name */
    public final nt1.c f70337b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f70338c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f70339d;

    /* renamed from: e, reason: collision with root package name */
    public final int f70340e;

    /* renamed from: f, reason: collision with root package name */
    public final short[][] f70341f;

    /* renamed from: g, reason: collision with root package name */
    public long f70342g;

    /* renamed from: h, reason: collision with root package name */
    public long f70343h;

    /* renamed from: i, reason: collision with root package name */
    public final float f70344i;

    /* renamed from: j, reason: collision with root package name */
    public final float f70345j;

    /* renamed from: k, reason: collision with root package name */
    public long f70346k;

    /* renamed from: l, reason: collision with root package name */
    public long f70347l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f70348m;

    public s(nt1.b sourceAudioFormat, nt1.b targetAudioFormat) {
        Intrinsics.checkNotNullParameter(sourceAudioFormat, "sourceAudioFormat");
        Intrinsics.checkNotNullParameter(targetAudioFormat, "targetAudioFormat");
        this.f70336a = sourceAudioFormat;
        this.f70337b = targetAudioFormat;
        Integer h10 = sourceAudioFormat.h();
        Intrinsics.f(h10);
        int intValue = h10.intValue();
        this.f70340e = intValue;
        short[][] sArr = new short[intValue][];
        for (int i13 = 0; i13 < intValue; i13++) {
            sArr[i13] = new short[4];
        }
        this.f70341f = sArr;
        Integer b13 = this.f70337b.b();
        Intrinsics.f(b13);
        float intValue2 = b13.intValue();
        Intrinsics.f(this.f70336a.b());
        float intValue3 = intValue2 / r4.intValue();
        this.f70344i = intValue3;
        this.f70345j = 1.0f / intValue3;
        this.f70346k = -4L;
        this.f70347l = -3L;
        this.f70348m = nt1.d.a(8192);
        ft1.i g13 = this.f70336a.g();
        ft1.i iVar = t.f70351a;
        if (g13 != iVar) {
            throw new RuntimeException("Resampler input PcmType must be " + iVar);
        }
        if (this.f70337b.g() == iVar) {
            return;
        }
        throw new RuntimeException("Resampler output PcmType must be " + iVar);
    }

    @Override // mt1.a
    public final void a(Object obj) {
        ft1.a incomingPacket = (ft1.a) obj;
        Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
        if (incomingPacket.f62933a == 0) {
            return;
        }
        long j13 = this.f70342g;
        ByteBuffer byteBuffer = incomingPacket.f62935c;
        if (j13 == 0) {
            byteBuffer.mark();
            h(byteBuffer);
            byteBuffer.reset();
        }
        int i13 = incomingPacket.f62933a;
        ft1.i pcmType = ft1.i.Short;
        Intrinsics.checkNotNullParameter(pcmType, "pcmType");
        int i14 = this.f70340e;
        int size = pcmType.getSize() * ((int) Math.ceil((i13 + 1) * this.f70344i)) * i14;
        if (this.f70348m.capacity() < size) {
            this.f70348m = nt1.d.a(size);
        }
        this.f70348m.clear();
        long j14 = this.f70343h;
        loop0: while (true) {
            float f13 = j14 * this.f70345j;
            while (f13 >= this.f70347l) {
                if (!byteBuffer.hasRemaining()) {
                    break loop0;
                } else {
                    h(byteBuffer);
                }
            }
            float f14 = f13 - this.f70346k;
            char c13 = 0;
            int i15 = 0;
            while (i15 < i14) {
                short[] sArr = this.f70341f[i15];
                float f15 = sArr[c13];
                float f16 = (-0.5f) * f15;
                float f17 = sArr[1];
                float f18 = sArr[2];
                float f19 = sArr[3] * 0.5f;
                float f23 = (((f17 * 1.5f) + f16) - (1.5f * f18)) + f19;
                float f24 = ((f18 * 2.0f) + (f15 - (2.5f * f17))) - f19;
                double d2 = f14;
                this.f70348m.putShort((short) ml2.c.c((((f18 * 0.5f) + f16) * f14) + (f24 * ((float) Math.pow(d2, 2.0f))) + (f23 * ((float) Math.pow(d2, 3.0f))) + f17));
                i15++;
                incomingPacket = incomingPacket;
                i13 = i13;
                c13 = 0;
            }
            j14++;
            incomingPacket = incomingPacket;
            i13 = i13;
        }
        int i16 = (int) (j14 - this.f70343h);
        this.f70348m.flip();
        if (i16 > 0) {
            ft1.a aVar = new ft1.a(i16, this.f70337b, this.f70348m, true, incomingPacket.f62937e);
            this.f70343h += i16;
            Function1 function1 = this.f70338c;
            if (function1 != null) {
                function1.invoke(aVar);
            }
            this.f70348m.clear();
        }
        this.f70342g += i13;
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        this.f70338c = producePacketCallback;
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        this.f70339d = doneProducingCallback;
    }

    @Override // mt1.a
    public final void g() {
        Function0 function0 = this.f70339d;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void h(ByteBuffer byteBuffer) {
        for (int i13 = 0; i13 < this.f70340e; i13++) {
            short[] sArr = this.f70341f[i13];
            short s13 = byteBuffer.getShort();
            Intrinsics.checkNotNullParameter(sArr, "<this>");
            int length = sArr.length - 1;
            int i14 = 0;
            while (i14 < length) {
                int i15 = i14 + 1;
                sArr[i14] = sArr[i15];
                i14 = i15;
            }
            Intrinsics.checkNotNullParameter(sArr, "<this>");
            sArr[sArr.length - 1] = s13;
        }
        this.f70346k++;
        this.f70347l++;
    }

    public final String toString() {
        return "Audio Resampler - source format [" + this.f70336a + "] target format [" + this.f70337b + "]";
    }
}
