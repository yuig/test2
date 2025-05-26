package u4;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f120247a;

    /* renamed from: d, reason: collision with root package name */
    public e f120250d;

    /* renamed from: e, reason: collision with root package name */
    public e f120251e;

    /* renamed from: f, reason: collision with root package name */
    public e f120252f;

    /* renamed from: g, reason: collision with root package name */
    public e f120253g;

    /* renamed from: h, reason: collision with root package name */
    public int f120254h;

    /* renamed from: i, reason: collision with root package name */
    public int f120255i;

    /* renamed from: j, reason: collision with root package name */
    public int f120256j;

    /* renamed from: k, reason: collision with root package name */
    public int f120257k;

    /* renamed from: q, reason: collision with root package name */
    public int f120263q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f120264r;

    /* renamed from: b, reason: collision with root package name */
    public h f120248b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f120249c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f120258l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f120259m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f120260n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f120261o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f120262p = 0;

    public j(k kVar, int i13, e eVar, e eVar2, e eVar3, e eVar4, int i14) {
        this.f120264r = kVar;
        this.f120254h = 0;
        this.f120255i = 0;
        this.f120256j = 0;
        this.f120257k = 0;
        this.f120263q = 0;
        this.f120247a = i13;
        this.f120250d = eVar;
        this.f120251e = eVar2;
        this.f120252f = eVar3;
        this.f120253g = eVar4;
        this.f120254h = kVar.B0;
        this.f120255i = kVar.f120281x0;
        this.f120256j = kVar.C0;
        this.f120257k = kVar.f120282y0;
        this.f120263q = i14;
    }

    public final void a(h hVar) {
        int i13 = this.f120247a;
        k kVar = this.f120264r;
        if (i13 == 0) {
            int l03 = kVar.l0(this.f120263q, hVar);
            if (hVar.U[0] == g.MATCH_CONSTRAINT) {
                this.f120262p++;
                l03 = 0;
            }
            this.f120258l = l03 + (hVar.f120213i0 != 8 ? kVar.U0 : 0) + this.f120258l;
            int k03 = kVar.k0(this.f120263q, hVar);
            if (this.f120248b == null || this.f120249c < k03) {
                this.f120248b = hVar;
                this.f120249c = k03;
                this.f120259m = k03;
            }
        } else {
            int l04 = kVar.l0(this.f120263q, hVar);
            int k04 = kVar.k0(this.f120263q, hVar);
            if (hVar.U[1] == g.MATCH_CONSTRAINT) {
                this.f120262p++;
                k04 = 0;
            }
            this.f120259m = k04 + (hVar.f120213i0 != 8 ? kVar.V0 : 0) + this.f120259m;
            if (this.f120248b == null || this.f120249c < l04) {
                this.f120248b = hVar;
                this.f120249c = l04;
                this.f120258l = l04;
            }
        }
        this.f120261o++;
    }

    public final void b(int i13, boolean z13, boolean z14) {
        k kVar;
        int i14;
        int i15;
        int i16;
        h hVar;
        int i17;
        char c13;
        int i18;
        float f13;
        float f14;
        int i19;
        float f15;
        int i23;
        int i24 = this.f120261o;
        int i25 = 0;
        while (true) {
            kVar = this.f120264r;
            if (i25 >= i24 || (i23 = this.f120260n + i25) >= kVar.f120271g1) {
                break;
            }
            h hVar2 = kVar.f120270f1[i23];
            if (hVar2 != null) {
                hVar2.M();
            }
            i25++;
        }
        if (i24 == 0 || this.f120248b == null) {
            return;
        }
        boolean z15 = z14 && i13 == 0;
        int i26 = -1;
        int i27 = -1;
        for (int i28 = 0; i28 < i24; i28++) {
            int i29 = this.f120260n + (z13 ? (i24 - 1) - i28 : i28);
            if (i29 >= kVar.f120271g1) {
                break;
            }
            h hVar3 = kVar.f120270f1[i29];
            if (hVar3 != null && hVar3.f120213i0 == 0) {
                if (i26 == -1) {
                    i26 = i28;
                }
                i27 = i28;
            }
        }
        if (this.f120247a != 0) {
            h hVar4 = this.f120248b;
            hVar4.f120221m0 = kVar.I0;
            int i33 = this.f120254h;
            if (i13 > 0) {
                i33 += kVar.U0;
            }
            e eVar = hVar4.f120195J;
            e eVar2 = hVar4.L;
            if (z13) {
                eVar2.a(this.f120252f, i33);
                if (z14) {
                    eVar.a(this.f120250d, this.f120256j);
                }
                if (i13 > 0) {
                    this.f120252f.f120187d.f120195J.a(eVar2, 0);
                }
            } else {
                eVar.a(this.f120250d, i33);
                if (z14) {
                    eVar2.a(this.f120252f, this.f120256j);
                }
                if (i13 > 0) {
                    this.f120250d.f120187d.L.a(eVar, 0);
                }
            }
            h hVar5 = null;
            for (int i34 = 0; i34 < i24; i34++) {
                int i35 = this.f120260n + i34;
                if (i35 >= kVar.f120271g1) {
                    return;
                }
                h hVar6 = kVar.f120270f1[i35];
                if (hVar6 != null) {
                    e eVar3 = hVar6.K;
                    if (i34 == 0) {
                        hVar6.g(eVar3, this.f120251e, this.f120255i);
                        int i36 = kVar.J0;
                        float f16 = kVar.P0;
                        if (this.f120260n == 0) {
                            i16 = kVar.L0;
                            i14 = i36;
                            i15 = -1;
                            if (i16 != -1) {
                                f16 = kVar.R0;
                                hVar6.f120223n0 = i16;
                                hVar6.f120209g0 = f16;
                            }
                        } else {
                            i14 = i36;
                            i15 = -1;
                        }
                        if (!z14 || (i16 = kVar.N0) == i15) {
                            i16 = i14;
                        } else {
                            f16 = kVar.T0;
                        }
                        hVar6.f120223n0 = i16;
                        hVar6.f120209g0 = f16;
                    }
                    if (i34 == i24 - 1) {
                        hVar6.g(hVar6.M, this.f120253g, this.f120257k);
                    }
                    if (hVar5 != null) {
                        int i37 = kVar.V0;
                        e eVar4 = hVar5.M;
                        eVar3.a(eVar4, i37);
                        if (i34 == i26) {
                            int i38 = this.f120255i;
                            if (eVar3.j()) {
                                eVar3.f120191h = i38;
                            }
                        }
                        eVar4.a(eVar3, 0);
                        if (i34 == i27 + 1) {
                            int i39 = this.f120257k;
                            if (eVar4.j()) {
                                eVar4.f120191h = i39;
                            }
                        }
                    }
                    if (hVar6 != hVar4) {
                        e eVar5 = hVar6.L;
                        e eVar6 = hVar6.f120195J;
                        if (z13) {
                            int i43 = kVar.W0;
                            if (i43 == 0) {
                                eVar5.a(eVar2, 0);
                            } else if (i43 == 1) {
                                eVar6.a(eVar, 0);
                            } else if (i43 == 2) {
                                eVar6.a(eVar, 0);
                                eVar5.a(eVar2, 0);
                            }
                        } else {
                            int i44 = kVar.W0;
                            if (i44 == 0) {
                                eVar6.a(eVar, 0);
                            } else if (i44 == 1) {
                                eVar5.a(eVar2, 0);
                            } else if (i44 == 2) {
                                if (z15) {
                                    eVar6.a(this.f120250d, this.f120254h);
                                    eVar5.a(this.f120252f, this.f120256j);
                                } else {
                                    eVar6.a(eVar, 0);
                                    eVar5.a(eVar2, 0);
                                }
                            }
                            hVar5 = hVar6;
                        }
                    }
                    hVar5 = hVar6;
                }
            }
            return;
        }
        h hVar7 = this.f120248b;
        hVar7.f120223n0 = kVar.J0;
        int i45 = this.f120255i;
        if (i13 > 0) {
            i45 += kVar.V0;
        }
        e eVar7 = this.f120251e;
        e eVar8 = hVar7.K;
        eVar8.a(eVar7, i45);
        e eVar9 = hVar7.M;
        if (z14) {
            eVar9.a(this.f120253g, this.f120257k);
        }
        if (i13 > 0) {
            this.f120251e.f120187d.M.a(eVar8, 0);
        }
        if (kVar.X0 == 3 && !hVar7.E) {
            for (int i46 = 0; i46 < i24; i46++) {
                int i47 = this.f120260n + (z13 ? (i24 - 1) - i46 : i46);
                if (i47 >= kVar.f120271g1) {
                    break;
                }
                hVar = kVar.f120270f1[i47];
                if (hVar.E) {
                    break;
                }
            }
        }
        hVar = hVar7;
        int i48 = 0;
        h hVar8 = null;
        while (i48 < i24) {
            int i49 = z13 ? (i24 - 1) - i48 : i48;
            int i53 = this.f120260n + i49;
            if (i53 >= kVar.f120271g1) {
                return;
            }
            h hVar9 = kVar.f120270f1[i53];
            if (hVar9 == null) {
                i17 = i24;
                c13 = 3;
            } else {
                e eVar10 = hVar9.f120195J;
                if (i48 == 0) {
                    hVar9.g(eVar10, this.f120250d, this.f120254h);
                }
                if (i49 == 0) {
                    int i54 = kVar.I0;
                    if (z13) {
                        i18 = i54;
                        f13 = 1.0f - kVar.O0;
                    } else {
                        i18 = i54;
                        f13 = kVar.O0;
                    }
                    if (this.f120260n == 0) {
                        int i55 = kVar.K0;
                        f14 = f13;
                        if (i55 != -1) {
                            f15 = z13 ? 1.0f - kVar.Q0 : kVar.Q0;
                            i19 = i55;
                            hVar9.f120221m0 = i19;
                            hVar9.f120207f0 = f15;
                        }
                    } else {
                        f14 = f13;
                    }
                    if (!z14 || (i19 = kVar.M0) == -1) {
                        i19 = i18;
                        f15 = f14;
                    } else {
                        f15 = z13 ? 1.0f - kVar.S0 : kVar.S0;
                    }
                    hVar9.f120221m0 = i19;
                    hVar9.f120207f0 = f15;
                }
                if (i48 == i24 - 1) {
                    i17 = i24;
                    hVar9.g(hVar9.L, this.f120252f, this.f120256j);
                } else {
                    i17 = i24;
                }
                if (hVar8 != null) {
                    int i56 = kVar.U0;
                    e eVar11 = hVar8.L;
                    eVar10.a(eVar11, i56);
                    if (i48 == i26) {
                        int i57 = this.f120254h;
                        if (eVar10.j()) {
                            eVar10.f120191h = i57;
                        }
                    }
                    eVar11.a(eVar10, 0);
                    if (i48 == i27 + 1) {
                        int i58 = this.f120256j;
                        if (eVar11.j()) {
                            eVar11.f120191h = i58;
                        }
                    }
                }
                if (hVar9 != hVar7) {
                    int i59 = kVar.X0;
                    c13 = 3;
                    if (i59 == 3 && hVar.E && hVar9 != hVar && hVar9.E) {
                        hVar9.N.a(hVar.N, 0);
                    } else {
                        e eVar12 = hVar9.K;
                        if (i59 != 0) {
                            e eVar13 = hVar9.M;
                            if (i59 == 1) {
                                eVar13.a(eVar9, 0);
                            } else if (z15) {
                                eVar12.a(this.f120251e, this.f120255i);
                                eVar13.a(this.f120253g, this.f120257k);
                            } else {
                                eVar12.a(eVar8, 0);
                                eVar13.a(eVar9, 0);
                            }
                        } else {
                            eVar12.a(eVar8, 0);
                        }
                    }
                } else {
                    c13 = 3;
                }
                hVar8 = hVar9;
            }
            i48++;
            i24 = i17;
        }
    }

    public final int c() {
        return this.f120247a == 1 ? this.f120259m - this.f120264r.V0 : this.f120259m;
    }

    public final int d() {
        return this.f120247a == 0 ? this.f120258l - this.f120264r.U0 : this.f120258l;
    }

    public final void e(int i13) {
        int i14 = this.f120262p;
        if (i14 == 0) {
            return;
        }
        int i15 = this.f120261o;
        int i16 = i13 / i14;
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = this.f120260n;
            int i19 = i18 + i17;
            k kVar = this.f120264r;
            if (i19 >= kVar.f120271g1) {
                break;
            }
            h hVar = kVar.f120270f1[i18 + i17];
            if (this.f120247a == 0) {
                if (hVar != null) {
                    g[] gVarArr = hVar.U;
                    if (gVarArr[0] == g.MATCH_CONSTRAINT && hVar.f120230r == 0) {
                        kVar.j0(hVar, g.FIXED, i16, gVarArr[1], hVar.o());
                    }
                }
            } else if (hVar != null) {
                g[] gVarArr2 = hVar.U;
                if (gVarArr2[1] == g.MATCH_CONSTRAINT && hVar.f120232s == 0) {
                    kVar.j0(hVar, gVarArr2[0], hVar.y(), g.FIXED, i16);
                }
            }
        }
        this.f120258l = 0;
        this.f120259m = 0;
        this.f120248b = null;
        this.f120249c = 0;
        int i23 = this.f120261o;
        for (int i24 = 0; i24 < i23; i24++) {
            int i25 = this.f120260n + i24;
            k kVar2 = this.f120264r;
            if (i25 >= kVar2.f120271g1) {
                return;
            }
            h hVar2 = kVar2.f120270f1[i25];
            if (this.f120247a == 0) {
                int y13 = hVar2.y();
                int i26 = kVar2.U0;
                if (hVar2.f120213i0 == 8) {
                    i26 = 0;
                }
                this.f120258l = y13 + i26 + this.f120258l;
                int k03 = kVar2.k0(this.f120263q, hVar2);
                if (this.f120248b == null || this.f120249c < k03) {
                    this.f120248b = hVar2;
                    this.f120249c = k03;
                    this.f120259m = k03;
                }
            } else {
                int l03 = kVar2.l0(this.f120263q, hVar2);
                int k04 = kVar2.k0(this.f120263q, hVar2);
                int i27 = kVar2.V0;
                if (hVar2.f120213i0 == 8) {
                    i27 = 0;
                }
                this.f120259m = k04 + i27 + this.f120259m;
                if (this.f120248b == null || this.f120249c < l03) {
                    this.f120248b = hVar2;
                    this.f120249c = l03;
                    this.f120258l = l03;
                }
            }
        }
    }

    public final void f(int i13, e eVar, e eVar2, e eVar3, e eVar4, int i14, int i15, int i16, int i17, int i18) {
        this.f120247a = i13;
        this.f120250d = eVar;
        this.f120251e = eVar2;
        this.f120252f = eVar3;
        this.f120253g = eVar4;
        this.f120254h = i14;
        this.f120255i = i15;
        this.f120256j = i16;
        this.f120257k = i17;
        this.f120263q = i18;
    }
}
