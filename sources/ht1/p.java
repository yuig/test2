package ht1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends mt1.i {

    /* renamed from: d, reason: collision with root package name */
    public jt1.d f70299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f70300e;

    public p(q qVar) {
        this.f70300e = qVar;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        long longValue = ((Number) obj).longValue();
        if (0 > longValue || longValue > 2147483647L) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i13 = (int) longValue;
        q qVar = this.f70300e;
        if (i13 > 0) {
            nt1.c cVar = qVar.f70311g;
            if (cVar == null) {
                Intrinsics.r("audioFormat");
                throw null;
            }
            int w13 = l3.c.w(i13, cVar);
            ByteBuffer byteBuffer = qVar.f70309e;
            if (byteBuffer == null) {
                Intrinsics.r("dispatchBuffer");
                throw null;
            }
            if (w13 > byteBuffer.capacity()) {
                ByteBuffer byteBuffer2 = qVar.f70309e;
                if (byteBuffer2 == null) {
                    Intrinsics.r("dispatchBuffer");
                    throw null;
                }
                int capacity = byteBuffer2.capacity();
                while (capacity < w13) {
                    capacity *= 2;
                }
                ByteBuffer allocate = ByteBuffer.allocate(capacity);
                Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
                qVar.f70309e = allocate;
                if (allocate == null) {
                    Intrinsics.r("dispatchBuffer");
                    throw null;
                }
                ByteOrder byteOrder = qVar.f70312h;
                if (byteOrder == null) {
                    Intrinsics.r("byteOrder");
                    throw null;
                }
                allocate.order(byteOrder);
            }
            it1.a aVar = qVar.f70307c;
            ByteBuffer byteBuffer3 = qVar.f70309e;
            if (byteBuffer3 == null) {
                Intrinsics.r("dispatchBuffer");
                throw null;
            }
            aVar.a(qVar.f70310f, w13, byteBuffer3);
            nt1.c cVar2 = qVar.f70311g;
            if (cVar2 == null) {
                Intrinsics.r("audioFormat");
                throw null;
            }
            ByteBuffer byteBuffer4 = qVar.f70309e;
            if (byteBuffer4 == null) {
                Intrinsics.r("dispatchBuffer");
                throw null;
            }
            Long l13 = qVar.f70314j;
            Intrinsics.f(l13);
            long longValue2 = l13.longValue();
            long j13 = qVar.f70315k;
            nt1.e eVar = qVar.f70316l;
            if (eVar == null) {
                Intrinsics.r("audioClockPeriod");
                throw null;
            }
            long g13 = nt1.d.g(j13, eVar, nt1.d.f92294a) + longValue2;
            ft1.a aVar2 = new ft1.a(i13, cVar2, byteBuffer4, true, g13);
            qVar.f70313i = Integer.valueOf(i13);
            qVar.f70315k += i13;
            this.f70299d = new jt1.d(g13, aVar2.c());
            e(aVar2);
            int i14 = qVar.f70307c.f73677d;
            if (qVar.f70311g == null) {
                Intrinsics.r("audioFormat");
                throw null;
            }
            qVar.f70322r.e(Long.valueOf(l3.c.x(i14, r1)));
        }
        if (qVar.f70307c.f73677d == 0 && qVar.f70317m && !qVar.f70318n) {
            qVar.f70318n = true;
            qVar.f70322r.f();
            qVar.f70320p.f();
        }
    }

    @Override // mt1.i, mt1.a
    public final void g() {
        q qVar = this.f70300e;
        if (qVar.f70318n) {
            return;
        }
        qVar.f70318n = true;
        qVar.f70322r.f();
        qVar.f70320p.f();
    }

    @Override // mt1.i
    public final String toString() {
        return "Send Audio Frames: time span of last sent packet [" + this.f70299d + "]";
    }
}
