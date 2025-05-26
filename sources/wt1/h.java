package wt1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes2.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f131117r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f131118s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f131119t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ yk1.n f131120u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yk1.n nVar, d dVar, e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f131118s = dVar;
        this.f131119t = eVar;
        this.f131120u = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f131120u, this.f131118s, this.f131119t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f131117r;
        if (i13 == 0) {
            ue.c.H(obj);
            d dVar = this.f131118s;
            do2.i a13 = dVar.a();
            g gVar = new g(this.f131120u, dVar, this.f131119t, null);
            this.f131117r = 1;
            if (l0.I(a13, gVar, this) == aVar) {
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
