package mq;

import ao2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f87960r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h0 f87961s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(h0 h0Var, bl2.c cVar) {
        super(2, cVar);
        this.f87961s = h0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c0(this.f87961s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f87960r;
        if (i13 == 0) {
            ue.c.H(obj);
            h0 h0Var = this.f87961s;
            androidx.lifecycle.z viewLifecycleOwner = h0Var.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            b0 b0Var = new b0(h0Var, null);
            this.f87960r = 1;
            if (m0.f0(viewLifecycleOwner, rVar, b0Var, this) == aVar) {
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
