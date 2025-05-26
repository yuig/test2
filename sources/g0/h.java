package g0;

import com.google.common.util.concurrent.c0;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements r4.j, a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f63200b;

    public /* synthetic */ h(int i13, c0 c0Var) {
        this.f63199a = i13;
        this.f63200b = c0Var;
    }

    @Override // r4.j
    public Object C(r4.i iVar) {
        int i13 = this.f63199a;
        c0 c0Var = this.f63200b;
        switch (i13) {
            case 0:
                c0Var.d(new j(iVar, 0), l3.c.s());
                return "transformVoidFuture [" + c0Var + "]";
            default:
                m.h(false, c0Var, iVar, l3.c.s());
                return "nonCancellationPropagating[" + c0Var + "]";
        }
    }

    @Override // g0.a
    public c0 apply(Object obj) {
        int i13 = this.f63199a;
        c0 c0Var = this.f63200b;
        switch (i13) {
            case 0:
                return ((d0.j) c0Var.get()).a();
            default:
                return ((d0.j) c0Var.get()).b();
        }
    }
}
