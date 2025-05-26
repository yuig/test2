package v4;

/* loaded from: classes3.dex */
public final class n extends u {

    /* renamed from: k */
    public static final int[] f124005k = new int[2];

    public n(u4.h hVar) {
        super(hVar);
        this.f124025h.f123994e = g.LEFT;
        this.f124026i.f123994e = g.RIGHT;
        this.f124023f = 0;
    }

    public static void m(int[] iArr, int i13, int i14, int i15, int i16, float f13, int i17) {
        int i18 = i14 - i13;
        int i19 = i16 - i15;
        if (i17 != -1) {
            if (i17 == 0) {
                iArr[0] = (int) ((i19 * f13) + 0.5f);
                iArr[1] = i19;
                return;
            } else {
                if (i17 != 1) {
                    return;
                }
                iArr[0] = i18;
                iArr[1] = (int) ((i18 * f13) + 0.5f);
                return;
            }
        }
        int i23 = (int) ((i19 * f13) + 0.5f);
        int i24 = (int) ((i18 / f13) + 0.5f);
        if (i23 <= i18) {
            iArr[0] = i23;
            iArr[1] = i19;
        } else if (i24 <= i19) {
            iArr[0] = i18;
            iArr[1] = i24;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0249, code lost:
    
        if (r15 != 1) goto L313;
     */
    @Override // v4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(v4.e r23) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.n.a(v4.e):void");
    }

    @Override // v4.u
    public final void d() {
        u4.h hVar;
        u4.h hVar2;
        u4.g gVar;
        u4.h hVar3;
        u4.h hVar4;
        u4.g gVar2;
        u4.h hVar5 = this.f124019b;
        boolean z13 = hVar5.f120196a;
        i iVar = this.f124022e;
        if (z13) {
            iVar.d(hVar5.y());
        }
        boolean z14 = iVar.f123999j;
        h hVar6 = this.f124026i;
        h hVar7 = this.f124025h;
        if (z14) {
            u4.g gVar3 = this.f124021d;
            u4.g gVar4 = u4.g.MATCH_PARENT;
            if (gVar3 == gVar4 && (hVar2 = (hVar = this.f124019b).V) != null && ((gVar = hVar2.U[0]) == u4.g.FIXED || gVar == gVar4)) {
                u.b(hVar7, hVar2.f120202d.f124025h, hVar.f120195J.e());
                u.b(hVar6, hVar2.f120202d.f124026i, -this.f124019b.L.e());
                return;
            }
        } else {
            u4.h hVar8 = this.f124019b;
            u4.g gVar5 = hVar8.U[0];
            this.f124021d = gVar5;
            if (gVar5 != u4.g.MATCH_CONSTRAINT) {
                u4.g gVar6 = u4.g.MATCH_PARENT;
                if (gVar5 == gVar6 && (hVar4 = hVar8.V) != null && ((gVar2 = hVar4.U[0]) == u4.g.FIXED || gVar2 == gVar6)) {
                    int y13 = (hVar4.y() - this.f124019b.f120195J.e()) - this.f124019b.L.e();
                    u.b(hVar7, hVar4.f120202d.f124025h, this.f124019b.f120195J.e());
                    u.b(hVar6, hVar4.f120202d.f124026i, -this.f124019b.L.e());
                    iVar.d(y13);
                    return;
                }
                if (gVar5 == u4.g.FIXED) {
                    iVar.d(hVar8.y());
                }
            }
        }
        if (iVar.f123999j) {
            u4.h hVar9 = this.f124019b;
            if (hVar9.f120196a) {
                u4.e[] eVarArr = hVar9.R;
                u4.e eVar = eVarArr[0];
                u4.e eVar2 = eVar.f120189f;
                if (eVar2 != null && eVarArr[1].f120189f != null) {
                    if (hVar9.F()) {
                        hVar7.f123995f = this.f124019b.R[0].e();
                        hVar6.f123995f = -this.f124019b.R[1].e();
                        return;
                    }
                    h h10 = u.h(this.f124019b.R[0]);
                    if (h10 != null) {
                        u.b(hVar7, h10, this.f124019b.R[0].e());
                    }
                    h h13 = u.h(this.f124019b.R[1]);
                    if (h13 != null) {
                        u.b(hVar6, h13, -this.f124019b.R[1].e());
                    }
                    hVar7.f123991b = true;
                    hVar6.f123991b = true;
                    return;
                }
                if (eVar2 != null) {
                    h h14 = u.h(eVar);
                    if (h14 != null) {
                        u.b(hVar7, h14, this.f124019b.R[0].e());
                        u.b(hVar6, hVar7, iVar.f123996g);
                        return;
                    }
                    return;
                }
                u4.e eVar3 = eVarArr[1];
                if (eVar3.f120189f != null) {
                    h h15 = u.h(eVar3);
                    if (h15 != null) {
                        u.b(hVar6, h15, -this.f124019b.R[1].e());
                        u.b(hVar7, hVar6, -iVar.f123996g);
                        return;
                    }
                    return;
                }
                if ((hVar9 instanceof u4.n) || hVar9.V == null || hVar9.l(u4.d.CENTER).f120189f != null) {
                    return;
                }
                u4.h hVar10 = this.f124019b;
                u.b(hVar7, hVar10.V.f120202d.f124025h, hVar10.z());
                u.b(hVar6, hVar7, iVar.f123996g);
                return;
            }
        }
        if (this.f124021d == u4.g.MATCH_CONSTRAINT) {
            u4.h hVar11 = this.f124019b;
            int i13 = hVar11.f120230r;
            if (i13 == 2) {
                u4.h hVar12 = hVar11.V;
                if (hVar12 != null) {
                    i iVar2 = hVar12.f120204e.f124022e;
                    iVar.f124001l.add(iVar2);
                    iVar2.f124000k.add(iVar);
                    iVar.f123991b = true;
                    iVar.f124000k.add(hVar7);
                    iVar.f124000k.add(hVar6);
                }
            } else if (i13 == 3) {
                if (hVar11.f120232s == 3) {
                    hVar7.f123990a = this;
                    hVar6.f123990a = this;
                    q qVar = hVar11.f120204e;
                    qVar.f124025h.f123990a = this;
                    qVar.f124026i.f123990a = this;
                    iVar.f123990a = this;
                    if (hVar11.H()) {
                        iVar.f124001l.add(this.f124019b.f120204e.f124022e);
                        this.f124019b.f120204e.f124022e.f124000k.add(iVar);
                        q qVar2 = this.f124019b.f120204e;
                        qVar2.f124022e.f123990a = this;
                        iVar.f124001l.add(qVar2.f124025h);
                        iVar.f124001l.add(this.f124019b.f120204e.f124026i);
                        this.f124019b.f120204e.f124025h.f124000k.add(iVar);
                        this.f124019b.f120204e.f124026i.f124000k.add(iVar);
                    } else if (this.f124019b.F()) {
                        this.f124019b.f120204e.f124022e.f124001l.add(iVar);
                        iVar.f124000k.add(this.f124019b.f120204e.f124022e);
                    } else {
                        this.f124019b.f120204e.f124022e.f124001l.add(iVar);
                    }
                } else {
                    i iVar3 = hVar11.f120204e.f124022e;
                    iVar.f124001l.add(iVar3);
                    iVar3.f124000k.add(iVar);
                    this.f124019b.f120204e.f124025h.f124000k.add(iVar);
                    this.f124019b.f120204e.f124026i.f124000k.add(iVar);
                    iVar.f123991b = true;
                    iVar.f124000k.add(hVar7);
                    iVar.f124000k.add(hVar6);
                    hVar7.f124001l.add(iVar);
                    hVar6.f124001l.add(iVar);
                }
            }
        }
        u4.h hVar13 = this.f124019b;
        u4.e[] eVarArr2 = hVar13.R;
        u4.e eVar4 = eVarArr2[0];
        u4.e eVar5 = eVar4.f120189f;
        if (eVar5 != null && eVarArr2[1].f120189f != null) {
            if (hVar13.F()) {
                hVar7.f123995f = this.f124019b.R[0].e();
                hVar6.f123995f = -this.f124019b.R[1].e();
                return;
            }
            h h16 = u.h(this.f124019b.R[0]);
            h h17 = u.h(this.f124019b.R[1]);
            if (h16 != null) {
                h16.b(this);
            }
            if (h17 != null) {
                h17.b(this);
            }
            this.f124027j = t.CENTER;
            return;
        }
        if (eVar5 != null) {
            h h18 = u.h(eVar4);
            if (h18 != null) {
                u.b(hVar7, h18, this.f124019b.R[0].e());
                c(hVar6, hVar7, 1, iVar);
                return;
            }
            return;
        }
        u4.e eVar6 = eVarArr2[1];
        if (eVar6.f120189f != null) {
            h h19 = u.h(eVar6);
            if (h19 != null) {
                u.b(hVar6, h19, -this.f124019b.R[1].e());
                c(hVar7, hVar6, -1, iVar);
                return;
            }
            return;
        }
        if ((hVar13 instanceof u4.n) || (hVar3 = hVar13.V) == null) {
            return;
        }
        u.b(hVar7, hVar3.f120202d.f124025h, hVar13.z());
        c(hVar6, hVar7, 1, iVar);
    }

    @Override // v4.u
    public final void e() {
        h hVar = this.f124025h;
        if (hVar.f123999j) {
            this.f124019b.f120197a0 = hVar.f123996g;
        }
    }

    @Override // v4.u
    public final void f() {
        this.f124020c = null;
        this.f124025h.c();
        this.f124026i.c();
        this.f124022e.c();
        this.f124024g = false;
    }

    @Override // v4.u
    public final boolean k() {
        return this.f124021d != u4.g.MATCH_CONSTRAINT || this.f124019b.f120230r == 0;
    }

    public final void n() {
        this.f124024g = false;
        h hVar = this.f124025h;
        hVar.c();
        hVar.f123999j = false;
        h hVar2 = this.f124026i;
        hVar2.c();
        hVar2.f123999j = false;
        this.f124022e.f123999j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f124019b.f120217k0;
    }
}
