package bx1;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import m60.w;
import tu.d0;
import yq1.u1;

/* loaded from: classes4.dex */
public final class s extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final d0 f24116c;

    /* renamed from: d, reason: collision with root package name */
    public final sw1.b f24117d;

    /* renamed from: e, reason: collision with root package name */
    public final w f24118e;

    /* renamed from: f, reason: collision with root package name */
    public final zw1.g f24119f;

    /* renamed from: g, reason: collision with root package name */
    public final y f24120g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(j0 scope, d0 featureSEP, sw1.b navigationSEP, w eventManager) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(featureSEP, "featureSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f24116c = featureSEP;
        this.f24117d = navigationSEP;
        this.f24118e = eventManager;
        int i13 = 1;
        this.f24119f = new zw1.g(this, i13);
        a0 a0Var = new a0(scope);
        rw1.f stateTransformer = new rw1.f(i13);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        this.f24120g = a0.b(a0Var, new r(), new u1(this, 29), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f24120g.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f24120g.e();
    }

    @Override // l82.b, androidx.lifecycle.l1
    public final void g() {
        super.g();
        zw1.g gVar = this.f24119f;
        w wVar = this.f24118e;
        synchronized (wVar.f85945b) {
            wVar.f85945b.remove(gVar);
        }
    }

    public final void h() {
        this.f24118e.a(this.f24119f);
    }
}
