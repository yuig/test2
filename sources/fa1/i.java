package fa1;

import ao2.j0;
import e82.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f61565r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f61566s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f61567t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f61568u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, boolean z13, w wVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f61565r = nVar;
        this.f61566s = z13;
        this.f61567t = wVar;
        this.f61568u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f61565r, this.f61566s, this.f61567t, this.f61568u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        n nVar = this.f61565r;
        xj2.b bVar = nVar.f61587h;
        e82.f fVar = nVar.f61582c;
        w wVar = this.f61567t;
        boolean z13 = this.f61566s;
        kk2.b c13 = fVar.c(wVar, z13);
        r rVar = this.f61568u;
        bVar.a(c13.o(new c(6, new r1.f(z13, rVar, 26)), new c(7, new g(rVar, 2))));
        return Unit.f80348a;
    }
}
