package yq1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f139839r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f139840s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, bl2.c cVar) {
        super(2, cVar);
        this.f139840s = kVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f139840s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f139839r;
        if (i13 == 0) {
            ue.c.H(obj);
            k kVar = this.f139840s;
            androidx.lifecycle.z viewLifecycleOwner = kVar.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            e eVar = new e(kVar, null);
            this.f139839r = 1;
            if (ao2.m0.f0(viewLifecycleOwner, rVar, eVar, this) == aVar) {
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
