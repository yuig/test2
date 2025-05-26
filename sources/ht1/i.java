package ht1;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements mt1.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f70236a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f70237b;

    /* renamed from: c, reason: collision with root package name */
    public nt1.c f70238c;

    /* renamed from: d, reason: collision with root package name */
    public final String f70239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f70240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f70241f;

    public i(String str, j jVar) {
        this.f70240e = str;
        this.f70241f = jVar;
        this.f70239d = str;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        ft1.a incomingPacket = (ft1.a) obj;
        Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
        j jVar = this.f70241f;
        nt1.c cVar = jVar.f70249c;
        String str = this.f70240e;
        if (cVar == null) {
            jVar.c(incomingPacket.f62934b, str);
            nt1.c cVar2 = incomingPacket.f62934b;
            jVar.f70249c = cVar2;
            jVar.f70256j.e(cVar2);
        }
        if (this.f70238c == null) {
            nt1.c cVar3 = jVar.f70249c;
            Intrinsics.f(cVar3);
            nt1.c cVar4 = incomingPacket.f62934b;
            jVar.c(cVar4, str);
            Integer b13 = cVar3.b();
            Intrinsics.f(b13);
            int intValue = b13.intValue();
            Integer b14 = cVar4.b();
            Intrinsics.f(b14);
            int intValue2 = b14.intValue();
            if (intValue != intValue2) {
                StringBuilder sb3 = new StringBuilder("Unexpected sample rate [");
                sb3.append(intValue2);
                sb3.append("] for track [");
                sb3.append(str);
                sb3.append("]. Expected sample rate [");
                throw new IllegalArgumentException(a.a.n(sb3, intValue, "].").toString());
            }
            Integer h10 = cVar3.h();
            Intrinsics.f(h10);
            int intValue3 = h10.intValue();
            Integer h13 = cVar4.h();
            Intrinsics.f(h13);
            int intValue4 = h13.intValue();
            if (intValue3 != intValue4) {
                StringBuilder sb4 = new StringBuilder("Unexpected channel count [");
                sb4.append(intValue4);
                sb4.append("] for track [");
                sb4.append(str);
                sb4.append("]. Expected sample rate [");
                throw new IllegalArgumentException(a.a.n(sb4, intValue3, "].").toString());
            }
            this.f70238c = incomingPacket.f62934b;
        }
        LinkedHashMap linkedHashMap = jVar.f70248b;
        boolean isEmpty = linkedHashMap.isEmpty();
        ft1.i iVar = jVar.f70250d;
        if (!isEmpty) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (!(!((i) ((Map.Entry) it.next()).getValue()).f70237b)) {
                    long j13 = incomingPacket.f62937e;
                    Long l13 = jVar.f70252f;
                    Intrinsics.f(l13);
                    long longValue = l13.longValue();
                    String str2 = this.f70239d;
                    if (j13 != longValue) {
                        throw new RuntimeException("Mixer received unaligned start time. Expected start time [" + jVar.f70252f + "]. Actual start time [" + incomingPacket.f62937e + "] from track [" + str2 + "]");
                    }
                    Integer num = jVar.f70253g;
                    int i13 = incomingPacket.f62933a;
                    if (num == null || num.intValue() != i13) {
                        Integer num2 = jVar.f70253g;
                        StringBuilder sb5 = new StringBuilder("Mixer received unaligned frame count. Expected frame count [");
                        sb5.append(num2);
                        sb5.append("]. Actual frame count [");
                        sb5.append(i13);
                        sb5.append("] from track [");
                        throw new RuntimeException(a.a.p(sb5, str2, "]."));
                    }
                    ByteBuffer byteBuffer = jVar.f70251e;
                    ByteBuffer byteBuffer2 = incomingPacket.f62935c;
                    kotlin.ranges.a p13 = ql2.s.p(ql2.s.q(0, byteBuffer2.remaining()), iVar.getSize());
                    int i14 = p13.f80453a;
                    int i15 = p13.f80454b;
                    int i16 = p13.f80455c;
                    if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                        while (true) {
                            byteBuffer.putFloat(i14, byteBuffer.getFloat(i14) + byteBuffer2.getFloat(i14));
                            if (i14 == i15) {
                                break;
                            } else {
                                i14 += i16;
                            }
                        }
                    }
                    this.f70237b = true;
                    j.a(jVar);
                }
            }
        }
        jVar.f70252f = Long.valueOf(incomingPacket.f62937e);
        jVar.f70253g = Integer.valueOf(incomingPacket.f62933a);
        int capacity = jVar.f70251e.capacity();
        ByteBuffer byteBuffer3 = incomingPacket.f62935c;
        if (capacity < byteBuffer3.remaining()) {
            jVar.f70251e = nt1.d.a(byteBuffer3.remaining());
        }
        jVar.f70251e.clear();
        nt1.d.f(iVar.getSize(), jVar.f70251e, byteBuffer3);
        jVar.f70251e.flip();
        this.f70237b = true;
        j.a(jVar);
    }

    @Override // mt1.a
    public final void g() {
        j jVar = this.f70241f;
        ((et1.u0) ((et1.v0) jVar.f70247a).f60109a).c(this);
        this.f70236a = true;
        if (!jVar.f70248b.isEmpty()) {
            j.a(jVar);
        }
        if (jVar.b()) {
            jVar.f70254h = true;
            jVar.f70255i.f();
        }
    }

    public final String toString() {
        return "Mixer Input Track: mixed audio for this track? [" + this.f70237b + "] reached end? [" + this.f70236a + "]";
    }
}
