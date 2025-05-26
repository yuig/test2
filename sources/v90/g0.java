package v90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final class g0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f124896r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0 f124897s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, bl2.c cVar) {
        super(2, cVar);
        this.f124897s = i0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g0(this.f124897s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f124896r;
        if (i13 == 0) {
            ue.c.H(obj);
            IntRange intRange = i0.f124904q0;
            i0 i0Var = this.f124897s;
            do2.i d2 = ((l1) i0Var.f124905c0.getValue()).f124942j.d();
            f0 f0Var = new f0(i0Var, null);
            this.f124896r = 1;
            if (lb.l0.I(d2, f0Var, this) == aVar) {
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
