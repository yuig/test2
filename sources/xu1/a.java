package xu1;

import ao2.j0;
import do2.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f135941r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f135942s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f135942s = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f135942s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f135941r;
        if (i13 == 0) {
            ue.c.H(obj);
            d dVar = this.f135942s;
            t2 t2Var = dVar.f135955h;
            Boolean valueOf = Boolean.valueOf(dVar.f135954g.f135957a.get());
            this.f135941r = 1;
            t2Var.i(valueOf);
            if (Unit.f80348a == aVar) {
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
