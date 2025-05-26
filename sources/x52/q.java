package x52;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.z;
import ao2.j0;
import ao2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f133907r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Fragment f133908s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.r f133909t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function2 f133910u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Fragment fragment, androidx.lifecycle.r rVar, Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f133908s = fragment;
        this.f133909t = rVar;
        this.f133910u = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q(this.f133908s, this.f133909t, this.f133910u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f133907r;
        if (i13 == 0) {
            ue.c.H(obj);
            z viewLifecycleOwner = this.f133908s.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            p pVar = new p(this.f133910u, null);
            this.f133907r = 1;
            if (m0.f0(viewLifecycleOwner, this.f133909t, pVar, this) == aVar) {
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
