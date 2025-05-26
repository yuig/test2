package k8;

import a.cb;
import a7.f1;
import a7.g1;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import d7.n0;
import g8.m1;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j extends g1 {
    public static final j X = new j(new i());
    public final boolean G;
    public final boolean H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f78531J;
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
    public final boolean U;
    public final SparseArray V;
    public final SparseBooleanArray W;

    static {
        cb.s(1000, 1001, 1002, 1003, 1004);
        cb.s(1005, 1006, 1007, 1008, 1009);
        cb.s(1010, 1011, 1012, 1013, 1014);
        n0.Q(1015);
        n0.Q(1016);
        n0.Q(1017);
        n0.Q(1018);
    }

    public j(i iVar) {
        super(iVar);
        this.G = iVar.F;
        this.H = iVar.G;
        this.I = iVar.H;
        this.f78531J = iVar.I;
        this.K = iVar.f78530J;
        this.L = iVar.K;
        this.M = iVar.L;
        this.N = iVar.M;
        this.O = iVar.N;
        this.P = iVar.O;
        this.Q = iVar.P;
        this.R = iVar.Q;
        this.S = iVar.R;
        this.T = iVar.S;
        this.U = iVar.T;
        this.V = iVar.U;
        this.W = iVar.V;
    }

    public static boolean b(Map map, Map map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            m1 m1Var = (m1) entry.getKey();
            if (!map2.containsKey(m1Var) || !Objects.equals(entry.getValue(), map2.get(m1Var))) {
                return false;
            }
        }
        return true;
    }

    @Override // a7.g1
    public final f1 a() {
        return new i(this);
    }

    public final void c(int i13, m1 m1Var) {
        Map map = (Map) this.V.get(i13);
        if (map != null) {
            ep.b.A(map.get(m1Var));
        }
    }

    @Override // a7.g1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (super.equals(jVar) && this.G == jVar.G && this.H == jVar.H && this.I == jVar.I && this.f78531J == jVar.f78531J && this.K == jVar.K && this.L == jVar.L && this.M == jVar.M && this.N == jVar.N && this.O == jVar.O && this.P == jVar.P && this.Q == jVar.Q && this.R == jVar.R && this.S == jVar.S && this.T == jVar.T && this.U == jVar.U) {
            SparseBooleanArray sparseBooleanArray = this.W;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = jVar.W;
            if (sparseBooleanArray2.size() == size) {
                int i13 = 0;
                while (true) {
                    if (i13 >= size) {
                        SparseArray sparseArray = this.V;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = jVar.V;
                        if (sparseArray2.size() == size2) {
                            for (int i14 = 0; i14 < size2; i14++) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i14));
                                if (indexOfKey >= 0 && b((Map) sparseArray.valueAt(i14), (Map) sparseArray2.valueAt(indexOfKey))) {
                                }
                            }
                            return true;
                        }
                    } else {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i13)) < 0) {
                            break;
                        }
                        i13++;
                    }
                }
            }
        }
        return false;
    }

    @Override // a7.g1
    public final int hashCode() {
        return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.f78531J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 31) + (this.S ? 1 : 0)) * 31) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0);
    }
}
