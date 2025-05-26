package i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class t2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f71300r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f71301s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f71301s = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new t2(this.f71301s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f71300r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f71300r = 1;
            if (lb.l0.S(16L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return this.f71301s.invoke(new Long(System.nanoTime()));
    }
}
