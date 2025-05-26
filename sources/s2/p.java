package s2;

import g1.g0;
import i2.a4;
import i2.r3;
import j1.x0;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a */
    public static final r3 f110666a = new r3();

    /* renamed from: b */
    public static final Object f110667b = new Object();

    /* renamed from: c */
    public static n f110668c;

    /* renamed from: d */
    public static int f110669d;

    /* renamed from: e */
    public static final l f110670e;

    /* renamed from: f */
    public static final x f110671f;

    /* renamed from: g */
    public static List f110672g;

    /* renamed from: h */
    public static List f110673h;

    /* renamed from: i */
    public static final AtomicReference f110674i;

    /* renamed from: j */
    public static final i f110675j;

    /* renamed from: k */
    public static final i2.g f110676k;

    static {
        n nVar = n.f110658e;
        f110668c = nVar;
        f110669d = 2;
        l lVar = new l();
        lVar.f110648b = new int[16];
        lVar.f110649c = new int[16];
        int[] iArr = new int[16];
        int i13 = 0;
        while (i13 < 16) {
            int i14 = i13 + 1;
            iArr[i13] = i14;
            i13 = i14;
        }
        lVar.f110650d = iArr;
        f110670e = lVar;
        x xVar = new x();
        xVar.f110708b = new int[16];
        xVar.f110709c = new a4[16];
        f110671f = xVar;
        q0 q0Var = q0.f80391a;
        f110672g = q0Var;
        f110673h = q0Var;
        int i15 = f110669d;
        f110669d = i15 + 1;
        b bVar = new b(i15, nVar);
        f110668c = f110668c.p(bVar.f110643b);
        AtomicReference atomicReference = new AtomicReference(bVar);
        f110674i = atomicReference;
        f110675j = (i) atomicReference.get();
        f110676k = new i2.g(0);
    }

    public static final void a() {
        f(o.f110663j);
    }

    public static final Function1 b(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new a(function1, function12, 1);
    }

    public static final HashMap c(c cVar, c cVar2, n nVar) {
        long[] jArr;
        int i13;
        n nVar2;
        long[] jArr2;
        int i14;
        n nVar3;
        g0 y13 = cVar2.y();
        int d2 = cVar.d();
        if (y13 != null) {
            n n13 = cVar2.e().p(cVar2.d()).n(cVar2.f110612j);
            Object[] objArr = y13.f63286b;
            long[] jArr3 = y13.f63285a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return null;
            }
            int i15 = 0;
            HashMap hashMap = null;
            loop0: while (true) {
                long j13 = jArr3[i15];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((255 & j13) < 128) {
                            z zVar = (z) objArr[(i15 << 3) + i18];
                            b0 d13 = zVar.d();
                            b0 s13 = s(d13, d2, nVar);
                            if (s13 == null) {
                                jArr2 = jArr3;
                            } else {
                                jArr2 = jArr3;
                                b0 s14 = s(d13, d2, n13);
                                if (s14 != null && !Intrinsics.d(s13, s14)) {
                                    i14 = d2;
                                    nVar3 = n13;
                                    b0 s15 = s(d13, cVar2.d(), cVar2.e());
                                    if (s15 == null) {
                                        r();
                                        throw null;
                                    }
                                    b0 b13 = zVar.b(s14, s13, s15);
                                    if (b13 == null) {
                                        break loop0;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s13, b13);
                                    hashMap = hashMap;
                                }
                            }
                            i14 = d2;
                            nVar3 = n13;
                        } else {
                            jArr2 = jArr3;
                            i14 = d2;
                            nVar3 = n13;
                        }
                        j13 >>= 8;
                        i18++;
                        i16 = 8;
                        jArr3 = jArr2;
                        d2 = i14;
                        n13 = nVar3;
                    }
                    jArr = jArr3;
                    i13 = d2;
                    nVar2 = n13;
                    if (i17 != i16) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    i13 = d2;
                    nVar2 = n13;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                jArr3 = jArr;
                d2 = i13;
                n13 = nVar2;
            }
            return hashMap;
        }
        return null;
    }

    public static final void d(i iVar) {
        int i13;
        if (f110668c.j(iVar.d())) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("Snapshot is not open: id=");
        sb3.append(iVar.d());
        sb3.append(", disposed=");
        sb3.append(iVar.f110644c);
        sb3.append(", applied=");
        c cVar = iVar instanceof c ? (c) iVar : null;
        sb3.append(cVar != null ? Boolean.valueOf(cVar.x()) : "read-only");
        sb3.append(", lowestPin=");
        synchronized (f110667b) {
            l lVar = f110670e;
            i13 = lVar.f110647a > 0 ? lVar.f110648b[0] : -1;
        }
        sb3.append(i13);
        throw new IllegalStateException(sb3.toString().toString());
    }

    public static final n e(int i13, int i14, n nVar) {
        while (i13 < i14) {
            nVar = nVar.p(i13);
            i13++;
        }
        return nVar;
    }

    public static final Object f(Function1 function1) {
        Object obj;
        g0 g0Var;
        Object v13;
        i iVar = f110675j;
        Intrinsics.g(iVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (f110667b) {
            try {
                obj = f110674i.get();
                g0Var = ((b) obj).f110610h;
                if (g0Var != null) {
                    f110676k.addAndGet(1);
                }
                v13 = v((i) obj, function1);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (g0Var != null) {
            try {
                List list = f110672g;
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((Function2) list.get(i13)).invoke(new k2.g(g0Var), obj);
                }
            } finally {
                f110676k.addAndGet(-1);
            }
        }
        synchronized (f110667b) {
            try {
                g();
                if (g0Var != null) {
                    Object[] objArr = g0Var.f63286b;
                    long[] jArr = g0Var.f63285a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j13 = jArr[i14];
                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i15 = 8 - ((~(i14 - length)) >>> 31);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    if ((255 & j13) < 128) {
                                        q((z) objArr[(i14 << 3) + i16]);
                                    }
                                    j13 >>= 8;
                                }
                                if (i15 != 8) {
                                    break;
                                }
                            }
                            if (i14 == length) {
                                break;
                            }
                            i14++;
                        }
                    }
                    Unit unit = Unit.f80348a;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return v13;
    }

    public static final void g() {
        x xVar = f110671f;
        int i13 = xVar.f110707a;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= i13) {
                break;
            }
            a4 a4Var = xVar.c()[i14];
            if ((a4Var != null ? a4Var.get() : null) != null && !(!p((z) r5))) {
                if (i15 != i14) {
                    xVar.c()[i15] = a4Var;
                    xVar.b()[i15] = xVar.b()[i14];
                }
                i15++;
            }
            i14++;
        }
        for (int i16 = i15; i16 < i13; i16++) {
            xVar.c()[i16] = null;
            xVar.b()[i16] = 0;
        }
        if (i15 != i13) {
            xVar.d(i15);
        }
    }

    public static final i h(i iVar, Function1 function1, boolean z13) {
        boolean z14 = iVar instanceof c;
        if (z14 || iVar == null) {
            return new e0(z14 ? (c) iVar : null, function1, null, false, z13);
        }
        return new f0(iVar, function1, z13);
    }

    public static final b0 i(b0 b0Var) {
        b0 s13;
        i k13 = k();
        b0 s14 = s(b0Var, k13.d(), k13.e());
        if (s14 != null) {
            return s14;
        }
        synchronized (f110667b) {
            i k14 = k();
            s13 = s(b0Var, k14.d(), k14.e());
        }
        if (s13 != null) {
            return s13;
        }
        r();
        throw null;
    }

    public static final b0 j(b0 b0Var, i iVar) {
        b0 s13 = s(b0Var, iVar.d(), iVar.e());
        if (s13 != null) {
            return s13;
        }
        r();
        throw null;
    }

    public static final i k() {
        i iVar = (i) f110666a.a();
        return iVar == null ? (i) f110674i.get() : iVar;
    }

    public static final Function1 l(Function1 function1, Function1 function12, boolean z13) {
        if (!z13) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new x0(20, function1, function12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final s2.b0 m(s2.b0 r12, s2.z r13) {
        /*
            s2.b0 r0 = r13.d()
            int r1 = s2.p.f110669d
            s2.l r2 = s2.p.f110670e
            int r3 = r2.f110647a
            r4 = 0
            if (r3 <= 0) goto L11
            int[] r1 = r2.f110648b
            r1 = r1[r4]
        L11:
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r5 = r3
        L15:
            if (r0 == 0) goto L57
            int r6 = r0.f110604a
            if (r6 != 0) goto L1d
        L1b:
            r3 = r0
            goto L57
        L1d:
            if (r6 == 0) goto L54
            if (r6 > r1) goto L54
            int r6 = r6 + 0
            r7 = 0
            r9 = 1
            r11 = 64
            if (r6 < 0) goto L35
            if (r6 >= r11) goto L35
            long r9 = r9 << r6
            long r9 = r9 & r7
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L44
        L33:
            r6 = r2
            goto L45
        L35:
            if (r6 < r11) goto L44
            r11 = 128(0x80, float:1.8E-43)
            if (r6 >= r11) goto L44
            int r6 = r6 + (-64)
            long r9 = r9 << r6
            long r9 = r9 & r7
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L44
            goto L33
        L44:
            r6 = r4
        L45:
            if (r6 != 0) goto L54
            if (r5 != 0) goto L4b
            r5 = r0
            goto L54
        L4b:
            int r1 = r0.f110604a
            int r2 = r5.f110604a
            if (r1 >= r2) goto L52
            goto L1b
        L52:
            r3 = r5
            goto L57
        L54:
            s2.b0 r0 = r0.f110605b
            goto L15
        L57:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == 0) goto L5f
            r3.f110604a = r0
            goto L6e
        L5f:
            s2.b0 r3 = r12.b()
            r3.f110604a = r0
            s2.b0 r12 = r13.d()
            r3.f110605b = r12
            r13.e(r3)
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.p.m(s2.b0, s2.z):s2.b0");
    }

    public static final void n(i iVar, z zVar) {
        iVar.s(iVar.h() + 1);
        Function1 i13 = iVar.i();
        if (i13 != null) {
            i13.invoke(zVar);
        }
    }

    public static final b0 o(b0 b0Var, z zVar, i iVar, b0 b0Var2) {
        b0 m13;
        if (iVar.g()) {
            iVar.n(zVar);
        }
        int d2 = iVar.d();
        if (b0Var2.f110604a == d2) {
            return b0Var2;
        }
        synchronized (f110667b) {
            m13 = m(b0Var, zVar);
        }
        m13.f110604a = d2;
        if (b0Var2.f110604a != 1) {
            iVar.n(zVar);
        }
        return m13;
    }

    public static final boolean p(z zVar) {
        b0 b0Var;
        int i13 = f110669d;
        l lVar = f110670e;
        if (lVar.f110647a > 0) {
            i13 = lVar.f110648b[0];
        }
        b0 b0Var2 = null;
        b0 b0Var3 = null;
        int i14 = 0;
        for (b0 d2 = zVar.d(); d2 != null; d2 = d2.f110605b) {
            int i15 = d2.f110604a;
            if (i15 != 0) {
                if (i15 >= i13) {
                    i14++;
                } else if (b0Var2 == null) {
                    i14++;
                    b0Var2 = d2;
                } else {
                    if (i15 < b0Var2.f110604a) {
                        b0Var = b0Var2;
                        b0Var2 = d2;
                    } else {
                        b0Var = d2;
                    }
                    if (b0Var3 == null) {
                        b0Var3 = zVar.d();
                        b0 b0Var4 = b0Var3;
                        while (true) {
                            if (b0Var3 == null) {
                                b0Var3 = b0Var4;
                                break;
                            }
                            int i16 = b0Var3.f110604a;
                            if (i16 >= i13) {
                                break;
                            }
                            if (b0Var4.f110604a < i16) {
                                b0Var4 = b0Var3;
                            }
                            b0Var3 = b0Var3.f110605b;
                        }
                    }
                    b0Var2.f110604a = 0;
                    b0Var2.a(b0Var3);
                    b0Var2 = b0Var;
                }
            }
        }
        return i14 > 1;
    }

    public static final void q(z zVar) {
        if (p(zVar)) {
            f110671f.a(zVar);
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final b0 s(b0 b0Var, int i13, n nVar) {
        b0 b0Var2 = null;
        while (b0Var != null) {
            int i14 = b0Var.f110604a;
            if (i14 != 0 && i14 <= i13 && !nVar.j(i14) && (b0Var2 == null || b0Var2.f110604a < b0Var.f110604a)) {
                b0Var2 = b0Var;
            }
            b0Var = b0Var.f110605b;
        }
        if (b0Var2 != null) {
            return b0Var2;
        }
        return null;
    }

    public static final b0 t(b0 b0Var, z zVar) {
        b0 s13;
        i k13 = k();
        Function1 f13 = k13.f();
        if (f13 != null) {
            f13.invoke(zVar);
        }
        b0 s14 = s(b0Var, k13.d(), k13.e());
        if (s14 != null) {
            return s14;
        }
        synchronized (f110667b) {
            i k14 = k();
            b0 d2 = zVar.d();
            Intrinsics.g(d2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            s13 = s(d2, k14.d(), k14.e());
            if (s13 == null) {
                r();
                throw null;
            }
        }
        return s13;
    }

    public static final void u(int i13) {
        int i14;
        l lVar = f110670e;
        int i15 = lVar.f110650d[i13];
        lVar.b(i15, lVar.f110647a - 1);
        lVar.f110647a--;
        int[] iArr = lVar.f110648b;
        int i16 = iArr[i15];
        int i17 = i15;
        while (i17 > 0) {
            int i18 = ((i17 + 1) >> 1) - 1;
            if (iArr[i18] <= i16) {
                break;
            }
            lVar.b(i18, i17);
            i17 = i18;
        }
        int[] iArr2 = lVar.f110648b;
        int i19 = lVar.f110647a >> 1;
        while (i15 < i19) {
            int i23 = (i15 + 1) << 1;
            int i24 = i23 - 1;
            if (i23 < lVar.f110647a && (i14 = iArr2[i23]) < iArr2[i24]) {
                if (i14 >= iArr2[i15]) {
                    break;
                }
                lVar.b(i23, i15);
                i15 = i23;
            } else {
                if (iArr2[i24] >= iArr2[i15]) {
                    break;
                }
                lVar.b(i24, i15);
                i15 = i24;
            }
        }
        lVar.f110650d[i13] = lVar.f110651e;
        lVar.f110651e = i13;
    }

    public static final Object v(i iVar, Function1 function1) {
        Object invoke = function1.invoke(f110668c.i(iVar.d()));
        synchronized (f110667b) {
            int i13 = f110669d;
            f110669d = i13 + 1;
            n i14 = f110668c.i(iVar.d());
            f110668c = i14;
            f110674i.set(new b(i13, i14));
            iVar.c();
            f110668c = f110668c.p(i13);
            Unit unit = Unit.f80348a;
        }
        return invoke;
    }

    public static final b0 w(r rVar, z zVar, i iVar) {
        b0 s13;
        if (iVar.g()) {
            iVar.n(zVar);
        }
        int d2 = iVar.d();
        b0 s14 = s(rVar, d2, iVar.e());
        if (s14 == null) {
            r();
            throw null;
        }
        if (s14.f110604a == iVar.d()) {
            return s14;
        }
        synchronized (f110667b) {
            s13 = s(zVar.d(), d2, iVar.e());
            if (s13 == null) {
                r();
                throw null;
            }
            if (s13.f110604a != d2) {
                b0 m13 = m(s13, zVar);
                m13.a(s13);
                m13.f110604a = iVar.d();
                s13 = m13;
            }
        }
        if (s14.f110604a != 1) {
            iVar.n(zVar);
        }
        return s13;
    }
}
