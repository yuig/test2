package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f77913r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0 f77914s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, bl2.c cVar) {
        super(2, cVar);
        this.f77914s = l0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k0(this.f77914s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f77913r;
        if (i13 == 0) {
            ue.c.H(obj);
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
            l0 l0Var = this.f77914s;
            do2.f2 f2Var = ((o1.l) l0Var.f77919n).f92764a;
            j0 j0Var = new j0(h0Var, h0Var2, h0Var3, l0Var, 0);
            this.f77913r = 1;
            f2Var.getClass();
            if (do2.f2.j(f2Var, j0Var, this) == aVar) {
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
