package j1;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b3 implements u2 {

    /* renamed from: a, reason: collision with root package name */
    public final g1.t f74008a;

    /* renamed from: b, reason: collision with root package name */
    public final g1.u f74009b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74010c;

    /* renamed from: d, reason: collision with root package name */
    public final float f74011d;

    /* renamed from: e, reason: collision with root package name */
    public t f74012e;

    /* renamed from: f, reason: collision with root package name */
    public t f74013f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f74014g;

    /* renamed from: h, reason: collision with root package name */
    public f1 f74015h;

    /* renamed from: i, reason: collision with root package name */
    public float[][] f74016i;

    /* renamed from: j, reason: collision with root package name */
    public t f74017j;

    /* renamed from: k, reason: collision with root package name */
    public t f74018k;

    public b3(g1.t tVar, g1.u uVar, int i13, float f13) {
        this.f74008a = tVar;
        this.f74009b = uVar;
        this.f74010c = i13;
        this.f74011d = f13;
    }

    public final float c(int i13, int i14) {
        c0 c0Var;
        float a13;
        g1.t tVar = this.f74008a;
        if (i13 >= tVar.f63324b - 1) {
            a13 = i14;
        } else {
            int e13 = tVar.e(i13);
            int e14 = tVar.e(i13 + 1);
            if (i14 == e13) {
                a13 = e13;
            } else {
                int i15 = e14 - e13;
                Pair pair = (Pair) this.f74009b.h(tVar.e(i13));
                if (pair == null || (c0Var = (c0) pair.f80347b) == null) {
                    c0Var = g0.f74072c;
                }
                float f13 = i15;
                a13 = (c0Var.a((i14 - e13) / f13) * f13) + e13;
            }
        }
        return a13 / 1000;
    }

    public final void d(t tVar, t tVar2, t tVar3) {
        float[] fArr;
        float[] fArr2;
        t tVar4 = this.f74012e;
        g1.t tVar5 = this.f74008a;
        if (tVar4 == null) {
            this.f74012e = tVar.c();
            this.f74013f = tVar3.c();
            int i13 = tVar5.f63324b;
            float[] fArr3 = new float[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                fArr3[i14] = tVar5.e(i14) / 1000;
            }
            this.f74014g = fArr3;
        }
        if (this.f74015h != null && Intrinsics.d(this.f74017j, tVar) && Intrinsics.d(this.f74018k, tVar2)) {
            return;
        }
        boolean z13 = !Intrinsics.d(this.f74017j, tVar);
        boolean z14 = !Intrinsics.d(this.f74018k, tVar2);
        this.f74017j = tVar;
        this.f74018k = tVar2;
        int b13 = tVar.b();
        float[][] fArr4 = this.f74016i;
        int i15 = this.f74010c;
        g1.u uVar = this.f74009b;
        if (fArr4 == null) {
            int i16 = tVar5.f63324b;
            float[][] fArr5 = new float[i16][];
            for (int i17 = 0; i17 < i16; i17++) {
                int e13 = tVar5.e(i17);
                if (e13 != 0) {
                    if (e13 != i15) {
                        fArr = new float[b13];
                        Object h10 = uVar.h(e13);
                        Intrinsics.f(h10);
                        t tVar6 = (t) ((Pair) h10).f80346a;
                        for (int i18 = 0; i18 < b13; i18++) {
                            fArr[i18] = tVar6.a(i18);
                        }
                    } else if (uVar.b(e13)) {
                        fArr = new float[b13];
                        Object h13 = uVar.h(e13);
                        Intrinsics.f(h13);
                        t tVar7 = (t) ((Pair) h13).f80346a;
                        for (int i19 = 0; i19 < b13; i19++) {
                            fArr[i19] = tVar7.a(i19);
                        }
                    } else {
                        fArr2 = new float[b13];
                        for (int i23 = 0; i23 < b13; i23++) {
                            fArr2[i23] = tVar2.a(i23);
                        }
                    }
                    fArr2 = fArr;
                } else if (uVar.b(e13)) {
                    fArr = new float[b13];
                    Object h14 = uVar.h(e13);
                    Intrinsics.f(h14);
                    t tVar8 = (t) ((Pair) h14).f80346a;
                    for (int i24 = 0; i24 < b13; i24++) {
                        fArr[i24] = tVar8.a(i24);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[b13];
                    for (int i25 = 0; i25 < b13; i25++) {
                        fArr2[i25] = tVar.a(i25);
                    }
                }
                fArr5[i17] = fArr2;
            }
            this.f74016i = fArr5;
        } else {
            if (z13 && !uVar.b(0)) {
                float[][] fArr6 = this.f74016i;
                if (fArr6 == null) {
                    Intrinsics.r("values");
                    throw null;
                }
                int i26 = e.i(tVar5, 0);
                float[] fArr7 = new float[b13];
                for (int i27 = 0; i27 < b13; i27++) {
                    fArr7[i27] = tVar.a(i27);
                }
                fArr6[i26] = fArr7;
            }
            if (z14 && !uVar.b(i15)) {
                float[][] fArr8 = this.f74016i;
                if (fArr8 == null) {
                    Intrinsics.r("values");
                    throw null;
                }
                int i28 = e.i(tVar5, i15);
                float[] fArr9 = new float[b13];
                for (int i29 = 0; i29 < b13; i29++) {
                    fArr9[i29] = tVar2.a(i29);
                }
                fArr8[i28] = fArr9;
            }
        }
        float[] fArr10 = this.f74014g;
        if (fArr10 == null) {
            Intrinsics.r("times");
            throw null;
        }
        float[][] fArr11 = this.f74016i;
        if (fArr11 == null) {
            Intrinsics.r("values");
            throw null;
        }
        this.f74015h = new f1(fArr10, fArr11, this.f74011d);
    }

    @Override // j1.r2
    public final t g(long j13, t tVar, t tVar2, t tVar3) {
        int j14 = (int) e.j(this, j13 / 1000000);
        if (j14 < 0) {
            return tVar3;
        }
        d(tVar, tVar2, tVar3);
        int i13 = e.i(this.f74008a, j14);
        if (i13 < -1) {
            i13 = -(i13 + 2);
        }
        f1 f1Var = this.f74015h;
        if (f1Var == null) {
            Intrinsics.r("monoSpline");
            throw null;
        }
        float c13 = c(i13, j14);
        t tVar4 = this.f74013f;
        if (tVar4 == null) {
            Intrinsics.r("velocityVector");
            throw null;
        }
        float[] fArr = f1Var.f74057a;
        int length = fArr.length;
        float[][] fArr2 = f1Var.f74058b;
        int i14 = 0;
        int length2 = fArr2[0].length;
        float f13 = fArr[0];
        float[][] fArr3 = f1Var.f74059c;
        if (c13 > f13) {
            int i15 = length - 1;
            if (c13 < fArr[i15]) {
                while (true) {
                    if (i13 >= i15) {
                        break;
                    }
                    int i16 = i13 + 1;
                    float f14 = fArr[i16];
                    if (c13 <= f14) {
                        float f15 = fArr[i13];
                        float f16 = f14 - f15;
                        float f17 = (c13 - f15) / f16;
                        while (i14 < length2) {
                            tVar4.e(i14, f1.a(f16, f17, fArr2[i13][i14], fArr2[i16][i14], fArr3[i13][i14], fArr3[i16][i14]) / f16);
                            i14++;
                        }
                    } else {
                        i13 = i16;
                    }
                }
            } else {
                while (i14 < length2) {
                    tVar4.e(i14, fArr3[i15][i14]);
                    i14++;
                }
            }
        } else {
            for (int i17 = 0; i17 < length2; i17++) {
                tVar4.e(i17, fArr3[0][i17]);
            }
        }
        t tVar5 = this.f74013f;
        if (tVar5 != null) {
            return tVar5;
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
        int j14 = (int) e.j(this, j13 / 1000000);
        g1.u uVar = this.f74009b;
        if (uVar.c(j14)) {
            Object h10 = uVar.h(j14);
            Intrinsics.f(h10);
            return (t) ((Pair) h10).f80346a;
        }
        if (j14 >= this.f74010c) {
            return tVar2;
        }
        if (j14 <= 0) {
            return tVar;
        }
        d(tVar, tVar2, tVar3);
        int i13 = e.i(this.f74008a, j14);
        if (i13 < -1) {
            i13 = -(i13 + 2);
        }
        f1 f1Var = this.f74015h;
        if (f1Var == null) {
            Intrinsics.r("monoSpline");
            throw null;
        }
        float c13 = c(i13, j14);
        t tVar4 = this.f74012e;
        if (tVar4 == null) {
            Intrinsics.r("valueVector");
            throw null;
        }
        f1Var.b(c13, tVar4, i13);
        t tVar5 = this.f74012e;
        if (tVar5 != null) {
            return tVar5;
        }
        Intrinsics.r("valueVector");
        throw null;
    }

    @Override // j1.u2
    public final int r() {
        return this.f74010c;
    }
}
