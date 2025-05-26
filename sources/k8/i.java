package k8;

import a7.f1;
import a7.g1;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends f1 {
    public boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f78530J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final SparseArray U;
    public final SparseBooleanArray V;

    public i() {
        this.U = new SparseArray();
        this.V = new SparseBooleanArray();
        this.F = true;
        this.G = false;
        this.H = true;
        this.I = false;
        this.f78530J = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = false;
        this.S = true;
        this.T = false;
    }

    @Override // a7.f1
    public final g1 a() {
        return new j(this);
    }

    @Override // a7.f1
    public final f1 c(int i13, boolean z13) {
        super.c(i13, z13);
        return this;
    }

    public final void d(boolean z13) {
        super.c(1, z13);
    }

    public i(j jVar) {
        super(jVar);
        this.F = jVar.G;
        this.G = jVar.H;
        this.H = jVar.I;
        this.I = jVar.f78531J;
        this.f78530J = jVar.K;
        this.K = jVar.L;
        this.L = jVar.M;
        this.M = jVar.N;
        this.N = jVar.O;
        this.O = jVar.P;
        this.P = jVar.Q;
        this.Q = jVar.R;
        this.R = jVar.S;
        this.S = jVar.T;
        this.T = jVar.U;
        SparseArray sparseArray = new SparseArray();
        int i13 = 0;
        while (true) {
            SparseArray sparseArray2 = jVar.V;
            if (i13 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i13), new HashMap((Map) sparseArray2.valueAt(i13)));
                i13++;
            } else {
                this.U = sparseArray;
                this.V = jVar.W.clone();
                return;
            }
        }
    }
}
