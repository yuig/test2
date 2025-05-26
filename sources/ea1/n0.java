package ea1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f58086r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v0 f58087s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(v0 v0Var, bl2.c cVar) {
        super(2, cVar);
        this.f58087s = v0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n0(this.f58087s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f58086r;
        if (i13 == 0) {
            ue.c.H(obj);
            v0 v0Var = this.f58087s;
            androidx.lifecycle.z viewLifecycleOwner = v0Var.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            m0 m0Var = new m0(v0Var, null);
            this.f58086r = 1;
            if (ao2.m0.f0(viewLifecycleOwner, rVar, m0Var, this) == aVar) {
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
