package cj0;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f27861r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Fragment f27862s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f27863t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Fragment fragment, Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f27862s = fragment;
        this.f27863t = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r(this.f27862s, this.f27863t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f27861r;
        if (i13 == 0) {
            ue.c.H(obj);
            androidx.lifecycle.z viewLifecycleOwner = this.f27862s.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            q qVar = new q(this.f27863t, null);
            this.f27861r = 1;
            if (ao2.m0.f0(viewLifecycleOwner, rVar, qVar, this) == aVar) {
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
