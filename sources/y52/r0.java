package y52;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f137840r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x0 f137841s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(x0 x0Var, bl2.c cVar) {
        super(2, cVar);
        this.f137841s = x0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r0(this.f137841s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f137840r;
        if (i13 == 0) {
            ue.c.H(obj);
            x0 x0Var = this.f137841s;
            androidx.lifecycle.z viewLifecycleOwner = x0Var.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            q0 q0Var = new q0(x0Var, null);
            this.f137840r = 1;
            if (ao2.m0.f0(viewLifecycleOwner, rVar, q0Var, this) == aVar) {
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
