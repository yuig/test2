package hq2;

import java.math.BigInteger;
import kh2.j1;
import kh2.p2;
import kh2.r;
import kh2.w;
import kq2.n;
import kq2.p;
import kq2.t;
import kq2.v;
import kq2.x;

/* loaded from: classes4.dex */
public final class k extends i {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f69960h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(f fVar, int i13) {
        this(fVar, null, null, false, 0);
        this.f69960h = i13;
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
            default:
                break;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private hq2.l n(hq2.l r17) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hq2.k.n(hq2.l):hq2.l");
    }

    private l o(l lVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        iq2.c cVar;
        iq2.c cVar2;
        boolean z13;
        char c13;
        if (f()) {
            return lVar;
        }
        if (lVar.f()) {
            return this;
        }
        if (this == lVar) {
            return m();
        }
        iq2.c cVar3 = (iq2.c) this.f69963b;
        iq2.c cVar4 = (iq2.c) this.f69964c;
        iq2.c cVar5 = (iq2.c) this.f69965d[0];
        iq2.c cVar6 = (iq2.c) lVar.f69963b;
        iq2.c cVar7 = (iq2.c) lVar.d();
        iq2.c cVar8 = (iq2.c) lVar.e();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean p13 = he2.k.p(cVar5.f73442e);
        int[] iArr9 = cVar5.f73442e;
        if (p13) {
            iArr = cVar6.f73442e;
            iArr2 = cVar7.f73442e;
        } else {
            iq2.b.d(iArr9, iArr7);
            iq2.b.a(iArr7, cVar6.f73442e, iArr6);
            iq2.b.a(iArr7, iArr9, iArr7);
            iq2.b.a(iArr7, cVar7.f73442e, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean p14 = he2.k.p(cVar8.f73442e);
        int[] iArr10 = cVar8.f73442e;
        if (p14) {
            iArr3 = cVar3.f73442e;
            iArr4 = cVar4.f73442e;
        } else {
            iq2.b.d(iArr10, iArr8);
            iq2.b.a(iArr8, cVar3.f73442e, iArr5);
            iq2.b.a(iArr8, iArr10, iArr8);
            iq2.b.a(iArr8, cVar4.f73442e, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[8];
        iq2.b.g(iArr3, iArr, iArr11);
        iq2.b.g(iArr4, iArr2, iArr6);
        boolean r13 = he2.k.r(iArr11);
        f fVar = this.f69962a;
        if (r13) {
            return he2.k.r(iArr6) ? m() : fVar.j();
        }
        int[] iArr12 = new int[8];
        iq2.b.d(iArr11, iArr12);
        int[] iArr13 = new int[8];
        iq2.b.a(iArr12, iArr11, iArr13);
        iq2.b.a(iArr12, iArr3, iArr7);
        if (he2.k.r(iArr13)) {
            he2.k.J(iArr13);
        } else {
            he2.k.z(iq2.b.f73438a, iArr13, iArr13);
        }
        he2.k.t(iArr4, iArr13, iArr5);
        iq2.b.c(iArr13, he2.k.c(iArr7, iArr7, iArr13));
        iq2.c cVar9 = new iq2.c(iArr8);
        iq2.b.d(iArr6, iArr8);
        iq2.b.g(iArr8, iArr13, iArr8);
        iq2.c cVar10 = new iq2.c(iArr13);
        iq2.b.g(iArr7, iArr8, iArr13);
        he2.k.u(iArr13, iArr6, iArr5);
        if (j1.j0(16, iArr5, iq2.b.f73439b)) {
            long j13 = (iArr5[0] & 4294967295L) - (r12[0] & 4294967295L);
            iArr5[0] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                c13 = '\b';
                j14 = j1.X(8, 1, iArr5);
            } else {
                c13 = '\b';
            }
            z13 = p13;
            long j15 = (iArr5[c13] & 4294967295L) + 19 + j14;
            iArr5[8] = (int) j15;
            long j16 = j15 >> 32;
            if (j16 != 0) {
                j16 = j1.p0(15, 9, iArr5);
            }
            cVar = cVar9;
            cVar2 = cVar10;
            iArr5[15] = (int) (((iArr5[15] & 4294967295L) - ((r12[15] + 1) & 4294967295L)) + j16);
        } else {
            cVar = cVar9;
            cVar2 = cVar10;
            z13 = p13;
        }
        iq2.b.b(iArr5, iArr13);
        iq2.c cVar11 = new iq2.c(iArr11);
        if (!z13) {
            iq2.b.a(iArr11, iArr9, iArr11);
        }
        if (!p14) {
            iq2.b.a(iArr11, iArr10, iArr11);
        }
        if (!z13 || !p14) {
            iArr12 = null;
        }
        return new k(fVar, cVar, cVar2, new o6.d[]{cVar11, q(cVar11, iArr12)}, this.f69966e, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f6, code lost:
    
        if (kh2.j1.j0(16, r10, r12) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private hq2.l p(hq2.l r24) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hq2.k.p(hq2.l):hq2.l");
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0323, code lost:
    
        if (kh2.j1.j0(16, r7, r9) != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0442, code lost:
    
        if (kh2.j1.j0(16, r10, kq2.b.f80695w) != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0b6e, code lost:
    
        if (kh2.j1.j0(10, r8, kq2.b.f80677e) != false) goto L404;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0b8e  */
    @Override // hq2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final hq2.l a(hq2.l r42) {
        /*
            Method dump skipped, instructions count: 3794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hq2.k.a(hq2.l):hq2.l");
    }

    @Override // hq2.l
    public final o6.d e() {
        switch (this.f69960h) {
        }
        return super.e();
    }

    @Override // hq2.l
    public final l i() {
        o6.d dVar = this.f69964c;
        switch (this.f69960h) {
            case 0:
                if (f()) {
                    return this;
                }
                f fVar = this.f69962a;
                if (fVar.f69949f != 0) {
                    return new k(fVar, this.f69963b, dVar.q(), this.f69965d, this.f69966e, 0);
                }
                return new k(fVar, this.f69963b, dVar.q(), this.f69966e, 0);
            case 1:
                if (f()) {
                    return this;
                }
                o6.d q13 = dVar.q();
                boolean z13 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q13, this.f69965d, z13, 1);
            case 2:
                if (f()) {
                    return this;
                }
                o6.d q14 = dVar.q();
                boolean z14 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q14, this.f69965d, z14, 2);
            case 3:
                if (f()) {
                    return this;
                }
                o6.d q15 = dVar.q();
                boolean z15 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q15, this.f69965d, z15, 3);
            case 4:
                if (f()) {
                    return this;
                }
                o6.d q16 = dVar.q();
                boolean z16 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q16, this.f69965d, z16, 4);
            case 5:
                if (f()) {
                    return this;
                }
                o6.d q17 = dVar.q();
                boolean z17 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q17, this.f69965d, z17, 5);
            case 6:
                if (f()) {
                    return this;
                }
                o6.d q18 = dVar.q();
                boolean z18 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q18, this.f69965d, z18, 6);
            case 7:
                if (f()) {
                    return this;
                }
                o6.d q19 = dVar.q();
                boolean z19 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q19, this.f69965d, z19, 7);
            case 8:
                if (f()) {
                    return this;
                }
                o6.d q23 = dVar.q();
                boolean z23 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q23, this.f69965d, z23, 8);
            case 9:
                if (f()) {
                    return this;
                }
                o6.d q24 = dVar.q();
                boolean z24 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q24, this.f69965d, z24, 9);
            case 10:
                if (f()) {
                    return this;
                }
                o6.d q25 = dVar.q();
                boolean z25 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q25, this.f69965d, z25, 10);
            case 11:
                if (f()) {
                    return this;
                }
                o6.d q26 = dVar.q();
                boolean z26 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q26, this.f69965d, z26, 11);
            case 12:
                if (f()) {
                    return this;
                }
                o6.d q27 = dVar.q();
                boolean z27 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q27, this.f69965d, z27, 12);
            case 13:
                if (f()) {
                    return this;
                }
                o6.d q28 = dVar.q();
                boolean z28 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q28, this.f69965d, z28, 13);
            default:
                if (f()) {
                    return this;
                }
                o6.d q29 = dVar.q();
                boolean z29 = this.f69966e;
                return new k(this.f69962a, this.f69963b, q29, this.f69965d, z29, 14);
        }
    }

    @Override // hq2.l
    public final l m() {
        o6.d dVar;
        o6.d a13;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        f fVar = this.f69962a;
        o6.d[] dVarArr = this.f69965d;
        o6.d dVar2 = this.f69963b;
        o6.d dVar3 = this.f69964c;
        switch (this.f69960h) {
            case 0:
                if (f()) {
                    return this;
                }
                if (dVar3.m()) {
                    return fVar.j();
                }
                int i13 = fVar.f69949f;
                if (i13 == 0) {
                    o6.d s13 = dVar2.s();
                    o6.d d2 = s13.a(s13).a(s13).a(fVar.f69945b).d(dVar3.a(dVar3));
                    o6.d u13 = d2.s().u(dVar2.a(dVar2));
                    return new k(fVar, u13, d2.n(dVar2.u(u13)).u(dVar3), this.f69966e, 0);
                }
                if (i13 == 1) {
                    o6.d dVar4 = dVarArr[0];
                    boolean l13 = dVar4.l();
                    o6.d dVar5 = fVar.f69945b;
                    if (!dVar5.m() && !l13) {
                        dVar5 = dVar5.n(dVar4.s());
                    }
                    o6.d s14 = dVar2.s();
                    o6.d a14 = dVar5.a(s14.a(s14).a(s14));
                    o6.d n13 = l13 ? dVar3 : dVar3.n(dVar4);
                    o6.d s15 = l13 ? dVar3.s() : n13.n(dVar3);
                    o6.d n14 = dVar2.n(s15);
                    o6.d a15 = n14.a(n14);
                    o6.d a16 = a15.a(a15);
                    o6.d u14 = a14.s().u(a16.a(a16));
                    o6.d a17 = n13.a(n13);
                    o6.d n15 = u14.n(a17);
                    o6.d a18 = s15.a(s15);
                    o6.d n16 = a16.u(u14).n(a14);
                    o6.d s16 = a18.s();
                    o6.d u15 = n16.u(s16.a(s16));
                    o6.d a19 = l13 ? a18.a(a18) : a17.s();
                    return new k(fVar, n15, u15, new o6.d[]{a19.a(a19).n(n13)}, this.f69966e, 0);
                }
                if (i13 != 2) {
                    if (i13 != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    o6.d dVar6 = dVarArr[0];
                    o6.d dVar7 = dVarArr[1];
                    if (dVar7 == null) {
                        dVar7 = r(dVarArr[0], null);
                        dVarArr[1] = dVar7;
                    }
                    o6.d s17 = dVar2.s();
                    o6.d a23 = s17.a(s17).a(s17).a(dVar7);
                    o6.d a24 = dVar3.a(dVar3);
                    o6.d n17 = a24.n(dVar3);
                    o6.d n18 = dVar2.n(n17);
                    o6.d a25 = n18.a(n18);
                    o6.d u16 = a23.s().u(a25.a(a25));
                    o6.d s18 = n17.s();
                    o6.d a26 = s18.a(s18);
                    o6.d u17 = a23.n(a25.u(u16)).u(a26);
                    o6.d n19 = a26.n(dVar7);
                    o6.d a27 = n19.a(n19);
                    if (!dVar6.l()) {
                        a24 = a24.n(dVar6);
                    }
                    return new k(this.f69962a, u16, u17, new o6.d[]{a24, a27}, this.f69966e, 0);
                }
                o6.d dVar8 = dVarArr[0];
                boolean l14 = dVar8.l();
                o6.d s19 = dVar3.s();
                o6.d s22 = s19.s();
                o6.d dVar9 = fVar.f69945b;
                o6.d q13 = dVar9.q();
                if (q13.w().equals(BigInteger.valueOf(3L))) {
                    o6.d s23 = l14 ? dVar8 : dVar8.s();
                    o6.d n23 = dVar2.a(s23).n(dVar2.u(s23));
                    dVar = n23.a(n23).a(n23);
                    o6.d n24 = s19.n(dVar2);
                    o6.d a28 = n24.a(n24);
                    a13 = a28.a(a28);
                } else {
                    o6.d s24 = dVar2.s();
                    o6.d a29 = s24.a(s24).a(s24);
                    if (l14) {
                        dVar = a29.a(dVar9);
                    } else if (dVar9.m()) {
                        dVar = a29;
                    } else {
                        o6.d s25 = dVar8.s().s();
                        dVar = q13.c() < dVar9.c() ? a29.u(s25.n(q13)) : a29.a(s25.n(dVar9));
                    }
                    o6.d n25 = dVar2.n(s19);
                    o6.d a33 = n25.a(n25);
                    a13 = a33.a(a33);
                }
                o6.d u18 = dVar.s().u(a13.a(a13));
                o6.d n26 = a13.u(u18).n(dVar);
                o6.d a34 = s22.a(s22);
                o6.d a35 = a34.a(a34);
                o6.d u19 = n26.u(a35.a(a35));
                o6.d a36 = dVar3.a(dVar3);
                if (!l14) {
                    a36 = a36.n(dVar8);
                }
                return new k(fVar, u18, u19, new o6.d[]{a36}, this.f69966e, 0);
            case 1:
                if (f()) {
                    return this;
                }
                if (dVar3.m()) {
                    return fVar.j();
                }
                iq2.c cVar = (iq2.c) dVar2;
                iq2.c cVar2 = (iq2.c) dVar3;
                iq2.c cVar3 = (iq2.c) dVarArr[0];
                iq2.c cVar4 = (iq2.c) dVarArr[1];
                if (cVar4 == null) {
                    cVar4 = q((iq2.c) dVarArr[0], null);
                    dVarArr[1] = cVar4;
                }
                int[] iArr10 = {(int) r12, (int) r13, (int) r12, (int) r12, (int) r12, (int) r12, (int) r11, (int) r11};
                iq2.b.d(cVar.f73442e, iArr10);
                int c13 = he2.k.c(iArr10, iArr10, iArr10);
                int[] iArr11 = cVar4.f73442e;
                iq2.c cVar5 = cVar4;
                long j13 = (iArr11[0] & 4294967295L) + (iArr10[0] & 4294967295L);
                long j14 = (iArr11[1] & 4294967295L) + (iArr10[1] & 4294967295L) + (j13 >>> 32);
                long j15 = (iArr11[2] & 4294967295L) + (iArr10[2] & 4294967295L) + (j14 >>> 32);
                long j16 = (iArr11[3] & 4294967295L) + (iArr10[3] & 4294967295L) + (j15 >>> 32);
                long j17 = (iArr11[4] & 4294967295L) + (iArr10[4] & 4294967295L) + (j16 >>> 32);
                long j18 = (iArr11[5] & 4294967295L) + (iArr10[5] & 4294967295L) + (j17 >>> 32);
                long j19 = (iArr11[6] & 4294967295L) + (iArr10[6] & 4294967295L) + (j18 >>> 32);
                long j23 = (iArr11[7] & 4294967295L) + (iArr10[7] & 4294967295L) + (j19 >>> 32);
                iq2.b.c(iArr10, c13 + ((int) (j23 >>> 32)));
                int[] iArr12 = new int[8];
                int[] iArr13 = cVar2.f73442e;
                iq2.b.h(iArr13, iArr12);
                int[] iArr14 = new int[8];
                iq2.b.a(iArr12, iArr13, iArr14);
                int[] iArr15 = new int[8];
                iq2.b.a(iArr14, cVar.f73442e, iArr15);
                iq2.b.h(iArr15, iArr15);
                int[] iArr16 = new int[8];
                iq2.b.d(iArr14, iArr16);
                iq2.b.h(iArr16, iArr16);
                iq2.c cVar6 = new iq2.c(iArr14);
                iq2.b.d(iArr10, iArr14);
                iq2.b.g(iArr14, iArr15, iArr14);
                iq2.b.g(iArr14, iArr15, iArr14);
                iq2.c cVar7 = new iq2.c(iArr15);
                iq2.b.g(iArr15, iArr14, iArr15);
                iq2.b.a(iArr15, iArr10, iArr15);
                iq2.b.g(iArr15, iArr16, iArr15);
                iq2.c cVar8 = new iq2.c(iArr12);
                if (!he2.k.p(cVar3.f73442e)) {
                    iq2.b.a(iArr12, cVar3.f73442e, iArr12);
                }
                iq2.c cVar9 = new iq2.c(iArr16);
                iq2.b.a(iArr16, cVar5.f73442e, iArr16);
                iq2.b.h(iArr16, iArr16);
                return new k(this.f69962a, cVar6, cVar7, new o6.d[]{cVar8, cVar9}, this.f69966e, 1);
            case 2:
                if (f()) {
                    return this;
                }
                jq2.c cVar10 = (jq2.c) dVar3;
                boolean r13 = he2.k.r(cVar10.f77525e);
                f fVar2 = this.f69962a;
                if (r13) {
                    return fVar2.j();
                }
                jq2.c cVar11 = (jq2.c) dVar2;
                jq2.c cVar12 = (jq2.c) dVarArr[0];
                int[] iArr17 = new int[8];
                int[] iArr18 = new int[8];
                int[] iArr19 = new int[8];
                int[] iArr20 = cVar10.f77525e;
                jq2.b.f(iArr20, iArr19);
                int[] iArr21 = new int[8];
                jq2.b.f(iArr19, iArr21);
                boolean p13 = he2.k.p(cVar12.f77525e);
                int[] iArr22 = cVar12.f77525e;
                if (p13) {
                    iArr = iArr22;
                } else {
                    jq2.b.f(iArr22, iArr18);
                    iArr = iArr18;
                }
                jq2.b.h(cVar11.f77525e, iArr, iArr17);
                int[] iArr23 = cVar11.f77525e;
                jq2.b.a(iArr23, iArr, iArr18);
                jq2.b.c(iArr18, iArr17, iArr18);
                jq2.b.e(iArr18, he2.k.c(iArr18, iArr18, iArr18));
                jq2.b.c(iArr19, iArr23, iArr19);
                jq2.b.e(iArr19, j1.s1(8, iArr19));
                jq2.b.e(iArr17, j1.t1(8, iArr21, iArr17));
                jq2.c cVar13 = new jq2.c(iArr21);
                jq2.b.f(iArr18, iArr21);
                jq2.b.h(iArr21, iArr19, iArr21);
                jq2.b.h(iArr21, iArr19, iArr21);
                jq2.c cVar14 = new jq2.c(iArr19);
                jq2.b.h(iArr19, iArr21, iArr19);
                jq2.b.c(iArr19, iArr18, iArr19);
                jq2.b.h(iArr19, iArr17, iArr19);
                jq2.c cVar15 = new jq2.c(iArr18);
                if (j1.r1(8, 0, iArr20, iArr18) != 0 || ((iArr18[7] >>> 1) >= Integer.MAX_VALUE && he2.k.o(iArr18, jq2.b.f77522a))) {
                    jq2.b.b(iArr18);
                }
                if (!p13) {
                    jq2.b.c(iArr18, iArr22, iArr18);
                }
                return new k(fVar2, cVar13, cVar14, new o6.d[]{cVar15}, this.f69966e, 2);
            case 3:
                if (f()) {
                    return this;
                }
                kq2.c cVar16 = (kq2.c) dVar3;
                boolean g13 = j1.g1(cVar16.f80701e);
                f fVar3 = this.f69962a;
                if (g13) {
                    return fVar3.j();
                }
                kq2.c cVar17 = (kq2.c) dVar2;
                kq2.c cVar18 = (kq2.c) dVarArr[0];
                int[] iArr24 = new int[4];
                int[] iArr25 = new int[4];
                int[] iArr26 = new int[4];
                int[] iArr27 = cVar16.f80701e;
                kq2.b.u0(iArr27, iArr26);
                int[] iArr28 = new int[4];
                kq2.b.u0(iArr26, iArr28);
                boolean c14 = j1.c1(cVar18.f80701e);
                int[] iArr29 = cVar18.f80701e;
                if (c14) {
                    iArr2 = iArr29;
                } else {
                    kq2.b.u0(iArr29, iArr25);
                    iArr2 = iArr25;
                }
                kq2.b.U0(cVar17.f80701e, iArr2, iArr24);
                int[] iArr30 = cVar17.f80701e;
                kq2.b.a(iArr30, iArr2, iArr25);
                kq2.b.A(iArr25, iArr24, iArr25);
                kq2.b.j0(iArr25, j1.I(iArr25, iArr25, iArr25));
                kq2.b.A(iArr26, iArr30, iArr26);
                kq2.b.j0(iArr26, j1.s1(4, iArr26));
                kq2.b.j0(iArr24, j1.t1(4, iArr28, iArr24));
                kq2.c cVar19 = new kq2.c(iArr28);
                kq2.b.u0(iArr25, iArr28);
                kq2.b.U0(iArr28, iArr26, iArr28);
                kq2.b.U0(iArr28, iArr26, iArr28);
                kq2.c cVar20 = new kq2.c(iArr26);
                kq2.b.U0(iArr26, iArr28, iArr26);
                kq2.b.A(iArr26, iArr25, iArr26);
                kq2.b.U0(iArr26, iArr24, iArr26);
                kq2.c cVar21 = new kq2.c(iArr25);
                if (j1.r1(4, 0, iArr27, iArr25) != 0 || ((iArr25[3] >>> 1) >= 2147483646 && j1.k0(iArr25, kq2.b.f80673a))) {
                    kq2.b.i(iArr25);
                }
                if (!c14) {
                    kq2.b.A(iArr25, iArr29, iArr25);
                }
                return new k(fVar3, cVar19, cVar20, new o6.d[]{cVar21}, this.f69966e, 3);
            case 4:
                if (f()) {
                    return this;
                }
                kq2.h hVar = (kq2.h) dVar3;
                boolean S0 = p2.S0(hVar.f80716e);
                f fVar4 = this.f69962a;
                if (S0) {
                    return fVar4.j();
                }
                kq2.h hVar2 = (kq2.h) dVar2;
                kq2.h hVar3 = (kq2.h) dVarArr[0];
                int[] iArr31 = new int[5];
                int[] iArr32 = hVar.f80716e;
                kq2.b.z0(iArr32, iArr31);
                int[] iArr33 = new int[5];
                kq2.b.z0(iArr31, iArr33);
                int[] iArr34 = new int[5];
                kq2.b.z0(hVar2.f80716e, iArr34);
                kq2.b.l0(iArr34, p2.M(iArr34, iArr34, iArr34));
                kq2.b.F(iArr31, hVar2.f80716e, iArr31);
                kq2.b.l0(iArr31, j1.s1(5, iArr31));
                int[] iArr35 = new int[5];
                kq2.b.l0(iArr35, j1.t1(5, iArr33, iArr35));
                kq2.h hVar4 = new kq2.h(iArr33);
                kq2.b.z0(iArr34, iArr33);
                kq2.b.X0(iArr33, iArr31, iArr33);
                kq2.b.X0(iArr33, iArr31, iArr33);
                kq2.h hVar5 = new kq2.h(iArr31);
                kq2.b.X0(iArr31, iArr33, iArr31);
                kq2.b.F(iArr31, iArr34, iArr31);
                kq2.b.X0(iArr31, iArr35, iArr31);
                kq2.h hVar6 = new kq2.h(iArr34);
                kq2.b.f1(iArr32, iArr34);
                if (!p2.R0(hVar3.f80716e)) {
                    kq2.b.F(iArr34, hVar3.f80716e, iArr34);
                }
                return new k(fVar4, hVar4, hVar5, new o6.d[]{hVar6}, this.f69966e, 4);
            case 5:
                if (f()) {
                    return this;
                }
                kq2.f fVar5 = (kq2.f) dVar3;
                boolean S02 = p2.S0(fVar5.f80710e);
                f fVar6 = this.f69962a;
                if (S02) {
                    return fVar6.j();
                }
                kq2.f fVar7 = (kq2.f) dVar2;
                kq2.f fVar8 = (kq2.f) dVarArr[0];
                int[] iArr36 = new int[5];
                int[] iArr37 = new int[5];
                int[] iArr38 = new int[5];
                int[] iArr39 = fVar5.f80710e;
                kq2.b.w0(iArr39, iArr38);
                int[] iArr40 = new int[5];
                kq2.b.w0(iArr38, iArr40);
                boolean R0 = p2.R0(fVar8.f80710e);
                int[] iArr41 = fVar8.f80710e;
                if (R0) {
                    iArr3 = iArr41;
                } else {
                    kq2.b.w0(iArr41, iArr37);
                    iArr3 = iArr37;
                }
                kq2.b.V0(fVar7.f80710e, iArr3, iArr36);
                int[] iArr42 = fVar7.f80710e;
                int J2 = p2.J(iArr42, iArr3, iArr37);
                int[] iArr43 = kq2.b.f80676d;
                if (J2 != 0 || (iArr37[4] == -1 && p2.p0(iArr37, iArr43))) {
                    j1.M(5, -2147483647, iArr37);
                }
                kq2.b.C(iArr37, iArr36, iArr37);
                kq2.b.k0(iArr37, p2.M(iArr37, iArr37, iArr37));
                kq2.b.C(iArr38, iArr42, iArr38);
                kq2.b.k0(iArr38, j1.s1(5, iArr38));
                kq2.b.k0(iArr36, j1.t1(5, iArr40, iArr36));
                kq2.f fVar9 = new kq2.f(iArr40);
                kq2.b.w0(iArr37, iArr40);
                kq2.b.V0(iArr40, iArr38, iArr40);
                kq2.b.V0(iArr40, iArr38, iArr40);
                kq2.f fVar10 = new kq2.f(iArr38);
                kq2.b.V0(iArr38, iArr40, iArr38);
                kq2.b.C(iArr38, iArr37, iArr38);
                kq2.b.V0(iArr38, iArr36, iArr38);
                kq2.f fVar11 = new kq2.f(iArr37);
                if (j1.r1(5, 0, iArr39, iArr37) != 0 || (iArr37[4] == -1 && p2.p0(iArr37, iArr43))) {
                    j1.M(5, -2147483647, iArr37);
                }
                if (!R0) {
                    kq2.b.C(iArr37, iArr41, iArr37);
                }
                return new k(fVar6, fVar9, fVar10, new o6.d[]{fVar11}, this.f69966e, 5);
            case 6:
                if (f()) {
                    return this;
                }
                kq2.h hVar7 = (kq2.h) dVar3;
                boolean S03 = p2.S0(hVar7.f80716e);
                f fVar12 = this.f69962a;
                if (S03) {
                    return fVar12.j();
                }
                kq2.h hVar8 = (kq2.h) dVar2;
                kq2.h hVar9 = (kq2.h) dVarArr[0];
                int[] iArr44 = new int[5];
                int[] iArr45 = new int[5];
                int[] iArr46 = new int[5];
                int[] iArr47 = hVar7.f80716e;
                kq2.b.z0(iArr47, iArr46);
                int[] iArr48 = new int[5];
                kq2.b.z0(iArr46, iArr48);
                boolean R02 = p2.R0(hVar9.f80716e);
                int[] iArr49 = hVar9.f80716e;
                if (R02) {
                    iArr4 = iArr49;
                } else {
                    kq2.b.z0(iArr49, iArr45);
                    iArr4 = iArr45;
                }
                kq2.b.X0(hVar8.f80716e, iArr4, iArr44);
                int[] iArr50 = hVar8.f80716e;
                if (p2.J(iArr50, iArr4, iArr45) != 0 || (iArr45[4] == -1 && p2.p0(iArr45, kq2.b.f80679g))) {
                    j1.C(5, 21389, iArr45);
                }
                kq2.b.F(iArr45, iArr44, iArr45);
                kq2.b.l0(iArr45, p2.M(iArr45, iArr45, iArr45));
                kq2.b.F(iArr46, iArr50, iArr46);
                kq2.b.l0(iArr46, j1.s1(5, iArr46));
                kq2.b.l0(iArr44, j1.t1(5, iArr48, iArr44));
                kq2.h hVar10 = new kq2.h(iArr48);
                kq2.b.z0(iArr45, iArr48);
                kq2.b.X0(iArr48, iArr46, iArr48);
                kq2.b.X0(iArr48, iArr46, iArr48);
                kq2.h hVar11 = new kq2.h(iArr46);
                kq2.b.X0(iArr46, iArr48, iArr46);
                kq2.b.F(iArr46, iArr45, iArr46);
                kq2.b.X0(iArr46, iArr44, iArr46);
                kq2.h hVar12 = new kq2.h(iArr45);
                kq2.b.f1(iArr47, iArr45);
                if (!R02) {
                    kq2.b.F(iArr45, iArr49, iArr45);
                }
                return new k(fVar12, hVar10, hVar11, new o6.d[]{hVar12}, this.f69966e, 6);
            case 7:
                if (f()) {
                    return this;
                }
                kq2.j jVar = (kq2.j) dVar3;
                boolean b13 = r.b1(jVar.f80724e);
                f fVar13 = this.f69962a;
                if (b13) {
                    return fVar13.j();
                }
                kq2.j jVar2 = (kq2.j) dVar2;
                kq2.j jVar3 = (kq2.j) dVarArr[0];
                int[] iArr51 = new int[6];
                int[] iArr52 = jVar.f80724e;
                kq2.b.A0(iArr52, iArr51);
                int[] iArr53 = new int[6];
                kq2.b.A0(iArr51, iArr53);
                int[] iArr54 = new int[6];
                kq2.b.A0(jVar2.f80724e, iArr54);
                kq2.b.m0(iArr54, r.l(iArr54, iArr54, iArr54));
                kq2.b.H(iArr51, jVar2.f80724e, iArr51);
                kq2.b.m0(iArr51, j1.s1(6, iArr51));
                int[] iArr55 = new int[6];
                kq2.b.m0(iArr55, j1.t1(6, iArr53, iArr55));
                kq2.j jVar4 = new kq2.j(iArr53);
                kq2.b.A0(iArr54, iArr53);
                kq2.b.Y0(iArr53, iArr51, iArr53);
                kq2.b.Y0(iArr53, iArr51, iArr53);
                kq2.j jVar5 = new kq2.j(iArr51);
                kq2.b.Y0(iArr51, iArr53, iArr51);
                kq2.b.H(iArr51, iArr54, iArr51);
                kq2.b.Y0(iArr51, iArr55, iArr51);
                kq2.j jVar6 = new kq2.j(iArr54);
                if (j1.r1(6, 0, iArr52, iArr54) != 0 || (iArr54[5] == -1 && r.R(iArr54, kq2.b.f80682j))) {
                    j1.C(6, 4553, iArr54);
                }
                if (!r.X0(jVar3.f80724e)) {
                    kq2.b.H(iArr54, jVar3.f80724e, iArr54);
                }
                return new k(fVar13, jVar4, jVar5, new o6.d[]{jVar6}, this.f69966e, 7);
            case 8:
                if (f()) {
                    return this;
                }
                kq2.l lVar = (kq2.l) dVar3;
                boolean b14 = r.b1(lVar.f80728e);
                f fVar14 = this.f69962a;
                if (b14) {
                    return fVar14.j();
                }
                kq2.l lVar2 = (kq2.l) dVar2;
                kq2.l lVar3 = (kq2.l) dVarArr[0];
                int[] iArr56 = new int[6];
                int[] iArr57 = new int[6];
                int[] iArr58 = new int[6];
                int[] iArr59 = lVar.f80728e;
                kq2.b.B0(iArr59, iArr58);
                int[] iArr60 = new int[6];
                kq2.b.B0(iArr58, iArr60);
                boolean X0 = r.X0(lVar3.f80728e);
                int[] iArr61 = lVar3.f80728e;
                if (X0) {
                    iArr5 = iArr61;
                } else {
                    kq2.b.B0(iArr61, iArr57);
                    iArr5 = iArr57;
                }
                kq2.b.Z0(lVar2.f80728e, iArr5, iArr56);
                int[] iArr62 = lVar2.f80728e;
                int j24 = r.j(iArr62, iArr5, iArr57);
                int[] iArr63 = kq2.b.f80685m;
                if (j24 != 0 || (iArr57[5] == -1 && r.R(iArr57, iArr63))) {
                    kq2.b.j(iArr57);
                }
                kq2.b.J(iArr57, iArr56, iArr57);
                kq2.b.n0(iArr57, r.l(iArr57, iArr57, iArr57));
                kq2.b.J(iArr58, iArr62, iArr58);
                kq2.b.n0(iArr58, j1.s1(6, iArr58));
                kq2.b.n0(iArr56, j1.t1(6, iArr60, iArr56));
                kq2.l lVar4 = new kq2.l(iArr60);
                kq2.b.B0(iArr57, iArr60);
                kq2.b.Z0(iArr60, iArr58, iArr60);
                kq2.b.Z0(iArr60, iArr58, iArr60);
                kq2.l lVar5 = new kq2.l(iArr58);
                kq2.b.Z0(iArr58, iArr60, iArr58);
                kq2.b.J(iArr58, iArr57, iArr58);
                kq2.b.Z0(iArr58, iArr56, iArr58);
                kq2.l lVar6 = new kq2.l(iArr57);
                if (j1.r1(6, 0, iArr59, iArr57) != 0 || (iArr57[5] == -1 && r.R(iArr57, iArr63))) {
                    kq2.b.j(iArr57);
                }
                if (!X0) {
                    kq2.b.J(iArr57, iArr61, iArr57);
                }
                return new k(fVar14, lVar4, lVar5, new o6.d[]{lVar6}, this.f69966e, 8);
            case 9:
                if (f()) {
                    return this;
                }
                n nVar = (n) dVar3;
                boolean l03 = w.l0(nVar.f80733e);
                f fVar15 = this.f69962a;
                if (l03) {
                    return fVar15.j();
                }
                n nVar2 = (n) dVar2;
                n nVar3 = (n) dVarArr[0];
                int[] iArr64 = new int[7];
                int[] iArr65 = nVar.f80733e;
                kq2.b.C0(iArr65, iArr64);
                int[] iArr66 = new int[7];
                kq2.b.C0(iArr64, iArr66);
                int[] iArr67 = new int[7];
                kq2.b.C0(nVar2.f80733e, iArr67);
                kq2.b.o0(iArr67, w.q(iArr67, iArr67, iArr67));
                kq2.b.K(iArr64, nVar2.f80733e, iArr64);
                kq2.b.o0(iArr64, j1.s1(7, iArr64));
                int[] iArr68 = new int[7];
                kq2.b.o0(iArr68, j1.t1(7, iArr66, iArr68));
                n nVar4 = new n(iArr66);
                kq2.b.C0(iArr67, iArr66);
                kq2.b.a1(iArr66, iArr64, iArr66);
                kq2.b.a1(iArr66, iArr64, iArr66);
                n nVar5 = new n(iArr64);
                kq2.b.a1(iArr64, iArr66, iArr64);
                kq2.b.K(iArr64, iArr67, iArr64);
                kq2.b.a1(iArr64, iArr68, iArr64);
                n nVar6 = new n(iArr67);
                if (j1.r1(7, 0, iArr65, iArr67) != 0 || (iArr67[6] == -1 && w.T(iArr67, kq2.b.f80688p))) {
                    j1.C(7, 6803, iArr67);
                }
                if (!w.j0(nVar3.f80733e)) {
                    kq2.b.K(iArr67, nVar3.f80733e, iArr67);
                }
                return new k(fVar15, nVar4, nVar5, new o6.d[]{nVar6}, this.f69966e, 9);
            case 10:
                if (f()) {
                    return this;
                }
                p pVar = (p) dVar3;
                boolean l04 = w.l0(pVar.f80737e);
                f fVar16 = this.f69962a;
                if (l04) {
                    return fVar16.j();
                }
                p pVar2 = (p) dVar2;
                p pVar3 = (p) dVarArr[0];
                int[] iArr69 = new int[7];
                int[] iArr70 = new int[7];
                int[] iArr71 = new int[7];
                int[] iArr72 = pVar.f80737e;
                kq2.b.D0(iArr72, iArr71);
                int[] iArr73 = new int[7];
                kq2.b.D0(iArr71, iArr73);
                boolean j03 = w.j0(pVar3.f80737e);
                int[] iArr74 = pVar3.f80737e;
                if (j03) {
                    iArr6 = iArr74;
                } else {
                    kq2.b.D0(iArr74, iArr70);
                    iArr6 = iArr70;
                }
                kq2.b.b1(pVar2.f80737e, iArr6, iArr69);
                int[] iArr75 = pVar2.f80737e;
                kq2.b.c(iArr75, iArr6, iArr70);
                kq2.b.L(iArr70, iArr69, iArr70);
                kq2.b.p0(iArr70, w.q(iArr70, iArr70, iArr70));
                kq2.b.L(iArr71, iArr75, iArr71);
                kq2.b.p0(iArr71, j1.s1(7, iArr71));
                kq2.b.p0(iArr69, j1.t1(7, iArr73, iArr69));
                p pVar4 = new p(iArr73);
                kq2.b.D0(iArr70, iArr73);
                kq2.b.b1(iArr73, iArr71, iArr73);
                kq2.b.b1(iArr73, iArr71, iArr73);
                p pVar5 = new p(iArr71);
                kq2.b.b1(iArr71, iArr73, iArr71);
                kq2.b.L(iArr71, iArr70, iArr71);
                kq2.b.b1(iArr71, iArr69, iArr71);
                p pVar6 = new p(iArr70);
                kq2.b.g1(iArr72, iArr70);
                if (!j03) {
                    kq2.b.L(iArr70, iArr74, iArr70);
                }
                return new k(fVar16, pVar4, pVar5, new o6.d[]{pVar6}, this.f69966e, 10);
            case 11:
                if (f()) {
                    return this;
                }
                kq2.r rVar = (kq2.r) dVar3;
                boolean r14 = he2.k.r(rVar.f80741e);
                f fVar17 = this.f69962a;
                if (r14) {
                    return fVar17.j();
                }
                kq2.r rVar2 = (kq2.r) dVar2;
                kq2.r rVar3 = (kq2.r) dVarArr[0];
                int[] iArr76 = new int[8];
                int[] iArr77 = rVar.f80741e;
                kq2.b.E0(iArr77, iArr76);
                int[] iArr78 = new int[8];
                kq2.b.E0(iArr76, iArr78);
                int[] iArr79 = new int[8];
                kq2.b.E0(rVar2.f80741e, iArr79);
                kq2.b.q0(iArr79, he2.k.c(iArr79, iArr79, iArr79));
                kq2.b.M(iArr76, rVar2.f80741e, iArr76);
                kq2.b.q0(iArr76, j1.s1(8, iArr76));
                int[] iArr80 = new int[8];
                kq2.b.q0(iArr80, j1.t1(8, iArr78, iArr80));
                kq2.r rVar4 = new kq2.r(iArr78);
                kq2.b.E0(iArr79, iArr78);
                kq2.b.c1(iArr78, iArr76, iArr78);
                kq2.b.c1(iArr78, iArr76, iArr78);
                kq2.r rVar5 = new kq2.r(iArr76);
                kq2.b.c1(iArr76, iArr78, iArr76);
                kq2.b.M(iArr76, iArr79, iArr76);
                kq2.b.c1(iArr76, iArr80, iArr76);
                kq2.r rVar6 = new kq2.r(iArr79);
                if (j1.r1(8, 0, iArr77, iArr79) != 0 || (iArr79[7] == -1 && he2.k.o(iArr79, kq2.b.f80694v))) {
                    j1.C(8, 977, iArr79);
                }
                if (!he2.k.p(rVar3.f80741e)) {
                    kq2.b.M(iArr79, rVar3.f80741e, iArr79);
                }
                return new k(fVar17, rVar4, rVar5, new o6.d[]{rVar6}, this.f69966e, 11);
            case 12:
                if (f()) {
                    return this;
                }
                t tVar = (t) dVar3;
                boolean r15 = he2.k.r(tVar.f80745e);
                f fVar18 = this.f69962a;
                if (r15) {
                    return fVar18.j();
                }
                t tVar2 = (t) dVar2;
                t tVar3 = (t) dVarArr[0];
                int[] iArr81 = new int[8];
                int[] iArr82 = new int[8];
                int[] iArr83 = new int[8];
                int[] iArr84 = tVar.f80745e;
                kq2.b.F0(iArr84, iArr83);
                int[] iArr85 = new int[8];
                kq2.b.F0(iArr83, iArr85);
                boolean p14 = he2.k.p(tVar3.f80745e);
                int[] iArr86 = tVar3.f80745e;
                if (p14) {
                    iArr7 = iArr86;
                } else {
                    kq2.b.F0(iArr86, iArr82);
                    iArr7 = iArr82;
                }
                kq2.b.d1(tVar2.f80745e, iArr7, iArr81);
                int[] iArr87 = tVar2.f80745e;
                int b15 = he2.k.b(iArr87, iArr7, iArr82);
                int[] iArr88 = kq2.b.f80697y;
                if (b15 != 0 || (iArr82[7] == -1 && he2.k.o(iArr82, iArr88))) {
                    kq2.b.l(iArr82);
                }
                kq2.b.N(iArr82, iArr81, iArr82);
                kq2.b.r0(iArr82, he2.k.c(iArr82, iArr82, iArr82));
                kq2.b.N(iArr83, iArr87, iArr83);
                kq2.b.r0(iArr83, j1.s1(8, iArr83));
                kq2.b.r0(iArr81, j1.t1(8, iArr85, iArr81));
                t tVar4 = new t(iArr85);
                kq2.b.F0(iArr82, iArr85);
                kq2.b.d1(iArr85, iArr83, iArr85);
                kq2.b.d1(iArr85, iArr83, iArr85);
                t tVar5 = new t(iArr83);
                kq2.b.d1(iArr83, iArr85, iArr83);
                kq2.b.N(iArr83, iArr82, iArr83);
                kq2.b.d1(iArr83, iArr81, iArr83);
                t tVar6 = new t(iArr82);
                if (j1.r1(8, 0, iArr84, iArr82) != 0 || (iArr82[7] == -1 && he2.k.o(iArr82, iArr88))) {
                    kq2.b.l(iArr82);
                }
                if (!p14) {
                    kq2.b.N(iArr82, iArr86, iArr82);
                }
                return new k(fVar18, tVar4, tVar5, new o6.d[]{tVar6}, this.f69966e, 12);
            case 13:
                if (f()) {
                    return this;
                }
                v vVar = (v) dVar3;
                boolean m13 = vVar.m();
                f fVar19 = this.f69962a;
                if (m13) {
                    return fVar19.j();
                }
                v vVar2 = (v) dVar2;
                v vVar3 = (v) dVarArr[0];
                int[] iArr89 = new int[12];
                int[] iArr90 = new int[12];
                int[] iArr91 = new int[12];
                int[] iArr92 = vVar.f80749e;
                kq2.b.G0(iArr92, iArr91);
                int[] iArr93 = new int[12];
                kq2.b.G0(iArr91, iArr93);
                boolean l15 = vVar3.l();
                int[] iArr94 = vVar3.f80749e;
                if (l15) {
                    iArr8 = iArr94;
                } else {
                    kq2.b.G0(iArr94, iArr90);
                    iArr8 = iArr90;
                }
                kq2.b.e1(vVar2.f80749e, iArr8, iArr89);
                int[] iArr95 = vVar2.f80749e;
                int B = j1.B(12, iArr95, iArr8, iArr90);
                int[] iArr96 = kq2.b.A;
                if (B != 0 || (iArr90[11] == -1 && j1.j0(12, iArr90, iArr96))) {
                    kq2.b.m(iArr90);
                }
                kq2.b.O(iArr90, iArr89, iArr90);
                kq2.b.s0(iArr90, j1.H(12, iArr90, iArr90, iArr90));
                kq2.b.O(iArr91, iArr95, iArr91);
                kq2.b.s0(iArr91, j1.s1(12, iArr91));
                kq2.b.s0(iArr89, j1.t1(12, iArr93, iArr89));
                v vVar4 = new v(iArr93);
                kq2.b.G0(iArr90, iArr93);
                kq2.b.e1(iArr93, iArr91, iArr93);
                kq2.b.e1(iArr93, iArr91, iArr93);
                v vVar5 = new v(iArr91);
                kq2.b.e1(iArr91, iArr93, iArr91);
                kq2.b.O(iArr91, iArr90, iArr91);
                kq2.b.e1(iArr91, iArr89, iArr91);
                v vVar6 = new v(iArr90);
                if (j1.r1(12, 0, iArr92, iArr90) != 0 || (iArr90[11] == -1 && j1.j0(12, iArr90, iArr96))) {
                    kq2.b.m(iArr90);
                }
                if (!l15) {
                    kq2.b.O(iArr90, iArr94, iArr90);
                }
                return new k(fVar19, vVar4, vVar5, new o6.d[]{vVar6}, this.f69966e, 13);
            default:
                if (f()) {
                    return this;
                }
                x xVar = (x) dVar3;
                boolean m14 = xVar.m();
                f fVar20 = this.f69962a;
                if (m14) {
                    return fVar20.j();
                }
                x xVar2 = (x) dVar2;
                x xVar3 = (x) dVarArr[0];
                int[] iArr97 = new int[17];
                int[] iArr98 = new int[17];
                int[] iArr99 = new int[17];
                int[] iArr100 = xVar.f80753e;
                kq2.b.y0(iArr100, iArr99);
                int[] iArr101 = new int[17];
                kq2.b.y0(iArr99, iArr101);
                boolean l16 = xVar3.l();
                int[] iArr102 = xVar3.f80753e;
                if (l16) {
                    iArr9 = iArr102;
                } else {
                    kq2.b.y0(iArr102, iArr98);
                    iArr9 = iArr98;
                }
                kq2.b.W0(xVar2.f80753e, iArr9, iArr97);
                int[] iArr103 = xVar2.f80753e;
                kq2.b.d(iArr103, iArr9, iArr98);
                kq2.b.E(iArr98, iArr97, iArr98);
                j1.H(17, iArr98, iArr98, iArr98);
                kq2.b.i0(iArr98);
                kq2.b.E(iArr99, iArr103, iArr99);
                j1.s1(17, iArr99);
                kq2.b.i0(iArr99);
                j1.t1(17, iArr101, iArr97);
                kq2.b.i0(iArr97);
                x xVar4 = new x(iArr101);
                kq2.b.y0(iArr98, iArr101);
                kq2.b.W0(iArr101, iArr99, iArr101);
                kq2.b.W0(iArr101, iArr99, iArr101);
                x xVar5 = new x(iArr99);
                kq2.b.W0(iArr99, iArr101, iArr99);
                kq2.b.E(iArr99, iArr98, iArr99);
                kq2.b.W0(iArr99, iArr97, iArr99);
                x xVar6 = new x(iArr98);
                int i14 = iArr100[16];
                iArr98[16] = (j1.r1(16, i14 << 23, iArr100, iArr98) | (i14 << 1)) & 511;
                if (!l16) {
                    kq2.b.E(iArr98, iArr102, iArr98);
                }
                return new k(fVar20, xVar4, xVar5, new o6.d[]{xVar6}, this.f69966e, 14);
        }
    }

    public final iq2.c q(iq2.c cVar, int[] iArr) {
        iq2.c cVar2 = (iq2.c) this.f69962a.f69945b;
        if (he2.k.p(cVar.f73442e)) {
            return cVar2;
        }
        iq2.c cVar3 = new iq2.c(2);
        int[] iArr2 = new int[8];
        cVar3.f73442e = iArr2;
        if (iArr == null) {
            iq2.b.d(cVar.f73442e, iArr2);
            iArr = iArr2;
        }
        iq2.b.d(iArr, iArr2);
        iq2.b.a(iArr2, cVar2.f73442e, iArr2);
        return cVar3;
    }

    public final o6.d r(o6.d dVar, o6.d dVar2) {
        o6.d dVar3 = this.f69962a.f69945b;
        if (dVar3.m() || dVar.l()) {
            return dVar3;
        }
        if (dVar2 == null) {
            dVar2 = dVar.s();
        }
        o6.d s13 = dVar2.s();
        o6.d q13 = dVar3.q();
        return q13.c() < dVar3.c() ? s13.n(q13).q() : s13.n(dVar3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, o6.d dVar, o6.d dVar2, boolean z13, int i13) {
        super(fVar, dVar, dVar2, 1);
        this.f69960h = i13;
        switch (i13) {
            case 1:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 2:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 3:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 4:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 5:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 6:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 7:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 8:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 9:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 10:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 11:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 12:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 13:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            case 14:
                super(fVar, dVar, dVar2, 1);
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            default:
                if ((dVar == null) == (dVar2 == null)) {
                    this.f69966e = z13;
                    return;
                }
                throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, o6.d dVar, o6.d dVar2, o6.d[] dVarArr, boolean z13, int i13) {
        super(fVar, dVar, dVar2, dVarArr, 1);
        this.f69960h = i13;
        switch (i13) {
            case 1:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            case 2:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            case 3:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            case 4:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            case 5:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            case 6:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            case 7:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            case 8:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            case 9:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            case 10:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            case 11:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            case 12:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            case 13:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            case 14:
                super(fVar, dVar, dVar2, dVarArr, 1);
                this.f69966e = z13;
                break;
            default:
                this.f69966e = z13;
                break;
        }
    }
}
