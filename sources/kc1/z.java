package kc1;

import ao2.j0;
import ao2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f79187r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f79188s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0 d0Var, bl2.c cVar) {
        super(2, cVar);
        this.f79188s = d0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new z(this.f79188s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f79187r;
        if (i13 == 0) {
            ue.c.H(obj);
            d0 d0Var = this.f79188s;
            androidx.lifecycle.z viewLifecycleOwner = d0Var.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            y yVar = new y(d0Var, null);
            this.f79187r = 1;
            if (m0.f0(viewLifecycleOwner, rVar, yVar, this) == aVar) {
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
