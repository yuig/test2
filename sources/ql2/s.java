package ql2;

import java.util.NoSuchElementException;
import jk.v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public class s extends r {
    public static float a(float f13, float f14) {
        return f13 < f14 ? f14 : f13;
    }

    public static long b(long j13, long j14) {
        return j13 < j14 ? j14 : j13;
    }

    public static float c(float f13, float f14) {
        return f13 > f14 ? f14 : f13;
    }

    public static long d(long j13, long j14) {
        return j13 > j14 ? j14 : j13;
    }

    public static double e(double d2, double d13, double d14) {
        if (d13 <= d14) {
            return d2 < d13 ? d13 : d2 > d14 ? d14 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d14 + " is less than minimum " + d13 + '.');
    }

    public static float f(float f13, float f14, float f15) {
        if (f14 <= f15) {
            return f13 < f14 ? f14 : f13 > f15 ? f15 : f13;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f15 + " is less than minimum " + f14 + '.');
    }

    public static int g(int i13, int i14, int i15) {
        if (i14 <= i15) {
            return i13 < i14 ? i14 : i13 > i15 ? i15 : i13;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i15 + " is less than minimum " + i14 + '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int h(int i13, IntRange range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof h) {
            return ((Number) k(Integer.valueOf(i13), (h) range)).intValue();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        int i14 = range.f80453a;
        if (i13 < Integer.valueOf(i14).intValue()) {
            return Integer.valueOf(i14).intValue();
        }
        int i15 = range.f80454b;
        return i13 > Integer.valueOf(i15).intValue() ? Integer.valueOf(i15).intValue() : i13;
    }

    public static long i(long j13, long j14, long j15) {
        if (j14 <= j15) {
            return j13 < j14 ? j14 : j13 > j15 ? j15 : j13;
        }
        StringBuilder u13 = a.a.u("Cannot coerce value to an empty range: maximum ", j15, " is less than minimum ");
        u13.append(j14);
        u13.append('.');
        throw new IllegalArgumentException(u13.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long j(long j13, q range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof h) {
            return ((Number) k(Long.valueOf(j13), (h) range)).longValue();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        long j14 = range.f104112a;
        if (j13 < Long.valueOf(j14).longValue()) {
            return Long.valueOf(j14).longValue();
        }
        long j15 = range.f104113b;
        return j13 > Long.valueOf(j15).longValue() ? Long.valueOf(j15).longValue() : j13;
    }

    public static Comparable k(Comparable comparable, h range) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return (!range.b(comparable, range.c()) || range.b(range.c(), comparable)) ? (!range.b(range.d(), comparable) || range.b(comparable, range.d())) ? comparable : range.d() : range.c();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static boolean l(float f13, f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.a(Double.valueOf(f13));
    }

    public static kotlin.ranges.a m(int i13, int i14) {
        kotlin.ranges.a.f80452d.getClass();
        return new kotlin.ranges.a(i13, i14, -1);
    }

    public static int n(ol2.e random, IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return v.a0(random, intRange);
        } catch (IllegalArgumentException e13) {
            throw new NoSuchElementException(e13.getMessage());
        }
    }

    public static kotlin.ranges.a o(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        j jVar = kotlin.ranges.a.f80452d;
        int i13 = intRange.f80454b;
        int i14 = -intRange.f80455c;
        jVar.getClass();
        return new kotlin.ranges.a(i13, intRange.f80453a, i14);
    }

    public static kotlin.ranges.a p(IntRange intRange, int i13) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        boolean z13 = i13 > 0;
        Integer step = Integer.valueOf(i13);
        Intrinsics.checkNotNullParameter(step, "step");
        if (!z13) {
            throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
        }
        j jVar = kotlin.ranges.a.f80452d;
        int i14 = intRange.f80453a;
        if (intRange.f80455c <= 0) {
            i13 = -i13;
        }
        jVar.getClass();
        return new kotlin.ranges.a(i14, intRange.f80454b, i13);
    }

    public static IntRange q(int i13, int i14) {
        if (i14 > Integer.MIN_VALUE) {
            return new IntRange(i13, i14 - 1, 1);
        }
        IntRange.f80450e.getClass();
        return IntRange.f80451f;
    }
}
