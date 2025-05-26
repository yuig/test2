package v4;

/* loaded from: classes3.dex */
public final class q extends u {

    /* renamed from: k, reason: collision with root package name */
    public final h f124009k;

    /* renamed from: l, reason: collision with root package name */
    public a f124010l;

    public q(u4.h hVar) {
        super(hVar);
        h hVar2 = new h(this);
        this.f124009k = hVar2;
        this.f124010l = null;
        this.f124025h.f123994e = g.TOP;
        this.f124026i.f123994e = g.BOTTOM;
        hVar2.f123994e = g.BASELINE;
        this.f124023f = 1;
    }

    @Override // v4.e
    public final void a(e eVar) {
        float f13;
        float f14;
        float f15;
        int i13;
        if (p.f124008a[this.f124027j.ordinal()] == 3) {
            u4.h hVar = this.f124019b;
            l(hVar.K, hVar.M, 1);
            return;
        }
        i iVar = this.f124022e;
        if (iVar.f123992c && !iVar.f123999j && this.f124021d == u4.g.MATCH_CONSTRAINT) {
            u4.h hVar2 = this.f124019b;
            int i14 = hVar2.f120232s;
            if (i14 == 2) {
                u4.h hVar3 = hVar2.V;
                if (hVar3 != null) {
                    if (hVar3.f120204e.f124022e.f123999j) {
                        iVar.d((int) ((r1.f123996g * hVar2.f120242z) + 0.5f));
                    }
                }
            } else if (i14 == 3) {
                i iVar2 = hVar2.f120202d.f124022e;
                if (iVar2.f123999j) {
                    int i15 = hVar2.Z;
                    if (i15 == -1) {
                        f13 = iVar2.f123996g;
                        f14 = hVar2.Y;
                    } else if (i15 == 0) {
                        f15 = iVar2.f123996g * hVar2.Y;
                        i13 = (int) (f15 + 0.5f);
                        iVar.d(i13);
                    } else if (i15 != 1) {
                        i13 = 0;
                        iVar.d(i13);
                    } else {
                        f13 = iVar2.f123996g;
                        f14 = hVar2.Y;
                    }
                    f15 = f13 / f14;
                    i13 = (int) (f15 + 0.5f);
                    iVar.d(i13);
                }
            }
        }
        h hVar4 = this.f124025h;
        if (hVar4.f123992c) {
            h hVar5 = this.f124026i;
            if (hVar5.f123992c) {
                if (hVar4.f123999j && hVar5.f123999j && iVar.f123999j) {
                    return;
                }
                if (!iVar.f123999j && this.f124021d == u4.g.MATCH_CONSTRAINT) {
                    u4.h hVar6 = this.f124019b;
                    if (hVar6.f120230r == 0 && !hVar6.H()) {
                        h hVar7 = (h) hVar4.f124001l.get(0);
                        h hVar8 = (h) hVar5.f124001l.get(0);
                        int i16 = hVar7.f123996g + hVar4.f123995f;
                        int i17 = hVar8.f123996g + hVar5.f123995f;
                        hVar4.d(i16);
                        hVar5.d(i17);
                        iVar.d(i17 - i16);
                        return;
                    }
                }
                if (!iVar.f123999j && this.f124021d == u4.g.MATCH_CONSTRAINT && this.f124018a == 1 && hVar4.f124001l.size() > 0 && hVar5.f124001l.size() > 0) {
                    h hVar9 = (h) hVar4.f124001l.get(0);
                    int i18 = (((h) hVar5.f124001l.get(0)).f123996g + hVar5.f123995f) - (hVar9.f123996g + hVar4.f123995f);
                    int i19 = iVar.f124002m;
                    if (i18 < i19) {
                        iVar.d(i18);
                    } else {
                        iVar.d(i19);
                    }
                }
                if (iVar.f123999j && hVar4.f124001l.size() > 0 && hVar5.f124001l.size() > 0) {
                    h hVar10 = (h) hVar4.f124001l.get(0);
                    h hVar11 = (h) hVar5.f124001l.get(0);
                    int i23 = hVar10.f123996g;
                    int i24 = hVar4.f123995f + i23;
                    int i25 = hVar11.f123996g;
                    int i26 = hVar5.f123995f + i25;
                    float f16 = this.f124019b.f120209g0;
                    if (hVar10 == hVar11) {
                        f16 = 0.5f;
                    } else {
                        i23 = i24;
                        i25 = i26;
                    }
                    hVar4.d((int) ((((i25 - i23) - iVar.f123996g) * f16) + i23 + 0.5f));
                    hVar5.d(hVar4.f123996g + iVar.f123996g);
                }
            }
        }
    }

    @Override // v4.u
    public final void d() {
        u4.h hVar;
        u4.h hVar2;
        u4.h hVar3;
        u4.h hVar4;
        u4.h hVar5 = this.f124019b;
        boolean z13 = hVar5.f120196a;
        i iVar = this.f124022e;
        if (z13) {
            iVar.d(hVar5.o());
        }
        boolean z14 = iVar.f123999j;
        h hVar6 = this.f124026i;
        h hVar7 = this.f124025h;
        if (!z14) {
            u4.h hVar8 = this.f124019b;
            this.f124021d = hVar8.U[1];
            if (hVar8.E) {
                this.f124010l = new a(this);
            }
            u4.g gVar = this.f124021d;
            if (gVar != u4.g.MATCH_CONSTRAINT) {
                if (gVar == u4.g.MATCH_PARENT && (hVar4 = this.f124019b.V) != null && hVar4.U[1] == u4.g.FIXED) {
                    int o13 = (hVar4.o() - this.f124019b.K.e()) - this.f124019b.M.e();
                    u.b(hVar7, hVar4.f120204e.f124025h, this.f124019b.K.e());
                    u.b(hVar6, hVar4.f120204e.f124026i, -this.f124019b.M.e());
                    iVar.d(o13);
                    return;
                }
                if (gVar == u4.g.FIXED) {
                    iVar.d(this.f124019b.o());
                }
            }
        } else if (this.f124021d == u4.g.MATCH_PARENT && (hVar2 = (hVar = this.f124019b).V) != null && hVar2.U[1] == u4.g.FIXED) {
            u.b(hVar7, hVar2.f120204e.f124025h, hVar.K.e());
            u.b(hVar6, hVar2.f120204e.f124026i, -this.f124019b.M.e());
            return;
        }
        boolean z15 = iVar.f123999j;
        h hVar9 = this.f124009k;
        if (z15) {
            u4.h hVar10 = this.f124019b;
            if (hVar10.f120196a) {
                u4.e[] eVarArr = hVar10.R;
                u4.e eVar = eVarArr[2];
                u4.e eVar2 = eVar.f120189f;
                if (eVar2 != null && eVarArr[3].f120189f != null) {
                    if (hVar10.H()) {
                        hVar7.f123995f = this.f124019b.R[2].e();
                        hVar6.f123995f = -this.f124019b.R[3].e();
                    } else {
                        h h10 = u.h(this.f124019b.R[2]);
                        if (h10 != null) {
                            u.b(hVar7, h10, this.f124019b.R[2].e());
                        }
                        h h13 = u.h(this.f124019b.R[3]);
                        if (h13 != null) {
                            u.b(hVar6, h13, -this.f124019b.R[3].e());
                        }
                        hVar7.f123991b = true;
                        hVar6.f123991b = true;
                    }
                    u4.h hVar11 = this.f124019b;
                    if (hVar11.E) {
                        u.b(hVar9, hVar7, hVar11.f120201c0);
                        return;
                    }
                    return;
                }
                if (eVar2 != null) {
                    h h14 = u.h(eVar);
                    if (h14 != null) {
                        u.b(hVar7, h14, this.f124019b.R[2].e());
                        u.b(hVar6, hVar7, iVar.f123996g);
                        u4.h hVar12 = this.f124019b;
                        if (hVar12.E) {
                            u.b(hVar9, hVar7, hVar12.f120201c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                u4.e eVar3 = eVarArr[3];
                if (eVar3.f120189f != null) {
                    h h15 = u.h(eVar3);
                    if (h15 != null) {
                        u.b(hVar6, h15, -this.f124019b.R[3].e());
                        u.b(hVar7, hVar6, -iVar.f123996g);
                    }
                    u4.h hVar13 = this.f124019b;
                    if (hVar13.E) {
                        u.b(hVar9, hVar7, hVar13.f120201c0);
                        return;
                    }
                    return;
                }
                u4.e eVar4 = eVarArr[4];
                if (eVar4.f120189f != null) {
                    h h16 = u.h(eVar4);
                    if (h16 != null) {
                        u.b(hVar9, h16, 0);
                        u.b(hVar7, hVar9, -this.f124019b.f120201c0);
                        u.b(hVar6, hVar7, iVar.f123996g);
                        return;
                    }
                    return;
                }
                if ((hVar10 instanceof u4.n) || hVar10.V == null || hVar10.l(u4.d.CENTER).f120189f != null) {
                    return;
                }
                u4.h hVar14 = this.f124019b;
                u.b(hVar7, hVar14.V.f120204e.f124025h, hVar14.A());
                u.b(hVar6, hVar7, iVar.f123996g);
                u4.h hVar15 = this.f124019b;
                if (hVar15.E) {
                    u.b(hVar9, hVar7, hVar15.f120201c0);
                    return;
                }
                return;
            }
        }
        if (z15 || this.f124021d != u4.g.MATCH_CONSTRAINT) {
            iVar.b(this);
        } else {
            u4.h hVar16 = this.f124019b;
            int i13 = hVar16.f120232s;
            if (i13 == 2) {
                u4.h hVar17 = hVar16.V;
                if (hVar17 != null) {
                    i iVar2 = hVar17.f120204e.f124022e;
                    iVar.f124001l.add(iVar2);
                    iVar2.f124000k.add(iVar);
                    iVar.f123991b = true;
                    iVar.f124000k.add(hVar7);
                    iVar.f124000k.add(hVar6);
                }
            } else if (i13 == 3 && !hVar16.H()) {
                u4.h hVar18 = this.f124019b;
                if (hVar18.f120230r != 3) {
                    i iVar3 = hVar18.f120202d.f124022e;
                    iVar.f124001l.add(iVar3);
                    iVar3.f124000k.add(iVar);
                    iVar.f123991b = true;
                    iVar.f124000k.add(hVar7);
                    iVar.f124000k.add(hVar6);
                }
            }
        }
        u4.h hVar19 = this.f124019b;
        u4.e[] eVarArr2 = hVar19.R;
        u4.e eVar5 = eVarArr2[2];
        u4.e eVar6 = eVar5.f120189f;
        if (eVar6 != null && eVarArr2[3].f120189f != null) {
            if (hVar19.H()) {
                hVar7.f123995f = this.f124019b.R[2].e();
                hVar6.f123995f = -this.f124019b.R[3].e();
            } else {
                h h17 = u.h(this.f124019b.R[2]);
                h h18 = u.h(this.f124019b.R[3]);
                if (h17 != null) {
                    h17.b(this);
                }
                if (h18 != null) {
                    h18.b(this);
                }
                this.f124027j = t.CENTER;
            }
            if (this.f124019b.E) {
                c(hVar9, hVar7, 1, this.f124010l);
            }
        } else if (eVar6 != null) {
            h h19 = u.h(eVar5);
            if (h19 != null) {
                u.b(hVar7, h19, this.f124019b.R[2].e());
                c(hVar6, hVar7, 1, iVar);
                if (this.f124019b.E) {
                    c(hVar9, hVar7, 1, this.f124010l);
                }
                u4.g gVar2 = this.f124021d;
                u4.g gVar3 = u4.g.MATCH_CONSTRAINT;
                if (gVar2 == gVar3) {
                    u4.h hVar20 = this.f124019b;
                    if (hVar20.Y > 0.0f) {
                        n nVar = hVar20.f120202d;
                        if (nVar.f124021d == gVar3) {
                            nVar.f124022e.f124000k.add(iVar);
                            iVar.f124001l.add(this.f124019b.f120202d.f124022e);
                            iVar.f123990a = this;
                        }
                    }
                }
            }
        } else {
            u4.e eVar7 = eVarArr2[3];
            if (eVar7.f120189f != null) {
                h h23 = u.h(eVar7);
                if (h23 != null) {
                    u.b(hVar6, h23, -this.f124019b.R[3].e());
                    c(hVar7, hVar6, -1, iVar);
                    if (this.f124019b.E) {
                        c(hVar9, hVar7, 1, this.f124010l);
                    }
                }
            } else {
                u4.e eVar8 = eVarArr2[4];
                if (eVar8.f120189f != null) {
                    h h24 = u.h(eVar8);
                    if (h24 != null) {
                        u.b(hVar9, h24, 0);
                        c(hVar7, hVar9, -1, this.f124010l);
                        c(hVar6, hVar7, 1, iVar);
                    }
                } else if (!(hVar19 instanceof u4.n) && (hVar3 = hVar19.V) != null) {
                    u.b(hVar7, hVar3.f120204e.f124025h, hVar19.A());
                    c(hVar6, hVar7, 1, iVar);
                    if (this.f124019b.E) {
                        c(hVar9, hVar7, 1, this.f124010l);
                    }
                    u4.g gVar4 = this.f124021d;
                    u4.g gVar5 = u4.g.MATCH_CONSTRAINT;
                    if (gVar4 == gVar5) {
                        u4.h hVar21 = this.f124019b;
                        if (hVar21.Y > 0.0f) {
                            n nVar2 = hVar21.f120202d;
                            if (nVar2.f124021d == gVar5) {
                                nVar2.f124022e.f124000k.add(iVar);
                                iVar.f124001l.add(this.f124019b.f120202d.f124022e);
                                iVar.f123990a = this;
                            }
                        }
                    }
                }
            }
        }
        if (iVar.f124001l.size() == 0) {
            iVar.f123992c = true;
        }
    }

    @Override // v4.u
    public final void e() {
        h hVar = this.f124025h;
        if (hVar.f123999j) {
            this.f124019b.f120199b0 = hVar.f123996g;
        }
    }

    @Override // v4.u
    public final void f() {
        this.f124020c = null;
        this.f124025h.c();
        this.f124026i.c();
        this.f124009k.c();
        this.f124022e.c();
        this.f124024g = false;
    }

    @Override // v4.u
    public final boolean k() {
        return this.f124021d != u4.g.MATCH_CONSTRAINT || this.f124019b.f120232s == 0;
    }

    public final void m() {
        this.f124024g = false;
        h hVar = this.f124025h;
        hVar.c();
        hVar.f123999j = false;
        h hVar2 = this.f124026i;
        hVar2.c();
        hVar2.f123999j = false;
        h hVar3 = this.f124009k;
        hVar3.c();
        hVar3.f123999j = false;
        this.f124022e.f123999j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f124019b.f120217k0;
    }
}
