package fk0;

import ao2.j0;
import ao2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f62317r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f62318s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f62318s = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f62318s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f62317r;
        if (i13 == 0) {
            ue.c.H(obj);
            q qVar = this.f62318s;
            androidx.lifecycle.z viewLifecycleOwner = qVar.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            o oVar = new o(qVar, null);
            this.f62317r = 1;
            if (m0.f0(viewLifecycleOwner, rVar, oVar, this) == aVar) {
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
