package wn0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f130471r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f130472s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f130472s = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f130472s, cVar);
        fVar.f130471r = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((vn0.a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        vn0.a aVar2 = (vn0.a) this.f130471r;
        j jVar = this.f130472s;
        rk0.j jVar2 = jVar.f130488k1;
        if (jVar2 != null) {
            rk0.c.d(jVar2, aVar2.f126252a);
        }
        rk0.j jVar3 = jVar.f130488k1;
        if (jVar3 != null) {
            jVar3.l(aVar2.f126253b);
        }
        return Unit.f80348a;
    }
}
