package l9;

import android.util.SparseArray;
import q8.e0;
import q8.k0;
import q8.u;

/* loaded from: classes.dex */
public final class m implements u {

    /* renamed from: a, reason: collision with root package name */
    public final u f82321a;

    /* renamed from: b, reason: collision with root package name */
    public final j f82322b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f82323c = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public boolean f82324d;

    public m(u uVar, j jVar) {
        this.f82321a = uVar;
        this.f82322b = jVar;
    }

    @Override // q8.u
    public final void A() {
        this.f82321a.A();
        if (!this.f82324d) {
            return;
        }
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f82323c;
            if (i13 >= sparseArray.size()) {
                return;
            }
            ((n) sparseArray.valueAt(i13)).f82334j = true;
            i13++;
        }
    }

    @Override // q8.u
    public final k0 D(int i13, int i14) {
        u uVar = this.f82321a;
        if (i14 != 3) {
            this.f82324d = true;
            return uVar.D(i13, i14);
        }
        SparseArray sparseArray = this.f82323c;
        n nVar = (n) sparseArray.get(i13);
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(uVar.D(i13, i14), this.f82322b);
        sparseArray.put(i13, nVar2);
        return nVar2;
    }

    @Override // q8.u
    public final void j(e0 e0Var) {
        this.f82321a.j(e0Var);
    }
}
