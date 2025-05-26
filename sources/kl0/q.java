package kl0;

import ao2.j0;
import ao2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f80109r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f80110s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f80110s = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q(this.f80110s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f80109r;
        if (i13 == 0) {
            ue.c.H(obj);
            z zVar = this.f80110s;
            androidx.lifecycle.z viewLifecycleOwner = zVar.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            p pVar = new p(zVar, null);
            this.f80109r = 1;
            if (m0.f0(viewLifecycleOwner, rVar, pVar, this) == aVar) {
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
