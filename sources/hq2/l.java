package hq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public abstract class l {

    /* renamed from: f, reason: collision with root package name */
    public static final o6.d[] f69961f = new o6.d[0];

    /* renamed from: a, reason: collision with root package name */
    public final f f69962a;

    /* renamed from: b, reason: collision with root package name */
    public final o6.d f69963b;

    /* renamed from: c, reason: collision with root package name */
    public final o6.d f69964c;

    /* renamed from: d, reason: collision with root package name */
    public final o6.d[] f69965d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f69966e;

    public l(f fVar, o6.d dVar, o6.d dVar2, o6.d[] dVarArr) {
        this.f69962a = fVar;
        this.f69963b = dVar;
        this.f69964c = dVar2;
        this.f69965d = dVarArr;
    }

    public abstract l a(l lVar);

    public final boolean b(l lVar) {
        l lVar2;
        if (lVar == null) {
            return false;
        }
        f fVar = lVar.f69962a;
        f fVar2 = this.f69962a;
        boolean z13 = fVar2 == null;
        boolean z14 = fVar == null;
        boolean f13 = f();
        boolean f14 = lVar.f();
        if (f13 || f14) {
            if (f13 && f14) {
                return z13 || z14 || fVar2.g(fVar);
            }
            return false;
        }
        if (!z13 || !z14) {
            if (!z13) {
                if (z14) {
                    lVar2 = j();
                } else {
                    if (!fVar2.g(fVar)) {
                        return false;
                    }
                    l[] lVarArr = {this, fVar2.k(lVar)};
                    for (int i13 = 0; i13 < 2; i13++) {
                        l lVar3 = lVarArr[i13];
                        if (lVar3 != null && fVar2 != lVar3.f69962a) {
                            throw new IllegalArgumentException("'points' entries must be null or on this curve");
                        }
                    }
                    int i14 = fVar2.f69949f;
                    if (i14 != 0 && i14 != 5) {
                        o6.d[] dVarArr = new o6.d[2];
                        int[] iArr = new int[2];
                        int i15 = 0;
                        for (int i16 = 0; i16 < 2; i16++) {
                            l lVar4 = lVarArr[i16];
                            if (lVar4 != null && !lVar4.g()) {
                                dVarArr[i15] = lVar4.e();
                                iArr[i15] = i16;
                                i15++;
                            }
                        }
                        if (i15 != 0) {
                            o6.d[] dVarArr2 = new o6.d[i15];
                            dVarArr2[0] = dVarArr[0];
                            int i17 = 0;
                            while (true) {
                                int i18 = i17 + 1;
                                if (i18 >= i15) {
                                    break;
                                }
                                dVarArr2[i18] = dVarArr2[i17].n(dVarArr[i18]);
                                i17 = i18;
                            }
                            o6.d k13 = dVarArr2[i17].k();
                            while (i17 > 0) {
                                int i19 = i17 - 1;
                                o6.d dVar = dVarArr[i17];
                                dVarArr[i17] = dVarArr2[i19].n(k13);
                                k13 = k13.n(dVar);
                                i17 = i19;
                            }
                            dVarArr[0] = k13;
                            for (int i23 = 0; i23 < i15; i23++) {
                                int i24 = iArr[i23];
                                lVarArr[i24] = lVarArr[i24].k(dVarArr[i23]);
                            }
                        }
                    }
                    lVar2 = lVarArr[0];
                    lVar = lVarArr[1];
                }
                return lVar2.f69963b.equals(lVar.f69963b) && lVar2.d().equals(lVar.d());
            }
            lVar = lVar.j();
        }
        lVar2 = this;
        if (lVar2.f69963b.equals(lVar.f69963b)) {
            return false;
        }
    }

    public final int c() {
        f fVar = this.f69962a;
        if (fVar == null) {
            return 0;
        }
        return fVar.f69949f;
    }

    public o6.d d() {
        return this.f69964c;
    }

    public o6.d e() {
        o6.d[] dVarArr = this.f69965d;
        if (dVarArr.length <= 0) {
            return null;
        }
        return dVarArr[0];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return b((l) obj);
        }
        return false;
    }

    public final boolean f() {
        if (this.f69963b != null && this.f69964c != null) {
            o6.d[] dVarArr = this.f69965d;
            if (dVarArr.length <= 0 || !dVarArr[0].m()) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        int c13 = c();
        return c13 == 0 || c13 == 5 || f() || this.f69965d[0].l();
    }

    public final boolean h() {
        boolean equals;
        o6.d p13;
        o6.d t13;
        if (!f() && this.f69962a != null) {
            i iVar = (i) this;
            o6.d dVar = iVar.f69963b;
            o6.d[] dVarArr = iVar.f69965d;
            o6.d dVar2 = iVar.f69964c;
            f fVar = iVar.f69962a;
            switch (iVar.f69958g) {
                case 0:
                    o6.d dVar3 = fVar.f69945b;
                    o6.d dVar4 = fVar.f69946c;
                    int i13 = fVar.f69949f;
                    if (i13 != 6) {
                        o6.d n13 = dVar2.a(dVar).n(dVar2);
                        if (i13 != 0) {
                            if (i13 != 1) {
                                throw new IllegalStateException("unsupported coordinate system");
                            }
                            o6.d dVar5 = dVarArr[0];
                            if (!dVar5.l()) {
                                o6.d n14 = dVar5.n(dVar5.s());
                                n13 = n13.n(dVar5);
                                dVar3 = dVar3.n(dVar5);
                                dVar4 = dVar4.n(n14);
                            }
                        }
                        equals = n13.equals(dVar.a(dVar3).n(dVar.s()).a(dVar4));
                        break;
                    } else {
                        o6.d dVar6 = dVarArr[0];
                        boolean l13 = dVar6.l();
                        if (!dVar.m()) {
                            o6.d s13 = dVar.s();
                            if (l13) {
                                p13 = d7.g.p(dVar2, dVar2, dVar3);
                                t13 = s13.s().a(dVar4);
                            } else {
                                o6.d s14 = dVar6.s();
                                o6.d s15 = s14.s();
                                p13 = dVar2.a(dVar6).p(dVar2, dVar3, s14);
                                t13 = s13.t(dVar4, s15);
                            }
                            equals = p13.n(s13).equals(t13);
                            break;
                        } else {
                            o6.d s16 = dVar2.s();
                            if (!l13) {
                                dVar4 = dVar4.n(dVar6.s());
                            }
                            equals = s16.equals(dVar4);
                            break;
                        }
                    }
                default:
                    o6.d dVar7 = fVar.f69945b;
                    o6.d dVar8 = fVar.f69946c;
                    o6.d s17 = dVar2.s();
                    int c13 = iVar.c();
                    if (c13 != 0) {
                        if (c13 == 1) {
                            o6.d dVar9 = dVarArr[0];
                            if (!dVar9.l()) {
                                o6.d s18 = dVar9.s();
                                o6.d n15 = dVar9.n(s18);
                                s17 = s17.n(dVar9);
                                dVar7 = dVar7.n(s18);
                                dVar8 = dVar8.n(n15);
                            }
                        } else {
                            if (c13 != 2 && c13 != 3 && c13 != 4) {
                                throw new IllegalStateException("unsupported coordinate system");
                            }
                            o6.d dVar10 = dVarArr[0];
                            if (!dVar10.l()) {
                                o6.d s19 = dVar10.s();
                                o6.d s22 = s19.s();
                                o6.d n16 = s19.n(s22);
                                dVar7 = dVar7.n(s22);
                                dVar8 = dVar8.n(n16);
                            }
                        }
                    }
                    equals = s17.equals(dVar.s().a(dVar7).n(dVar).a(dVar8));
                    break;
            }
            if (!equals || !l()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        f fVar = this.f69962a;
        int i13 = fVar == null ? 0 : ~fVar.hashCode();
        if (f()) {
            return i13;
        }
        l j13 = j();
        return (i13 ^ (j13.f69963b.hashCode() * 17)) ^ (j13.d().hashCode() * RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER);
    }

    public abstract l i();

    public final l j() {
        int c13;
        if (f() || (c13 = c()) == 0 || c13 == 5) {
            return this;
        }
        o6.d e13 = e();
        return e13.l() ? this : k(e13.k());
    }

    public final l k(o6.d dVar) {
        int c13 = c();
        if (c13 != 1) {
            if (c13 == 2 || c13 == 3 || c13 == 4) {
                o6.d s13 = dVar.s();
                o6.d n13 = s13.n(dVar);
                return this.f69962a.d(this.f69963b.n(s13), this.f69964c.n(n13), this.f69966e);
            }
            if (c13 != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return this.f69962a.d(this.f69963b.n(dVar), this.f69964c.n(dVar), this.f69966e);
    }

    public final boolean l() {
        f fVar = this.f69962a;
        BigInteger bigInteger = fVar.f69948e;
        if (bigInteger == null || bigInteger.equals(a.f69934b)) {
            return true;
        }
        BigInteger abs = bigInteger.abs();
        l j13 = fVar.j();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                j13 = this;
            }
            l lVar = this;
            for (int i13 = 1; i13 < bitLength; i13++) {
                lVar = lVar.m();
                if (abs.testBit(i13)) {
                    j13 = j13.a(lVar);
                }
            }
        }
        if (bigInteger.signum() < 0) {
            j13 = j13.i();
        }
        return !j13.f();
    }

    public abstract l m();

    public final String toString() {
        if (f()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        stringBuffer.append(this.f69963b);
        stringBuffer.append(',');
        stringBuffer.append(this.f69964c);
        int i13 = 0;
        while (true) {
            o6.d[] dVarArr = this.f69965d;
            if (i13 >= dVarArr.length) {
                stringBuffer.append(')');
                return stringBuffer.toString();
            }
            stringBuffer.append(',');
            stringBuffer.append(dVarArr[i13]);
            i13++;
        }
    }
}
