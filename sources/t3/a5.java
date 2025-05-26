package t3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a5 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f115848r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d5 f115849s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(d5 d5Var, bl2.c cVar) {
        super(2, cVar);
        this.f115849s = d5Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a5(this.f115849s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a5) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f115848r;
        if (i13 == 0) {
            ue.c.H(obj);
            c0 c0Var = this.f115849s.f115942a;
            this.f115848r = 1;
            Object n13 = c0Var.f115891l.n(this);
            if (n13 != aVar) {
                n13 = Unit.f80348a;
            }
            if (n13 == aVar) {
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
