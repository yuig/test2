package ac2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class d {
    public static final String a(long j13, q1 placement, e1 roundingType) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(roundingType, "roundingType");
        if (j13 > 0) {
            return b(j13, placement, roundingType);
        }
        int i13 = c.f1940a[placement.ordinal()];
        return i13 != 1 ? i13 != 2 ? "" : "0:00" : "00:00";
    }

    public static final String b(long j13, q1 placement, e1 roundingType) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(roundingType, "roundingType");
        if (j13 < 0) {
            return "";
        }
        double milliseconds = j13 / pb0.i.SECONDS.getMilliseconds();
        long d2 = e1.ROUND == roundingType ? ml2.c.d(milliseconds) : (long) Math.floor(milliseconds);
        pb0.i iVar = pb0.i.MINUTES;
        long seconds = d2 % iVar.getSeconds();
        long seconds2 = (d2 / iVar.getSeconds()) % iVar.getSeconds();
        long seconds3 = d2 / pb0.i.HOURS.getSeconds();
        if (seconds3 > 0) {
            return df.j1.Y("%d:%02d:%02d", new Object[]{Long.valueOf(seconds3), Long.valueOf(seconds2), Long.valueOf(seconds)}, null, 6);
        }
        int i13 = c.f1940a[placement.ordinal()];
        return df.j1.Y(i13 != 1 ? i13 != 2 ? "%d:%02d" : "%2d:%02d" : "%02d:%02d", new Object[]{Long.valueOf(seconds2), Long.valueOf(seconds)}, null, 6);
    }

    public static final u50.i0 c(long j13, q1 placement, e1 roundingType) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(roundingType, "roundingType");
        if (j13 <= 0) {
            int i13 = c.f1940a[placement.ordinal()];
            if (i13 == 1) {
                return new u50.f0("00:00");
            }
            if (i13 != 2) {
                return null;
            }
            return new u50.f0("0:00");
        }
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(roundingType, "roundingType");
        if (j13 < 0) {
            return null;
        }
        double milliseconds = j13 / pb0.i.SECONDS.getMilliseconds();
        long d2 = e1.ROUND == roundingType ? ml2.c.d(milliseconds) : (long) Math.floor(milliseconds);
        pb0.i iVar = pb0.i.MINUTES;
        long seconds = d2 % iVar.getSeconds();
        long seconds2 = (d2 / iVar.getSeconds()) % iVar.getSeconds();
        long seconds3 = d2 / pb0.i.HOURS.getSeconds();
        if (seconds3 > 0) {
            return new ub0.a("%d:%02d:%02d", kotlin.collections.f0.j(Long.valueOf(seconds3), Long.valueOf(seconds2), Long.valueOf(seconds)));
        }
        int i14 = c.f1940a[placement.ordinal()];
        return new ub0.a(i14 != 1 ? i14 != 2 ? "%d:%02d" : "%2d:%02d" : "%02d:%02d", kotlin.collections.f0.j(Long.valueOf(seconds2), Long.valueOf(seconds)));
    }
}
