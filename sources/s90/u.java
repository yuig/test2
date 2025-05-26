package s90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f112026r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f112027s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f112027s = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u(this.f112027s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f112026r;
        if (i13 == 0) {
            ue.c.H(obj);
            v vVar = this.f112027s;
            androidx.lifecycle.z viewLifecycleOwner = vVar.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            t tVar = new t(vVar, null);
            this.f112026r = 1;
            if (ao2.m0.f0(viewLifecycleOwner, rVar, tVar, this) == aVar) {
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
