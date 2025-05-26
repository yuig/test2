package n7;

import a7.u0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements d7.r, d7.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f89414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f89415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f89416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f89417e;

    public /* synthetic */ e(Object obj, g8.v vVar, g8.a0 a0Var, int i13, int i14) {
        this.f89413a = i14;
        this.f89414b = obj;
        this.f89416d = vVar;
        this.f89417e = a0Var;
        this.f89415c = i13;
    }

    @Override // d7.i
    public final void accept(Object obj) {
        g8.h0 h0Var = (g8.h0) this.f89414b;
        ((g8.i0) obj).a(h0Var.f64276a, h0Var.f64277b, (g8.v) this.f89416d, (g8.a0) this.f89417e, this.f89415c);
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        switch (this.f89413a) {
            case 0:
                b bVar = (b) this.f89414b;
                u0 u0Var = (u0) this.f89416d;
                u0 u0Var2 = (u0) this.f89417e;
                c cVar = (c) obj;
                cVar.getClass();
                cVar.x(bVar, u0Var, u0Var2, this.f89415c);
                break;
            default:
                ((c) obj).getClass();
                break;
        }
    }

    public /* synthetic */ e(b bVar, u0 u0Var, u0 u0Var2, int i13) {
        this.f89413a = 0;
        this.f89414b = bVar;
        this.f89415c = i13;
        this.f89416d = u0Var;
        this.f89417e = u0Var2;
    }
}
