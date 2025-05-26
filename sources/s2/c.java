package s2;

import ao2.m0;
import g1.g0;
import g1.n0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class c extends i {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f110606n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f110607e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f110608f;

    /* renamed from: g, reason: collision with root package name */
    public int f110609g;

    /* renamed from: h, reason: collision with root package name */
    public g0 f110610h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f110611i;

    /* renamed from: j, reason: collision with root package name */
    public n f110612j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f110613k;

    /* renamed from: l, reason: collision with root package name */
    public int f110614l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f110615m;

    public c(int i13, n nVar, Function1 function1, Function1 function12) {
        super(i13, nVar);
        this.f110607e = function1;
        this.f110608f = function12;
        this.f110612j = n.f110658e;
        this.f110613k = f110606n;
        this.f110614l = 1;
    }

    public final bs1.c A(int i13, HashMap hashMap, n nVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        n nVar2;
        Object[] objArr;
        long[] jArr;
        n nVar3;
        Object[] objArr2;
        long[] jArr2;
        int i14;
        b0 s13;
        b0 b13;
        n n13 = e().p(d()).n(this.f110612j);
        g0 y13 = y();
        Intrinsics.f(y13);
        Object[] objArr3 = y13.f63286b;
        long[] jArr3 = y13.f63285a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i15 = 0;
            arrayList4 = null;
            arrayList3 = null;
            while (true) {
                long j13 = jArr3[i15];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j13 & 255) < 128) {
                            z zVar = (z) objArr3[(i15 << 3) + i18];
                            b0 d2 = zVar.d();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            b0 s14 = p.s(d2, i13, nVar);
                            if (s14 == null || (s13 = p.s(d2, d(), n13)) == null) {
                                nVar3 = n13;
                            } else {
                                nVar3 = n13;
                                if (s13.f110604a != 1 && !Intrinsics.d(s14, s13)) {
                                    b0 s15 = p.s(d2, d(), e());
                                    if (s15 == null) {
                                        p.r();
                                        throw null;
                                    }
                                    if (hashMap == null || (b13 = (b0) hashMap.get(s14)) == null) {
                                        b13 = zVar.b(s13, s14, s15);
                                    }
                                    if (b13 == null) {
                                        return new j();
                                    }
                                    if (!Intrinsics.d(b13, s15)) {
                                        if (Intrinsics.d(b13, s14)) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(new Pair(zVar, s14.b()));
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(zVar);
                                        } else {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(!Intrinsics.d(b13, s13) ? new Pair(zVar, b13) : new Pair(zVar, s13.b()));
                                        }
                                    }
                                }
                            }
                            i14 = 8;
                        } else {
                            nVar3 = n13;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i14 = i16;
                        }
                        j13 >>= i14;
                        i18++;
                        i16 = i14;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        n13 = nVar3;
                    }
                    nVar2 = n13;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i17 != i16) {
                        break;
                    }
                } else {
                    nVar2 = n13;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i15 == length) {
                    arrayList2 = arrayList4;
                    arrayList = arrayList3;
                    break;
                }
                i15++;
                objArr3 = objArr;
                jArr3 = jArr;
                n13 = nVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        arrayList4 = arrayList2;
        if (arrayList4 != null) {
            v();
            int size = arrayList4.size();
            for (int i19 = 0; i19 < size; i19++) {
                Pair pair = (Pair) arrayList4.get(i19);
                z zVar2 = (z) pair.f80346a;
                b0 b0Var = (b0) pair.f80347b;
                b0Var.f110604a = d();
                synchronized (p.f110667b) {
                    b0Var.f110605b = zVar2.d();
                    zVar2.e(b0Var);
                    Unit unit = Unit.f80348a;
                }
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i23 = 0; i23 < size2; i23++) {
                y13.l((z) arrayList3.get(i23));
            }
            ArrayList arrayList5 = this.f110611i;
            if (arrayList5 != null) {
                arrayList3 = CollectionsKt.l0(arrayList3, arrayList5);
            }
            this.f110611i = arrayList3;
        }
        return k.f110646a;
    }

    public final void B(int i13) {
        synchronized (p.f110667b) {
            this.f110612j = this.f110612j.p(i13);
            Unit unit = Unit.f80348a;
        }
    }

    public void C(g0 g0Var) {
        this.f110610h = g0Var;
    }

    public c D(Function1 function1, Function1 function12) {
        d dVar;
        if (!(!this.f110644c)) {
            m0.o0("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f110615m && this.f110645d < 0) {
            m0.p0("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        B(d());
        Object obj = p.f110667b;
        synchronized (obj) {
            int i13 = p.f110669d;
            p.f110669d = i13 + 1;
            p.f110668c = p.f110668c.p(i13);
            n e13 = e();
            r(e13.p(i13));
            dVar = new d(i13, p.e(d() + 1, i13, e13), p.l(function1, f(), true), p.b(function12, i()), this);
        }
        if (!this.f110615m && !this.f110644c) {
            int d2 = d();
            synchronized (obj) {
                int i14 = p.f110669d;
                p.f110669d = i14 + 1;
                q(i14);
                p.f110668c = p.f110668c.p(d());
                Unit unit = Unit.f80348a;
            }
            r(p.e(d2 + 1, d(), e()));
        }
        return dVar;
    }

    @Override // s2.i
    public final void b() {
        p.f110668c = p.f110668c.i(d()).f(this.f110612j);
    }

    @Override // s2.i
    public void c() {
        if (this.f110644c) {
            return;
        }
        super.c();
        l();
    }

    @Override // s2.i
    public boolean g() {
        return false;
    }

    @Override // s2.i
    public int h() {
        return this.f110609g;
    }

    @Override // s2.i
    public Function1 i() {
        return this.f110608f;
    }

    @Override // s2.i
    public void k() {
        this.f110614l++;
    }

    @Override // s2.i
    public void l() {
        int i13 = this.f110614l;
        if (i13 <= 0) {
            m0.o0("no pending nested snapshots");
            throw null;
        }
        int i14 = i13 - 1;
        this.f110614l = i14;
        if (i14 != 0 || this.f110615m) {
            return;
        }
        u();
    }

    @Override // s2.i
    public void m() {
        if (this.f110615m || this.f110644c) {
            return;
        }
        v();
    }

    @Override // s2.i
    public void n(z zVar) {
        g0 y13 = y();
        if (y13 == null) {
            int i13 = n0.f63290a;
            y13 = new g0();
            C(y13);
        }
        y13.d(zVar);
    }

    @Override // s2.i
    public final void o() {
        int length = this.f110613k.length;
        for (int i13 = 0; i13 < length; i13++) {
            p.u(this.f110613k[i13]);
        }
        int i14 = this.f110645d;
        if (i14 >= 0) {
            p.u(i14);
            this.f110645d = -1;
        }
    }

    @Override // s2.i
    public void s(int i13) {
        this.f110609g = i13;
    }

    @Override // s2.i
    public i t(Function1 function1) {
        e eVar;
        if (!(!this.f110644c)) {
            m0.o0("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f110615m && this.f110645d < 0) {
            m0.p0("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int d2 = d();
        B(d());
        Object obj = p.f110667b;
        synchronized (obj) {
            int i13 = p.f110669d;
            p.f110669d = i13 + 1;
            p.f110668c = p.f110668c.p(i13);
            eVar = new e(i13, p.e(d2 + 1, i13, e()), p.l(function1, f(), true), this);
        }
        if (!this.f110615m && !this.f110644c) {
            int d13 = d();
            synchronized (obj) {
                int i14 = p.f110669d;
                p.f110669d = i14 + 1;
                q(i14);
                p.f110668c = p.f110668c.p(d());
                Unit unit = Unit.f80348a;
            }
            r(p.e(d13 + 1, d(), e()));
        }
        return eVar;
    }

    public final void u() {
        g0 y13 = y();
        if (y13 != null) {
            if (!(!this.f110615m)) {
                m0.p0("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            C(null);
            int d2 = d();
            Object[] objArr = y13.f63286b;
            long[] jArr = y13.f63285a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j13 = jArr[i13];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((255 & j13) < 128) {
                                for (b0 d13 = ((z) objArr[(i13 << 3) + i15]).d(); d13 != null; d13 = d13.f110605b) {
                                    int i16 = d13.f110604a;
                                    if (i16 == d2 || CollectionsKt.L(this.f110612j, Integer.valueOf(i16))) {
                                        d13.f110604a = 0;
                                    }
                                }
                            }
                            j13 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        }
                    }
                    if (i13 == length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        a();
    }

    public final void v() {
        B(d());
        Unit unit = Unit.f80348a;
        if (this.f110615m || this.f110644c) {
            return;
        }
        int d2 = d();
        synchronized (p.f110667b) {
            int i13 = p.f110669d;
            p.f110669d = i13 + 1;
            q(i13);
            p.f110668c = p.f110668c.p(d());
        }
        r(p.e(d2 + 1, d(), e()));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2 A[LOOP:1: B:32:0x00c0->B:33:0x00c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bs1.c w() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.c.w():bs1.c");
    }

    public final boolean x() {
        return this.f110615m;
    }

    public g0 y() {
        return this.f110610h;
    }

    @Override // s2.i
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Function1 f() {
        return this.f110607e;
    }
}
