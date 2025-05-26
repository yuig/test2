package l7;

import android.content.Context;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f81806a;

    /* renamed from: b, reason: collision with root package name */
    public final a7.j f81807b;

    /* renamed from: c, reason: collision with root package name */
    public final sp2.i f81808c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f81809d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f81810e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f81811f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f81812g;

    /* renamed from: h, reason: collision with root package name */
    public final int f81813h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f81814i;

    /* renamed from: j, reason: collision with root package name */
    public i0 f81815j;

    /* renamed from: k, reason: collision with root package name */
    public u0 f81816k;

    public l0(Context context, a7.j jVar, sp2.i iVar, z0 z0Var, Executor executor, n nVar, boolean z13, boolean z14, boolean z15) {
        this.f81806a = context;
        this.f81807b = jVar;
        this.f81808c = iVar;
        this.f81809d = z0Var;
        this.f81811f = executor;
        this.f81810e = nVar;
        SparseArray sparseArray = new SparseArray();
        this.f81812g = sparseArray;
        this.f81813h = 0;
        this.f81814i = z14;
        k0 k0Var = new k0(new a0(iVar, z0Var, z13, z14));
        sparseArray.put(1, k0Var);
        sparseArray.put(4, k0Var);
        sparseArray.put(2, new k0(new c(iVar, z0Var, z15)));
        sparseArray.put(3, new k0(new t0(iVar, z0Var)));
    }

    public final void a() {
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f81812g;
            if (i13 >= sparseArray.size()) {
                return;
            }
            k0 k0Var = (k0) sparseArray.get(sparseArray.keyAt(i13));
            if (!k0Var.f81805e) {
                k0Var.f81805e = true;
                k0Var.f81801a.f();
                x xVar = k0Var.f81802b;
                if (xVar != null) {
                    ((m) xVar).a();
                }
            }
            i13++;
        }
    }
}
