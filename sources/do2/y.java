package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class y extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56005r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f56006s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f56007t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(bl2.c cVar, kotlin.jvm.internal.j0 j0Var, j jVar) {
        super(2, cVar);
        this.f56006s = j0Var;
        this.f56007t = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new y(cVar, this.f56006s, this.f56007t);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((Unit) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56005r;
        if (i13 == 0) {
            ue.c.H(obj);
            kotlin.jvm.internal.j0 j0Var = this.f56006s;
            Object obj2 = j0Var.f80434a;
            if (obj2 == null) {
                return Unit.f80348a;
            }
            j0Var.f80434a = null;
            if (obj2 == eo2.j0.f59783a) {
                obj2 = null;
            }
            this.f56005r = 1;
            if (this.f56007t.emit(obj2, this) == aVar) {
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
