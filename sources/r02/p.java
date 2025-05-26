package r02;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f105783r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f105784s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f105784s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f105784s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f105783r;
        if (i13 == 0) {
            ue.c.H(obj);
            r rVar = this.f105784s;
            androidx.lifecycle.z viewLifecycleOwner = rVar.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar2 = androidx.lifecycle.r.STARTED;
            o oVar = new o(rVar, null);
            this.f105783r = 1;
            if (ao2.m0.f0(viewLifecycleOwner, rVar2, oVar, this) == aVar) {
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
