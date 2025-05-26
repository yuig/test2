package kt1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import et1.f0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import nt1.f;

/* loaded from: classes4.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final b f80877a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f80878b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80879c;

    /* renamed from: d, reason: collision with root package name */
    public final long f80880d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f80881e;

    public e(c muxer, f0 runningMedianCalculatorFactory) {
        Intrinsics.checkNotNullParameter(muxer, "muxer");
        Intrinsics.checkNotNullParameter(runningMedianCalculatorFactory, "runningMedianCalculatorFactory");
        this.f80877a = muxer;
        this.f80878b = runningMedianCalculatorFactory;
        this.f80879c = 50;
        this.f80880d = 33333L;
        this.f80881e = new LinkedHashMap();
    }

    @Override // kt1.b
    public final void a() {
        this.f80877a.a();
    }

    @Override // kt1.b
    public final void b(int i13, MediaCodec.BufferInfo bufferInfo, ByteBuffer sampleData) {
        Intrinsics.checkNotNullParameter(sampleData, "sampleData");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        LinkedHashMap linkedHashMap = this.f80881e;
        Integer valueOf = Integer.valueOf(i13);
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            this.f80878b.getClass();
            obj = new d(new f(this.f80879c), bufferInfo.presentationTimeUs);
            linkedHashMap.put(valueOf, obj);
        }
        d dVar = (d) obj;
        int i14 = bufferInfo.flags & 4;
        f fVar = dVar.f80875a;
        if (i14 != 0) {
            Long l13 = (Long) fVar.a();
            bufferInfo.presentationTimeUs = dVar.f80876b + (l13 != null ? l13.longValue() : this.f80880d);
        }
        long j13 = bufferInfo.presentationTimeUs;
        long j14 = dVar.f80876b;
        if (j13 > j14) {
            Long value = Long.valueOf(j13 - j14);
            fVar.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = fVar.f92298b;
            int size = arrayList.size();
            int i15 = fVar.f92297a;
            if (size < i15) {
                arrayList.add(value);
            } else {
                arrayList.set(fVar.f92299c, value);
                int i16 = fVar.f92299c + 1;
                fVar.f92299c = i16;
                fVar.f92299c = i16 % i15;
            }
        }
        dVar.f80876b = bufferInfo.presentationTimeUs;
        this.f80877a.b(i13, bufferInfo, sampleData);
    }

    @Override // kt1.b
    public final int c(MediaFormat trackFormat) {
        Intrinsics.checkNotNullParameter(trackFormat, "trackFormat");
        return this.f80877a.c(trackFormat);
    }

    @Override // kt1.b
    public final void start() {
        this.f80877a.start();
    }

    @Override // kt1.b
    public final void stop() {
        this.f80877a.stop();
    }
}
