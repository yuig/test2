package mu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88220r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p0 f88221s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, bl2.c cVar) {
        super(2, cVar);
        this.f88221s = p0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o0(this.f88221s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88220r;
        if (i13 == 0) {
            ue.c.H(obj);
            p0 p0Var = this.f88221s;
            androidx.lifecycle.z viewLifecycleOwner = p0Var.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            n0 n0Var = new n0(p0Var, null);
            this.f88220r = 1;
            if (ao2.m0.f0(viewLifecycleOwner, rVar, n0Var, this) == aVar) {
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
