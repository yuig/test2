package rd;

import java.util.ArrayDeque;
import pd.g0;
import pd.t;
import td.a0;

/* loaded from: classes.dex */
public final class g extends he.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f107499d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f107500e;

    public g(long j13) {
        super(j13);
    }

    @Override // he.k
    public final int b(Object obj) {
        switch (this.f107499d) {
            case 0:
                g0 g0Var = (g0) obj;
                if (g0Var == null) {
                    return 1;
                }
                return g0Var.a();
            default:
                return 1;
        }
    }

    @Override // he.k
    public final void c(Object obj, Object obj2) {
        switch (this.f107499d) {
            case 0:
                g0 g0Var = (g0) obj2;
                h hVar = (h) this.f107500e;
                if (hVar == null || g0Var == null) {
                    return;
                }
                ((t) hVar).f99759e.i(g0Var, true);
                return;
            default:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                ArrayDeque arrayDeque = a0.f117366d;
                synchronized (arrayDeque) {
                    arrayDeque.offer(a0Var);
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar) {
        super(500L);
        this.f107500e = jVar;
    }
}
