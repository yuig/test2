package rq;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class d3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f109141r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ gx.p f109142s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ gx.m f109143t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(gx.p pVar, gx.m mVar, bl2.c cVar) {
        super(2, cVar);
        this.f109142s = pVar;
        this.f109143t = mVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d3(this.f109142s, this.f109143t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d3) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f109141r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.i d2 = this.f109142s.f66277e.d();
            c3 c3Var = new c3(this.f109143t, null);
            this.f109141r = 1;
            if (lb.l0.I(d2, c3Var, this) == aVar) {
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
