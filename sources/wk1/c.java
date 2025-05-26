package wk1;

import is1.s;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d1;
import nx.o0;
import x02.i2;
import yk1.v;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f130130a;

    /* renamed from: b, reason: collision with root package name */
    public qa2.n f130131b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f130132c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f130133d;

    /* renamed from: e, reason: collision with root package name */
    public final w f130134e;

    /* renamed from: f, reason: collision with root package name */
    public final ky.e f130135f;

    /* renamed from: g, reason: collision with root package name */
    public final uj2.q f130136g;

    /* renamed from: h, reason: collision with root package name */
    public final v f130137h;

    /* renamed from: i, reason: collision with root package name */
    public final sq0.f f130138i;

    /* renamed from: j, reason: collision with root package name */
    public final sq0.m f130139j;

    /* renamed from: k, reason: collision with root package name */
    public final i2 f130140k;

    /* renamed from: l, reason: collision with root package name */
    public final vr.a f130141l;

    /* renamed from: m, reason: collision with root package name */
    public final s f130142m;

    public c(b bVar) {
        uk1.d dVar = bVar.f130115b;
        Intrinsics.f(dVar);
        this.f130130a = dVar;
        qa2.n nVar = bVar.f130114a;
        Intrinsics.f(nVar);
        this.f130131b = nVar;
        o0 o0Var = bVar.f130116c;
        Intrinsics.f(o0Var);
        this.f130132c = o0Var;
        d1 d1Var = bVar.f130117d;
        Intrinsics.f(d1Var);
        this.f130133d = d1Var;
        w wVar = bVar.f130118e;
        Intrinsics.f(wVar);
        this.f130134e = wVar;
        Intrinsics.f(bVar.f130119f);
        ky.e eVar = bVar.f130120g;
        Intrinsics.f(eVar);
        this.f130135f = eVar;
        uj2.q qVar = bVar.f130125l;
        if (qVar == null) {
            Intrinsics.r("connectivityObservable");
            throw null;
        }
        this.f130136g = qVar;
        v vVar = bVar.f130121h;
        Intrinsics.f(vVar);
        this.f130137h = vVar;
        sq0.f fVar = bVar.f130122i;
        Intrinsics.f(fVar);
        this.f130138i = fVar;
        this.f130139j = bVar.f130123j;
        i2 i2Var = bVar.f130124k;
        Intrinsics.f(i2Var);
        this.f130140k = i2Var;
        Intrinsics.f(bVar.f130126m);
        vr.a aVar = bVar.f130127n;
        Intrinsics.f(aVar);
        this.f130141l = aVar;
        bVar.b();
        s sVar = bVar.f130129p;
        if (sVar != null) {
            this.f130142m = sVar;
        } else {
            Intrinsics.r("pinSwipePreferences");
            throw null;
        }
    }

    public final uj2.q a() {
        return this.f130136g;
    }

    public final w b() {
        return this.f130134e;
    }

    public final qa2.n c() {
        return this.f130131b;
    }

    public final sq0.f d() {
        return this.f130138i;
    }

    public final v e() {
        return this.f130137h;
    }

    public final void f(qa2.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.f130131b = nVar;
    }
}
