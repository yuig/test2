package eo2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class z extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f59854r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ do2.i f59855s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f59856t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f59857u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ co2.b0 f59858v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ do2.j f59859w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kl2.l f59860x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ao2.x f59861y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(do2.i iVar, CoroutineContext coroutineContext, Object obj, co2.b0 b0Var, do2.j jVar, kl2.l lVar, ao2.x xVar, bl2.c cVar) {
        super(2, cVar);
        this.f59855s = iVar;
        this.f59856t = coroutineContext;
        this.f59857u = obj;
        this.f59858v = b0Var;
        this.f59859w = jVar;
        this.f59860x = lVar;
        this.f59861y = xVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new z(this.f59855s, this.f59856t, this.f59857u, this.f59858v, this.f59859w, this.f59860x, this.f59861y, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((Unit) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f59854r;
        if (i13 == 0) {
            ue.c.H(obj);
            yc.t tVar = new yc.t(this.f59856t, this.f59857u, this.f59858v, this.f59859w, this.f59860x, this.f59861y);
            this.f59854r = 1;
            if (this.f59855s.collect(tVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
