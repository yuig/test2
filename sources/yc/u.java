package yc;

import kotlin.Unit;
import kotlin.jvm.internal.j0;

/* loaded from: classes3.dex */
public final class u implements do2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ do2.i f138677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ad.b f138678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pc.f f138679c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f138680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f138681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pc.v f138682f;

    public u(vc.k kVar, ad.b bVar, pc.f fVar, j0 j0Var, x xVar, pc.v vVar) {
        this.f138677a = kVar;
        this.f138678b = bVar;
        this.f138679c = fVar;
        this.f138680d = j0Var;
        this.f138681e = xVar;
        this.f138682f = vVar;
    }

    @Override // do2.i
    public final Object collect(do2.j jVar, bl2.c cVar) {
        Object collect = this.f138677a.collect(new t(jVar, this.f138678b, this.f138679c, this.f138680d, this.f138681e, this.f138682f), cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }
}
