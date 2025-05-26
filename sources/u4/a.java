package u4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: x0, reason: collision with root package name */
    public int f120163x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f120164y0 = true;

    /* renamed from: z0, reason: collision with root package name */
    public int f120165z0 = 0;
    public boolean A0 = false;

    @Override // u4.h
    public final boolean J() {
        return this.A0;
    }

    @Override // u4.h
    public final boolean K() {
        return this.A0;
    }

    @Override // u4.h
    public final void c(s4.d dVar, boolean z13) {
        boolean z14;
        int i13;
        int i14;
        e[] eVarArr = this.R;
        e eVar = this.f120195J;
        eVarArr[0] = eVar;
        e eVar2 = this.K;
        int i15 = 2;
        eVarArr[2] = eVar2;
        e eVar3 = this.L;
        eVarArr[1] = eVar3;
        e eVar4 = this.M;
        eVarArr[3] = eVar4;
        for (e eVar5 : eVarArr) {
            eVar5.f120192i = dVar.n(eVar5);
        }
        int i16 = this.f120163x0;
        if (i16 < 0 || i16 >= 4) {
            return;
        }
        e eVar6 = eVarArr[i16];
        if (!this.A0) {
            h0();
        }
        if (this.A0) {
            this.A0 = false;
            int i17 = this.f120163x0;
            if (i17 == 0 || i17 == 1) {
                dVar.e(eVar.f120192i, this.f120197a0);
                dVar.e(eVar3.f120192i, this.f120197a0);
                return;
            } else {
                if (i17 == 2 || i17 == 3) {
                    dVar.e(eVar2.f120192i, this.f120199b0);
                    dVar.e(eVar4.f120192i, this.f120199b0);
                    return;
                }
                return;
            }
        }
        for (int i18 = 0; i18 < this.f120279w0; i18++) {
            h hVar = this.f120278v0[i18];
            if ((this.f120164y0 || hVar.d()) && ((((i14 = this.f120163x0) == 0 || i14 == 1) && hVar.U[0] == g.MATCH_CONSTRAINT && hVar.f120195J.f120189f != null && hVar.L.f120189f != null) || ((i14 == 2 || i14 == 3) && hVar.U[1] == g.MATCH_CONSTRAINT && hVar.K.f120189f != null && hVar.M.f120189f != null))) {
                z14 = true;
                break;
            }
        }
        z14 = false;
        boolean z15 = eVar.i() || eVar3.i();
        boolean z16 = eVar2.i() || eVar4.i();
        int i19 = (z14 || !(((i13 = this.f120163x0) == 0 && z15) || ((i13 == 2 && z16) || ((i13 == 1 && z15) || (i13 == 3 && z16))))) ? 4 : 5;
        int i23 = 0;
        while (i23 < this.f120279w0) {
            h hVar2 = this.f120278v0[i23];
            if (this.f120164y0 || hVar2.d()) {
                s4.j n13 = dVar.n(hVar2.R[this.f120163x0]);
                int i24 = this.f120163x0;
                e eVar7 = hVar2.R[i24];
                eVar7.f120192i = n13;
                e eVar8 = eVar7.f120189f;
                int i25 = (eVar8 == null || eVar8.f120187d != this) ? 0 : eVar7.f120190g;
                if (i24 == 0 || i24 == i15) {
                    s4.j jVar = eVar6.f120192i;
                    int i26 = this.f120165z0 - i25;
                    s4.c o13 = dVar.o();
                    s4.j p13 = dVar.p();
                    p13.f111103d = 0;
                    o13.f(jVar, n13, p13, i26);
                    dVar.d(o13);
                } else {
                    s4.j jVar2 = eVar6.f120192i;
                    int i27 = this.f120165z0 + i25;
                    s4.c o14 = dVar.o();
                    s4.j p14 = dVar.p();
                    p14.f111103d = 0;
                    o14.e(jVar2, n13, p14, i27);
                    dVar.d(o14);
                }
                dVar.f(eVar6.f120192i, n13, this.f120165z0 + i25, i19);
            }
            i23++;
            i15 = 2;
        }
        int i28 = this.f120163x0;
        if (i28 == 0) {
            dVar.f(eVar3.f120192i, eVar.f120192i, 0, 8);
            dVar.f(eVar.f120192i, this.V.L.f120192i, 0, 4);
            dVar.f(eVar.f120192i, this.V.f120195J.f120192i, 0, 0);
            return;
        }
        if (i28 == 1) {
            dVar.f(eVar.f120192i, eVar3.f120192i, 0, 8);
            dVar.f(eVar.f120192i, this.V.f120195J.f120192i, 0, 4);
            dVar.f(eVar.f120192i, this.V.L.f120192i, 0, 0);
        } else if (i28 == 2) {
            dVar.f(eVar4.f120192i, eVar2.f120192i, 0, 8);
            dVar.f(eVar2.f120192i, this.V.M.f120192i, 0, 4);
            dVar.f(eVar2.f120192i, this.V.K.f120192i, 0, 0);
        } else if (i28 == 3) {
            dVar.f(eVar2.f120192i, eVar4.f120192i, 0, 8);
            dVar.f(eVar2.f120192i, this.V.K.f120192i, 0, 4);
            dVar.f(eVar2.f120192i, this.V.M.f120192i, 0, 0);
        }
    }

    @Override // u4.h
    public final boolean d() {
        return true;
    }

    public final boolean h0() {
        int i13;
        int i14;
        int i15;
        boolean z13 = true;
        int i16 = 0;
        while (true) {
            i13 = this.f120279w0;
            if (i16 >= i13) {
                break;
            }
            h hVar = this.f120278v0[i16];
            if ((this.f120164y0 || hVar.d()) && ((((i14 = this.f120163x0) == 0 || i14 == 1) && !hVar.J()) || (((i15 = this.f120163x0) == 2 || i15 == 3) && !hVar.K()))) {
                z13 = false;
            }
            i16++;
        }
        if (!z13 || i13 <= 0) {
            return false;
        }
        int i17 = 0;
        boolean z14 = false;
        for (int i18 = 0; i18 < this.f120279w0; i18++) {
            h hVar2 = this.f120278v0[i18];
            if (this.f120164y0 || hVar2.d()) {
                if (!z14) {
                    int i19 = this.f120163x0;
                    if (i19 == 0) {
                        i17 = hVar2.l(d.LEFT).d();
                    } else if (i19 == 1) {
                        i17 = hVar2.l(d.RIGHT).d();
                    } else if (i19 == 2) {
                        i17 = hVar2.l(d.TOP).d();
                    } else if (i19 == 3) {
                        i17 = hVar2.l(d.BOTTOM).d();
                    }
                    z14 = true;
                }
                int i23 = this.f120163x0;
                if (i23 == 0) {
                    i17 = Math.min(i17, hVar2.l(d.LEFT).d());
                } else if (i23 == 1) {
                    i17 = Math.max(i17, hVar2.l(d.RIGHT).d());
                } else if (i23 == 2) {
                    i17 = Math.min(i17, hVar2.l(d.TOP).d());
                } else if (i23 == 3) {
                    i17 = Math.max(i17, hVar2.l(d.BOTTOM).d());
                }
            }
        }
        int i24 = i17 + this.f120165z0;
        int i25 = this.f120163x0;
        if (i25 == 0 || i25 == 1) {
            U(i24, i24);
        } else {
            V(i24, i24);
        }
        this.A0 = true;
        return true;
    }

    @Override // u4.o, u4.h
    public final void i(h hVar, HashMap hashMap) {
        super.i(hVar, hashMap);
        a aVar = (a) hVar;
        this.f120163x0 = aVar.f120163x0;
        this.f120164y0 = aVar.f120164y0;
        this.f120165z0 = aVar.f120165z0;
    }

    public final int i0() {
        int i13 = this.f120163x0;
        if (i13 == 0 || i13 == 1) {
            return 0;
        }
        return (i13 == 2 || i13 == 3) ? 1 : -1;
    }

    public final void j0() {
        for (int i13 = 0; i13 < this.f120279w0; i13++) {
            h hVar = this.f120278v0[i13];
            if (this.f120164y0 || hVar.d()) {
                int i14 = this.f120163x0;
                if (i14 == 0 || i14 == 1) {
                    hVar.T[0] = true;
                } else if (i14 == 2 || i14 == 3) {
                    hVar.T[1] = true;
                }
            }
        }
    }

    @Override // u4.h
    public final String toString() {
        String p13 = a.a.p(new StringBuilder("[Barrier] "), this.f120217k0, " {");
        for (int i13 = 0; i13 < this.f120279w0; i13++) {
            h hVar = this.f120278v0[i13];
            if (i13 > 0) {
                p13 = a.a.C(p13, ", ");
            }
            StringBuilder i14 = n60.o.i(p13);
            i14.append(hVar.f120217k0);
            p13 = i14.toString();
        }
        return a.a.C(p13, "}");
    }
}
