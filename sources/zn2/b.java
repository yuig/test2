package zn2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ql2.q;
import ql2.s;

/* loaded from: classes2.dex */
public final class b implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f142311b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f142312c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f142313d;

    /* renamed from: a, reason: collision with root package name */
    public final long f142314a;

    static {
        int i13 = c.f142315a;
        f142312c = dl2.b.g0(4611686018427387903L);
        f142313d = dl2.b.g0(-4611686018427387903L);
    }

    public /* synthetic */ b(long j13) {
        this.f142314a = j13;
    }

    public static final long a(long j13, long j14) {
        long j15 = 1000000;
        long j16 = j14 / j15;
        long j17 = j13 + j16;
        if (!new q(-4611686018426L, 4611686018426L).e(j17)) {
            return dl2.b.g0(s.i(j17, -4611686018427387903L, 4611686018427387903L));
        }
        return dl2.b.i0((j17 * j15) + (j14 - (j16 * j15)));
    }

    public static final void b(StringBuilder sb3, int i13, int i14, int i15, String str, boolean z13) {
        sb3.append(i13);
        if (i14 != 0) {
            sb3.append('.');
            String Q = StringsKt.Q(String.valueOf(i14), i15);
            int i16 = -1;
            int length = Q.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i17 = length - 1;
                    if (Q.charAt(length) != '0') {
                        i16 = length;
                        break;
                    } else if (i17 < 0) {
                        break;
                    } else {
                        length = i17;
                    }
                }
            }
            int i18 = i16 + 1;
            if (z13 || i18 >= 3) {
                sb3.append((CharSequence) Q, 0, ((i16 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
            } else {
                sb3.append((CharSequence) Q, 0, i18);
                Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
            }
        }
        sb3.append(str);
    }

    public static int c(long j13, long j14) {
        long j15 = j13 ^ j14;
        if (j15 < 0 || (((int) j15) & 1) == 0) {
            return Intrinsics.j(j13, j14);
        }
        int i13 = (((int) j13) & 1) - (((int) j14) & 1);
        return j13 < 0 ? -i13 : i13;
    }

    public static final boolean d(long j13, long j14) {
        return j13 == j14;
    }

    public static final long e(long j13) {
        return ((((int) j13) & 1) == 1 && h(j13)) ? j13 >> 1 : n(j13, d.MILLISECONDS);
    }

    public static final long f(long j13) {
        long j14 = j13 >> 1;
        if ((((int) j13) & 1) == 0) {
            return j14;
        }
        if (j14 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j14 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j14 * 1000000;
    }

    public static final int g(long j13) {
        if (i(j13)) {
            return 0;
        }
        return (int) ((((int) j13) & 1) == 1 ? ((j13 >> 1) % 1000) * 1000000 : (j13 >> 1) % 1000000000);
    }

    public static final boolean h(long j13) {
        return !i(j13);
    }

    public static final boolean i(long j13) {
        return j13 == f142312c || j13 == f142313d;
    }

    public static final long j(long j13, long j14) {
        return k(j13, p(j14));
    }

    public static final long k(long j13, long j14) {
        if (i(j13)) {
            if (h(j14) || (j14 ^ j13) >= 0) {
                return j13;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (i(j14)) {
            return j14;
        }
        int i13 = ((int) j13) & 1;
        if (i13 != (((int) j14) & 1)) {
            return i13 == 1 ? a(j13 >> 1, j14 >> 1) : a(j14 >> 1, j13 >> 1);
        }
        long j15 = (j13 >> 1) + (j14 >> 1);
        return i13 == 0 ? new q(-4611686018426999999L, 4611686018426999999L).e(j15) ? dl2.b.i0(j15) : dl2.b.g0(j15 / 1000000) : dl2.b.h0(j15);
    }

    public static final long l(double d2, long j13) {
        double a13;
        int b13 = ml2.c.b(d2);
        if (b13 == d2) {
            return m(b13, j13);
        }
        int i13 = ((int) j13) & 1;
        d unit = i13 == 0 ? d.NANOSECONDS : d.MILLISECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j13 == f142312c) {
            a13 = Double.POSITIVE_INFINITY;
        } else if (j13 == f142313d) {
            a13 = Double.NEGATIVE_INFINITY;
        } else {
            a13 = e.a(j13 >> 1, i13 == 0 ? d.NANOSECONDS : d.MILLISECONDS, unit);
        }
        return dl2.b.O2(a13 * d2, unit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if ((ml2.c.a(r19) * r5) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
    
        if ((ml2.c.a(r19) * r5) > 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long m(int r19, long r20) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zn2.b.m(int, long):long");
    }

    public static final long n(long j13, d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j13 == f142312c) {
            return Long.MAX_VALUE;
        }
        if (j13 == f142313d) {
            return Long.MIN_VALUE;
        }
        return e.b(j13 >> 1, (((int) j13) & 1) == 0 ? d.NANOSECONDS : d.MILLISECONDS, unit);
    }

    public static String o(long j13) {
        int i13;
        if (j13 == 0) {
            return "0s";
        }
        if (j13 == f142312c) {
            return "Infinity";
        }
        if (j13 == f142313d) {
            return "-Infinity";
        }
        boolean z13 = j13 < 0;
        StringBuilder sb3 = new StringBuilder();
        if (z13) {
            sb3.append('-');
        }
        long p13 = j13 < 0 ? p(j13) : j13;
        long n13 = n(p13, d.DAYS);
        int n14 = i(p13) ? 0 : (int) (n(p13, d.HOURS) % 24);
        int n15 = i(p13) ? 0 : (int) (n(p13, d.MINUTES) % 60);
        int n16 = i(p13) ? 0 : (int) (n(p13, d.SECONDS) % 60);
        int g13 = g(p13);
        boolean z14 = n13 != 0;
        boolean z15 = n14 != 0;
        boolean z16 = n15 != 0;
        boolean z17 = (n16 == 0 && g13 == 0) ? false : true;
        if (z14) {
            sb3.append(n13);
            sb3.append('d');
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (z15 || (z14 && (z16 || z17))) {
            int i14 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            sb3.append(n14);
            sb3.append('h');
            i13 = i14;
        }
        if (z16 || (z17 && (z15 || z14))) {
            int i15 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            sb3.append(n15);
            sb3.append('m');
            i13 = i15;
        }
        if (z17) {
            int i16 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            if (n16 != 0 || z14 || z15 || z16) {
                b(sb3, n16, g13, 9, "s", false);
            } else if (g13 >= 1000000) {
                b(sb3, g13 / 1000000, g13 % 1000000, 6, "ms", false);
            } else if (g13 >= 1000) {
                b(sb3, g13 / 1000, g13 % 1000, 3, "us", false);
            } else {
                sb3.append(g13);
                sb3.append("ns");
            }
            i13 = i16;
        }
        if (z13 && i13 > 1) {
            sb3.insert(1, '(').append(')');
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static final long p(long j13) {
        long j14 = ((-(j13 >> 1)) << 1) + (((int) j13) & 1);
        int i13 = c.f142315a;
        return j14;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f142314a, ((b) obj).f142314a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f142314a == ((b) obj).f142314a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f142314a);
    }

    public final String toString() {
        return o(this.f142314a);
    }
}
