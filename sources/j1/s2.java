package j1;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public final class s2 implements u, j8.a, le.y {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f74236a;

    public s2() {
        this.f74236a = new ArrayList();
    }

    @Override // j8.a
    public pk.c1 a(long j13) {
        int g13 = g(j13);
        if (g13 == 0) {
            pk.y0 y0Var = pk.c1.f100372b;
            return pk.v2.f100502e;
        }
        l9.a aVar = (l9.a) this.f74236a.get(g13 - 1);
        long j14 = aVar.f82297d;
        if (j14 == -9223372036854775807L || j13 < j14) {
            return aVar.f82294a;
        }
        pk.y0 y0Var2 = pk.c1.f100372b;
        return pk.v2.f100502e;
    }

    @Override // j8.a
    public long b(long j13) {
        ArrayList arrayList = this.f74236a;
        if (arrayList.isEmpty() || j13 < ((l9.a) arrayList.get(0)).f82295b) {
            return -9223372036854775807L;
        }
        for (int i13 = 1; i13 < arrayList.size(); i13++) {
            long j14 = ((l9.a) arrayList.get(i13)).f82295b;
            if (j13 == j14) {
                return j14;
            }
            if (j13 < j14) {
                l9.a aVar = (l9.a) arrayList.get(i13 - 1);
                long j15 = aVar.f82297d;
                return (j15 == -9223372036854775807L || j15 > j13) ? aVar.f82295b : j15;
            }
        }
        l9.a aVar2 = (l9.a) com.bumptech.glide.c.P(arrayList);
        long j16 = aVar2.f82297d;
        return (j16 == -9223372036854775807L || j13 < j16) ? aVar2.f82295b : j16;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // j8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(l9.a r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f82295b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            bf.b.i(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.f82297d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.f74236a
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            l9.a r7 = (l9.a) r7
            long r7 = r7.f82295b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            l9.a r7 = (l9.a) r7
            long r7 = r7.f82295b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.s2.c(l9.a, long):boolean");
    }

    @Override // j8.a
    public void clear() {
        this.f74236a.clear();
    }

    @Override // j8.a
    public long d(long j13) {
        ArrayList arrayList = this.f74236a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j13 < ((l9.a) arrayList.get(0)).f82295b) {
            return ((l9.a) arrayList.get(0)).f82295b;
        }
        for (int i13 = 1; i13 < arrayList.size(); i13++) {
            l9.a aVar = (l9.a) arrayList.get(i13);
            if (j13 < aVar.f82295b) {
                long j14 = ((l9.a) arrayList.get(i13 - 1)).f82297d;
                long j15 = aVar.f82295b;
                return (j14 == -9223372036854775807L || j14 <= j13 || j14 >= j15) ? j15 : j14;
            }
        }
        long j16 = ((l9.a) com.bumptech.glide.c.P(arrayList)).f82297d;
        if (j16 == -9223372036854775807L || j13 >= j16) {
            return Long.MIN_VALUE;
        }
        return j16;
    }

    @Override // le.y
    public void e(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f74236a.add(t3.s1.e(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2, Locale.US, "%s=%s", "java.lang.String.format(locale, format, *args)"));
    }

    @Override // j8.a
    public void f(long j13) {
        int g13 = g(j13);
        if (g13 == 0) {
            return;
        }
        ArrayList arrayList = this.f74236a;
        long j14 = ((l9.a) arrayList.get(g13 - 1)).f82297d;
        if (j14 == -9223372036854775807L || j14 >= j13) {
            g13--;
        }
        arrayList.subList(0, g13).clear();
    }

    public int g(long j13) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f74236a;
            if (i13 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j13 < ((l9.a) arrayList.get(i13)).f82295b) {
                return i13;
            }
            i13++;
        }
    }

    @Override // j1.u
    public i0 get(int i13) {
        return (k0) this.f74236a.get(i13);
    }

    public s2(float f13, float f14, t tVar) {
        IntRange q13 = ql2.s.q(0, tVar.b());
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(q13, 10));
        ql2.k it = q13.iterator();
        while (it.f104109c) {
            arrayList.add(new k0(f13, f14, tVar.a(it.b())));
        }
        this.f74236a = arrayList;
    }

    public s2(ArrayList arrayList) {
        this.f74236a = arrayList;
    }
}
