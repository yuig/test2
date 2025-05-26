package jd1;

import h32.a4;
import h32.d4;
import h32.g0;
import nx.f0;

/* loaded from: classes5.dex */
public final class c extends uk1.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f75506g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f75507h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, f0 f0Var, int i13) {
        super(f0Var);
        this.f75506g = i13;
        this.f75507h = dVar;
    }

    @Override // uk1.d
    public final g0 f() {
        switch (this.f75506g) {
            case 0:
                return this.f75507h.k9();
            default:
                return null;
        }
    }

    @Override // uk1.d
    public final a4 i() {
        switch (this.f75506g) {
            case 0:
                return this.f75507h.x9();
            default:
                return a4.SHOPPING_PRODUCT_FILTER;
        }
    }

    @Override // uk1.d
    public final d4 j() {
        int i13 = this.f75506g;
        d dVar = this.f75507h;
        switch (i13) {
        }
        return dVar.getE0();
    }
}
