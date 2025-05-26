package t4;

import kh2.c3;

/* loaded from: classes3.dex */
public final class b extends c3 {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f116343a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f116344b;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r5 == r3) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(int[] r29, double[] r30, double[][] r31) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.b.<init>(int[], double[], double[][]):void");
    }

    @Override // kh2.c3
    public final double F(double d2) {
        a[] aVarArr = this.f116344b;
        a aVar = aVarArr[0];
        double d13 = aVar.f116327c;
        if (d2 < d13) {
            double d14 = d2 - d13;
            if (aVar.f116342r) {
                return (d14 * aVarArr[0].f116336l) + aVar.c(d13);
            }
            aVar.g(d13);
            return (aVarArr[0].a() * d14) + aVarArr[0].e();
        }
        if (d2 > aVarArr[aVarArr.length - 1].f116328d) {
            double d15 = aVarArr[aVarArr.length - 1].f116328d;
            double d16 = d2 - d15;
            int length = aVarArr.length - 1;
            return (d16 * aVarArr[length].f116336l) + aVarArr[length].c(d15);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            a aVar2 = aVarArr[i13];
            if (d2 <= aVar2.f116328d) {
                if (aVar2.f116342r) {
                    return aVar2.c(d2);
                }
                aVar2.g(d2);
                return aVarArr[i13].e();
            }
        }
        return Double.NaN;
    }

    @Override // kh2.c3
    public final void G(double d2, double[] dArr) {
        a[] aVarArr = this.f116344b;
        a aVar = aVarArr[0];
        double d13 = aVar.f116327c;
        if (d2 < d13) {
            double d14 = d2 - d13;
            if (aVar.f116342r) {
                double c13 = aVar.c(d13);
                a aVar2 = aVarArr[0];
                dArr[0] = (aVar2.f116336l * d14) + c13;
                dArr[1] = (d14 * aVarArr[0].f116337m) + aVar2.d(d13);
                return;
            }
            aVar.g(d13);
            dArr[0] = (aVarArr[0].a() * d14) + aVarArr[0].e();
            dArr[1] = (aVarArr[0].b() * d14) + aVarArr[0].f();
            return;
        }
        if (d2 <= aVarArr[aVarArr.length - 1].f116328d) {
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                a aVar3 = aVarArr[i13];
                if (d2 <= aVar3.f116328d) {
                    if (aVar3.f116342r) {
                        dArr[0] = aVar3.c(d2);
                        dArr[1] = aVarArr[i13].d(d2);
                        return;
                    } else {
                        aVar3.g(d2);
                        dArr[0] = aVarArr[i13].e();
                        dArr[1] = aVarArr[i13].f();
                        return;
                    }
                }
            }
            return;
        }
        double d15 = aVarArr[aVarArr.length - 1].f116328d;
        double d16 = d2 - d15;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (aVar4.f116342r) {
            double c14 = aVar4.c(d15);
            a aVar5 = aVarArr[length];
            dArr[0] = (aVar5.f116336l * d16) + c14;
            dArr[1] = (d16 * aVarArr[length].f116337m) + aVar5.d(d15);
            return;
        }
        aVar4.g(d2);
        dArr[0] = (aVarArr[length].a() * d16) + aVarArr[length].e();
        dArr[1] = (aVarArr[length].b() * d16) + aVarArr[length].f();
    }

    @Override // kh2.c3
    public final void H(double d2, float[] fArr) {
        a[] aVarArr = this.f116344b;
        a aVar = aVarArr[0];
        double d13 = aVar.f116327c;
        if (d2 < d13) {
            double d14 = d2 - d13;
            if (aVar.f116342r) {
                double c13 = aVar.c(d13);
                a aVar2 = aVarArr[0];
                fArr[0] = (float) ((aVar2.f116336l * d14) + c13);
                fArr[1] = (float) ((d14 * aVarArr[0].f116337m) + aVar2.d(d13));
                return;
            }
            aVar.g(d13);
            fArr[0] = (float) ((aVarArr[0].a() * d14) + aVarArr[0].e());
            fArr[1] = (float) ((aVarArr[0].b() * d14) + aVarArr[0].f());
            return;
        }
        if (d2 <= aVarArr[aVarArr.length - 1].f116328d) {
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                a aVar3 = aVarArr[i13];
                if (d2 <= aVar3.f116328d) {
                    if (aVar3.f116342r) {
                        fArr[0] = (float) aVar3.c(d2);
                        fArr[1] = (float) aVarArr[i13].d(d2);
                        return;
                    } else {
                        aVar3.g(d2);
                        fArr[0] = (float) aVarArr[i13].e();
                        fArr[1] = (float) aVarArr[i13].f();
                        return;
                    }
                }
            }
            return;
        }
        double d15 = aVarArr[aVarArr.length - 1].f116328d;
        double d16 = d2 - d15;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (!aVar4.f116342r) {
            aVar4.g(d2);
            fArr[0] = (float) aVarArr[length].e();
            fArr[1] = (float) aVarArr[length].f();
        } else {
            double c14 = aVar4.c(d15);
            a aVar5 = aVarArr[length];
            fArr[0] = (float) ((aVar5.f116336l * d16) + c14);
            fArr[1] = (float) ((d16 * aVarArr[length].f116337m) + aVar5.d(d15));
        }
    }

    @Override // kh2.c3
    public final double I(double d2) {
        a[] aVarArr = this.f116344b;
        double d13 = aVarArr[0].f116327c;
        if (d2 < d13) {
            d2 = d13;
        }
        if (d2 > aVarArr[aVarArr.length - 1].f116328d) {
            d2 = aVarArr[aVarArr.length - 1].f116328d;
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            a aVar = aVarArr[i13];
            if (d2 <= aVar.f116328d) {
                if (aVar.f116342r) {
                    return aVar.f116336l;
                }
                aVar.g(d2);
                return aVarArr[i13].a();
            }
        }
        return Double.NaN;
    }

    @Override // kh2.c3
    public final void J(double d2, double[] dArr) {
        a[] aVarArr = this.f116344b;
        double d13 = aVarArr[0].f116327c;
        if (d2 < d13) {
            d2 = d13;
        } else if (d2 > aVarArr[aVarArr.length - 1].f116328d) {
            d2 = aVarArr[aVarArr.length - 1].f116328d;
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            a aVar = aVarArr[i13];
            if (d2 <= aVar.f116328d) {
                if (aVar.f116342r) {
                    dArr[0] = aVar.f116336l;
                    dArr[1] = aVar.f116337m;
                    return;
                } else {
                    aVar.g(d2);
                    dArr[0] = aVarArr[i13].a();
                    dArr[1] = aVarArr[i13].b();
                    return;
                }
            }
        }
    }

    @Override // kh2.c3
    public final double[] K() {
        return this.f116343a;
    }
}
