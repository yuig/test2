package jk2;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class h extends uj2.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76482a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.t[] f76483b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterable f76484c;

    /* renamed from: d, reason: collision with root package name */
    public final ak2.f f76485d;

    /* renamed from: e, reason: collision with root package name */
    public final int f76486e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f76487f = false;

    public h(uj2.t[] tVarArr, ArrayList arrayList, ak2.f fVar, int i13, int i14) {
        this.f76482a = i14;
        this.f76483b = tVarArr;
        this.f76484c = arrayList;
        this.f76485d = fVar;
        this.f76486e = i13;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        int length;
        int length2;
        int i13 = 0;
        switch (this.f76482a) {
            case 0:
                uj2.t[] tVarArr = this.f76483b;
                if (tVarArr == null) {
                    tVarArr = new uj2.t[8];
                    length = 0;
                    for (uj2.t tVar : this.f76484c) {
                        if (length == tVarArr.length) {
                            uj2.t[] tVarArr2 = new uj2.t[(length >> 2) + length];
                            System.arraycopy(tVarArr, 0, tVarArr2, 0, length);
                            tVarArr = tVarArr2;
                        }
                        tVarArr[length] = tVar;
                        length++;
                    }
                } else {
                    length = tVarArr.length;
                }
                int i14 = length;
                if (i14 == 0) {
                    bk2.d.complete(vVar);
                    break;
                } else {
                    g gVar = new g(i14, this.f76486e, vVar, this.f76485d, this.f76487f);
                    f[] fVarArr = gVar.f76466c;
                    int length3 = fVarArr.length;
                    gVar.f76464a.b(gVar);
                    while (i13 < length3 && !gVar.f76471h && !gVar.f76470g) {
                        tVarArr[i13].d(fVarArr[i13]);
                        i13++;
                    }
                }
            default:
                uj2.t[] tVarArr3 = this.f76483b;
                if (tVarArr3 == null) {
                    tVarArr3 = new uj2.t[8];
                    length2 = 0;
                    for (uj2.t tVar2 : this.f76484c) {
                        if (length2 == tVarArr3.length) {
                            uj2.t[] tVarArr4 = new uj2.t[(length2 >> 2) + length2];
                            System.arraycopy(tVarArr3, 0, tVarArr4, 0, length2);
                            tVarArr3 = tVarArr4;
                        }
                        tVarArr3[length2] = tVar2;
                        length2++;
                    }
                } else {
                    length2 = tVarArr3.length;
                }
                if (length2 == 0) {
                    bk2.d.complete(vVar);
                    break;
                } else {
                    a3 a3Var = new a3(length2, vVar, this.f76485d, this.f76487f);
                    int i15 = this.f76486e;
                    b3[] b3VarArr = a3Var.f76391c;
                    int length4 = b3VarArr.length;
                    for (int i16 = 0; i16 < length4; i16++) {
                        b3VarArr[i16] = new b3(a3Var, i15);
                    }
                    a3Var.lazySet(0);
                    a3Var.f76389a.b(a3Var);
                    while (i13 < length4 && !a3Var.f76394f) {
                        tVarArr3[i13].d(b3VarArr[i13]);
                        i13++;
                    }
                }
        }
    }
}
