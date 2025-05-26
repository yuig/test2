package pu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f101353r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f101354s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f101354s = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i0(this.f101354s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f101353r;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = this.f101354s;
            androidx.lifecycle.z viewLifecycleOwner = j0Var.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            h0 h0Var = new h0(j0Var, null);
            this.f101353r = 1;
            if (ao2.m0.f0(viewLifecycleOwner, rVar, h0Var, this) == aVar) {
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
