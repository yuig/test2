package z2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object obj, int i13) {
        super(0, obj, h.class, "invalidateNodes", "invalidateNodes()V", 0);
        this.f140617a = i13;
        if (i13 != 1) {
        } else {
            super(0, obj, androidx.compose.ui.focus.b.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        g1.g0 g0Var;
        h hVar;
        g1.g0 g0Var2;
        Object[] objArr;
        long[] jArr;
        g1.g0 g0Var3;
        h hVar2;
        g1.g0 g0Var4;
        Object[] objArr2;
        long[] jArr2;
        x xVar;
        k2.e eVar;
        k2.e eVar2;
        boolean z13;
        boolean z14;
        g1.g0 g0Var5;
        h hVar3;
        g1.g0 g0Var6;
        g1.g0 g0Var7;
        int i13;
        k2.e eVar3;
        Object[] objArr3;
        long[] jArr3;
        Object[] objArr4;
        long[] jArr4;
        int i14;
        k2.e eVar4;
        k2.e eVar5;
        Object[] objArr5;
        long[] jArr5;
        int i15;
        switch (this.f140617a) {
            case 0:
                h hVar4 = (h) this.receiver;
                g1.g0 g0Var8 = hVar4.f140623e;
                Object[] objArr6 = g0Var8.f63286b;
                long[] jArr6 = g0Var8.f63285a;
                int length = jArr6.length - 2;
                char c13 = 7;
                long j13 = -9187201950435737472L;
                g1.g0 g0Var9 = hVar4.f140621c;
                int i16 = 8;
                if (length >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j14 = jArr6[i17];
                        if ((((~j14) << c13) & j14 & j13) != j13) {
                            int i18 = 8 - ((~(i17 - length)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j14 & 255) < 128) {
                                    u2.p pVar = (u2.p) ((q) objArr6[(i17 << 3) + i19]);
                                    u2.p pVar2 = pVar.f120042a;
                                    if (pVar2.f120054m) {
                                        k2.e eVar6 = null;
                                        while (pVar2 != null) {
                                            if (pVar2 instanceof z) {
                                                g0Var9.d((z) pVar2);
                                            } else if ((pVar2.f120044c & 1024) != 0 && (pVar2 instanceof s3.n)) {
                                                u2.p pVar3 = ((s3.n) pVar2).f110843o;
                                                objArr5 = objArr6;
                                                int i23 = 0;
                                                while (pVar3 != null) {
                                                    long[] jArr7 = jArr6;
                                                    if ((pVar3.f120044c & 1024) != 0) {
                                                        i23++;
                                                        if (i23 == 1) {
                                                            pVar2 = pVar3;
                                                        } else {
                                                            if (eVar6 == null) {
                                                                i15 = i23;
                                                                eVar6 = new k2.e(new u2.p[16]);
                                                            } else {
                                                                i15 = i23;
                                                            }
                                                            if (pVar2 != null) {
                                                                eVar6.b(pVar2);
                                                                pVar2 = null;
                                                            }
                                                            eVar6.b(pVar3);
                                                            i23 = i15;
                                                        }
                                                    }
                                                    pVar3 = pVar3.f120047f;
                                                    jArr6 = jArr7;
                                                }
                                                jArr5 = jArr6;
                                                if (i23 == 1) {
                                                    objArr6 = objArr5;
                                                    jArr6 = jArr5;
                                                }
                                                pVar2 = com.bumptech.glide.c.g(eVar6);
                                                objArr6 = objArr5;
                                                jArr6 = jArr5;
                                            }
                                            objArr5 = objArr6;
                                            jArr5 = jArr6;
                                            pVar2 = com.bumptech.glide.c.g(eVar6);
                                            objArr6 = objArr5;
                                            jArr6 = jArr5;
                                        }
                                        objArr4 = objArr6;
                                        jArr4 = jArr6;
                                        u2.p pVar4 = pVar.f120042a;
                                        if (!pVar4.f120054m) {
                                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                        }
                                        k2.e eVar7 = new k2.e(new u2.p[16]);
                                        u2.p pVar5 = pVar4.f120047f;
                                        if (pVar5 == null) {
                                            com.bumptech.glide.c.e(eVar7, pVar4);
                                        } else {
                                            eVar7.b(pVar5);
                                        }
                                        while (eVar7.m()) {
                                            u2.p pVar6 = (u2.p) eVar7.o(eVar7.f78184c - 1);
                                            if ((pVar6.f120045d & 1024) == 0) {
                                                com.bumptech.glide.c.e(eVar7, pVar6);
                                            } else {
                                                while (true) {
                                                    if (pVar6 == null) {
                                                        break;
                                                    }
                                                    if ((pVar6.f120044c & 1024) != 0) {
                                                        k2.e eVar8 = null;
                                                        while (pVar6 != null) {
                                                            if (pVar6 instanceof z) {
                                                                g0Var9.d((z) pVar6);
                                                            } else if ((pVar6.f120044c & 1024) != 0 && (pVar6 instanceof s3.n)) {
                                                                u2.p pVar7 = ((s3.n) pVar6).f110843o;
                                                                int i24 = 0;
                                                                while (pVar7 != null) {
                                                                    if ((pVar7.f120044c & 1024) != 0) {
                                                                        i24++;
                                                                        if (i24 == 1) {
                                                                            eVar5 = eVar7;
                                                                            pVar6 = pVar7;
                                                                        } else {
                                                                            if (eVar8 == null) {
                                                                                eVar5 = eVar7;
                                                                                eVar8 = new k2.e(new u2.p[16]);
                                                                            } else {
                                                                                eVar5 = eVar7;
                                                                            }
                                                                            if (pVar6 != null) {
                                                                                eVar8.b(pVar6);
                                                                                pVar6 = null;
                                                                            }
                                                                            eVar8.b(pVar7);
                                                                        }
                                                                    } else {
                                                                        eVar5 = eVar7;
                                                                    }
                                                                    pVar7 = pVar7.f120047f;
                                                                    eVar7 = eVar5;
                                                                }
                                                                eVar4 = eVar7;
                                                                if (i24 == 1) {
                                                                    eVar7 = eVar4;
                                                                }
                                                                pVar6 = com.bumptech.glide.c.g(eVar8);
                                                                eVar7 = eVar4;
                                                            }
                                                            eVar4 = eVar7;
                                                            pVar6 = com.bumptech.glide.c.g(eVar8);
                                                            eVar7 = eVar4;
                                                        }
                                                    } else {
                                                        pVar6 = pVar6.f120047f;
                                                        eVar7 = eVar7;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        objArr4 = objArr6;
                                        jArr4 = jArr6;
                                    }
                                    i14 = 8;
                                } else {
                                    objArr4 = objArr6;
                                    jArr4 = jArr6;
                                    i14 = i16;
                                }
                                j14 >>= i14;
                                i19++;
                                i16 = i14;
                                objArr6 = objArr4;
                                jArr6 = jArr4;
                            }
                            objArr3 = objArr6;
                            jArr3 = jArr6;
                            if (i18 != i16) {
                            }
                        } else {
                            objArr3 = objArr6;
                            jArr3 = jArr6;
                        }
                        if (i17 != length) {
                            i17++;
                            objArr6 = objArr3;
                            jArr6 = jArr3;
                            c13 = 7;
                            i16 = 8;
                            j13 = -9187201950435737472L;
                        }
                    }
                }
                g0Var8.f();
                g1.g0 g0Var10 = hVar4.f140622d;
                Object[] objArr7 = g0Var10.f63286b;
                long[] jArr8 = g0Var10.f63285a;
                int length2 = jArr8.length - 2;
                g1.g0 g0Var11 = hVar4.f140624f;
                if (length2 >= 0) {
                    int i25 = 0;
                    while (true) {
                        long j15 = jArr8[i25];
                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i26 = 8 - ((~(i25 - length2)) >>> 31);
                            int i27 = 0;
                            while (i27 < i26) {
                                if ((j15 & 255) < 128) {
                                    d dVar = (d) objArr7[(i25 << 3) + i27];
                                    u2.p pVar8 = (u2.p) dVar;
                                    objArr2 = objArr7;
                                    u2.p pVar9 = pVar8.f120042a;
                                    jArr2 = jArr8;
                                    if (pVar9.f120054m) {
                                        boolean z15 = false;
                                        boolean z16 = true;
                                        z zVar = null;
                                        k2.e eVar9 = null;
                                        while (pVar9 != null) {
                                            boolean z17 = z16;
                                            if (pVar9 instanceof z) {
                                                z zVar2 = (z) pVar9;
                                                if (zVar != null) {
                                                    z15 = true;
                                                }
                                                if (g0Var9.a(zVar2)) {
                                                    g0Var11.d(zVar2);
                                                    z16 = false;
                                                } else {
                                                    z16 = z17;
                                                }
                                                g0Var5 = g0Var10;
                                                hVar3 = hVar4;
                                                g0Var6 = g0Var8;
                                                zVar = zVar2;
                                            } else {
                                                if ((pVar9.f120044c & 1024) == 0 || !(pVar9 instanceof s3.n)) {
                                                    g0Var5 = g0Var10;
                                                    hVar3 = hVar4;
                                                    g0Var6 = g0Var8;
                                                } else {
                                                    u2.p pVar10 = ((s3.n) pVar9).f110843o;
                                                    g0Var6 = g0Var8;
                                                    int i28 = 0;
                                                    while (pVar10 != null) {
                                                        h hVar5 = hVar4;
                                                        if ((pVar10.f120044c & 1024) != 0) {
                                                            i28++;
                                                            if (i28 == 1) {
                                                                g0Var7 = g0Var10;
                                                                pVar9 = pVar10;
                                                            } else {
                                                                if (eVar9 == null) {
                                                                    g0Var7 = g0Var10;
                                                                    i13 = i28;
                                                                    eVar3 = new k2.e(new u2.p[16]);
                                                                } else {
                                                                    g0Var7 = g0Var10;
                                                                    i13 = i28;
                                                                    eVar3 = eVar9;
                                                                }
                                                                if (pVar9 != null) {
                                                                    eVar3.b(pVar9);
                                                                    pVar9 = null;
                                                                }
                                                                eVar3.b(pVar10);
                                                                eVar9 = eVar3;
                                                                i28 = i13;
                                                            }
                                                        } else {
                                                            g0Var7 = g0Var10;
                                                        }
                                                        pVar10 = pVar10.f120047f;
                                                        hVar4 = hVar5;
                                                        g0Var10 = g0Var7;
                                                    }
                                                    g0Var5 = g0Var10;
                                                    hVar3 = hVar4;
                                                    if (i28 == 1) {
                                                        z16 = z17;
                                                        g0Var8 = g0Var6;
                                                        hVar4 = hVar3;
                                                        g0Var10 = g0Var5;
                                                    }
                                                }
                                                z16 = z17;
                                            }
                                            pVar9 = com.bumptech.glide.c.g(eVar9);
                                            g0Var8 = g0Var6;
                                            hVar4 = hVar3;
                                            g0Var10 = g0Var5;
                                        }
                                        g0Var3 = g0Var10;
                                        hVar2 = hVar4;
                                        g0Var4 = g0Var8;
                                        boolean z18 = z16;
                                        u2.p pVar11 = pVar8.f120042a;
                                        if (!pVar11.f120054m) {
                                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                        }
                                        k2.e eVar10 = new k2.e(new u2.p[16]);
                                        u2.p pVar12 = pVar11.f120047f;
                                        if (pVar12 == null) {
                                            com.bumptech.glide.c.e(eVar10, pVar11);
                                        } else {
                                            eVar10.b(pVar12);
                                        }
                                        boolean z19 = z18;
                                        while (eVar10.m()) {
                                            u2.p pVar13 = (u2.p) eVar10.o(eVar10.f78184c - 1);
                                            if ((pVar13.f120045d & 1024) == 0) {
                                                com.bumptech.glide.c.e(eVar10, pVar13);
                                            } else {
                                                while (pVar13 != null) {
                                                    if ((pVar13.f120044c & 1024) != 0) {
                                                        k2.e eVar11 = null;
                                                        while (pVar13 != null) {
                                                            if (pVar13 instanceof z) {
                                                                z zVar3 = (z) pVar13;
                                                                if (zVar != null) {
                                                                    z15 = true;
                                                                }
                                                                if (g0Var9.a(zVar3)) {
                                                                    g0Var11.d(zVar3);
                                                                    z19 = false;
                                                                }
                                                                zVar = zVar3;
                                                                eVar2 = eVar10;
                                                            } else {
                                                                if ((pVar13.f120044c & 1024) == 0 || !(pVar13 instanceof s3.n)) {
                                                                    eVar2 = eVar10;
                                                                    z13 = z19;
                                                                } else {
                                                                    u2.p pVar14 = ((s3.n) pVar13).f110843o;
                                                                    int i29 = 0;
                                                                    while (pVar14 != null) {
                                                                        k2.e eVar12 = eVar10;
                                                                        if ((pVar14.f120044c & 1024) != 0) {
                                                                            i29++;
                                                                            if (i29 == 1) {
                                                                                pVar13 = pVar14;
                                                                            } else {
                                                                                if (eVar11 == null) {
                                                                                    z14 = z19;
                                                                                    eVar11 = new k2.e(new u2.p[16]);
                                                                                } else {
                                                                                    z14 = z19;
                                                                                }
                                                                                if (pVar13 != null) {
                                                                                    eVar11.b(pVar13);
                                                                                    pVar13 = null;
                                                                                }
                                                                                eVar11.b(pVar14);
                                                                                pVar14 = pVar14.f120047f;
                                                                                z19 = z14;
                                                                                eVar10 = eVar12;
                                                                            }
                                                                        }
                                                                        z14 = z19;
                                                                        pVar14 = pVar14.f120047f;
                                                                        z19 = z14;
                                                                        eVar10 = eVar12;
                                                                    }
                                                                    eVar2 = eVar10;
                                                                    z13 = z19;
                                                                    if (i29 == 1) {
                                                                        z19 = z13;
                                                                        eVar10 = eVar2;
                                                                    }
                                                                }
                                                                z19 = z13;
                                                            }
                                                            pVar13 = com.bumptech.glide.c.g(eVar11);
                                                            eVar10 = eVar2;
                                                        }
                                                        eVar = eVar10;
                                                        eVar10 = eVar;
                                                    } else {
                                                        pVar13 = pVar13.f120047f;
                                                        eVar10 = eVar10;
                                                    }
                                                }
                                            }
                                            eVar = eVar10;
                                            eVar10 = eVar;
                                        }
                                        if (z19) {
                                            if (z15) {
                                                xVar = androidx.compose.ui.focus.a.q(dVar);
                                            } else if (zVar == null || (xVar = zVar.N0()) == null) {
                                                xVar = x.Inactive;
                                            }
                                            dVar.x(xVar);
                                        }
                                        j15 >>= 8;
                                        i27++;
                                        objArr7 = objArr2;
                                        jArr8 = jArr2;
                                        g0Var8 = g0Var4;
                                        hVar4 = hVar2;
                                        g0Var10 = g0Var3;
                                    } else {
                                        dVar.x(x.Inactive);
                                        g0Var3 = g0Var10;
                                        hVar2 = hVar4;
                                        g0Var4 = g0Var8;
                                    }
                                } else {
                                    g0Var3 = g0Var10;
                                    hVar2 = hVar4;
                                    g0Var4 = g0Var8;
                                    objArr2 = objArr7;
                                    jArr2 = jArr8;
                                }
                                j15 >>= 8;
                                i27++;
                                objArr7 = objArr2;
                                jArr8 = jArr2;
                                g0Var8 = g0Var4;
                                hVar4 = hVar2;
                                g0Var10 = g0Var3;
                            }
                            g0Var = g0Var10;
                            hVar = hVar4;
                            g0Var2 = g0Var8;
                            objArr = objArr7;
                            jArr = jArr8;
                            if (i26 != 8) {
                            }
                        } else {
                            g0Var = g0Var10;
                            hVar = hVar4;
                            g0Var2 = g0Var8;
                            objArr = objArr7;
                            jArr = jArr8;
                        }
                        if (i25 != length2) {
                            i25++;
                            objArr7 = objArr;
                            jArr8 = jArr;
                            g0Var8 = g0Var2;
                            hVar4 = hVar;
                            g0Var10 = g0Var;
                        }
                    }
                } else {
                    g0Var = g0Var10;
                    hVar = hVar4;
                    g0Var2 = g0Var8;
                }
                g0Var.f();
                Object[] objArr8 = g0Var9.f63286b;
                long[] jArr9 = g0Var9.f63285a;
                int length3 = jArr9.length - 2;
                if (length3 >= 0) {
                    int i33 = 0;
                    while (true) {
                        long j16 = jArr9[i33];
                        if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i34 = 8 - ((~(i33 - length3)) >>> 31);
                            for (int i35 = 0; i35 < i34; i35++) {
                                if ((j16 & 255) < 128) {
                                    z zVar4 = (z) objArr8[(i33 << 3) + i35];
                                    if (zVar4.f120054m) {
                                        x N0 = zVar4.N0();
                                        zVar4.Q0();
                                        if (N0 != zVar4.N0() || g0Var11.a(zVar4)) {
                                            androidx.compose.ui.focus.a.D(zVar4);
                                        }
                                    }
                                }
                                j16 >>= 8;
                            }
                            if (i34 != 8) {
                            }
                        }
                        if (i33 != length3) {
                            i33++;
                        }
                    }
                }
                g0Var9.f();
                g0Var11.f();
                hVar.f140620b.invoke();
                if (!g0Var2.b()) {
                    jk.r.y("Unprocessed FocusProperties nodes");
                    throw null;
                }
                if (!g0Var.b()) {
                    jk.r.y("Unprocessed FocusEvent nodes");
                    throw null;
                }
                if (g0Var9.b()) {
                    return;
                }
                jk.r.y("Unprocessed FocusTarget nodes");
                throw null;
            default:
                androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) this.receiver;
                if (bVar.f17409f.N0() == x.Inactive) {
                    bVar.f17406c.invoke();
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f140617a) {
            case 0:
                h();
                break;
            default:
                h();
                break;
        }
        return Unit.f80348a;
    }
}
