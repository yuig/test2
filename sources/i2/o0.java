package i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class o0 extends s2.a0 implements p0 {

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f71203b;

    /* renamed from: c, reason: collision with root package name */
    public final j3 f71204c;

    /* renamed from: d, reason: collision with root package name */
    public m0 f71205d = new m0();

    public o0(j3 j3Var, Function0 function0) {
        this.f71203b = function0;
        this.f71204c = j3Var;
    }

    @Override // s2.z
    public final s2.b0 d() {
        return this.f71205d;
    }

    @Override // s2.z
    public final void e(s2.b0 b0Var) {
        this.f71205d = (m0) b0Var;
    }

    @Override // i2.v3
    public final Object getValue() {
        Function1 f13 = s2.p.k().f();
        if (f13 != null) {
            f13.invoke(this);
        }
        s2.i k13 = s2.p.k();
        return i((m0) s2.p.j(this.f71205d, k13), k13, true, this.f71203b).f71170f;
    }

    public final m0 h(s2.i iVar) {
        return i((m0) s2.p.j(this.f71205d, iVar), iVar, false, this.f71203b);
    }

    /* JADX WARN: Finally extract failed */
    public final m0 i(m0 m0Var, s2.i iVar, boolean z13, Function0 function0) {
        int i13;
        j3 j3Var;
        int i14;
        m0 m0Var2 = m0Var;
        if (m0Var2.c(this, iVar)) {
            if (z13) {
                k2.e Q = bs1.c.Q();
                int i15 = Q.f78184c;
                if (i15 > 0) {
                    Object[] objArr = Q.f78182a;
                    int i16 = 0;
                    do {
                        ((r) ((q0) objArr[i16])).b();
                        i16++;
                    } while (i16 < i15);
                }
                try {
                    g1.z zVar = m0Var2.f71169e;
                    r3 r3Var = k3.f71150a;
                    q2.j jVar = (q2.j) r3Var.a();
                    if (jVar == null) {
                        jVar = new q2.j(0);
                        r3Var.b(jVar);
                    }
                    int i17 = jVar.f102114a;
                    Object[] objArr2 = zVar.f63354b;
                    int[] iArr = zVar.f63355c;
                    long[] jArr = zVar.f63353a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i18 = 0;
                        while (true) {
                            long j13 = jArr[i18];
                            long[] jArr2 = jArr;
                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i19 = 8;
                                int i23 = 8 - ((~(i18 - length)) >>> 31);
                                int i24 = 0;
                                while (i24 < i23) {
                                    if ((j13 & 255) < 128) {
                                        int i25 = (i18 << 3) + i24;
                                        s2.z zVar2 = (s2.z) objArr2[i25];
                                        jVar.f102114a = i17 + iArr[i25];
                                        Function1 f13 = iVar.f();
                                        if (f13 != null) {
                                            f13.invoke(zVar2);
                                        }
                                        i14 = 8;
                                    } else {
                                        i14 = i19;
                                    }
                                    j13 >>= i14;
                                    i24++;
                                    i19 = i14;
                                }
                                if (i23 != i19) {
                                    break;
                                }
                            }
                            if (i18 == length) {
                                break;
                            }
                            i18++;
                            jArr = jArr2;
                        }
                    }
                    jVar.f102114a = i17;
                    Unit unit = Unit.f80348a;
                    int i26 = Q.f78184c;
                    if (i26 > 0) {
                        Object[] objArr3 = Q.f78182a;
                        int i27 = 0;
                        do {
                            ((r) ((q0) objArr3[i27])).a();
                            i27++;
                        } while (i27 < i26);
                    }
                } catch (Throwable th3) {
                    int i28 = Q.f78184c;
                    if (i28 > 0) {
                        Object[] objArr4 = Q.f78182a;
                        int i29 = 0;
                        do {
                            ((r) ((q0) objArr4[i29])).a();
                            i29++;
                        } while (i29 < i28);
                    }
                    throw th3;
                }
            }
            return m0Var2;
        }
        g1.z zVar3 = new g1.z();
        r3 r3Var2 = k3.f71150a;
        q2.j jVar2 = (q2.j) r3Var2.a();
        if (jVar2 == null) {
            i13 = 0;
            jVar2 = new q2.j(0);
            r3Var2.b(jVar2);
        } else {
            i13 = 0;
        }
        int i33 = jVar2.f102114a;
        k2.e Q2 = bs1.c.Q();
        int i34 = Q2.f78184c;
        if (i34 > 0) {
            Object[] objArr5 = Q2.f78182a;
            int i35 = i13;
            while (true) {
                ((r) ((q0) objArr5[i35])).b();
                int i36 = i35 + 1;
                if (i36 >= i34) {
                    break;
                }
                i35 = i36;
            }
        }
        try {
            jVar2.f102114a = i33 + 1;
            Object a03 = bk.f.a0(function0, new n0(this, jVar2, zVar3, i33));
            jVar2.f102114a = i33;
            int i37 = Q2.f78184c;
            if (i37 > 0) {
                Object[] objArr6 = Q2.f78182a;
                do {
                    ((r) ((q0) objArr6[i13])).a();
                    i13++;
                } while (i13 < i37);
            }
            Object obj = s2.p.f110667b;
            synchronized (obj) {
                try {
                    s2.i k13 = s2.p.k();
                    Object obj2 = m0Var2.f71170f;
                    if (obj2 == m0.f71166h || (j3Var = this.f71204c) == null || !j3Var.a(a03, obj2)) {
                        m0 m0Var3 = this.f71205d;
                        synchronized (obj) {
                            s2.b0 m13 = s2.p.m(m0Var3, this);
                            m13.a(m0Var3);
                            m13.f110604a = k13.d();
                            m0Var2 = (m0) m13;
                            m0Var2.f71169e = zVar3;
                            m0Var2.f71171g = m0Var2.d(this, k13);
                            m0Var2.f71170f = a03;
                        }
                        return m0Var2;
                    }
                    m0Var2.f71169e = zVar3;
                    m0Var2.f71171g = m0Var2.d(this, k13);
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            q2.j jVar3 = (q2.j) k3.f71150a.a();
            if (jVar3 != null && jVar3.f102114a == 0) {
                s2.p.k().m();
                synchronized (obj) {
                    s2.i k14 = s2.p.k();
                    m0Var2.f71167c = k14.d();
                    m0Var2.f71168d = k14.h();
                    Unit unit2 = Unit.f80348a;
                }
            }
            return m0Var2;
        } catch (Throwable th5) {
            int i38 = Q2.f78184c;
            if (i38 > 0) {
                Object[] objArr7 = Q2.f78182a;
                do {
                    ((r) ((q0) objArr7[i13])).a();
                    i13++;
                } while (i13 < i38);
            }
            throw th5;
        }
    }

    public final m0 j() {
        s2.i k13 = s2.p.k();
        return i((m0) s2.p.j(this.f71205d, k13), k13, false, this.f71203b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DerivedState(value=");
        m0 m0Var = (m0) s2.p.i(this.f71205d);
        sb3.append(m0Var.c(this, s2.p.k()) ? String.valueOf(m0Var.f71170f) : "<Not calculated>");
        sb3.append(")@");
        sb3.append(hashCode());
        return sb3.toString();
    }
}
