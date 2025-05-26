package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class t0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f78011r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u0 f78012s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, bl2.c cVar) {
        super(2, cVar);
        this.f78012s = u0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new t0(this.f78012s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f78011r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f78011r = 1;
            if (androidx.compose.foundation.relocation.a.c(this.f78012s, null, this) == aVar) {
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
