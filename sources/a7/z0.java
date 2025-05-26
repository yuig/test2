package a7;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a */
    public Object f1251a;

    /* renamed from: b */
    public Object f1252b;

    /* renamed from: c */
    public int f1253c;

    /* renamed from: d */
    public long f1254d;

    /* renamed from: e */
    public long f1255e;

    /* renamed from: f */
    public boolean f1256f;

    /* renamed from: g */
    public b f1257g = b.f945g;

    static {
        cb.s(0, 1, 2, 3, 4);
    }

    public final long a(int i13, int i14) {
        a a13 = this.f1257g.a(i13);
        if (a13.f909b != -1) {
            return a13.f914g[i14];
        }
        return -9223372036854775807L;
    }

    public final int b(long j13) {
        int i13;
        b bVar = this.f1257g;
        long j14 = this.f1254d;
        bVar.getClass();
        if (j13 == Long.MIN_VALUE) {
            return -1;
        }
        if (j14 != -9223372036854775807L && j13 >= j14) {
            return -1;
        }
        int i14 = bVar.f951e;
        while (true) {
            i13 = bVar.f948b;
            if (i14 >= i13 || ((bVar.a(i14).f908a == Long.MIN_VALUE || bVar.a(i14).f908a > j13) && bVar.a(i14).c())) {
                break;
            }
            i14++;
        }
        if (i14 < i13) {
            return i14;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r3.f909b == (-1)) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(long r14) {
        /*
            r13 = this;
            a7.b r0 = r13.f1257g
            long r1 = r13.f1254d
            int r3 = r0.f948b
            int r4 = r3 + (-1)
            r5 = 1
            int r3 = r3 - r5
            r6 = -9223372036854775808
            r8 = -1
            if (r4 != r3) goto L22
            a7.a r3 = r0.a(r4)
            boolean r9 = r3.f918k
            if (r9 == 0) goto L22
            long r9 = r3.f908a
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto L22
            int r3 = r3.f909b
            if (r3 != r8) goto L22
            goto L23
        L22:
            r5 = 0
        L23:
            int r4 = r4 - r5
        L24:
            if (r4 < 0) goto L57
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto L2b
            goto L57
        L2b:
            a7.a r3 = r0.a(r4)
            long r9 = r3.f908a
            int r5 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r5 != 0) goto L50
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r5 == 0) goto L54
            boolean r5 = r3.f918k
            if (r5 == 0) goto L4b
            int r5 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r5 != 0) goto L4b
            int r3 = r3.f909b
            if (r3 != r8) goto L4b
            goto L54
        L4b:
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r3 >= 0) goto L57
            goto L54
        L50:
            int r3 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r3 >= 0) goto L57
        L54:
            int r4 = r4 + (-1)
            goto L24
        L57:
            if (r4 < 0) goto L64
            a7.a r14 = r0.a(r4)
            boolean r14 = r14.b()
            if (r14 == 0) goto L64
            r8 = r4
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.z0.c(long):int");
    }

    public final long d(int i13) {
        return this.f1257g.a(i13).f908a;
    }

    public final long e() {
        return this.f1257g.f949c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z0.class.equals(obj.getClass())) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Objects.equals(this.f1251a, z0Var.f1251a) && Objects.equals(this.f1252b, z0Var.f1252b) && this.f1253c == z0Var.f1253c && this.f1254d == z0Var.f1254d && this.f1255e == z0Var.f1255e && this.f1256f == z0Var.f1256f && Objects.equals(this.f1257g, z0Var.f1257g);
    }

    public final int f(int i13, int i14) {
        a a13 = this.f1257g.a(i13);
        if (a13.f909b != -1) {
            return a13.f913f[i14];
        }
        return 0;
    }

    public final long g(int i13) {
        return this.f1257g.a(i13).f916i;
    }

    public final int h(int i13) {
        return this.f1257g.a(i13).a(-1);
    }

    public final int hashCode() {
        Object obj = this.f1251a;
        int hashCode = (RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f1252b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f1253c) * 31;
        long j13 = this.f1254d;
        int i13 = (hashCode2 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f1255e;
        return this.f1257g.hashCode() + ((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f1256f ? 1 : 0)) * 31);
    }

    public final long i() {
        return d7.n0.o0(this.f1255e);
    }

    public final long j() {
        return this.f1255e;
    }

    public final int k() {
        return this.f1257g.f951e;
    }

    public final boolean l(int i13) {
        return !this.f1257g.a(i13).b();
    }

    public final boolean m(int i13) {
        b bVar = this.f1257g;
        int i14 = bVar.f948b;
        if (i13 == i14 - 1 && i13 == i14 - 1) {
            a a13 = bVar.a(i13);
            if (a13.f918k && a13.f908a == Long.MIN_VALUE && a13.f909b == -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(int i13) {
        return this.f1257g.a(i13).f917j;
    }

    public final void o(Object obj, Object obj2, int i13, long j13, long j14, b bVar, boolean z13) {
        this.f1251a = obj;
        this.f1252b = obj2;
        this.f1253c = i13;
        this.f1254d = j13;
        this.f1255e = j14;
        this.f1257g = bVar;
        this.f1256f = z13;
    }
}
