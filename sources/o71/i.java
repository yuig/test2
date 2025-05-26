package o71;

import a.cb;
import jk2.a1;
import kotlin.jvm.internal.Intrinsics;
import x02.a2;

/* loaded from: classes5.dex */
public final class i extends x {

    /* renamed from: l, reason: collision with root package name */
    public final m f93301l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.k f93302m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.k f93303n;

    /* renamed from: o, reason: collision with root package name */
    public final uk2.f f93304o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m environment) {
        super(environment.f93334b, environment.f93337e, environment.f93339g, (l0) environment.f93347o.getValue(), environment.f93338f, environment.f93336d, environment.f93333a, null);
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.f93301l = environment;
        xk2.n nVar = xk2.n.NONE;
        this.f93302m = xk2.m.a(nVar, new f(this, 1));
        this.f93303n = xk2.m.a(nVar, new f(this, 0));
        this.f93304o = cb.r("create(...)");
    }

    @Override // com.pinterest.feature.search.results.view.j
    public final void E0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (isBound()) {
            ((k71.o) getView()).F6(el.a.y(false, false, query, null, null, 0, ml1.b.DEFAULT_TRANSITION, 250));
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        l71.f[] fVarArr = {(l71.n) this.f93302m.getValue(), (l71.m) this.f93303n.getValue()};
        for (int i13 = 0; i13 < 2; i13++) {
            l71.f fVar = fVarArr[i13];
            l71.s sVar = fVar instanceof l71.s ? (l71.s) fVar : null;
            if (sVar != null) {
                sVar.f81962s.f106421o = new h(this);
            }
            this.f93397h.add(fVar);
            ((wk1.i) dataSources).b(fVar);
        }
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        String str;
        p3();
        uk2.d dVar = this.f93398i;
        if (dVar == null || (str = (String) dVar.S()) == null) {
            return;
        }
        xk2.k kVar = this.f93302m;
        if (((l71.n) kVar.getValue()).D(str)) {
            ((l71.n) kVar.getValue()).F(str);
        }
    }

    @Override // wk1.q, yk1.p
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public final void r3(k71.o view) {
        a1 a1Var;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onBind(view);
        l71.n nVar = (l71.n) this.f93302m.getValue();
        u51.b bVar = new u51.b(20, new g(this, 0));
        u51.b bVar2 = new u51.b(21, new g(this, 1));
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        uk2.f fVar = this.f93304o;
        addDisposable(fVar.F(bVar, bVar2, cVar, a2Var));
        nVar.f81966w = fVar;
        l71.s u33 = u3();
        if (u33 == null || (a1Var = u33.f81969z) == null) {
            return;
        }
        addDisposable(a1Var.F(new u51.b(22, new g(this, 2)), new u51.b(23, new g(this, 3)), cVar, a2Var));
    }
}
