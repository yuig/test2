package r02;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f105716r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e0 f105717s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e0 e0Var, bl2.c cVar) {
        super(2, cVar);
        this.f105717s = e0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a0(this.f105717s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f105716r;
        if (i13 == 0) {
            ue.c.H(obj);
            e0 e0Var = this.f105717s;
            androidx.lifecycle.z viewLifecycleOwner = e0Var.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            z zVar = new z(e0Var, null);
            this.f105716r = 1;
            if (ao2.m0.f0(viewLifecycleOwner, rVar, zVar, this) == aVar) {
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
