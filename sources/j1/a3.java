package j1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a3 implements u2 {

    /* renamed from: a, reason: collision with root package name */
    public final g1.t f73973a;

    /* renamed from: b, reason: collision with root package name */
    public final g1.u f73974b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73975c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f73976d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f73977e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f73978f;

    /* renamed from: g, reason: collision with root package name */
    public t f73979g;

    /* renamed from: h, reason: collision with root package name */
    public t f73980h;

    /* renamed from: i, reason: collision with root package name */
    public t f73981i;

    /* renamed from: j, reason: collision with root package name */
    public t f73982j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f73983k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f73984l;

    /* renamed from: m, reason: collision with root package name */
    public w f73985m;

    public a3(g1.t tVar, g1.u uVar, int i13, f0 f0Var) {
        this.f73973a = tVar;
        this.f73974b = uVar;
        this.f73975c = i13;
        this.f73976d = f0Var;
    }

    public final float c(int i13, int i14, boolean z13) {
        c0 c0Var;
        float f13;
        g1.t tVar = this.f73973a;
        if (i13 >= tVar.f63324b - 1) {
            f13 = i14;
        } else {
            int e13 = tVar.e(i13);
            int e14 = tVar.e(i13 + 1);
            if (i14 == e13) {
                f13 = e13;
            } else {
                int i15 = e14 - e13;
                z2 z2Var = (z2) this.f73974b.h(e13);
                if (z2Var == null || (c0Var = z2Var.f74341b) == null) {
                    c0Var = this.f73976d;
                }
                float f14 = i15;
                float a13 = c0Var.a((i14 - e13) / f14);
                if (z13) {
                    return a13;
                }
                f13 = (f14 * a13) + e13;
            }
        }
        return f13 / 1000;
    }

    public final void d(t tVar, t tVar2, t tVar3) {
        float[] fArr;
        float[] fArr2;
        boolean z13 = this.f73985m != null;
        t tVar4 = this.f73979g;
        g1.u uVar = this.f73974b;
        g1.t tVar5 = this.f73973a;
        if (tVar4 == null) {
            this.f73979g = tVar.c();
            this.f73980h = tVar3.c();
            int i13 = tVar5.f63324b;
            float[] fArr3 = new float[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                fArr3[i14] = tVar5.e(i14) / 1000;
            }
            this.f73978f = fArr3;
            int i15 = tVar5.f63324b;
            int[] iArr = new int[i15];
            for (int i16 = 0; i16 < i15; i16++) {
                z2 z2Var = (z2) uVar.h(tVar5.e(i16));
                int i17 = z2Var != null ? z2Var.f74342c : 0;
                if (i17 != 0) {
                    z13 = true;
                }
                iArr[i16] = i17;
            }
            this.f73977e = iArr;
        }
        if (z13) {
            if (this.f73985m != null) {
                t tVar6 = this.f73981i;
                if (tVar6 == null) {
                    Intrinsics.r("lastInitialValue");
                    throw null;
                }
                if (Intrinsics.d(tVar6, tVar)) {
                    t tVar7 = this.f73982j;
                    if (tVar7 == null) {
                        Intrinsics.r("lastTargetValue");
                        throw null;
                    }
                    if (Intrinsics.d(tVar7, tVar2)) {
                        return;
                    }
                }
            }
            this.f73981i = tVar;
            this.f73982j = tVar2;
            int b13 = tVar.b() + (tVar.b() % 2);
            this.f73983k = new float[b13];
            this.f73984l = new float[b13];
            int i18 = tVar5.f63324b;
            float[][] fArr4 = new float[i18][];
            for (int i19 = 0; i19 < i18; i19++) {
                int e13 = tVar5.e(i19);
                if (e13 != 0) {
                    if (e13 != this.f73975c) {
                        fArr = new float[b13];
                        Object h10 = uVar.h(e13);
                        Intrinsics.f(h10);
                        z2 z2Var2 = (z2) h10;
                        for (int i23 = 0; i23 < b13; i23++) {
                            fArr[i23] = z2Var2.f74340a.a(i23);
                        }
                    } else if (uVar.b(e13)) {
                        fArr = new float[b13];
                        Object h13 = uVar.h(e13);
                        Intrinsics.f(h13);
                        z2 z2Var3 = (z2) h13;
                        for (int i24 = 0; i24 < b13; i24++) {
                            fArr[i24] = z2Var3.f74340a.a(i24);
                        }
                    } else {
                        fArr2 = new float[b13];
                        for (int i25 = 0; i25 < b13; i25++) {
                            fArr2[i25] = tVar2.a(i25);
                        }
                    }
                    fArr2 = fArr;
                } else if (uVar.b(e13)) {
                    fArr = new float[b13];
                    Object h14 = uVar.h(e13);
                    Intrinsics.f(h14);
                    z2 z2Var4 = (z2) h14;
                    for (int i26 = 0; i26 < b13; i26++) {
                        fArr[i26] = z2Var4.f74340a.a(i26);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[b13];
                    for (int i27 = 0; i27 < b13; i27++) {
                        fArr2[i27] = tVar.a(i27);
                    }
                }
                fArr4[i19] = fArr2;
            }
            int[] iArr2 = this.f73977e;
            if (iArr2 == null) {
                Intrinsics.r("modes");
                throw null;
            }
            float[] fArr5 = this.f73978f;
            if (fArr5 == null) {
                Intrinsics.r("times");
                throw null;
            }
            this.f73985m = new w(iArr2, fArr5, fArr4);
        }
    }

    @Override // j1.r2
    public final t g(long j13, t tVar, t tVar2, t tVar3) {
        long j14 = e.j(this, j13 / 1000000);
        if (j14 < 0) {
            return tVar3;
        }
        d(tVar, tVar2, tVar3);
        int i13 = 0;
        if (this.f73985m == null) {
            t o13 = o((j14 - 1) * 1000000, tVar, tVar2, tVar3);
            t o14 = o(j14 * 1000000, tVar, tVar2, tVar3);
            int b13 = o13.b();
            while (i13 < b13) {
                t tVar4 = this.f73980h;
                if (tVar4 == null) {
                    Intrinsics.r("velocityVector");
                    throw null;
                }
                tVar4.e(i13, (o13.a(i13) - o14.a(i13)) * 1000.0f);
                i13++;
            }
            t tVar5 = this.f73980h;
            if (tVar5 != null) {
                return tVar5;
            }
            Intrinsics.r("velocityVector");
            throw null;
        }
        int i14 = (int) j14;
        int i15 = e.i(this.f73973a, i14);
        if (i15 < -1) {
            i15 = -(i15 + 2);
        }
        float c13 = c(i15, i14, false);
        w wVar = this.f73985m;
        if (wVar == null) {
            Intrinsics.r("arcSpline");
            throw null;
        }
        float[] fArr = this.f73984l;
        if (fArr == null) {
            Intrinsics.r("slopeArray");
            throw null;
        }
        v[][] vVarArr = wVar.f74286a;
        float f13 = vVarArr[0][0].f74257a;
        if (c13 < f13) {
            c13 = f13;
        } else if (c13 > vVarArr[vVarArr.length - 1][0].f74258b) {
            c13 = vVarArr[vVarArr.length - 1][0].f74258b;
        }
        int length = vVarArr.length;
        boolean z13 = false;
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = 0;
            int i18 = 0;
            while (i17 < fArr.length) {
                v vVar = vVarArr[i16][i18];
                if (c13 <= vVar.f74258b) {
                    if (vVar.f74274r) {
                        fArr[i17] = vVar.f74270n;
                        fArr[i17 + 1] = vVar.f74271o;
                    } else {
                        vVar.c(c13);
                        fArr[i17] = vVarArr[i16][i18].a();
                        fArr[i17 + 1] = vVarArr[i16][i18].b();
                    }
                    z13 = true;
                }
                i17 += 2;
                i18++;
            }
            if (z13) {
                break;
            }
        }
        float[] fArr2 = this.f73984l;
        if (fArr2 == null) {
            Intrinsics.r("slopeArray");
            throw null;
        }
        int length2 = fArr2.length;
        while (i13 < length2) {
            t tVar6 = this.f73980h;
            if (tVar6 == null) {
                Intrinsics.r("velocityVector");
                throw null;
            }
            float[] fArr3 = this.f73984l;
            if (fArr3 == null) {
                Intrinsics.r("slopeArray");
                throw null;
            }
            tVar6.e(i13, fArr3[i13]);
            i13++;
        }
        t tVar7 = this.f73980h;
        if (tVar7 != null) {
            return tVar7;
        }
        Intrinsics.r("velocityVector");
        throw null;
    }

    @Override // j1.u2
    public final int n() {
        return 0;
    }

    @Override // j1.r2
    public final t o(long j13, t tVar, t tVar2, t tVar3) {
        int i13;
        t tVar4 = tVar;
        t tVar5 = tVar2;
        int j14 = (int) e.j(this, j13 / 1000000);
        g1.u uVar = this.f73974b;
        if (uVar.b(j14)) {
            Object h10 = uVar.h(j14);
            Intrinsics.f(h10);
            return ((z2) h10).f74340a;
        }
        if (j14 >= this.f73975c) {
            return tVar5;
        }
        if (j14 <= 0) {
            return tVar4;
        }
        d(tVar4, tVar5, tVar3);
        w wVar = this.f73985m;
        int i14 = 0;
        g1.t tVar6 = this.f73973a;
        if (wVar == null) {
            int i15 = e.i(tVar6, j14);
            if (i15 < -1) {
                i15 = -(i15 + 2);
            }
            float c13 = c(i15, j14, true);
            int e13 = tVar6.e(i15);
            if (uVar.b(e13)) {
                Object h13 = uVar.h(e13);
                Intrinsics.f(h13);
                tVar4 = ((z2) h13).f74340a;
            }
            int e14 = tVar6.e(i15 + 1);
            if (uVar.b(e14)) {
                Object h14 = uVar.h(e14);
                Intrinsics.f(h14);
                tVar5 = ((z2) h14).f74340a;
            }
            t tVar7 = this.f73979g;
            if (tVar7 == null) {
                Intrinsics.r("valueVector");
                throw null;
            }
            int b13 = tVar7.b();
            for (int i16 = 0; i16 < b13; i16++) {
                t tVar8 = this.f73979g;
                if (tVar8 == null) {
                    Intrinsics.r("valueVector");
                    throw null;
                }
                float a13 = tVar4.a(i16);
                float a14 = tVar5.a(i16);
                p2 p2Var = q2.f74205a;
                tVar8.e(i16, (a14 * c13) + ((1 - c13) * a13));
            }
            t tVar9 = this.f73979g;
            if (tVar9 != null) {
                return tVar9;
            }
            Intrinsics.r("valueVector");
            throw null;
        }
        int i17 = e.i(tVar6, j14);
        if (i17 < -1) {
            i17 = -(i17 + 2);
        }
        float c14 = c(i17, j14, false);
        w wVar2 = this.f73985m;
        if (wVar2 == null) {
            Intrinsics.r("arcSpline");
            throw null;
        }
        float[] fArr = this.f73983k;
        if (fArr == null) {
            Intrinsics.r("posArray");
            throw null;
        }
        v[][] vVarArr = wVar2.f74286a;
        float f13 = vVarArr[0][0].f74257a;
        if (c14 < f13 || c14 > vVarArr[vVarArr.length - 1][0].f74258b) {
            if (c14 > vVarArr[vVarArr.length - 1][0].f74258b) {
                i13 = vVarArr.length - 1;
                f13 = vVarArr[vVarArr.length - 1][0].f74258b;
            } else {
                i13 = 0;
            }
            float f14 = c14 - f13;
            int i18 = 0;
            int i19 = 0;
            while (i18 < fArr.length) {
                v vVar = vVarArr[i13][i19];
                if (vVar.f74274r) {
                    float f15 = vVar.f74257a;
                    float f16 = vVar.f74267k;
                    float f17 = vVar.f74261e;
                    float f18 = vVar.f74259c;
                    fArr[i18] = (vVar.f74270n * f14) + ep.b.a(f17, f18, (f13 - f15) * f16, f18);
                    float f19 = (f13 - f15) * f16;
                    float f23 = vVar.f74262f;
                    float f24 = vVar.f74260d;
                    fArr[i18 + 1] = (vVar.f74271o * f14) + ep.b.a(f23, f24, f19, f24);
                } else {
                    vVar.c(f13);
                    v vVar2 = vVarArr[i13][i19];
                    fArr[i18] = (vVar2.a() * f14) + (vVar2.f74268l * vVar2.f74264h) + vVar2.f74270n;
                    v vVar3 = vVarArr[i13][i19];
                    fArr[i18 + 1] = (vVar3.b() * f14) + (vVar3.f74269m * vVar3.f74265i) + vVar3.f74271o;
                }
                i18 += 2;
                i19++;
            }
        } else {
            int length = vVarArr.length;
            int i23 = 0;
            boolean z13 = false;
            while (i23 < length) {
                int i24 = i14;
                int i25 = i24;
                while (i24 < fArr.length) {
                    v vVar4 = vVarArr[i23][i25];
                    if (c14 <= vVar4.f74258b) {
                        if (vVar4.f74274r) {
                            float f25 = vVar4.f74257a;
                            float f26 = vVar4.f74267k;
                            float f27 = vVar4.f74261e;
                            float f28 = vVar4.f74259c;
                            fArr[i24] = ep.b.a(f27, f28, (c14 - f25) * f26, f28);
                            float f29 = (c14 - f25) * f26;
                            float f33 = vVar4.f74262f;
                            float f34 = vVar4.f74260d;
                            fArr[i24 + 1] = ep.b.a(f33, f34, f29, f34);
                        } else {
                            vVar4.c(c14);
                            v vVar5 = vVarArr[i23][i25];
                            fArr[i24] = (vVar5.f74268l * vVar5.f74264h) + vVar5.f74270n;
                            fArr[i24 + 1] = (vVar5.f74269m * vVar5.f74265i) + vVar5.f74271o;
                        }
                        z13 = true;
                    }
                    i24 += 2;
                    i25++;
                }
                if (z13) {
                    break;
                }
                i23++;
                i14 = 0;
            }
        }
        float[] fArr2 = this.f73983k;
        if (fArr2 == null) {
            Intrinsics.r("posArray");
            throw null;
        }
        int length2 = fArr2.length;
        for (int i26 = 0; i26 < length2; i26++) {
            t tVar10 = this.f73979g;
            if (tVar10 == null) {
                Intrinsics.r("valueVector");
                throw null;
            }
            float[] fArr3 = this.f73983k;
            if (fArr3 == null) {
                Intrinsics.r("posArray");
                throw null;
            }
            tVar10.e(i26, fArr3[i26]);
        }
        t tVar11 = this.f73979g;
        if (tVar11 != null) {
            return tVar11;
        }
        Intrinsics.r("valueVector");
        throw null;
    }

    @Override // j1.u2
    public final int r() {
        return this.f73975c;
    }
}
