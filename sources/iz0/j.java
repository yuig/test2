package iz0;

import android.view.View;
import ao2.j0;
import ao2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f73919r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f73920s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f73921t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, View view, bl2.c cVar) {
        super(2, cVar);
        this.f73920s = nVar;
        this.f73921t = view;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f73920s, this.f73921t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f73919r;
        if (i13 == 0) {
            ue.c.H(obj);
            n nVar = this.f73920s;
            androidx.lifecycle.z viewLifecycleOwner = nVar.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            i iVar = new i(nVar, this.f73921t, null);
            this.f73919r = 1;
            if (m0.f0(viewLifecycleOwner, rVar, iVar, this) == aVar) {
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
