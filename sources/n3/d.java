package n3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final q3.x f89041a;

    /* renamed from: b, reason: collision with root package name */
    public final i f89042b = new i();

    /* renamed from: c, reason: collision with root package name */
    public final g1.w f89043c;

    public d(s3.x xVar) {
        this.f89041a = xVar;
        g1.w wVar = new g1.w();
        wVar.f63336a = g1.k0.f63281a;
        wVar.f63337b = g1.o.f63291a;
        wVar.f63338c = h1.a.f66447c;
        wVar.f(g1.k0.g(10));
        this.f89043c = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    public final void a(long j13, s3.v vVar, boolean z13) {
        long[] jArr;
        boolean z14;
        long[] jArr2;
        boolean z15;
        int i13;
        h hVar;
        h hVar2;
        i iVar = this.f89042b;
        g1.w wVar = this.f89043c;
        wVar.f63340e = 0;
        long[] jArr3 = wVar.f63336a;
        char c13 = 7;
        if (jArr3 != g1.k0.f63281a) {
            kotlin.collections.z.q(jArr3);
            long[] jArr4 = wVar.f63336a;
            int i14 = wVar.f63339d;
            int i15 = i14 >> 3;
            long j14 = 255 << ((i14 & 7) << 3);
            jArr4[i15] = j14 | (jArr4[i15] & (~j14));
        }
        int i16 = 0;
        kotlin.collections.z.o(0, wVar.f63339d, null, wVar.f63338c);
        wVar.f63341f = g1.k0.c(wVar.f63339d) - wVar.f63340e;
        int i17 = vVar.f110965d;
        boolean z16 = true;
        i iVar2 = iVar;
        boolean z17 = true;
        int i18 = 0;
        while (i18 < i17) {
            u2.p pVar = (u2.p) vVar.get(i18);
            if (z17) {
                k2.e eVar = iVar2.f89065a;
                int i19 = eVar.f78184c;
                if (i19 > 0) {
                    ?? r15 = eVar.f78182a;
                    int i23 = i16;
                    while (true) {
                        hVar2 = r15[i23];
                        if (Intrinsics.d(((h) hVar2).f89057b, pVar)) {
                            break;
                        }
                        int i24 = i23 + 1;
                        if (i24 >= i19) {
                            break;
                        } else {
                            i23 = i24;
                        }
                    }
                }
                hVar2 = 0;
                hVar = hVar2;
                if (hVar != null) {
                    hVar.f89063h = true;
                    hVar.f89058c.a(j13);
                    Object d2 = wVar.d(j13);
                    Object obj = d2;
                    if (d2 == null) {
                        g1.a0 a0Var = new g1.a0();
                        wVar.g(j13, a0Var);
                        obj = a0Var;
                    }
                    ((g1.a0) obj).a(hVar);
                    iVar2 = hVar;
                    i18++;
                    i16 = 0;
                } else {
                    z17 = false;
                }
            }
            hVar = new h(pVar);
            hVar.f89058c.a(j13);
            Object d13 = wVar.d(j13);
            Object obj2 = d13;
            if (d13 == null) {
                g1.a0 a0Var2 = new g1.a0();
                wVar.g(j13, a0Var2);
                obj2 = a0Var2;
            }
            ((g1.a0) obj2).a(hVar);
            iVar2.f89065a.b(hVar);
            iVar2 = hVar;
            i18++;
            i16 = 0;
        }
        if (!z13) {
            return;
        }
        long[] jArr5 = wVar.f63337b;
        Object[] objArr = wVar.f63338c;
        long[] jArr6 = wVar.f63336a;
        int length = jArr6.length - 2;
        if (length < 0) {
            return;
        }
        int i25 = 0;
        while (true) {
            long j15 = jArr6[i25];
            if ((((~j15) << c13) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i26 = 8;
                int i27 = 8 - ((~(i25 - length)) >>> 31);
                int i28 = 0;
                while (i28 < i27) {
                    if ((j15 & 255) < 128) {
                        int i29 = (i25 << 3) + i28;
                        long j16 = jArr5[i29];
                        g1.a0 a0Var3 = (g1.a0) objArr[i29];
                        k2.e eVar2 = iVar.f89065a;
                        int i33 = eVar2.f78184c;
                        if (i33 > 0) {
                            Object[] objArr2 = eVar2.f78182a;
                            int i34 = 0;
                            while (true) {
                                ((h) objArr2[i34]).g(j16, a0Var3);
                                jArr2 = jArr5;
                                z15 = true;
                                int i35 = i34 + 1;
                                if (i35 >= i33) {
                                    break;
                                }
                                i34 = i35;
                                jArr5 = jArr2;
                            }
                        } else {
                            jArr2 = jArr5;
                            z15 = true;
                        }
                        i13 = 8;
                    } else {
                        jArr2 = jArr5;
                        z15 = z16;
                        i13 = i26;
                    }
                    j15 >>= i13;
                    i28++;
                    z16 = z15;
                    i26 = i13;
                    jArr5 = jArr2;
                }
                jArr = jArr5;
                z14 = z16;
                if (i27 != i26) {
                    return;
                }
            } else {
                jArr = jArr5;
                z14 = z16;
            }
            if (i25 == length) {
                return;
            }
            i25++;
            z16 = z14;
            jArr5 = jArr;
            c13 = 7;
        }
    }

    public final boolean b(e eVar, boolean z13) {
        boolean z14;
        boolean z15;
        i iVar = this.f89042b;
        if (!iVar.a(eVar.b(), this.f89041a, eVar, z13)) {
            return false;
        }
        k2.e eVar2 = iVar.f89065a;
        int i13 = eVar2.f78184c;
        if (i13 > 0) {
            Object[] objArr = eVar2.f78182a;
            int i14 = 0;
            z14 = false;
            do {
                z14 = ((h) objArr[i14]).f(eVar, z13) || z14;
                i14++;
            } while (i14 < i13);
        } else {
            z14 = false;
        }
        int i15 = eVar2.f78184c;
        if (i15 > 0) {
            Object[] objArr2 = eVar2.f78182a;
            int i16 = 0;
            z15 = false;
            do {
                z15 = ((h) objArr2[i16]).e(eVar) || z15;
                i16++;
            } while (i16 < i15);
        } else {
            z15 = false;
        }
        iVar.b(eVar);
        return z15 || z14;
    }
}
