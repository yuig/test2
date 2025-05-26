package hq2;

import kh2.n3;
import kq2.h0;
import kq2.i0;

/* loaded from: classes4.dex */
public final class j extends i {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f69959h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(f fVar, int i13) {
        this(fVar, null, null, false, 0);
        this.f69959h = i13;
        switch (i13) {
            case 1:
                this(fVar, null, null, false, 1);
                break;
            case 2:
                this(fVar, null, null, false, 2);
                break;
            case 3:
                this(fVar, null, null, false, 3);
                break;
            case 4:
                this(fVar, null, null, false, 4);
                break;
            case 5:
                this(fVar, null, null, false, 5);
                break;
            case 6:
                this(fVar, null, null, false, 6);
                break;
            case 7:
                this(fVar, null, null, false, 7);
                break;
            case 8:
                this(fVar, null, null, false, 8);
                break;
            case 9:
                this(fVar, null, null, false, 9);
                break;
            case 10:
                this(fVar, null, null, false, 10);
                break;
            case 11:
                this(fVar, null, null, false, 11);
                break;
            case 12:
                this(fVar, null, null, false, 12);
                break;
            case 13:
                this(fVar, null, null, false, 13);
                break;
            case 14:
                this(fVar, null, null, false, 14);
                break;
            case 15:
                this(fVar, null, null, false, 15);
                break;
            case 16:
                this(fVar, null, null, false, 16);
                break;
            case 17:
                this(fVar, null, null, false, 17);
                break;
            case 18:
                this(fVar, null, null, false, 18);
                break;
            default:
                break;
        }
    }

    private l n(l lVar) {
        o6.d dVar;
        o6.d dVar2;
        o6.d dVar3;
        o6.d n13;
        o6.d dVar4;
        o6.d dVar5;
        if (f()) {
            return lVar;
        }
        if (lVar.f()) {
            return this;
        }
        f fVar = this.f69962a;
        int i13 = fVar.f69949f;
        o6.d dVar6 = this.f69964c;
        o6.d dVar7 = lVar.f69964c;
        o6.d dVar8 = this.f69963b;
        o6.d dVar9 = lVar.f69963b;
        if (i13 == 0) {
            o6.d a13 = dVar8.a(dVar9);
            o6.d a14 = dVar6.a(dVar7);
            if (a13.m()) {
                return a14.m() ? m() : fVar.j();
            }
            o6.d d2 = a14.d(a13);
            o6.d a15 = d7.g.p(d2, d2, a13).a(fVar.f69945b);
            return new j(fVar, a15, d2.n(dVar8.a(a15)).a(a15).a(dVar6), this.f69966e, 0);
        }
        o6.d[] dVarArr = this.f69965d;
        o6.d[] dVarArr2 = lVar.f69965d;
        if (i13 == 1) {
            o6.d dVar10 = dVarArr[0];
            o6.d dVar11 = dVarArr2[0];
            boolean l13 = dVar11.l();
            o6.d a16 = dVar10.n(dVar7).a(l13 ? dVar6 : dVar6.n(dVar11));
            o6.d a17 = dVar10.n(dVar9).a(l13 ? dVar8 : dVar8.n(dVar11));
            if (a17.m()) {
                return a16.m() ? m() : fVar.j();
            }
            o6.d s13 = a17.s();
            o6.d n14 = s13.n(a17);
            if (!l13) {
                dVar10 = dVar10.n(dVar11);
            }
            o6.d a18 = a16.a(a17);
            o6.d a19 = a18.p(a16, s13, fVar.f69945b).n(dVar10).a(n14);
            o6.d n15 = a17.n(a19);
            if (!l13) {
                s13 = s13.n(dVar11);
            }
            return new j(fVar, n15, a16.p(dVar8, a17, dVar6).p(s13, a18, a19), new o6.d[]{n14.n(dVar10)}, this.f69966e, 0);
        }
        if (i13 != 6) {
            throw new IllegalStateException("unsupported coordinate system");
        }
        if (dVar8.m()) {
            return dVar9.m() ? fVar.j() : lVar.a(this);
        }
        o6.d dVar12 = dVarArr[0];
        o6.d dVar13 = dVarArr2[0];
        boolean l14 = dVar12.l();
        if (l14) {
            dVar = dVar7;
            dVar2 = dVar9;
        } else {
            dVar2 = dVar9.n(dVar12);
            dVar = dVar7.n(dVar12);
        }
        boolean l15 = dVar13.l();
        if (l15) {
            dVar3 = dVar6;
        } else {
            dVar8 = dVar8.n(dVar13);
            dVar3 = dVar6.n(dVar13);
        }
        o6.d a23 = dVar3.a(dVar);
        o6.d a24 = dVar8.a(dVar2);
        if (a24.m()) {
            return a23.m() ? m() : fVar.j();
        }
        if (dVar9.m()) {
            l j13 = j();
            o6.d dVar14 = j13.f69963b;
            o6.d d13 = j13.d();
            o6.d d14 = d13.a(dVar7).d(dVar14);
            dVar4 = d7.g.p(d14, d14, dVar14).a(fVar.f69945b);
            if (dVar4.m()) {
                return new j(fVar, dVar4, fVar.f69946c.r(), this.f69966e, 0);
            }
            o6.d a25 = d14.n(dVar14.a(dVar4)).a(dVar4).a(d13).d(dVar4).a(dVar4);
            n13 = fVar.h(a.f69934b);
            dVar5 = a25;
        } else {
            o6.d s14 = a24.s();
            o6.d n16 = a23.n(dVar8);
            o6.d n17 = a23.n(dVar2);
            o6.d n18 = n16.n(n17);
            if (n18.m()) {
                return new j(fVar, n18, fVar.f69946c.r(), this.f69966e, 0);
            }
            o6.d n19 = a23.n(s14);
            n13 = !l15 ? n19.n(dVar13) : n19;
            o6.d t13 = n17.a(s14).t(n13, dVar6.a(dVar12));
            if (!l14) {
                n13 = n13.n(dVar12);
            }
            dVar4 = n18;
            dVar5 = t13;
        }
        return new j(fVar, dVar4, dVar5, new o6.d[]{n13}, this.f69966e, 0);
    }

    private l o(l lVar) {
        o6.d dVar;
        o6.d dVar2;
        o6.d dVar3;
        o6.d dVar4;
        o6.d dVar5;
        o6.d dVar6;
        if (f()) {
            return lVar;
        }
        if (lVar.f()) {
            return this;
        }
        o6.d dVar7 = this.f69963b;
        boolean m13 = dVar7.m();
        f fVar = this.f69962a;
        o6.d dVar8 = lVar.f69963b;
        if (m13) {
            return dVar8.m() ? fVar.j() : lVar.a(this);
        }
        o6.d dVar9 = this.f69965d[0];
        o6.d e13 = lVar.e();
        boolean l13 = dVar9.l();
        o6.d dVar10 = lVar.f69964c;
        if (l13) {
            dVar = dVar10;
            dVar2 = dVar8;
        } else {
            dVar2 = dVar8.n(dVar9);
            dVar = dVar10.n(dVar9);
        }
        boolean l14 = e13.l();
        o6.d dVar11 = this.f69964c;
        if (l14) {
            dVar3 = dVar11;
        } else {
            dVar7 = dVar7.n(e13);
            dVar3 = dVar11.n(e13);
        }
        o6.d a13 = dVar3.a(dVar);
        o6.d a14 = dVar7.a(dVar2);
        if (a14.m()) {
            return a13.m() ? m() : fVar.j();
        }
        if (dVar8.m()) {
            l j13 = j();
            o6.d dVar12 = j13.f69963b;
            o6.d d2 = j13.d();
            o6.d d13 = d2.a(dVar10).d(dVar12);
            dVar5 = d7.g.p(d13, d13, dVar12).a(fVar.f69945b);
            if (dVar5.m()) {
                return new j(fVar, dVar5, fVar.f69946c.r(), this.f69966e, 1);
            }
            o6.d a15 = d13.n(dVar12.a(dVar5)).a(dVar5).a(d2).d(dVar5).a(dVar5);
            dVar6 = fVar.h(a.f69934b);
            dVar4 = a15;
        } else {
            o6.d s13 = a14.s();
            o6.d n13 = a13.n(dVar7);
            o6.d n14 = a13.n(dVar2);
            o6.d n15 = n13.n(n14);
            if (n15.m()) {
                return new j(fVar, n15, fVar.f69946c.r(), this.f69966e, 1);
            }
            o6.d n16 = a13.n(s13);
            o6.d n17 = !l14 ? n16.n(e13) : n16;
            o6.d t13 = n14.a(s13).t(n17, dVar11.a(dVar9));
            if (l13) {
                dVar4 = t13;
                o6.d dVar13 = n17;
                dVar5 = n15;
                dVar6 = dVar13;
            } else {
                o6.d n18 = n17.n(dVar9);
                dVar4 = t13;
                dVar5 = n15;
                dVar6 = n18;
            }
        }
        return new j(fVar, dVar5, dVar4, new o6.d[]{dVar6}, this.f69966e, 1);
    }

    private l p(l lVar) {
        o6.d dVar;
        o6.d dVar2;
        o6.d dVar3;
        o6.d dVar4;
        o6.d dVar5;
        o6.d dVar6;
        if (f()) {
            return lVar;
        }
        if (lVar.f()) {
            return this;
        }
        o6.d dVar7 = this.f69963b;
        boolean m13 = dVar7.m();
        f fVar = this.f69962a;
        o6.d dVar8 = lVar.f69963b;
        if (m13) {
            return dVar8.m() ? fVar.j() : lVar.a(this);
        }
        o6.d dVar9 = this.f69965d[0];
        o6.d e13 = lVar.e();
        boolean l13 = dVar9.l();
        o6.d dVar10 = lVar.f69964c;
        if (l13) {
            dVar = dVar10;
            dVar2 = dVar8;
        } else {
            dVar2 = dVar8.n(dVar9);
            dVar = dVar10.n(dVar9);
        }
        boolean l14 = e13.l();
        o6.d dVar11 = this.f69964c;
        if (l14) {
            dVar3 = dVar11;
        } else {
            dVar7 = dVar7.n(e13);
            dVar3 = dVar11.n(e13);
        }
        o6.d a13 = dVar3.a(dVar);
        o6.d a14 = dVar7.a(dVar2);
        if (a14.m()) {
            return a13.m() ? m() : fVar.j();
        }
        if (dVar8.m()) {
            l j13 = j();
            o6.d dVar12 = j13.f69963b;
            o6.d d2 = j13.d();
            o6.d d13 = d2.a(dVar10).d(dVar12);
            dVar5 = d7.g.p(d13, d13, dVar12).a(fVar.f69945b);
            if (dVar5.m()) {
                return new j(fVar, dVar5, fVar.f69946c.r(), this.f69966e, 2);
            }
            o6.d a15 = d13.n(dVar12.a(dVar5)).a(dVar5).a(d2).d(dVar5).a(dVar5);
            dVar6 = fVar.h(a.f69934b);
            dVar4 = a15;
        } else {
            o6.d s13 = a14.s();
            o6.d n13 = a13.n(dVar7);
            o6.d n14 = a13.n(dVar2);
            o6.d n15 = n13.n(n14);
            if (n15.m()) {
                return new j(fVar, n15, fVar.f69946c.r(), this.f69966e, 2);
            }
            o6.d n16 = a13.n(s13);
            o6.d n17 = !l14 ? n16.n(e13) : n16;
            o6.d t13 = n14.a(s13).t(n17, dVar11.a(dVar9));
            if (l13) {
                dVar4 = t13;
                o6.d dVar13 = n17;
                dVar5 = n15;
                dVar6 = dVar13;
            } else {
                o6.d n18 = n17.n(dVar9);
                dVar4 = t13;
                dVar5 = n15;
                dVar6 = n18;
            }
        }
        return new j(fVar, dVar5, dVar4, new o6.d[]{dVar6}, this.f69966e, 2);
    }

    private l q(l lVar) {
        o6.d dVar;
        o6.d dVar2;
        o6.d dVar3;
        o6.d dVar4;
        o6.d dVar5;
        o6.d dVar6;
        if (f()) {
            return lVar;
        }
        if (lVar.f()) {
            return this;
        }
        o6.d dVar7 = this.f69963b;
        boolean m13 = dVar7.m();
        f fVar = this.f69962a;
        o6.d dVar8 = lVar.f69963b;
        if (m13) {
            return dVar8.m() ? fVar.j() : lVar.a(this);
        }
        o6.d dVar9 = this.f69965d[0];
        o6.d e13 = lVar.e();
        boolean l13 = dVar9.l();
        o6.d dVar10 = lVar.f69964c;
        if (l13) {
            dVar = dVar10;
            dVar2 = dVar8;
        } else {
            dVar2 = dVar8.n(dVar9);
            dVar = dVar10.n(dVar9);
        }
        boolean l14 = e13.l();
        o6.d dVar11 = this.f69964c;
        if (l14) {
            dVar3 = dVar11;
        } else {
            dVar7 = dVar7.n(e13);
            dVar3 = dVar11.n(e13);
        }
        o6.d a13 = dVar3.a(dVar);
        o6.d a14 = dVar7.a(dVar2);
        if (a14.m()) {
            return a13.m() ? m() : fVar.j();
        }
        if (dVar8.m()) {
            l j13 = j();
            o6.d dVar12 = j13.f69963b;
            o6.d d2 = j13.d();
            o6.d d13 = d2.a(dVar10).d(dVar12);
            dVar5 = d7.g.p(d13, d13, dVar12).a(fVar.f69945b);
            if (dVar5.m()) {
                return new j(fVar, dVar5, fVar.f69946c.r(), this.f69966e, 3);
            }
            o6.d a15 = d13.n(dVar12.a(dVar5)).a(dVar5).a(d2).d(dVar5).a(dVar5);
            dVar6 = fVar.h(a.f69934b);
            dVar4 = a15;
        } else {
            o6.d s13 = a14.s();
            o6.d n13 = a13.n(dVar7);
            o6.d n14 = a13.n(dVar2);
            o6.d n15 = n13.n(n14);
            if (n15.m()) {
                return new j(fVar, n15, fVar.f69946c.r(), this.f69966e, 3);
            }
            o6.d n16 = a13.n(s13);
            o6.d n17 = !l14 ? n16.n(e13) : n16;
            o6.d t13 = n14.a(s13).t(n17, dVar11.a(dVar9));
            if (l13) {
                dVar4 = t13;
                o6.d dVar13 = n17;
                dVar5 = n15;
                dVar6 = dVar13;
            } else {
                o6.d n18 = n17.n(dVar9);
                dVar4 = t13;
                dVar5 = n15;
                dVar6 = n18;
            }
        }
        return new j(fVar, dVar5, dVar4, new o6.d[]{dVar6}, this.f69966e, 3);
    }

    private l r(l lVar) {
        o6.d dVar;
        o6.d dVar2;
        o6.d dVar3;
        o6.d dVar4;
        o6.d dVar5;
        o6.d dVar6;
        if (f()) {
            return lVar;
        }
        if (lVar.f()) {
            return this;
        }
        o6.d dVar7 = this.f69963b;
        boolean m13 = dVar7.m();
        f fVar = this.f69962a;
        o6.d dVar8 = lVar.f69963b;
        if (m13) {
            return dVar8.m() ? fVar.j() : lVar.a(this);
        }
        o6.d dVar9 = this.f69965d[0];
        o6.d e13 = lVar.e();
        boolean l13 = dVar9.l();
        o6.d dVar10 = lVar.f69964c;
        if (l13) {
            dVar = dVar10;
            dVar2 = dVar8;
        } else {
            dVar2 = dVar8.n(dVar9);
            dVar = dVar10.n(dVar9);
        }
        boolean l14 = e13.l();
        o6.d dVar11 = this.f69964c;
        if (l14) {
            dVar3 = dVar11;
        } else {
            dVar7 = dVar7.n(e13);
            dVar3 = dVar11.n(e13);
        }
        o6.d a13 = dVar3.a(dVar);
        o6.d a14 = dVar7.a(dVar2);
        if (a14.m()) {
            return a13.m() ? m() : fVar.j();
        }
        if (dVar8.m()) {
            l j13 = j();
            o6.d dVar12 = j13.f69963b;
            o6.d d2 = j13.d();
            o6.d d13 = d2.a(dVar10).d(dVar12);
            dVar5 = d7.g.p(d13, d13, dVar12).a(fVar.f69945b);
            if (dVar5.m()) {
                return new j(fVar, dVar5, fVar.f69946c.r(), this.f69966e, 4);
            }
            o6.d a15 = d13.n(dVar12.a(dVar5)).a(dVar5).a(d2).d(dVar5).a(dVar5);
            dVar6 = fVar.h(a.f69934b);
            dVar4 = a15;
        } else {
            o6.d s13 = a14.s();
            o6.d n13 = a13.n(dVar7);
            o6.d n14 = a13.n(dVar2);
            o6.d n15 = n13.n(n14);
            if (n15.m()) {
                return new j(fVar, n15, fVar.f69946c.r(), this.f69966e, 4);
            }
            o6.d n16 = a13.n(s13);
            o6.d n17 = !l14 ? n16.n(e13) : n16;
            o6.d t13 = n14.a(s13).t(n17, dVar11.a(dVar9));
            if (l13) {
                dVar4 = t13;
                o6.d dVar13 = n17;
                dVar5 = n15;
                dVar6 = dVar13;
            } else {
                o6.d n18 = n17.n(dVar9);
                dVar4 = t13;
                dVar5 = n15;
                dVar6 = n18;
            }
        }
        return new j(fVar, dVar5, dVar4, new o6.d[]{dVar6}, this.f69966e, 4);
    }

    @Override // hq2.l
    public final l a(l lVar) {
        o6.d dVar;
        o6.d dVar2;
        o6.d dVar3;
        o6.d dVar4;
        o6.d dVar5;
        o6.d dVar6;
        o6.d dVar7;
        o6.d dVar8;
        o6.d dVar9;
        o6.d dVar10;
        o6.d dVar11;
        o6.d dVar12;
        o6.d dVar13;
        o6.d dVar14;
        o6.d dVar15;
        o6.d dVar16;
        o6.d dVar17;
        o6.d dVar18;
        o6.d dVar19;
        o6.d dVar20;
        o6.d dVar21;
        o6.d dVar22;
        o6.d dVar23;
        o6.d dVar24;
        o6.d dVar25;
        o6.d dVar26;
        o6.d dVar27;
        o6.d dVar28;
        o6.d dVar29;
        o6.d dVar30;
        o6.d dVar31;
        o6.d dVar32;
        o6.d dVar33;
        o6.d dVar34;
        o6.d dVar35;
        o6.d dVar36;
        o6.d dVar37;
        o6.d dVar38;
        o6.d dVar39;
        o6.d dVar40;
        o6.d dVar41;
        o6.d dVar42;
        o6.d dVar43;
        o6.d dVar44;
        o6.d dVar45;
        o6.d dVar46;
        o6.d dVar47;
        o6.d dVar48;
        o6.d dVar49;
        o6.d dVar50;
        o6.d dVar51;
        o6.d dVar52;
        o6.d dVar53;
        o6.d dVar54;
        o6.d dVar55;
        o6.d dVar56;
        o6.d dVar57;
        o6.d dVar58;
        o6.d dVar59;
        o6.d dVar60;
        o6.d dVar61;
        o6.d dVar62;
        o6.d dVar63;
        o6.d dVar64;
        o6.d dVar65;
        o6.d dVar66;
        o6.d dVar67;
        o6.d dVar68;
        o6.d dVar69;
        o6.d dVar70;
        o6.d dVar71;
        o6.d dVar72;
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        long[] jArr4;
        long[] jArr5;
        long[] jArr6;
        h0 h0Var4;
        h0 h0Var5;
        h0 h0Var6;
        o6.d[] dVarArr = this.f69965d;
        o6.d dVar73 = this.f69964c;
        o6.d dVar74 = this.f69963b;
        switch (this.f69959h) {
            case 0:
                return n(lVar);
            case 1:
                return o(lVar);
            case 2:
                return p(lVar);
            case 3:
                return q(lVar);
            case 4:
                return r(lVar);
            case 5:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                boolean m13 = dVar74.m();
                f fVar = this.f69962a;
                o6.d dVar75 = lVar.f69963b;
                if (m13) {
                    return dVar75.m() ? fVar.j() : lVar.a(this);
                }
                o6.d dVar76 = dVarArr[0];
                o6.d e13 = lVar.e();
                boolean l13 = dVar76.l();
                o6.d dVar77 = lVar.f69964c;
                if (l13) {
                    dVar = dVar77;
                    dVar2 = dVar75;
                } else {
                    dVar2 = dVar75.n(dVar76);
                    dVar = dVar77.n(dVar76);
                }
                boolean l14 = e13.l();
                if (l14) {
                    dVar3 = dVar73;
                } else {
                    dVar74 = dVar74.n(e13);
                    dVar3 = dVar73.n(e13);
                }
                o6.d a13 = dVar3.a(dVar);
                o6.d a14 = dVar74.a(dVar2);
                if (a14.m()) {
                    return a13.m() ? m() : fVar.j();
                }
                if (dVar75.m()) {
                    l j13 = j();
                    o6.d dVar78 = j13.f69963b;
                    o6.d d2 = j13.d();
                    o6.d d13 = d2.a(dVar77).d(dVar78);
                    dVar6 = d13.s().a(d13).a(dVar78).b();
                    if (dVar6.m()) {
                        return new j(fVar, dVar6, fVar.f69946c, this.f69966e, 5);
                    }
                    o6.d a15 = d13.n(dVar78.a(dVar6)).a(dVar6).a(d2).d(dVar6).a(dVar6);
                    dVar5 = fVar.h(a.f69934b);
                    dVar4 = a15;
                } else {
                    o6.d s13 = a14.s();
                    o6.d n13 = a13.n(dVar74);
                    o6.d n14 = a13.n(dVar2);
                    o6.d n15 = n13.n(n14);
                    if (n15.m()) {
                        return new j(fVar, n15, fVar.f69946c, this.f69966e, 5);
                    }
                    o6.d n16 = a13.n(s13);
                    o6.d n17 = !l14 ? n16.n(e13) : n16;
                    o6.d t13 = n14.a(s13).t(n17, dVar73.a(dVar76));
                    if (l13) {
                        dVar4 = t13;
                        dVar5 = n17;
                    } else {
                        dVar5 = n17.n(dVar76);
                        dVar4 = t13;
                    }
                    dVar6 = n15;
                }
                return new j(fVar, dVar6, dVar4, new o6.d[]{dVar5}, this.f69966e, 5);
            case 6:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                boolean m14 = dVar74.m();
                f fVar2 = this.f69962a;
                o6.d dVar79 = lVar.f69963b;
                if (m14) {
                    return dVar79.m() ? fVar2.j() : lVar.a(this);
                }
                o6.d dVar80 = dVarArr[0];
                o6.d e14 = lVar.e();
                boolean l15 = dVar80.l();
                o6.d dVar81 = lVar.f69964c;
                if (l15) {
                    dVar7 = dVar81;
                    dVar8 = dVar79;
                } else {
                    dVar8 = dVar79.n(dVar80);
                    dVar7 = dVar81.n(dVar80);
                }
                boolean l16 = e14.l();
                if (l16) {
                    dVar9 = dVar73;
                } else {
                    dVar74 = dVar74.n(e14);
                    dVar9 = dVar73.n(e14);
                }
                o6.d a16 = dVar9.a(dVar7);
                o6.d a17 = dVar74.a(dVar8);
                if (a17.m()) {
                    return a16.m() ? m() : fVar2.j();
                }
                if (dVar79.m()) {
                    l j14 = j();
                    o6.d dVar82 = j14.f69963b;
                    o6.d d14 = j14.d();
                    o6.d d15 = d14.a(dVar81).d(dVar82);
                    dVar12 = d7.g.p(d15, d15, dVar82).a(fVar2.f69945b);
                    if (dVar12.m()) {
                        return new j(fVar2, dVar12, fVar2.f69946c.r(), this.f69966e, 6);
                    }
                    o6.d a18 = d15.n(dVar82.a(dVar12)).a(dVar12).a(d14).d(dVar12).a(dVar12);
                    dVar11 = fVar2.h(a.f69934b);
                    dVar10 = a18;
                } else {
                    o6.d s14 = a17.s();
                    o6.d n18 = a16.n(dVar74);
                    o6.d n19 = a16.n(dVar8);
                    o6.d n23 = n18.n(n19);
                    if (n23.m()) {
                        return new j(fVar2, n23, fVar2.f69946c.r(), this.f69966e, 6);
                    }
                    o6.d n24 = a16.n(s14);
                    o6.d n25 = !l16 ? n24.n(e14) : n24;
                    o6.d t14 = n19.a(s14).t(n25, dVar73.a(dVar80));
                    if (l15) {
                        dVar10 = t14;
                        dVar11 = n25;
                    } else {
                        dVar11 = n25.n(dVar80);
                        dVar10 = t14;
                    }
                    dVar12 = n23;
                }
                return new j(fVar2, dVar12, dVar10, new o6.d[]{dVar11}, this.f69966e, 6);
            case 7:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                boolean m15 = dVar74.m();
                f fVar3 = this.f69962a;
                o6.d dVar83 = lVar.f69963b;
                if (m15) {
                    return dVar83.m() ? fVar3.j() : lVar.a(this);
                }
                o6.d dVar84 = dVarArr[0];
                o6.d e15 = lVar.e();
                boolean l17 = dVar84.l();
                o6.d dVar85 = lVar.f69964c;
                if (l17) {
                    dVar13 = dVar85;
                    dVar14 = dVar83;
                } else {
                    dVar14 = dVar83.n(dVar84);
                    dVar13 = dVar85.n(dVar84);
                }
                boolean l18 = e15.l();
                if (l18) {
                    dVar15 = dVar73;
                } else {
                    dVar74 = dVar74.n(e15);
                    dVar15 = dVar73.n(e15);
                }
                o6.d a19 = dVar15.a(dVar13);
                o6.d a23 = dVar74.a(dVar14);
                if (a23.m()) {
                    return a19.m() ? m() : fVar3.j();
                }
                if (dVar83.m()) {
                    l j15 = j();
                    o6.d dVar86 = j15.f69963b;
                    o6.d d16 = j15.d();
                    o6.d d17 = d16.a(dVar85).d(dVar86);
                    dVar18 = d17.s().a(d17).a(dVar86).b();
                    if (dVar18.m()) {
                        return new j(fVar3, dVar18, fVar3.f69946c.r(), this.f69966e, 7);
                    }
                    o6.d a24 = d17.n(dVar86.a(dVar18)).a(dVar18).a(d16).d(dVar18).a(dVar18);
                    dVar17 = fVar3.h(a.f69934b);
                    dVar16 = a24;
                } else {
                    o6.d s15 = a23.s();
                    o6.d n26 = a19.n(dVar74);
                    o6.d n27 = a19.n(dVar14);
                    o6.d n28 = n26.n(n27);
                    if (n28.m()) {
                        return new j(fVar3, n28, fVar3.f69946c.r(), this.f69966e, 7);
                    }
                    o6.d n29 = a19.n(s15);
                    o6.d n33 = !l18 ? n29.n(e15) : n29;
                    o6.d t15 = n27.a(s15).t(n33, dVar73.a(dVar84));
                    if (l17) {
                        dVar16 = t15;
                        dVar17 = n33;
                    } else {
                        dVar17 = n33.n(dVar84);
                        dVar16 = t15;
                    }
                    dVar18 = n28;
                }
                return new j(fVar3, dVar18, dVar16, new o6.d[]{dVar17}, this.f69966e, 7);
            case 8:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                boolean m16 = dVar74.m();
                f fVar4 = this.f69962a;
                o6.d dVar87 = lVar.f69963b;
                if (m16) {
                    return dVar87.m() ? fVar4.j() : lVar.a(this);
                }
                o6.d dVar88 = dVarArr[0];
                o6.d e16 = lVar.e();
                boolean l19 = dVar88.l();
                o6.d dVar89 = lVar.f69964c;
                if (l19) {
                    dVar19 = dVar89;
                    dVar20 = dVar87;
                } else {
                    dVar20 = dVar87.n(dVar88);
                    dVar19 = dVar89.n(dVar88);
                }
                boolean l23 = e16.l();
                if (l23) {
                    dVar21 = dVar73;
                } else {
                    dVar74 = dVar74.n(e16);
                    dVar21 = dVar73.n(e16);
                }
                o6.d a25 = dVar21.a(dVar19);
                o6.d a26 = dVar74.a(dVar20);
                if (a26.m()) {
                    return a25.m() ? m() : fVar4.j();
                }
                if (dVar87.m()) {
                    l j16 = j();
                    o6.d dVar90 = j16.f69963b;
                    o6.d d18 = j16.d();
                    o6.d d19 = d18.a(dVar89).d(dVar90);
                    dVar24 = d7.g.p(d19, d19, dVar90).a(fVar4.f69945b);
                    if (dVar24.m()) {
                        return new j(fVar4, dVar24, fVar4.f69946c.r(), this.f69966e, 8);
                    }
                    o6.d a27 = d19.n(dVar90.a(dVar24)).a(dVar24).a(d18).d(dVar24).a(dVar24);
                    dVar23 = fVar4.h(a.f69934b);
                    dVar22 = a27;
                } else {
                    o6.d s16 = a26.s();
                    o6.d n34 = a25.n(dVar74);
                    o6.d n35 = a25.n(dVar20);
                    o6.d n36 = n34.n(n35);
                    if (n36.m()) {
                        return new j(fVar4, n36, fVar4.f69946c.r(), this.f69966e, 8);
                    }
                    o6.d n37 = a25.n(s16);
                    o6.d n38 = !l23 ? n37.n(e16) : n37;
                    o6.d t16 = n35.a(s16).t(n38, dVar73.a(dVar88));
                    if (l19) {
                        dVar22 = t16;
                        dVar23 = n38;
                    } else {
                        dVar23 = n38.n(dVar88);
                        dVar22 = t16;
                    }
                    dVar24 = n36;
                }
                return new j(fVar4, dVar24, dVar22, new o6.d[]{dVar23}, this.f69966e, 8);
            case 9:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                boolean m17 = dVar74.m();
                f fVar5 = this.f69962a;
                o6.d dVar91 = lVar.f69963b;
                if (m17) {
                    return dVar91.m() ? fVar5.j() : lVar.a(this);
                }
                o6.d dVar92 = dVarArr[0];
                o6.d e17 = lVar.e();
                boolean l24 = dVar92.l();
                o6.d dVar93 = lVar.f69964c;
                if (l24) {
                    dVar25 = dVar93;
                    dVar26 = dVar91;
                } else {
                    dVar26 = dVar91.n(dVar92);
                    dVar25 = dVar93.n(dVar92);
                }
                boolean l25 = e17.l();
                if (l25) {
                    dVar27 = dVar73;
                } else {
                    dVar74 = dVar74.n(e17);
                    dVar27 = dVar73.n(e17);
                }
                o6.d a28 = dVar27.a(dVar25);
                o6.d a29 = dVar74.a(dVar26);
                if (a29.m()) {
                    return a28.m() ? m() : fVar5.j();
                }
                if (dVar91.m()) {
                    l j17 = j();
                    o6.d dVar94 = j17.f69963b;
                    o6.d d23 = j17.d();
                    o6.d d24 = d23.a(dVar93).d(dVar94);
                    dVar30 = d7.g.p(d24, d24, dVar94).a(fVar5.f69945b);
                    if (dVar30.m()) {
                        return new j(fVar5, dVar30, fVar5.f69946c.r(), this.f69966e, 9);
                    }
                    o6.d a33 = d24.n(dVar94.a(dVar30)).a(dVar30).a(d23).d(dVar30).a(dVar30);
                    dVar29 = fVar5.h(a.f69934b);
                    dVar28 = a33;
                } else {
                    o6.d s17 = a29.s();
                    o6.d n39 = a28.n(dVar74);
                    o6.d n43 = a28.n(dVar26);
                    o6.d n44 = n39.n(n43);
                    if (n44.m()) {
                        return new j(fVar5, n44, fVar5.f69946c.r(), this.f69966e, 9);
                    }
                    o6.d n45 = a28.n(s17);
                    o6.d n46 = !l25 ? n45.n(e17) : n45;
                    o6.d t17 = n43.a(s17).t(n46, dVar73.a(dVar92));
                    if (l24) {
                        dVar28 = t17;
                        dVar29 = n46;
                    } else {
                        dVar29 = n46.n(dVar92);
                        dVar28 = t17;
                    }
                    dVar30 = n44;
                }
                return new j(fVar5, dVar30, dVar28, new o6.d[]{dVar29}, this.f69966e, 9);
            case 10:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                boolean m18 = dVar74.m();
                f fVar6 = this.f69962a;
                o6.d dVar95 = lVar.f69963b;
                if (m18) {
                    return dVar95.m() ? fVar6.j() : lVar.a(this);
                }
                o6.d dVar96 = dVarArr[0];
                o6.d e18 = lVar.e();
                boolean l26 = dVar96.l();
                o6.d dVar97 = lVar.f69964c;
                if (l26) {
                    dVar31 = dVar97;
                    dVar32 = dVar95;
                } else {
                    dVar32 = dVar95.n(dVar96);
                    dVar31 = dVar97.n(dVar96);
                }
                boolean l27 = e18.l();
                if (l27) {
                    dVar33 = dVar73;
                } else {
                    dVar74 = dVar74.n(e18);
                    dVar33 = dVar73.n(e18);
                }
                o6.d a34 = dVar33.a(dVar31);
                o6.d a35 = dVar74.a(dVar32);
                if (a35.m()) {
                    return a34.m() ? m() : fVar6.j();
                }
                if (dVar95.m()) {
                    l j18 = j();
                    o6.d dVar98 = j18.f69963b;
                    o6.d d25 = j18.d();
                    o6.d d26 = d25.a(dVar97).d(dVar98);
                    dVar36 = d7.g.p(d26, d26, dVar98);
                    if (dVar36.m()) {
                        return new j(fVar6, dVar36, fVar6.f69946c, this.f69966e, 10);
                    }
                    o6.d a36 = d26.n(dVar98.a(dVar36)).a(dVar36).a(d25).d(dVar36).a(dVar36);
                    dVar35 = fVar6.h(a.f69934b);
                    dVar34 = a36;
                } else {
                    o6.d s18 = a35.s();
                    o6.d n47 = a34.n(dVar74);
                    o6.d n48 = a34.n(dVar32);
                    o6.d n49 = n47.n(n48);
                    if (n49.m()) {
                        return new j(fVar6, n49, fVar6.f69946c, this.f69966e, 10);
                    }
                    o6.d n53 = a34.n(s18);
                    o6.d n54 = !l27 ? n53.n(e18) : n53;
                    o6.d t18 = n48.a(s18).t(n54, dVar73.a(dVar96));
                    if (l26) {
                        dVar34 = t18;
                        dVar35 = n54;
                    } else {
                        dVar35 = n54.n(dVar96);
                        dVar34 = t18;
                    }
                    dVar36 = n49;
                }
                return new j(fVar6, dVar36, dVar34, new o6.d[]{dVar35}, this.f69966e, 10);
            case 11:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                boolean m19 = dVar74.m();
                f fVar7 = this.f69962a;
                o6.d dVar99 = lVar.f69963b;
                if (m19) {
                    return dVar99.m() ? fVar7.j() : lVar.a(this);
                }
                o6.d dVar100 = dVarArr[0];
                o6.d e19 = lVar.e();
                boolean l28 = dVar100.l();
                o6.d dVar101 = lVar.f69964c;
                if (l28) {
                    dVar37 = dVar101;
                    dVar38 = dVar99;
                } else {
                    dVar38 = dVar99.n(dVar100);
                    dVar37 = dVar101.n(dVar100);
                }
                boolean l29 = e19.l();
                if (l29) {
                    dVar39 = dVar73;
                } else {
                    dVar74 = dVar74.n(e19);
                    dVar39 = dVar73.n(e19);
                }
                o6.d a37 = dVar39.a(dVar37);
                o6.d a38 = dVar74.a(dVar38);
                if (a38.m()) {
                    return a37.m() ? m() : fVar7.j();
                }
                if (dVar99.m()) {
                    l j19 = j();
                    o6.d dVar102 = j19.f69963b;
                    o6.d d27 = j19.d();
                    o6.d d28 = d27.a(dVar101).d(dVar102);
                    dVar42 = d28.s().a(d28).a(dVar102).b();
                    if (dVar42.m()) {
                        return new j(fVar7, dVar42, fVar7.f69946c.r(), this.f69966e, 11);
                    }
                    o6.d a39 = d28.n(dVar102.a(dVar42)).a(dVar42).a(d27).d(dVar42).a(dVar42);
                    dVar41 = fVar7.h(a.f69934b);
                    dVar40 = a39;
                } else {
                    o6.d s19 = a38.s();
                    o6.d n55 = a37.n(dVar74);
                    o6.d n56 = a37.n(dVar38);
                    o6.d n57 = n55.n(n56);
                    if (n57.m()) {
                        return new j(fVar7, n57, fVar7.f69946c.r(), this.f69966e, 11);
                    }
                    o6.d n58 = a37.n(s19);
                    o6.d n59 = !l29 ? n58.n(e19) : n58;
                    o6.d t19 = n56.a(s19).t(n59, dVar73.a(dVar100));
                    if (l28) {
                        dVar40 = t19;
                        dVar41 = n59;
                    } else {
                        dVar41 = n59.n(dVar100);
                        dVar40 = t19;
                    }
                    dVar42 = n57;
                }
                return new j(fVar7, dVar42, dVar40, new o6.d[]{dVar41}, this.f69966e, 11);
            case 12:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                boolean m23 = dVar74.m();
                f fVar8 = this.f69962a;
                o6.d dVar103 = lVar.f69963b;
                if (m23) {
                    return dVar103.m() ? fVar8.j() : lVar.a(this);
                }
                o6.d dVar104 = dVarArr[0];
                o6.d e23 = lVar.e();
                boolean l33 = dVar104.l();
                o6.d dVar105 = lVar.f69964c;
                if (l33) {
                    dVar43 = dVar105;
                    dVar44 = dVar103;
                } else {
                    dVar44 = dVar103.n(dVar104);
                    dVar43 = dVar105.n(dVar104);
                }
                boolean l34 = e23.l();
                if (l34) {
                    dVar45 = dVar73;
                } else {
                    dVar74 = dVar74.n(e23);
                    dVar45 = dVar73.n(e23);
                }
                o6.d a43 = dVar45.a(dVar43);
                o6.d a44 = dVar74.a(dVar44);
                if (a44.m()) {
                    return a43.m() ? m() : fVar8.j();
                }
                if (dVar103.m()) {
                    l j23 = j();
                    o6.d dVar106 = j23.f69963b;
                    o6.d d29 = j23.d();
                    o6.d d33 = d29.a(dVar105).d(dVar106);
                    dVar48 = d7.g.p(d33, d33, dVar106);
                    if (dVar48.m()) {
                        return new j(fVar8, dVar48, fVar8.f69946c, this.f69966e, 12);
                    }
                    o6.d a45 = d33.n(dVar106.a(dVar48)).a(dVar48).a(d29).d(dVar48).a(dVar48);
                    dVar47 = fVar8.h(a.f69934b);
                    dVar46 = a45;
                } else {
                    o6.d s22 = a44.s();
                    o6.d n63 = a43.n(dVar74);
                    o6.d n64 = a43.n(dVar44);
                    o6.d n65 = n63.n(n64);
                    if (n65.m()) {
                        return new j(fVar8, n65, fVar8.f69946c, this.f69966e, 12);
                    }
                    o6.d n66 = a43.n(s22);
                    o6.d n67 = !l34 ? n66.n(e23) : n66;
                    o6.d t23 = n64.a(s22).t(n67, dVar73.a(dVar104));
                    if (l33) {
                        dVar46 = t23;
                        dVar47 = n67;
                    } else {
                        dVar47 = n67.n(dVar104);
                        dVar46 = t23;
                    }
                    dVar48 = n65;
                }
                return new j(fVar8, dVar48, dVar46, new o6.d[]{dVar47}, this.f69966e, 12);
            case 13:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                boolean m24 = dVar74.m();
                f fVar9 = this.f69962a;
                o6.d dVar107 = lVar.f69963b;
                if (m24) {
                    return dVar107.m() ? fVar9.j() : lVar.a(this);
                }
                o6.d dVar108 = dVarArr[0];
                o6.d e24 = lVar.e();
                boolean l35 = dVar108.l();
                o6.d dVar109 = lVar.f69964c;
                if (l35) {
                    dVar49 = dVar109;
                    dVar50 = dVar107;
                } else {
                    dVar50 = dVar107.n(dVar108);
                    dVar49 = dVar109.n(dVar108);
                }
                boolean l36 = e24.l();
                if (l36) {
                    dVar51 = dVar73;
                } else {
                    dVar74 = dVar74.n(e24);
                    dVar51 = dVar73.n(e24);
                }
                o6.d a46 = dVar51.a(dVar49);
                o6.d a47 = dVar74.a(dVar50);
                if (a47.m()) {
                    return a46.m() ? m() : fVar9.j();
                }
                if (dVar107.m()) {
                    l j24 = j();
                    o6.d dVar110 = j24.f69963b;
                    o6.d d34 = j24.d();
                    o6.d d35 = d34.a(dVar109).d(dVar110);
                    dVar54 = d7.g.p(d35, d35, dVar110);
                    if (dVar54.m()) {
                        return new j(fVar9, dVar54, fVar9.f69946c, this.f69966e, 13);
                    }
                    o6.d a48 = d35.n(dVar110.a(dVar54)).a(dVar54).a(d34).d(dVar54).a(dVar54);
                    dVar53 = fVar9.h(a.f69934b);
                    dVar52 = a48;
                } else {
                    o6.d s23 = a47.s();
                    o6.d n68 = a46.n(dVar74);
                    o6.d n69 = a46.n(dVar50);
                    o6.d n73 = n68.n(n69);
                    if (n73.m()) {
                        return new j(fVar9, n73, fVar9.f69946c, this.f69966e, 13);
                    }
                    o6.d n74 = a46.n(s23);
                    o6.d n75 = !l36 ? n74.n(e24) : n74;
                    o6.d t24 = n69.a(s23).t(n75, dVar73.a(dVar108));
                    if (l35) {
                        dVar52 = t24;
                        dVar53 = n75;
                    } else {
                        dVar53 = n75.n(dVar108);
                        dVar52 = t24;
                    }
                    dVar54 = n73;
                }
                return new j(fVar9, dVar54, dVar52, new o6.d[]{dVar53}, this.f69966e, 13);
            case 14:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                boolean m25 = dVar74.m();
                f fVar10 = this.f69962a;
                o6.d dVar111 = lVar.f69963b;
                if (m25) {
                    return dVar111.m() ? fVar10.j() : lVar.a(this);
                }
                o6.d dVar112 = dVarArr[0];
                o6.d e25 = lVar.e();
                boolean l37 = dVar112.l();
                o6.d dVar113 = lVar.f69964c;
                if (l37) {
                    dVar55 = dVar113;
                    dVar56 = dVar111;
                } else {
                    dVar56 = dVar111.n(dVar112);
                    dVar55 = dVar113.n(dVar112);
                }
                boolean l38 = e25.l();
                if (l38) {
                    dVar57 = dVar73;
                } else {
                    dVar74 = dVar74.n(e25);
                    dVar57 = dVar73.n(e25);
                }
                o6.d a49 = dVar57.a(dVar55);
                o6.d a53 = dVar74.a(dVar56);
                if (a53.m()) {
                    return a49.m() ? m() : fVar10.j();
                }
                if (dVar111.m()) {
                    l j25 = j();
                    o6.d dVar114 = j25.f69963b;
                    o6.d d36 = j25.d();
                    o6.d d37 = d36.a(dVar113).d(dVar114);
                    dVar60 = d37.s().a(d37).a(dVar114).b();
                    if (dVar60.m()) {
                        return new j(fVar10, dVar60, fVar10.f69946c.r(), this.f69966e, 14);
                    }
                    o6.d a54 = d37.n(dVar114.a(dVar60)).a(dVar60).a(d36).d(dVar60).a(dVar60);
                    dVar59 = fVar10.h(a.f69934b);
                    dVar58 = a54;
                } else {
                    o6.d s24 = a53.s();
                    o6.d n76 = a49.n(dVar74);
                    o6.d n77 = a49.n(dVar56);
                    o6.d n78 = n76.n(n77);
                    if (n78.m()) {
                        return new j(fVar10, n78, fVar10.f69946c.r(), this.f69966e, 14);
                    }
                    o6.d n79 = a49.n(s24);
                    o6.d n83 = !l38 ? n79.n(e25) : n79;
                    o6.d t25 = n77.a(s24).t(n83, dVar73.a(dVar112));
                    if (l37) {
                        dVar58 = t25;
                        dVar59 = n83;
                    } else {
                        dVar59 = n83.n(dVar112);
                        dVar58 = t25;
                    }
                    dVar60 = n78;
                }
                return new j(fVar10, dVar60, dVar58, new o6.d[]{dVar59}, this.f69966e, 14);
            case 15:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                boolean m26 = dVar74.m();
                f fVar11 = this.f69962a;
                o6.d dVar115 = lVar.f69963b;
                if (m26) {
                    return dVar115.m() ? fVar11.j() : lVar.a(this);
                }
                o6.d dVar116 = dVarArr[0];
                o6.d e26 = lVar.e();
                boolean l39 = dVar116.l();
                o6.d dVar117 = lVar.f69964c;
                if (l39) {
                    dVar61 = dVar117;
                    dVar62 = dVar115;
                } else {
                    dVar62 = dVar115.n(dVar116);
                    dVar61 = dVar117.n(dVar116);
                }
                boolean l43 = e26.l();
                if (l43) {
                    dVar63 = dVar73;
                } else {
                    dVar74 = dVar74.n(e26);
                    dVar63 = dVar73.n(e26);
                }
                o6.d a55 = dVar63.a(dVar61);
                o6.d a56 = dVar74.a(dVar62);
                if (a56.m()) {
                    return a55.m() ? m() : fVar11.j();
                }
                if (dVar115.m()) {
                    l j26 = j();
                    o6.d dVar118 = j26.f69963b;
                    o6.d d38 = j26.d();
                    o6.d d39 = d38.a(dVar117).d(dVar118);
                    dVar66 = d7.g.p(d39, d39, dVar118);
                    if (dVar66.m()) {
                        return new j(fVar11, dVar66, fVar11.f69946c, this.f69966e, 15);
                    }
                    o6.d a57 = d39.n(dVar118.a(dVar66)).a(dVar66).a(d38).d(dVar66).a(dVar66);
                    dVar65 = fVar11.h(a.f69934b);
                    dVar64 = a57;
                } else {
                    o6.d s25 = a56.s();
                    o6.d n84 = a55.n(dVar74);
                    o6.d n85 = a55.n(dVar62);
                    o6.d n86 = n84.n(n85);
                    if (n86.m()) {
                        return new j(fVar11, n86, fVar11.f69946c, this.f69966e, 15);
                    }
                    o6.d n87 = a55.n(s25);
                    o6.d n88 = !l43 ? n87.n(e26) : n87;
                    o6.d t26 = n85.a(s25).t(n88, dVar73.a(dVar116));
                    if (l39) {
                        dVar64 = t26;
                        dVar65 = n88;
                    } else {
                        dVar65 = n88.n(dVar116);
                        dVar64 = t26;
                    }
                    dVar66 = n86;
                }
                return new j(fVar11, dVar66, dVar64, new o6.d[]{dVar65}, this.f69966e, 15);
            case 16:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                boolean m27 = dVar74.m();
                f fVar12 = this.f69962a;
                o6.d dVar119 = lVar.f69963b;
                if (m27) {
                    return dVar119.m() ? fVar12.j() : lVar.a(this);
                }
                o6.d dVar120 = dVarArr[0];
                o6.d e27 = lVar.e();
                boolean l44 = dVar120.l();
                o6.d dVar121 = lVar.f69964c;
                if (l44) {
                    dVar67 = dVar121;
                    dVar68 = dVar119;
                } else {
                    dVar68 = dVar119.n(dVar120);
                    dVar67 = dVar121.n(dVar120);
                }
                boolean l45 = e27.l();
                if (l45) {
                    dVar69 = dVar73;
                } else {
                    dVar74 = dVar74.n(e27);
                    dVar69 = dVar73.n(e27);
                }
                o6.d a58 = dVar69.a(dVar67);
                o6.d a59 = dVar74.a(dVar68);
                if (a59.m()) {
                    return a58.m() ? m() : fVar12.j();
                }
                if (dVar119.m()) {
                    l j27 = j();
                    o6.d dVar122 = j27.f69963b;
                    o6.d d43 = j27.d();
                    o6.d d44 = d43.a(dVar121).d(dVar122);
                    dVar72 = d44.s().a(d44).a(dVar122).b();
                    if (dVar72.m()) {
                        return new j(fVar12, dVar72, fVar12.f69946c.r(), this.f69966e, 16);
                    }
                    o6.d a63 = d44.n(dVar122.a(dVar72)).a(dVar72).a(d43).d(dVar72).a(dVar72);
                    dVar71 = fVar12.h(a.f69934b);
                    dVar70 = a63;
                } else {
                    o6.d s26 = a59.s();
                    o6.d n89 = a58.n(dVar74);
                    o6.d n93 = a58.n(dVar68);
                    o6.d n94 = n89.n(n93);
                    if (n94.m()) {
                        return new j(fVar12, n94, fVar12.f69946c.r(), this.f69966e, 16);
                    }
                    o6.d n95 = a58.n(s26);
                    o6.d n96 = !l45 ? n95.n(e27) : n95;
                    o6.d t27 = n93.a(s26).t(n96, dVar73.a(dVar120));
                    if (l44) {
                        dVar70 = t27;
                        dVar71 = n96;
                    } else {
                        dVar71 = n96.n(dVar120);
                        dVar70 = t27;
                    }
                    dVar72 = n94;
                }
                return new j(fVar12, dVar72, dVar70, new o6.d[]{dVar71}, this.f69966e, 16);
            case 17:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                h0 h0Var7 = (h0) dVar74;
                h0 h0Var8 = (h0) lVar.f69963b;
                boolean w03 = n3.w0(h0Var7.f80717e);
                f fVar13 = this.f69962a;
                if (w03) {
                    return n3.w0(h0Var8.f80717e) ? fVar13.j() : lVar.a(this);
                }
                h0 h0Var9 = (h0) dVar73;
                h0 h0Var10 = (h0) dVarArr[0];
                h0 h0Var11 = (h0) lVar.f69964c;
                h0 h0Var12 = (h0) lVar.e();
                long[] jArr7 = new long[9];
                long[] jArr8 = new long[9];
                long[] jArr9 = new long[9];
                long[] jArr10 = new long[9];
                boolean l46 = h0Var10.l();
                long[] jArr11 = h0Var10.f80717e;
                long[] S = l46 ? null : kq2.b.S(jArr11);
                if (S == null) {
                    jArr2 = h0Var8.f80717e;
                    jArr = h0Var11.f80717e;
                } else {
                    kq2.b.R(h0Var8.f80717e, S, jArr8);
                    kq2.b.R(h0Var11.f80717e, S, jArr10);
                    jArr = jArr10;
                    jArr2 = jArr8;
                }
                long[] S2 = h0Var12.l() ? null : kq2.b.S(h0Var12.f80717e);
                long[] jArr12 = h0Var7.f80717e;
                if (S2 == null) {
                    jArr3 = h0Var9.f80717e;
                } else {
                    kq2.b.R(jArr12, S2, jArr7);
                    kq2.b.R(h0Var9.f80717e, S2, jArr9);
                    jArr12 = jArr7;
                    jArr3 = jArr9;
                }
                kq2.b.b(jArr3, jArr, jArr9);
                kq2.b.b(jArr12, jArr2, jArr10);
                if (n3.w0(jArr10)) {
                    return n3.w0(jArr9) ? m() : fVar13.j();
                }
                if (n3.w0(h0Var8.f80717e)) {
                    l j28 = j();
                    h0 h0Var13 = (h0) j28.f69963b;
                    o6.d d45 = j28.d();
                    o6.d d46 = d45.a(h0Var11).d(h0Var13);
                    h0 h0Var14 = (h0) d46.s().a(d46).a(h0Var13);
                    if (n3.w0(h0Var14.f80717e)) {
                        return new j(fVar13, h0Var14, fVar13.f69946c, this.f69966e, 17);
                    }
                    h0 h0Var15 = (h0) d46.n(h0Var13.a(h0Var14)).a(h0Var14).a(d45).d(h0Var14).a(h0Var14);
                    h0Var3 = (h0) fVar13.h(a.f69934b);
                    h0Var = h0Var15;
                    h0Var2 = h0Var14;
                } else {
                    kq2.b.x0(jArr10, jArr10);
                    long[] S3 = kq2.b.S(jArr9);
                    kq2.b.R(jArr12, S3, jArr7);
                    kq2.b.R(jArr2, S3, jArr8);
                    h0 h0Var16 = new h0(jArr7);
                    kq2.b.I(jArr7, jArr8, jArr7);
                    if (n3.w0(jArr7)) {
                        return new j(fVar13, h0Var16, fVar13.f69946c, this.f69966e, 17);
                    }
                    h0 h0Var17 = new h0(jArr9);
                    kq2.b.R(jArr10, S3, jArr9);
                    if (S2 != null) {
                        kq2.b.R(jArr9, S2, jArr9);
                    }
                    long[] jArr13 = new long[18];
                    kq2.b.b(jArr8, jArr10, jArr10);
                    long[] jArr14 = new long[18];
                    kq2.b.z(jArr10, jArr14);
                    for (int i13 = 0; i13 < 18; i13++) {
                        jArr13[i13] = jArr13[i13] ^ jArr14[i13];
                    }
                    kq2.b.b(h0Var9.f80717e, jArr11, jArr10);
                    kq2.b.Q(jArr10, jArr9, jArr13);
                    h0 h0Var18 = new h0(jArr10);
                    kq2.b.b0(jArr13, jArr10);
                    if (S != null) {
                        kq2.b.R(jArr9, S, jArr9);
                    }
                    h0Var = h0Var18;
                    h0Var2 = h0Var16;
                    h0Var3 = h0Var17;
                }
                return new j(fVar13, h0Var2, h0Var, new o6.d[]{h0Var3}, this.f69966e, 17);
            default:
                if (f()) {
                    return lVar;
                }
                if (lVar.f()) {
                    return this;
                }
                h0 h0Var19 = (h0) dVar74;
                h0 h0Var20 = (h0) lVar.f69963b;
                boolean w04 = n3.w0(h0Var19.f80717e);
                f fVar14 = this.f69962a;
                if (w04) {
                    return n3.w0(h0Var20.f80717e) ? fVar14.j() : lVar.a(this);
                }
                h0 h0Var21 = (h0) dVar73;
                h0 h0Var22 = (h0) dVarArr[0];
                h0 h0Var23 = (h0) lVar.f69964c;
                h0 h0Var24 = (h0) lVar.e();
                long[] jArr15 = new long[9];
                long[] jArr16 = new long[9];
                long[] jArr17 = new long[9];
                long[] jArr18 = new long[9];
                boolean l47 = h0Var22.l();
                long[] jArr19 = h0Var22.f80717e;
                long[] S4 = l47 ? null : kq2.b.S(jArr19);
                if (S4 == null) {
                    jArr5 = h0Var20.f80717e;
                    jArr4 = h0Var23.f80717e;
                } else {
                    kq2.b.R(h0Var20.f80717e, S4, jArr16);
                    kq2.b.R(h0Var23.f80717e, S4, jArr18);
                    jArr4 = jArr18;
                    jArr5 = jArr16;
                }
                long[] S5 = h0Var24.l() ? null : kq2.b.S(h0Var24.f80717e);
                long[] jArr20 = h0Var19.f80717e;
                if (S5 == null) {
                    jArr6 = h0Var21.f80717e;
                } else {
                    kq2.b.R(jArr20, S5, jArr15);
                    kq2.b.R(h0Var21.f80717e, S5, jArr17);
                    jArr20 = jArr15;
                    jArr6 = jArr17;
                }
                kq2.b.b(jArr6, jArr4, jArr17);
                kq2.b.b(jArr20, jArr5, jArr18);
                if (n3.w0(jArr18)) {
                    return n3.w0(jArr17) ? m() : fVar14.j();
                }
                if (n3.w0(h0Var20.f80717e)) {
                    l j29 = j();
                    h0 h0Var25 = (h0) j29.f69963b;
                    o6.d d47 = j29.d();
                    o6.d d48 = d47.a(h0Var23).d(h0Var25);
                    h0Var5 = (h0) d48.s().a(d48).a(h0Var25).b();
                    if (n3.w0(h0Var5.f80717e)) {
                        return new j(fVar14, h0Var5, i0.f80721j, this.f69966e, 18);
                    }
                    h0 h0Var26 = (h0) d48.n(h0Var25.a(h0Var5)).a(h0Var5).a(d47).d(h0Var5).a(h0Var5);
                    h0Var6 = (h0) fVar14.h(a.f69934b);
                    h0Var4 = h0Var26;
                } else {
                    kq2.b.x0(jArr18, jArr18);
                    long[] S6 = kq2.b.S(jArr17);
                    kq2.b.R(jArr20, S6, jArr15);
                    kq2.b.R(jArr5, S6, jArr16);
                    h0 h0Var27 = new h0(jArr15);
                    kq2.b.I(jArr15, jArr16, jArr15);
                    if (n3.w0(jArr15)) {
                        return new j(fVar14, h0Var27, i0.f80721j, this.f69966e, 18);
                    }
                    h0 h0Var28 = new h0(jArr17);
                    kq2.b.R(jArr18, S6, jArr17);
                    if (S5 != null) {
                        kq2.b.R(jArr17, S5, jArr17);
                    }
                    long[] jArr21 = new long[18];
                    kq2.b.b(jArr16, jArr18, jArr18);
                    long[] jArr22 = new long[18];
                    kq2.b.z(jArr18, jArr22);
                    int i14 = 0;
                    for (int i15 = 18; i14 < i15; i15 = 18) {
                        jArr21[i14] = jArr21[i14] ^ jArr22[i14];
                        i14++;
                    }
                    kq2.b.b(h0Var21.f80717e, jArr19, jArr18);
                    kq2.b.Q(jArr18, jArr17, jArr21);
                    h0 h0Var29 = new h0(jArr18);
                    kq2.b.b0(jArr21, jArr18);
                    if (S4 != null) {
                        kq2.b.R(jArr17, S4, jArr17);
                    }
                    h0Var4 = h0Var29;
                    h0Var5 = h0Var27;
                    h0Var6 = h0Var28;
                }
                return new j(fVar14, h0Var5, h0Var4, new o6.d[]{h0Var6}, this.f69966e, 18);
        }
    }

    @Override // hq2.l
    public final o6.d d() {
        o6.d[] dVarArr = this.f69965d;
        o6.d dVar = this.f69963b;
        o6.d dVar2 = this.f69964c;
        switch (this.f69959h) {
            case 0:
                int c13 = c();
                if ((c13 != 5 && c13 != 6) || f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n13 = dVar2.a(dVar).n(dVar);
                if (6 == c13) {
                    o6.d dVar3 = dVarArr[0];
                    if (!dVar3.l()) {
                        return n13.d(dVar3);
                    }
                }
                return n13;
            case 1:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n14 = dVar2.a(dVar).n(dVar);
                o6.d dVar4 = dVarArr[0];
                return !dVar4.l() ? n14.d(dVar4) : n14;
            case 2:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n15 = dVar2.a(dVar).n(dVar);
                o6.d dVar5 = dVarArr[0];
                return !dVar5.l() ? n15.d(dVar5) : n15;
            case 3:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n16 = dVar2.a(dVar).n(dVar);
                o6.d dVar6 = dVarArr[0];
                return !dVar6.l() ? n16.d(dVar6) : n16;
            case 4:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n17 = dVar2.a(dVar).n(dVar);
                o6.d dVar7 = dVarArr[0];
                return !dVar7.l() ? n17.d(dVar7) : n17;
            case 5:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n18 = dVar2.a(dVar).n(dVar);
                o6.d dVar8 = dVarArr[0];
                return !dVar8.l() ? n18.d(dVar8) : n18;
            case 6:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n19 = dVar2.a(dVar).n(dVar);
                o6.d dVar9 = dVarArr[0];
                return !dVar9.l() ? n19.d(dVar9) : n19;
            case 7:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n23 = dVar2.a(dVar).n(dVar);
                o6.d dVar10 = dVarArr[0];
                return !dVar10.l() ? n23.d(dVar10) : n23;
            case 8:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n24 = dVar2.a(dVar).n(dVar);
                o6.d dVar11 = dVarArr[0];
                return !dVar11.l() ? n24.d(dVar11) : n24;
            case 9:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n25 = dVar2.a(dVar).n(dVar);
                o6.d dVar12 = dVarArr[0];
                return !dVar12.l() ? n25.d(dVar12) : n25;
            case 10:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n26 = dVar2.a(dVar).n(dVar);
                o6.d dVar13 = dVarArr[0];
                return !dVar13.l() ? n26.d(dVar13) : n26;
            case 11:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n27 = dVar2.a(dVar).n(dVar);
                o6.d dVar14 = dVarArr[0];
                return !dVar14.l() ? n27.d(dVar14) : n27;
            case 12:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n28 = dVar2.a(dVar).n(dVar);
                o6.d dVar15 = dVarArr[0];
                return !dVar15.l() ? n28.d(dVar15) : n28;
            case 13:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n29 = dVar2.a(dVar).n(dVar);
                o6.d dVar16 = dVarArr[0];
                return !dVar16.l() ? n29.d(dVar16) : n29;
            case 14:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n33 = dVar2.a(dVar).n(dVar);
                o6.d dVar17 = dVarArr[0];
                return !dVar17.l() ? n33.d(dVar17) : n33;
            case 15:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n34 = dVar2.a(dVar).n(dVar);
                o6.d dVar18 = dVarArr[0];
                return !dVar18.l() ? n34.d(dVar18) : n34;
            case 16:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n35 = dVar2.a(dVar).n(dVar);
                o6.d dVar19 = dVarArr[0];
                return !dVar19.l() ? n35.d(dVar19) : n35;
            case 17:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n36 = dVar2.a(dVar).n(dVar);
                o6.d dVar20 = dVarArr[0];
                return !dVar20.l() ? n36.d(dVar20) : n36;
            default:
                if (f() || dVar.m()) {
                    return dVar2;
                }
                o6.d n37 = dVar2.a(dVar).n(dVar);
                o6.d dVar21 = dVarArr[0];
                return !dVar21.l() ? n37.d(dVar21) : n37;
        }
    }

    @Override // hq2.l
    public final l i() {
        o6.d dVar = this.f69964c;
        o6.d[] dVarArr = this.f69965d;
        o6.d dVar2 = this.f69963b;
        switch (this.f69959h) {
            case 0:
                if (f() || dVar2.m()) {
                    return this;
                }
                int c13 = c();
                if (c13 == 0) {
                    return new j(this.f69962a, dVar2, dVar.a(dVar2), this.f69966e, 0);
                }
                if (c13 == 1) {
                    o6.d dVar3 = dVarArr[0];
                    boolean z13 = this.f69966e;
                    return new j(this.f69962a, dVar2, dVar.a(dVar2), new o6.d[]{dVar3}, z13, 0);
                }
                if (c13 == 5) {
                    return new j(this.f69962a, dVar2, dVar.b(), this.f69966e, 0);
                }
                if (c13 != 6) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                o6.d dVar4 = dVarArr[0];
                boolean z14 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar4), new o6.d[]{dVar4}, z14, 0);
            case 1:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar5 = dVarArr[0];
                boolean z15 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar5), new o6.d[]{dVar5}, z15, 1);
            case 2:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar6 = dVarArr[0];
                boolean z16 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar6), new o6.d[]{dVar6}, z16, 2);
            case 3:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar7 = dVarArr[0];
                boolean z17 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar7), new o6.d[]{dVar7}, z17, 3);
            case 4:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar8 = dVarArr[0];
                boolean z18 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar8), new o6.d[]{dVar8}, z18, 4);
            case 5:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar9 = dVarArr[0];
                boolean z19 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar9), new o6.d[]{dVar9}, z19, 5);
            case 6:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar10 = dVarArr[0];
                boolean z23 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar10), new o6.d[]{dVar10}, z23, 6);
            case 7:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar11 = dVarArr[0];
                boolean z24 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar11), new o6.d[]{dVar11}, z24, 7);
            case 8:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar12 = dVarArr[0];
                boolean z25 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar12), new o6.d[]{dVar12}, z25, 8);
            case 9:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar13 = dVarArr[0];
                boolean z26 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar13), new o6.d[]{dVar13}, z26, 9);
            case 10:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar14 = dVarArr[0];
                boolean z27 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar14), new o6.d[]{dVar14}, z27, 10);
            case 11:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar15 = dVarArr[0];
                boolean z28 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar15), new o6.d[]{dVar15}, z28, 11);
            case 12:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar16 = dVarArr[0];
                boolean z29 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar16), new o6.d[]{dVar16}, z29, 12);
            case 13:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar17 = dVarArr[0];
                boolean z33 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar17), new o6.d[]{dVar17}, z33, 13);
            case 14:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar18 = dVarArr[0];
                boolean z34 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar18), new o6.d[]{dVar18}, z34, 14);
            case 15:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar19 = dVarArr[0];
                boolean z35 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar19), new o6.d[]{dVar19}, z35, 15);
            case 16:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar20 = dVarArr[0];
                boolean z36 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar20), new o6.d[]{dVar20}, z36, 16);
            case 17:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar21 = dVarArr[0];
                boolean z37 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar21), new o6.d[]{dVar21}, z37, 17);
            default:
                if (f() || dVar2.m()) {
                    return this;
                }
                o6.d dVar22 = dVarArr[0];
                boolean z38 = this.f69966e;
                return new j(this.f69962a, dVar2, dVar.a(dVar22), new o6.d[]{dVar22}, z38, 18);
        }
    }

    @Override // hq2.l
    public final l m() {
        o6.d a13;
        long[] jArr;
        f fVar = this.f69962a;
        o6.d[] dVarArr = this.f69965d;
        o6.d dVar = this.f69964c;
        o6.d dVar2 = this.f69963b;
        switch (this.f69959h) {
            case 0:
                if (f()) {
                    return this;
                }
                if (dVar2.m()) {
                    return fVar.j();
                }
                int i13 = fVar.f69949f;
                if (i13 == 0) {
                    o6.d a14 = dVar.d(dVar2).a(dVar2);
                    o6.d a15 = a14.s().a(a14).a(fVar.f69945b);
                    return new j(fVar, a15, dVar2.t(a15, a14.b()), this.f69966e, 0);
                }
                if (i13 == 1) {
                    o6.d dVar3 = dVarArr[0];
                    boolean l13 = dVar3.l();
                    o6.d n13 = l13 ? dVar2 : dVar2.n(dVar3);
                    if (!l13) {
                        dVar = dVar.n(dVar3);
                    }
                    o6.d s13 = dVar2.s();
                    o6.d a16 = s13.a(dVar);
                    o6.d s14 = n13.s();
                    o6.d a17 = a16.a(n13);
                    o6.d p13 = a17.p(a16, s14, fVar.f69945b);
                    return new j(fVar, n13.n(p13), s13.s().p(n13, p13, a17), new o6.d[]{n13.n(s14)}, this.f69966e, 0);
                }
                if (i13 != 6) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                o6.d dVar4 = dVarArr[0];
                boolean l14 = dVar4.l();
                o6.d n14 = l14 ? dVar : dVar.n(dVar4);
                o6.d s15 = l14 ? dVar4 : dVar4.s();
                o6.d dVar5 = fVar.f69945b;
                o6.d n15 = l14 ? dVar5 : dVar5.n(s15);
                o6.d p14 = d7.g.p(dVar, n14, n15);
                if (p14.m()) {
                    return new j(fVar, p14, fVar.f69946c.r(), this.f69966e, 0);
                }
                o6.d s16 = p14.s();
                o6.d n16 = l14 ? p14 : p14.n(s15);
                o6.d dVar6 = fVar.f69946c;
                if (dVar6.c() < (fVar.i() >> 1)) {
                    o6.d s17 = dVar.a(dVar2).s();
                    a13 = s17.a(p14).a(s15).n(s17).a(dVar6.l() ? n15.a(s15).s() : n15.t(dVar6, s15.s())).a(s16);
                    if (dVar5.m()) {
                        a13 = a13.a(n16);
                    } else if (!dVar5.l()) {
                        a13 = a13.a(dVar5.b().n(n16));
                    }
                } else {
                    if (!l14) {
                        dVar2 = dVar2.n(dVar4);
                    }
                    a13 = dVar2.t(p14, n14).a(s16).a(n16);
                }
                return new j(fVar, s16, a13, new o6.d[]{n16}, this.f69966e, 0);
            case 1:
                if (f()) {
                    return this;
                }
                if (dVar2.m()) {
                    return fVar.j();
                }
                o6.d dVar7 = dVarArr[0];
                boolean l15 = dVar7.l();
                o6.d n17 = l15 ? dVar : dVar.n(dVar7);
                o6.d s18 = l15 ? dVar7 : dVar7.s();
                o6.d dVar8 = fVar.f69945b;
                if (!l15) {
                    dVar8 = dVar8.n(s18);
                }
                o6.d p15 = d7.g.p(dVar, n17, dVar8);
                if (p15.m()) {
                    return new j(fVar, p15, fVar.f69946c.r(), this.f69966e, 1);
                }
                o6.d s19 = p15.s();
                o6.d n18 = l15 ? p15 : p15.n(s18);
                if (!l15) {
                    dVar2 = dVar2.n(dVar7);
                }
                return new j(fVar, s19, dVar2.t(p15, n17).a(s19).a(n18), new o6.d[]{n18}, this.f69966e, 1);
            case 2:
                if (f()) {
                    return this;
                }
                if (dVar2.m()) {
                    return fVar.j();
                }
                o6.d dVar9 = dVarArr[0];
                boolean l16 = dVar9.l();
                o6.d n19 = l16 ? dVar : dVar.n(dVar9);
                o6.d s22 = l16 ? dVar9 : dVar9.s();
                o6.d dVar10 = fVar.f69945b;
                if (!l16) {
                    dVar10 = dVar10.n(s22);
                }
                o6.d p16 = d7.g.p(dVar, n19, dVar10);
                if (p16.m()) {
                    return new j(fVar, p16, fVar.f69946c.r(), this.f69966e, 2);
                }
                o6.d s23 = p16.s();
                o6.d n23 = l16 ? p16 : p16.n(s22);
                if (!l16) {
                    dVar2 = dVar2.n(dVar9);
                }
                return new j(fVar, s23, dVar2.t(p16, n19).a(s23).a(n23), new o6.d[]{n23}, this.f69966e, 2);
            case 3:
                if (f()) {
                    return this;
                }
                if (dVar2.m()) {
                    return fVar.j();
                }
                o6.d dVar11 = dVarArr[0];
                boolean l17 = dVar11.l();
                o6.d n24 = l17 ? dVar : dVar.n(dVar11);
                o6.d s24 = l17 ? dVar11 : dVar11.s();
                o6.d dVar12 = fVar.f69945b;
                if (!l17) {
                    dVar12 = dVar12.n(s24);
                }
                o6.d p17 = d7.g.p(dVar, n24, dVar12);
                if (p17.m()) {
                    return new j(fVar, p17, fVar.f69946c.r(), this.f69966e, 3);
                }
                o6.d s25 = p17.s();
                o6.d n25 = l17 ? p17 : p17.n(s24);
                if (!l17) {
                    dVar2 = dVar2.n(dVar11);
                }
                return new j(fVar, s25, dVar2.t(p17, n24).a(s25).a(n25), new o6.d[]{n25}, this.f69966e, 3);
            case 4:
                if (f()) {
                    return this;
                }
                if (dVar2.m()) {
                    return fVar.j();
                }
                o6.d dVar13 = dVarArr[0];
                boolean l18 = dVar13.l();
                o6.d n26 = l18 ? dVar : dVar.n(dVar13);
                o6.d s26 = l18 ? dVar13 : dVar13.s();
                o6.d dVar14 = fVar.f69945b;
                if (!l18) {
                    dVar14 = dVar14.n(s26);
                }
                o6.d p18 = d7.g.p(dVar, n26, dVar14);
                if (p18.m()) {
                    return new j(fVar, p18, fVar.f69946c.r(), this.f69966e, 4);
                }
                o6.d s27 = p18.s();
                o6.d n27 = l18 ? p18 : p18.n(s26);
                if (!l18) {
                    dVar2 = dVar2.n(dVar13);
                }
                return new j(fVar, s27, dVar2.t(p18, n26).a(s27).a(n27), new o6.d[]{n27}, this.f69966e, 4);
            case 5:
                if (f()) {
                    return this;
                }
                boolean m13 = dVar2.m();
                f fVar2 = this.f69962a;
                if (m13) {
                    return fVar2.j();
                }
                o6.d dVar15 = dVarArr[0];
                boolean l19 = dVar15.l();
                o6.d n28 = l19 ? dVar : dVar.n(dVar15);
                if (!l19) {
                    dVar15 = dVar15.s();
                }
                o6.d p19 = d7.g.p(dVar, n28, dVar15);
                if (p19.m()) {
                    return new j(fVar2, p19, fVar2.f69946c, this.f69966e, 5);
                }
                o6.d s28 = p19.s();
                o6.d n29 = l19 ? p19 : p19.n(dVar15);
                o6.d s29 = dVar.a(dVar2).s();
                return new j(fVar2, s28, s29.a(p19).a(dVar15).n(s29).a(s28), new o6.d[]{n29}, this.f69966e, 5);
            case 6:
                if (f()) {
                    return this;
                }
                if (dVar2.m()) {
                    return fVar.j();
                }
                o6.d dVar16 = dVarArr[0];
                boolean l23 = dVar16.l();
                o6.d n33 = l23 ? dVar : dVar.n(dVar16);
                o6.d s33 = l23 ? dVar16 : dVar16.s();
                o6.d dVar17 = fVar.f69945b;
                if (!l23) {
                    dVar17 = dVar17.n(s33);
                }
                o6.d p23 = d7.g.p(dVar, n33, dVar17);
                if (p23.m()) {
                    return new j(fVar, p23, fVar.f69946c.r(), this.f69966e, 6);
                }
                o6.d s34 = p23.s();
                o6.d n34 = l23 ? p23 : p23.n(s33);
                if (!l23) {
                    dVar2 = dVar2.n(dVar16);
                }
                return new j(fVar, s34, dVar2.t(p23, n33).a(s34).a(n34), new o6.d[]{n34}, this.f69966e, 6);
            case 7:
                if (f()) {
                    return this;
                }
                boolean m14 = dVar2.m();
                f fVar3 = this.f69962a;
                if (m14) {
                    return fVar3.j();
                }
                o6.d dVar18 = dVarArr[0];
                boolean l24 = dVar18.l();
                o6.d n35 = l24 ? dVar : dVar.n(dVar18);
                o6.d s35 = l24 ? dVar18 : dVar18.s();
                o6.d p24 = d7.g.p(dVar, n35, s35);
                if (p24.m()) {
                    return new j(fVar3, p24, fVar3.f69946c.r(), this.f69966e, 7);
                }
                o6.d s36 = p24.s();
                o6.d n36 = l24 ? p24 : p24.n(s35);
                if (!l24) {
                    dVar2 = dVar2.n(dVar18);
                }
                return new j(fVar3, s36, dVar2.t(p24, n35).a(s36).a(n36), new o6.d[]{n36}, this.f69966e, 7);
            case 8:
                if (f()) {
                    return this;
                }
                if (dVar2.m()) {
                    return fVar.j();
                }
                o6.d dVar19 = dVarArr[0];
                boolean l25 = dVar19.l();
                o6.d n37 = l25 ? dVar : dVar.n(dVar19);
                o6.d s37 = l25 ? dVar19 : dVar19.s();
                o6.d dVar20 = fVar.f69945b;
                if (!l25) {
                    dVar20 = dVar20.n(s37);
                }
                o6.d p25 = d7.g.p(dVar, n37, dVar20);
                if (p25.m()) {
                    return new j(fVar, p25, fVar.f69946c.r(), this.f69966e, 8);
                }
                o6.d s38 = p25.s();
                o6.d n38 = l25 ? p25 : p25.n(s37);
                if (!l25) {
                    dVar2 = dVar2.n(dVar19);
                }
                return new j(fVar, s38, dVar2.t(p25, n37).a(s38).a(n38), new o6.d[]{n38}, this.f69966e, 8);
            case 9:
                if (f()) {
                    return this;
                }
                if (dVar2.m()) {
                    return fVar.j();
                }
                o6.d dVar21 = dVarArr[0];
                boolean l26 = dVar21.l();
                o6.d n39 = l26 ? dVar : dVar.n(dVar21);
                o6.d s39 = l26 ? dVar21 : dVar21.s();
                o6.d dVar22 = fVar.f69945b;
                if (!l26) {
                    dVar22 = dVar22.n(s39);
                }
                o6.d p26 = d7.g.p(dVar, n39, dVar22);
                if (p26.m()) {
                    return new j(fVar, p26, fVar.f69946c.r(), this.f69966e, 9);
                }
                o6.d s43 = p26.s();
                o6.d n43 = l26 ? p26 : p26.n(s39);
                if (!l26) {
                    dVar2 = dVar2.n(dVar21);
                }
                return new j(fVar, s43, dVar2.t(p26, n39).a(s43).a(n43), new o6.d[]{n43}, this.f69966e, 9);
            case 10:
                if (f()) {
                    return this;
                }
                boolean m15 = dVar2.m();
                f fVar4 = this.f69962a;
                if (m15) {
                    return fVar4.j();
                }
                o6.d dVar23 = dVarArr[0];
                boolean l27 = dVar23.l();
                o6.d s44 = l27 ? dVar23 : dVar23.s();
                o6.d a18 = l27 ? dVar.s().a(dVar) : dVar.a(dVar23).n(dVar);
                if (a18.m()) {
                    return new j(fVar4, a18, fVar4.f69946c, this.f69966e, 10);
                }
                o6.d s45 = a18.s();
                o6.d n44 = l27 ? a18 : a18.n(s44);
                o6.d s46 = dVar.a(dVar2).s();
                if (!l27) {
                    dVar23 = s44.s();
                }
                return new j(fVar4, s45, s46.a(a18).a(s44).n(s46).a(dVar23).a(s45).a(n44), new o6.d[]{n44}, this.f69966e, 10);
            case 11:
                if (f()) {
                    return this;
                }
                boolean m16 = dVar2.m();
                f fVar5 = this.f69962a;
                if (m16) {
                    return fVar5.j();
                }
                o6.d dVar24 = dVarArr[0];
                boolean l28 = dVar24.l();
                o6.d n45 = l28 ? dVar : dVar.n(dVar24);
                o6.d s47 = l28 ? dVar24 : dVar24.s();
                o6.d p27 = d7.g.p(dVar, n45, s47);
                if (p27.m()) {
                    return new j(fVar5, p27, fVar5.f69946c.r(), this.f69966e, 11);
                }
                o6.d s48 = p27.s();
                o6.d n46 = l28 ? p27 : p27.n(s47);
                if (!l28) {
                    dVar2 = dVar2.n(dVar24);
                }
                return new j(fVar5, s48, dVar2.t(p27, n45).a(s48).a(n46), new o6.d[]{n46}, this.f69966e, 11);
            case 12:
                if (f()) {
                    return this;
                }
                boolean m17 = dVar2.m();
                f fVar6 = this.f69962a;
                if (m17) {
                    return fVar6.j();
                }
                o6.d dVar25 = dVarArr[0];
                boolean l29 = dVar25.l();
                o6.d s49 = l29 ? dVar25 : dVar25.s();
                o6.d a19 = l29 ? dVar.s().a(dVar) : dVar.a(dVar25).n(dVar);
                if (a19.m()) {
                    return new j(fVar6, a19, fVar6.f69946c, this.f69966e, 12);
                }
                o6.d s53 = a19.s();
                o6.d n47 = l29 ? a19 : a19.n(s49);
                o6.d s54 = dVar.a(dVar2).s();
                if (!l29) {
                    dVar25 = s49.s();
                }
                return new j(fVar6, s53, s54.a(a19).a(s49).n(s54).a(dVar25).a(s53).a(n47), new o6.d[]{n47}, this.f69966e, 12);
            case 13:
                if (f()) {
                    return this;
                }
                boolean m18 = dVar2.m();
                f fVar7 = this.f69962a;
                if (m18) {
                    return fVar7.j();
                }
                o6.d dVar26 = dVarArr[0];
                boolean l33 = dVar26.l();
                o6.d s55 = l33 ? dVar26 : dVar26.s();
                o6.d a23 = l33 ? dVar.s().a(dVar) : dVar.a(dVar26).n(dVar);
                if (a23.m()) {
                    return new j(fVar7, a23, fVar7.f69946c, this.f69966e, 13);
                }
                o6.d s56 = a23.s();
                o6.d n48 = l33 ? a23 : a23.n(s55);
                o6.d s57 = dVar.a(dVar2).s();
                if (!l33) {
                    dVar26 = s55.s();
                }
                return new j(fVar7, s56, s57.a(a23).a(s55).n(s57).a(dVar26).a(s56).a(n48), new o6.d[]{n48}, this.f69966e, 13);
            case 14:
                if (f()) {
                    return this;
                }
                boolean m19 = dVar2.m();
                f fVar8 = this.f69962a;
                if (m19) {
                    return fVar8.j();
                }
                o6.d dVar27 = dVarArr[0];
                boolean l34 = dVar27.l();
                o6.d n49 = l34 ? dVar : dVar.n(dVar27);
                o6.d s58 = l34 ? dVar27 : dVar27.s();
                o6.d p28 = d7.g.p(dVar, n49, s58);
                if (p28.m()) {
                    return new j(fVar8, p28, fVar8.f69946c.r(), this.f69966e, 14);
                }
                o6.d s59 = p28.s();
                o6.d n53 = l34 ? p28 : p28.n(s58);
                if (!l34) {
                    dVar2 = dVar2.n(dVar27);
                }
                return new j(fVar8, s59, dVar2.t(p28, n49).a(s59).a(n53), new o6.d[]{n53}, this.f69966e, 14);
            case 15:
                if (f()) {
                    return this;
                }
                boolean m23 = dVar2.m();
                f fVar9 = this.f69962a;
                if (m23) {
                    return fVar9.j();
                }
                o6.d dVar28 = dVarArr[0];
                boolean l35 = dVar28.l();
                o6.d s63 = l35 ? dVar28 : dVar28.s();
                o6.d a24 = l35 ? dVar.s().a(dVar) : dVar.a(dVar28).n(dVar);
                if (a24.m()) {
                    return new j(fVar9, a24, fVar9.f69946c, this.f69966e, 15);
                }
                o6.d s64 = a24.s();
                o6.d n54 = l35 ? a24 : a24.n(s63);
                o6.d s65 = dVar.a(dVar2).s();
                if (!l35) {
                    dVar28 = s63.s();
                }
                return new j(fVar9, s64, s65.a(a24).a(s63).n(s65).a(dVar28).a(s64).a(n54), new o6.d[]{n54}, this.f69966e, 15);
            case 16:
                if (f()) {
                    return this;
                }
                boolean m24 = dVar2.m();
                f fVar10 = this.f69962a;
                if (m24) {
                    return fVar10.j();
                }
                o6.d dVar29 = dVarArr[0];
                boolean l36 = dVar29.l();
                o6.d n55 = l36 ? dVar : dVar.n(dVar29);
                o6.d s66 = l36 ? dVar29 : dVar29.s();
                o6.d p29 = d7.g.p(dVar, n55, s66);
                if (p29.m()) {
                    return new j(fVar10, p29, fVar10.f69946c.r(), this.f69966e, 16);
                }
                o6.d s67 = p29.s();
                o6.d n56 = l36 ? p29 : p29.n(s66);
                if (!l36) {
                    dVar2 = dVar2.n(dVar29);
                }
                return new j(fVar10, s67, dVar2.t(p29, n55).a(s67).a(n56), new o6.d[]{n56}, this.f69966e, 16);
            case 17:
                if (f()) {
                    return this;
                }
                boolean m25 = dVar2.m();
                f fVar11 = this.f69962a;
                if (m25) {
                    return fVar11.j();
                }
                o6.d dVar30 = dVarArr[0];
                boolean l37 = dVar30.l();
                o6.d s68 = l37 ? dVar30 : dVar30.s();
                o6.d a25 = l37 ? dVar.s().a(dVar) : dVar.a(dVar30).n(dVar);
                if (a25.m()) {
                    return new j(fVar11, a25, fVar11.f69946c, this.f69966e, 17);
                }
                o6.d s69 = a25.s();
                o6.d n57 = l37 ? a25 : a25.n(s68);
                o6.d s73 = dVar.a(dVar2).s();
                if (!l37) {
                    dVar30 = s68.s();
                }
                return new j(fVar11, s69, s73.a(a25).a(s68).n(s73).a(dVar30).a(s69).a(n57), new o6.d[]{n57}, this.f69966e, 17);
            default:
                if (f()) {
                    return this;
                }
                h0 h0Var = (h0) dVar2;
                boolean w03 = n3.w0(h0Var.f80717e);
                f fVar12 = this.f69962a;
                if (w03) {
                    return fVar12.j();
                }
                h0 h0Var2 = (h0) dVar;
                h0 h0Var3 = (h0) dVarArr[0];
                long[] jArr2 = new long[9];
                long[] jArr3 = new long[9];
                boolean l38 = h0Var3.l();
                long[] jArr4 = h0Var3.f80717e;
                long[] S = l38 ? null : kq2.b.S(jArr4);
                if (S == null) {
                    jArr = h0Var2.f80717e;
                } else {
                    kq2.b.R(h0Var2.f80717e, S, jArr2);
                    kq2.b.x0(jArr4, jArr3);
                    jArr = jArr2;
                    jArr4 = jArr3;
                }
                long[] jArr5 = new long[9];
                kq2.b.x0(h0Var2.f80717e, jArr5);
                for (int i14 = 0; i14 < 9; i14++) {
                    jArr5[i14] = jArr5[i14] ^ (jArr[i14] ^ jArr4[i14]);
                }
                if (n3.w0(jArr5)) {
                    return new j(fVar12, new h0(jArr5), i0.f80721j, this.f69966e, 18);
                }
                long[] jArr6 = new long[18];
                kq2.b.Q(jArr5, jArr, jArr6);
                h0 h0Var4 = new h0(jArr2);
                kq2.b.x0(jArr5, jArr2);
                h0 h0Var5 = new h0(jArr5);
                if (S != null) {
                    kq2.b.I(jArr5, jArr4, jArr5);
                }
                long[] jArr7 = h0Var.f80717e;
                if (S != null) {
                    kq2.b.R(jArr7, S, jArr3);
                    jArr7 = jArr3;
                }
                long[] jArr8 = new long[18];
                kq2.b.z(jArr7, jArr8);
                for (int i15 = 0; i15 < 18; i15++) {
                    jArr6[i15] = jArr6[i15] ^ jArr8[i15];
                }
                kq2.b.b0(jArr6, jArr3);
                for (int i16 = 0; i16 < 9; i16++) {
                    jArr3[i16] = jArr3[i16] ^ (jArr2[i16] ^ jArr5[i16]);
                }
                return new j(fVar12, h0Var4, new h0(jArr3), new o6.d[]{h0Var5}, this.f69966e, 18);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, o6.d dVar, o6.d dVar2, boolean z13, int i13) {
        super(fVar, dVar, dVar2, 0);
        this.f69959h = i13;
        switch (i13) {
            case 1:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 2:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 3:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 4:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 5:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 6:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 7:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 8:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 9:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 10:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 11:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 12:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 13:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 14:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 15:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 16:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 17:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 18:
                super(fVar, dVar, dVar2, 0);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            default:
                if ((dVar == null) == (dVar2 == null)) {
                    if (dVar != null) {
                        g.x(dVar, dVar2);
                        if (fVar != null) {
                            g.x(dVar, fVar.f69945b);
                        }
                    }
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, o6.d dVar, o6.d dVar2, o6.d[] dVarArr, boolean z13, int i13) {
        super(fVar, dVar, dVar2, dVarArr, 0);
        this.f69959h = i13;
        switch (i13) {
            case 1:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 2:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 3:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 4:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 5:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 6:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 7:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 8:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 9:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 10:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 11:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 12:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 13:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 14:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 15:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 16:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 17:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            case 18:
                super(fVar, dVar, dVar2, dVarArr, 0);
                this.f69966e = z13;
                break;
            default:
                this.f69966e = z13;
                break;
        }
    }
}
