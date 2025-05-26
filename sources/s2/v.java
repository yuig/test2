package s2;

import g1.g0;
import g1.m0;
import i2.j3;
import i2.o0;
import i2.p0;
import i2.y3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import k1.s2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f110685a;

    /* renamed from: b, reason: collision with root package name */
    public Object f110686b;

    /* renamed from: c, reason: collision with root package name */
    public g1.z f110687c;

    /* renamed from: j, reason: collision with root package name */
    public int f110694j;

    /* renamed from: d, reason: collision with root package name */
    public int f110688d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final k2.h f110689e = new k2.h();

    /* renamed from: f, reason: collision with root package name */
    public final g1.c0 f110690f = new g1.c0();

    /* renamed from: g, reason: collision with root package name */
    public final g0 f110691g = new g0();

    /* renamed from: h, reason: collision with root package name */
    public final k2.e f110692h = new k2.e(new p0[16]);

    /* renamed from: i, reason: collision with root package name */
    public final i2.r f110693i = new i2.r(this, 1);

    /* renamed from: k, reason: collision with root package name */
    public final k2.h f110695k = new k2.h();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f110696l = new HashMap();

    public v(Function1 function1) {
        this.f110685a = function1;
    }

    public final void a(Object obj, s2 s2Var, Function0 function0) {
        long[] jArr;
        long[] jArr2;
        int i13;
        Object obj2 = this.f110686b;
        g1.z zVar = this.f110687c;
        int i14 = this.f110688d;
        this.f110686b = obj;
        this.f110687c = (g1.z) this.f110690f.g(obj);
        if (this.f110688d == -1) {
            this.f110688d = p.k().d();
        }
        i2.r rVar = this.f110693i;
        k2.e Q = bs1.c.Q();
        try {
            Q.b(rVar);
            bk.f.a0(function0, s2Var);
            Q.o(Q.f78184c - 1);
            Object obj3 = this.f110686b;
            Intrinsics.f(obj3);
            int i15 = this.f110688d;
            g1.z zVar2 = this.f110687c;
            if (zVar2 != null) {
                long[] jArr3 = zVar2.f63353a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j13 = jArr3[i16];
                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j13 & 255) < 128) {
                                    int i23 = (i16 << 3) + i19;
                                    Object obj4 = zVar2.f63354b[i23];
                                    jArr2 = jArr3;
                                    boolean z13 = zVar2.f63355c[i23] != i15;
                                    if (z13) {
                                        d(obj3, obj4);
                                    }
                                    if (z13) {
                                        zVar2.h(i23);
                                    }
                                    i13 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i13 = i17;
                                }
                                j13 >>= i13;
                                i19++;
                                i17 = i13;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i18 != i17) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i16 == length) {
                            break;
                        }
                        i16++;
                        jArr3 = jArr;
                    }
                }
            }
            this.f110686b = obj2;
            this.f110687c = zVar;
            this.f110688d = i14;
        } catch (Throwable th3) {
            Q.o(Q.f78184c - 1);
            throw th3;
        }
    }

    public final boolean b(Set set) {
        boolean z13;
        Iterator it;
        k2.h hVar;
        Object obj;
        int i13;
        Object g13;
        HashMap hashMap;
        k2.h hVar2;
        long[] jArr;
        Object[] objArr;
        HashMap hashMap2;
        Iterator it2;
        k2.h hVar3;
        Object obj2;
        k2.h hVar4;
        long[] jArr2;
        Object[] objArr2;
        Object[] objArr3;
        HashMap hashMap3;
        Object[] objArr4;
        y3 y3Var;
        String str;
        k2.h hVar5;
        k2.h hVar6;
        int i14;
        int i15;
        int i16;
        HashMap hashMap4;
        Object[] objArr5;
        y3 y3Var2;
        String str2;
        k2.h hVar7;
        k2.h hVar8;
        int i17;
        int i18;
        long j13;
        int i19;
        Object g14;
        HashMap hashMap5;
        k2.h hVar9;
        long[] jArr3;
        Object[] objArr6;
        int i23;
        HashMap hashMap6;
        long[] jArr4;
        String str3;
        int i24;
        k2.h hVar10;
        int i25;
        Object[] objArr7;
        int i26;
        HashMap hashMap7 = this.f110696l;
        boolean z14 = set instanceof k2.g;
        y3 y3Var3 = y3.f71400a;
        String str4 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        k2.e eVar = this.f110692h;
        char c13 = 7;
        int i27 = 8;
        int i28 = 0;
        k2.h hVar11 = this.f110695k;
        k2.h hVar12 = this.f110689e;
        g0 g0Var = this.f110691g;
        if (z14) {
            m0 m0Var = ((k2.g) set).f78193a;
            Object[] objArr8 = m0Var.f63286b;
            long[] jArr5 = m0Var.f63285a;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i29 = 0;
                z13 = false;
                while (true) {
                    long j14 = jArr5[i29];
                    long[] jArr6 = jArr5;
                    if ((((~j14) << c13) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i33 = 8 - ((~(i29 - length)) >>> 31);
                        int i34 = 0;
                        while (i34 < i33) {
                            if ((j14 & 255) < 128) {
                                Object obj3 = objArr8[(i29 << 3) + i34];
                                if (obj3 instanceof a0) {
                                    objArr5 = objArr8;
                                    if (!((a0) obj3).f(2)) {
                                        i15 = i33;
                                        i16 = i34;
                                        hashMap4 = hashMap7;
                                        y3Var2 = y3Var3;
                                        str2 = str4;
                                        hVar7 = hVar11;
                                        hVar8 = hVar12;
                                        i17 = length;
                                        i18 = i29;
                                        j13 = j14;
                                        i19 = 8;
                                    }
                                } else {
                                    objArr5 = objArr8;
                                }
                                if (!hVar11.f78194a.b(obj3) || (g14 = hVar11.f78194a.g(obj3)) == null) {
                                    i15 = i33;
                                    i16 = i34;
                                    hashMap4 = hashMap7;
                                    y3Var2 = y3Var3;
                                    str2 = str4;
                                    hVar7 = hVar11;
                                    hVar8 = hVar12;
                                    i17 = length;
                                    i18 = i29;
                                    j13 = j14;
                                } else if (g14 instanceof g0) {
                                    g0 g0Var2 = (g0) g14;
                                    Object[] objArr9 = g0Var2.f63286b;
                                    long[] jArr7 = g0Var2.f63285a;
                                    y3Var2 = y3Var3;
                                    int length2 = jArr7.length - 2;
                                    i15 = i33;
                                    i16 = i34;
                                    if (length2 >= 0) {
                                        hVar7 = hVar11;
                                        int i35 = 0;
                                        while (true) {
                                            long j15 = jArr7[i35];
                                            i18 = i29;
                                            j13 = j14;
                                            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i36 = 8 - ((~(i35 - length2)) >>> 31);
                                                int i37 = 0;
                                                while (i37 < i36) {
                                                    if ((j15 & 255) < 128) {
                                                        p0 p0Var = (p0) objArr9[(i35 << 3) + i37];
                                                        Intrinsics.g(p0Var, str4);
                                                        jArr4 = jArr7;
                                                        Object obj4 = hashMap7.get(p0Var);
                                                        objArr7 = objArr9;
                                                        o0 o0Var = (o0) p0Var;
                                                        str3 = str4;
                                                        j3 j3Var = o0Var.f71204c;
                                                        if (j3Var == null) {
                                                            j3Var = y3Var2;
                                                        }
                                                        if (j3Var.a(o0Var.j().f71170f, obj4)) {
                                                            hashMap6 = hashMap7;
                                                            i24 = i35;
                                                            hVar10 = hVar12;
                                                            i25 = length;
                                                            eVar.b(p0Var);
                                                        } else {
                                                            Object g15 = hVar12.f78194a.g(p0Var);
                                                            if (g15 != null) {
                                                                if (g15 instanceof g0) {
                                                                    g0 g0Var3 = (g0) g15;
                                                                    Object[] objArr10 = g0Var3.f63286b;
                                                                    long[] jArr8 = g0Var3.f63285a;
                                                                    int length3 = jArr8.length - 2;
                                                                    if (length3 >= 0) {
                                                                        i24 = i35;
                                                                        hVar10 = hVar12;
                                                                        int i38 = 0;
                                                                        while (true) {
                                                                            long j16 = jArr8[i38];
                                                                            hashMap6 = hashMap7;
                                                                            long[] jArr9 = jArr8;
                                                                            if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i39 = 8 - ((~(i38 - length3)) >>> 31);
                                                                                int i43 = 0;
                                                                                while (i43 < i39) {
                                                                                    if ((j16 & 255) < 128) {
                                                                                        i26 = length;
                                                                                        g0Var.d(objArr10[(i38 << 3) + i43]);
                                                                                        z13 = true;
                                                                                    } else {
                                                                                        i26 = length;
                                                                                    }
                                                                                    j16 >>= 8;
                                                                                    i43++;
                                                                                    length = i26;
                                                                                }
                                                                                i25 = length;
                                                                                if (i39 != 8) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                i25 = length;
                                                                            }
                                                                            if (i38 == length3) {
                                                                                break;
                                                                            }
                                                                            i38++;
                                                                            hashMap7 = hashMap6;
                                                                            jArr8 = jArr9;
                                                                            length = i25;
                                                                        }
                                                                    }
                                                                } else {
                                                                    hashMap6 = hashMap7;
                                                                    i24 = i35;
                                                                    hVar10 = hVar12;
                                                                    i25 = length;
                                                                    g0Var.d(g15);
                                                                    z13 = true;
                                                                }
                                                            }
                                                            hashMap6 = hashMap7;
                                                            i24 = i35;
                                                            hVar10 = hVar12;
                                                            i25 = length;
                                                        }
                                                    } else {
                                                        hashMap6 = hashMap7;
                                                        jArr4 = jArr7;
                                                        str3 = str4;
                                                        i24 = i35;
                                                        hVar10 = hVar12;
                                                        i25 = length;
                                                        objArr7 = objArr9;
                                                    }
                                                    j15 >>= 8;
                                                    i37++;
                                                    jArr7 = jArr4;
                                                    objArr9 = objArr7;
                                                    str4 = str3;
                                                    hVar12 = hVar10;
                                                    i35 = i24;
                                                    hashMap7 = hashMap6;
                                                    length = i25;
                                                }
                                                hashMap5 = hashMap7;
                                                jArr3 = jArr7;
                                                str2 = str4;
                                                int i44 = i35;
                                                hVar9 = hVar12;
                                                i17 = length;
                                                objArr6 = objArr9;
                                                if (i36 != 8) {
                                                    break;
                                                }
                                                i23 = i44;
                                            } else {
                                                hashMap5 = hashMap7;
                                                jArr3 = jArr7;
                                                str2 = str4;
                                                hVar9 = hVar12;
                                                i17 = length;
                                                objArr6 = objArr9;
                                                i23 = i35;
                                            }
                                            if (i23 == length2) {
                                                break;
                                            }
                                            i35 = i23 + 1;
                                            i29 = i18;
                                            j14 = j13;
                                            jArr7 = jArr3;
                                            objArr9 = objArr6;
                                            str4 = str2;
                                            hVar12 = hVar9;
                                            hashMap7 = hashMap5;
                                            length = i17;
                                        }
                                    } else {
                                        hashMap5 = hashMap7;
                                        str2 = str4;
                                        hVar7 = hVar11;
                                        hVar9 = hVar12;
                                        i17 = length;
                                        i18 = i29;
                                        j13 = j14;
                                    }
                                    hVar8 = hVar9;
                                    hashMap4 = hashMap5;
                                } else {
                                    i15 = i33;
                                    i16 = i34;
                                    y3Var2 = y3Var3;
                                    str2 = str4;
                                    hVar7 = hVar11;
                                    k2.h hVar13 = hVar12;
                                    i17 = length;
                                    i18 = i29;
                                    j13 = j14;
                                    p0 p0Var2 = (p0) g14;
                                    hashMap4 = hashMap7;
                                    Object obj5 = hashMap4.get(p0Var2);
                                    o0 o0Var2 = (o0) p0Var2;
                                    j3 j3Var2 = o0Var2.f71204c;
                                    if (j3Var2 == null) {
                                        j3Var2 = y3Var2;
                                    }
                                    if (j3Var2.a(o0Var2.j().f71170f, obj5)) {
                                        hVar8 = hVar13;
                                        eVar.b(p0Var2);
                                    } else {
                                        hVar8 = hVar13;
                                        Object g16 = hVar8.f78194a.g(p0Var2);
                                        if (g16 != null) {
                                            if (g16 instanceof g0) {
                                                g0 g0Var4 = (g0) g16;
                                                Object[] objArr11 = g0Var4.f63286b;
                                                long[] jArr10 = g0Var4.f63285a;
                                                int length4 = jArr10.length - 2;
                                                if (length4 >= 0) {
                                                    int i45 = 0;
                                                    while (true) {
                                                        long j17 = jArr10[i45];
                                                        if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i46 = 8 - ((~(i45 - length4)) >>> 31);
                                                            for (int i47 = 0; i47 < i46; i47++) {
                                                                if ((j17 & 255) < 128) {
                                                                    g0Var.d(objArr11[(i45 << 3) + i47]);
                                                                    z13 = true;
                                                                }
                                                                j17 >>= 8;
                                                            }
                                                            if (i46 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i45 == length4) {
                                                            break;
                                                        }
                                                        i45++;
                                                    }
                                                }
                                            } else {
                                                g0Var.d(g16);
                                                z13 = true;
                                            }
                                        }
                                    }
                                }
                                Object g17 = hVar8.f78194a.g(obj3);
                                if (g17 != null) {
                                    if (g17 instanceof g0) {
                                        g0 g0Var5 = (g0) g17;
                                        Object[] objArr12 = g0Var5.f63286b;
                                        long[] jArr11 = g0Var5.f63285a;
                                        int length5 = jArr11.length - 2;
                                        if (length5 >= 0) {
                                            int i48 = 0;
                                            while (true) {
                                                long j18 = jArr11[i48];
                                                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i49 = 8 - ((~(i48 - length5)) >>> 31);
                                                    for (int i53 = 0; i53 < i49; i53++) {
                                                        if ((j18 & 255) < 128) {
                                                            g0Var.d(objArr12[(i48 << 3) + i53]);
                                                            z13 = true;
                                                        }
                                                        j18 >>= 8;
                                                    }
                                                    if (i49 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i48 == length5) {
                                                    break;
                                                }
                                                i48++;
                                            }
                                        }
                                    } else {
                                        g0Var.d(g17);
                                        z13 = true;
                                    }
                                }
                                i19 = 8;
                            } else {
                                i15 = i33;
                                i16 = i34;
                                hashMap4 = hashMap7;
                                objArr5 = objArr8;
                                y3Var2 = y3Var3;
                                str2 = str4;
                                hVar7 = hVar11;
                                hVar8 = hVar12;
                                i17 = length;
                                i18 = i29;
                                j13 = j14;
                                i19 = i27;
                            }
                            j14 = j13 >> i19;
                            i27 = i19;
                            hVar12 = hVar8;
                            i34 = i16 + 1;
                            objArr8 = objArr5;
                            y3Var3 = y3Var2;
                            hVar11 = hVar7;
                            i29 = i18;
                            str4 = str2;
                            length = i17;
                            hashMap7 = hashMap4;
                            i33 = i15;
                        }
                        objArr4 = objArr8;
                        y3Var = y3Var3;
                        str = str4;
                        hVar5 = hVar11;
                        int i54 = length;
                        int i55 = i29;
                        int i56 = i27;
                        int i57 = i33;
                        hashMap3 = hashMap7;
                        hVar6 = hVar12;
                        if (i57 != i56) {
                            break;
                        }
                        i14 = i55;
                        length = i54;
                    } else {
                        hashMap3 = hashMap7;
                        objArr4 = objArr8;
                        y3Var = y3Var3;
                        str = str4;
                        hVar5 = hVar11;
                        hVar6 = hVar12;
                        i14 = i29;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i29 = i14 + 1;
                    jArr5 = jArr6;
                    hVar12 = hVar6;
                    objArr8 = objArr4;
                    y3Var3 = y3Var;
                    hVar11 = hVar5;
                    str4 = str;
                    c13 = 7;
                    i27 = 8;
                    hashMap7 = hashMap3;
                }
            } else {
                z13 = false;
            }
        } else {
            HashMap hashMap8 = hashMap7;
            k2.h hVar14 = hVar11;
            k2.h hVar15 = hVar12;
            Iterator it3 = set.iterator();
            z13 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof a0) || ((a0) next).f(2)) {
                    k2.h hVar16 = hVar14;
                    if (!hVar16.f78194a.b(next) || (g13 = hVar16.f78194a.g(next)) == null) {
                        it = it3;
                        hVar = hVar15;
                        obj = next;
                        hVar14 = hVar16;
                    } else if (g13 instanceof g0) {
                        g0 g0Var6 = (g0) g13;
                        Object[] objArr13 = g0Var6.f63286b;
                        long[] jArr12 = g0Var6.f63285a;
                        int length6 = jArr12.length - 2;
                        if (length6 >= 0) {
                            int i58 = 0;
                            while (true) {
                                long j19 = jArr12[i58];
                                if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i59 = 8 - ((~(i58 - length6)) >>> 31);
                                    int i63 = 0;
                                    while (i63 < i59) {
                                        if ((j19 & 255) < 128) {
                                            p0 p0Var3 = (p0) objArr13[(i58 << 3) + i63];
                                            it2 = it3;
                                            Intrinsics.g(p0Var3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                            Object obj6 = hashMap8.get(p0Var3);
                                            hVar4 = hVar16;
                                            o0 o0Var3 = (o0) p0Var3;
                                            jArr2 = jArr12;
                                            j3 j3Var3 = o0Var3.f71204c;
                                            if (j3Var3 == null) {
                                                j3Var3 = y3Var3;
                                            }
                                            if (j3Var3.a(o0Var3.j().f71170f, obj6)) {
                                                hashMap2 = hashMap8;
                                                hVar3 = hVar15;
                                                obj2 = next;
                                                objArr2 = objArr13;
                                                eVar.b(p0Var3);
                                            } else {
                                                Object g18 = hVar15.f78194a.g(p0Var3);
                                                if (g18 != null) {
                                                    if (g18 instanceof g0) {
                                                        g0 g0Var7 = (g0) g18;
                                                        Object[] objArr14 = g0Var7.f63286b;
                                                        long[] jArr13 = g0Var7.f63285a;
                                                        int length7 = jArr13.length - 2;
                                                        if (length7 >= 0) {
                                                            hVar3 = hVar15;
                                                            obj2 = next;
                                                            int i64 = 0;
                                                            while (true) {
                                                                long j23 = jArr13[i64];
                                                                hashMap2 = hashMap8;
                                                                long[] jArr14 = jArr13;
                                                                if ((((~j23) << 7) & j23 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i65 = 8 - ((~(i64 - length7)) >>> 31);
                                                                    int i66 = 0;
                                                                    while (i66 < i65) {
                                                                        if ((j23 & 255) < 128) {
                                                                            objArr3 = objArr13;
                                                                            g0Var.d(objArr14[(i64 << 3) + i66]);
                                                                            z13 = true;
                                                                        } else {
                                                                            objArr3 = objArr13;
                                                                        }
                                                                        j23 >>= 8;
                                                                        i66++;
                                                                        objArr13 = objArr3;
                                                                    }
                                                                    objArr2 = objArr13;
                                                                    if (i65 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr13;
                                                                }
                                                                if (i64 == length7) {
                                                                    break;
                                                                }
                                                                i64++;
                                                                jArr13 = jArr14;
                                                                objArr13 = objArr2;
                                                                hashMap8 = hashMap2;
                                                            }
                                                        }
                                                    } else {
                                                        hashMap2 = hashMap8;
                                                        hVar3 = hVar15;
                                                        obj2 = next;
                                                        objArr2 = objArr13;
                                                        g0Var.d(g18);
                                                        z13 = true;
                                                    }
                                                }
                                                hashMap2 = hashMap8;
                                                hVar3 = hVar15;
                                                obj2 = next;
                                            }
                                            j19 >>= 8;
                                            i63++;
                                            it3 = it2;
                                            jArr12 = jArr2;
                                            hVar16 = hVar4;
                                            next = obj2;
                                            objArr13 = objArr2;
                                            hVar15 = hVar3;
                                            hashMap8 = hashMap2;
                                        } else {
                                            hashMap2 = hashMap8;
                                            it2 = it3;
                                            hVar3 = hVar15;
                                            obj2 = next;
                                            hVar4 = hVar16;
                                            jArr2 = jArr12;
                                        }
                                        objArr2 = objArr13;
                                        j19 >>= 8;
                                        i63++;
                                        it3 = it2;
                                        jArr12 = jArr2;
                                        hVar16 = hVar4;
                                        next = obj2;
                                        objArr13 = objArr2;
                                        hVar15 = hVar3;
                                        hashMap8 = hashMap2;
                                    }
                                    hashMap = hashMap8;
                                    it = it3;
                                    hVar2 = hVar15;
                                    obj = next;
                                    hVar14 = hVar16;
                                    jArr = jArr12;
                                    objArr = objArr13;
                                    if (i59 != 8) {
                                        break;
                                    }
                                } else {
                                    hashMap = hashMap8;
                                    it = it3;
                                    hVar2 = hVar15;
                                    obj = next;
                                    hVar14 = hVar16;
                                    jArr = jArr12;
                                    objArr = objArr13;
                                }
                                if (i58 == length6) {
                                    break;
                                }
                                i58++;
                                it3 = it;
                                jArr12 = jArr;
                                hVar16 = hVar14;
                                next = obj;
                                objArr13 = objArr;
                                hVar15 = hVar2;
                                hashMap8 = hashMap;
                            }
                        } else {
                            hashMap = hashMap8;
                            it = it3;
                            hVar2 = hVar15;
                            obj = next;
                            hVar14 = hVar16;
                        }
                        hVar = hVar2;
                        hashMap8 = hashMap;
                    } else {
                        it = it3;
                        k2.h hVar17 = hVar15;
                        obj = next;
                        hVar14 = hVar16;
                        p0 p0Var4 = (p0) g13;
                        Object obj7 = hashMap8.get(p0Var4);
                        o0 o0Var4 = (o0) p0Var4;
                        j3 j3Var4 = o0Var4.f71204c;
                        if (j3Var4 == null) {
                            j3Var4 = y3Var3;
                        }
                        if (j3Var4.a(o0Var4.j().f71170f, obj7)) {
                            hVar = hVar17;
                            eVar.b(p0Var4);
                        } else {
                            hVar = hVar17;
                            Object g19 = hVar.f78194a.g(p0Var4);
                            if (g19 != null) {
                                if (g19 instanceof g0) {
                                    g0 g0Var8 = (g0) g19;
                                    Object[] objArr15 = g0Var8.f63286b;
                                    long[] jArr15 = g0Var8.f63285a;
                                    int length8 = jArr15.length - 2;
                                    if (length8 >= 0) {
                                        int i67 = 0;
                                        while (true) {
                                            long j24 = jArr15[i67];
                                            if ((((~j24) << 7) & j24 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i68 = 8 - ((~(i67 - length8)) >>> 31);
                                                for (int i69 = 0; i69 < i68; i69++) {
                                                    if ((j24 & 255) < 128) {
                                                        g0Var.d(objArr15[(i67 << 3) + i69]);
                                                        z13 = true;
                                                    }
                                                    j24 >>= 8;
                                                }
                                                if (i68 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i67 == length8) {
                                                break;
                                            }
                                            i67++;
                                        }
                                    }
                                } else {
                                    g0Var.d(g19);
                                    z13 = true;
                                }
                            }
                        }
                    }
                    Object g23 = hVar.f78194a.g(obj);
                    if (g23 != null) {
                        if (g23 instanceof g0) {
                            g0 g0Var9 = (g0) g23;
                            Object[] objArr16 = g0Var9.f63286b;
                            long[] jArr16 = g0Var9.f63285a;
                            int length9 = jArr16.length - 2;
                            if (length9 >= 0) {
                                while (true) {
                                    long j25 = jArr16[i13];
                                    if ((((~j25) << 7) & j25 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i73 = 8 - ((~(i13 - length9)) >>> 31);
                                        for (int i74 = 0; i74 < i73; i74++) {
                                            if ((j25 & 255) < 128) {
                                                g0Var.d(objArr16[(i13 << 3) + i74]);
                                                z13 = true;
                                            }
                                            j25 >>= 8;
                                        }
                                        if (i73 != 8) {
                                            break;
                                        }
                                    }
                                    i13 = i13 != length9 ? i13 + 1 : 0;
                                }
                            }
                        } else {
                            g0Var.d(g23);
                            z13 = true;
                        }
                        hVar15 = hVar;
                        it3 = it;
                    }
                } else {
                    it = it3;
                    hVar = hVar15;
                }
                hVar15 = hVar;
                it3 = it;
            }
        }
        if (eVar.m()) {
            int i75 = eVar.f78184c;
            if (i75 > 0) {
                Object[] objArr17 = eVar.f78182a;
                while (true) {
                    f((p0) objArr17[i28]);
                    int i76 = i28 + 1;
                    if (i76 >= i75) {
                        break;
                    }
                    i28 = i76;
                }
            }
            eVar.h();
        }
        return z13;
    }

    public final void c(Object obj, int i13, Object obj2, g1.z zVar) {
        int i14;
        if (this.f110694j > 0) {
            return;
        }
        int d2 = zVar.d(obj);
        if (d2 < 0) {
            d2 = ~d2;
            i14 = -1;
        } else {
            i14 = zVar.f63355c[d2];
        }
        zVar.f63354b[d2] = obj;
        zVar.f63355c[d2] = i13;
        if ((obj instanceof p0) && i14 != i13) {
            i2.m0 j13 = ((o0) ((p0) obj)).j();
            this.f110696l.put(obj, j13.f71170f);
            g1.z zVar2 = j13.f71169e;
            k2.h hVar = this.f110695k;
            hVar.c(obj);
            Object[] objArr = zVar2.f63354b;
            long[] jArr = zVar2.f63353a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j14 = jArr[i15];
                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j14 & 255) < 128) {
                                z zVar3 = (z) objArr[(i15 << 3) + i17];
                                if (zVar3 instanceof a0) {
                                    ((a0) zVar3).g(2);
                                }
                                hVar.a(zVar3, obj);
                            }
                            j14 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        if (i14 == -1) {
            if (obj instanceof a0) {
                ((a0) obj).g(2);
            }
            this.f110689e.a(obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        k2.h hVar = this.f110689e;
        hVar.b(obj2, obj);
        if (!(obj2 instanceof p0) || hVar.f78194a.b(obj2)) {
            return;
        }
        this.f110695k.c(obj2);
        this.f110696l.remove(obj2);
    }

    public final void e() {
        s3.e eVar;
        long[] jArr;
        int i13;
        s3.e eVar2;
        long[] jArr2;
        int i14;
        int i15;
        int i16;
        char c13;
        long j13;
        int i17;
        int i18;
        s3.e eVar3 = s3.e.f110769n;
        g1.c0 c0Var = this.f110690f;
        long[] jArr3 = c0Var.f63238a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i19 = 0;
        while (true) {
            long j14 = jArr3[i19];
            char c14 = 7;
            long j15 = -9187201950435737472L;
            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i23 = 8;
                int i24 = 8 - ((~(i19 - length)) >>> 31);
                int i25 = 0;
                while (i25 < i24) {
                    if ((j14 & 255) < 128) {
                        int i26 = (i19 << 3) + i25;
                        Object obj = c0Var.f63239b[i26];
                        g1.z zVar = (g1.z) c0Var.f63240c[i26];
                        Boolean bool = (Boolean) eVar3.invoke(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = zVar.f63354b;
                            int[] iArr = zVar.f63355c;
                            long[] jArr4 = zVar.f63353a;
                            int length2 = jArr4.length - 2;
                            eVar2 = eVar3;
                            jArr2 = jArr3;
                            i14 = length;
                            if (length2 >= 0) {
                                int i27 = 0;
                                while (true) {
                                    long j16 = jArr4[i27];
                                    i16 = i24;
                                    long[] jArr5 = jArr4;
                                    c13 = 7;
                                    j13 = -9187201950435737472L;
                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                        int i29 = 0;
                                        while (i29 < i28) {
                                            if ((j16 & 255) < 128) {
                                                int i33 = (i27 << 3) + i29;
                                                i18 = i19;
                                                Object obj2 = objArr[i33];
                                                int i34 = iArr[i33];
                                                d(obj, obj2);
                                            } else {
                                                i18 = i19;
                                            }
                                            j16 >>= 8;
                                            i29++;
                                            i19 = i18;
                                        }
                                        i15 = i19;
                                        if (i28 != 8) {
                                            break;
                                        }
                                    } else {
                                        i15 = i19;
                                    }
                                    if (i27 == length2) {
                                        break;
                                    }
                                    i27++;
                                    i24 = i16;
                                    jArr4 = jArr5;
                                    i19 = i15;
                                }
                            } else {
                                i15 = i19;
                                i16 = i24;
                                j13 = -9187201950435737472L;
                                c13 = 7;
                            }
                        } else {
                            eVar2 = eVar3;
                            jArr2 = jArr3;
                            i14 = length;
                            i15 = i19;
                            i16 = i24;
                            c13 = c14;
                            j13 = j15;
                        }
                        if (bool.booleanValue()) {
                            c0Var.k(i26);
                        }
                        i17 = 8;
                    } else {
                        eVar2 = eVar3;
                        jArr2 = jArr3;
                        i14 = length;
                        i15 = i19;
                        i16 = i24;
                        c13 = c14;
                        j13 = j15;
                        i17 = i23;
                    }
                    j14 >>= i17;
                    i25++;
                    i23 = i17;
                    j15 = j13;
                    c14 = c13;
                    eVar3 = eVar2;
                    jArr3 = jArr2;
                    length = i14;
                    i24 = i16;
                    i19 = i15;
                }
                eVar = eVar3;
                jArr = jArr3;
                int i35 = length;
                int i36 = i19;
                if (i24 != i23) {
                    return;
                }
                length = i35;
                i13 = i36;
            } else {
                eVar = eVar3;
                jArr = jArr3;
                i13 = i19;
            }
            if (i13 == length) {
                return;
            }
            i19 = i13 + 1;
            eVar3 = eVar;
            jArr3 = jArr;
        }
    }

    public final void f(p0 p0Var) {
        int d2 = p.k().d();
        Object g13 = this.f110689e.f78194a.g(p0Var);
        if (g13 == null) {
            return;
        }
        boolean z13 = g13 instanceof g0;
        g1.c0 c0Var = this.f110690f;
        if (!z13) {
            g1.z zVar = (g1.z) c0Var.g(g13);
            if (zVar == null) {
                zVar = new g1.z();
                c0Var.l(g13, zVar);
                Unit unit = Unit.f80348a;
            }
            c(p0Var, d2, g13, zVar);
            return;
        }
        g0 g0Var = (g0) g13;
        Object[] objArr = g0Var.f63286b;
        long[] jArr = g0Var.f63285a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        Object obj = objArr[(i13 << 3) + i15];
                        g1.z zVar2 = (g1.z) c0Var.g(obj);
                        if (zVar2 == null) {
                            zVar2 = new g1.z();
                            c0Var.l(obj, zVar2);
                            Unit unit2 = Unit.f80348a;
                        }
                        c(p0Var, d2, obj, zVar2);
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }
}
