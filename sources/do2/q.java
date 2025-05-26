package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class q extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public int f55900r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f55901s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f55902t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(bl2.c cVar, kotlin.jvm.internal.j0 j0Var, j jVar) {
        super(1, cVar);
        this.f55901s = jVar;
        this.f55902t = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new q(cVar, this.f55902t, this.f55901s);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((q) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f55900r;
        kotlin.jvm.internal.j0 j0Var = this.f55902t;
        if (i13 == 0) {
            ue.c.H(obj);
            fi.b bVar = eo2.j0.f59783a;
            Object obj2 = j0Var.f80434a;
            if (obj2 == bVar) {
                obj2 = null;
            }
            this.f55900r = 1;
            if (this.f55901s.emit(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        j0Var.f80434a = null;
        return Unit.f80348a;
    }
}
