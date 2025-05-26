package kk2;

import uj2.f0;

/* loaded from: classes2.dex */
public final class h extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79946a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f79947b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.a f79948c;

    public h(f0 f0Var, ak2.a aVar, int i13) {
        this.f79946a = i13;
        this.f79947b = f0Var;
        this.f79948c = aVar;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        int i13 = this.f79946a;
        f0 f0Var = this.f79947b;
        ak2.a aVar = this.f79948c;
        switch (i13) {
            case 0:
                ((uj2.b0) f0Var).p(new f(d0Var, aVar, 1));
                break;
            default:
                ((uj2.b0) f0Var).p(new i(d0Var, aVar));
                break;
        }
    }
}
