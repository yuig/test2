package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class x1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f25367r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i2 f25368s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(i2 i2Var, bl2.c cVar) {
        super(2, cVar);
        this.f25368s = i2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x1(this.f25368s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f25367r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f25367r = 1;
            i2 i2Var = this.f25368s;
            i2Var.getClass();
            j2 j2Var = j2.Closed;
            w wVar = i2Var.f24842a;
            Object n13 = j1.n(wVar, j2Var, wVar.f25335k.h(), this);
            if (n13 != obj2) {
                n13 = Unit.f80348a;
            }
            if (n13 == obj2) {
                return obj2;
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
