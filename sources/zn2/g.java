package zn2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;

/* loaded from: classes2.dex */
public abstract class g implements TimeMark, Comparable {
    public static long a(long j13) {
        long j14;
        long j15;
        f.f142316a.getClass();
        long a13 = f.a();
        d unit = d.NANOSECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j13 - 1) | 1) == Long.MAX_VALUE) {
            if (j13 < 0) {
                b.f142311b.getClass();
                j15 = b.f142313d;
            } else {
                b.f142311b.getClass();
                j15 = b.f142312c;
            }
            return b.p(j15);
        }
        long j16 = a13 - j13;
        if (((j16 ^ a13) & (~(j16 ^ j13))) >= 0) {
            return dl2.b.Q2(j16, unit);
        }
        d dVar = d.MILLISECONDS;
        if (unit.compareTo(dVar) < 0) {
            long b13 = e.b(1L, dVar, unit);
            long j17 = (a13 / b13) - (j13 / b13);
            long j18 = (a13 % b13) - (j13 % b13);
            a aVar = b.f142311b;
            return b.k(dl2.b.Q2(j17, dVar), dl2.b.Q2(j18, unit));
        }
        if (j16 < 0) {
            b.f142311b.getClass();
            j14 = b.f142313d;
        } else {
            b.f142311b.getClass();
            j14 = b.f142312c;
        }
        return b.p(j14);
    }
}
