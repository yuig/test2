package kd1;

import androidx.lifecycle.r;
import androidx.lifecycle.z;
import ao2.j0;
import ao2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f79251r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f79252s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, bl2.c cVar) {
        super(2, cVar);
        this.f79252s = kVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f79252s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f79251r;
        if (i13 == 0) {
            ue.c.H(obj);
            k kVar = this.f79252s;
            z viewLifecycleOwner = kVar.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            r rVar = r.STARTED;
            h hVar = new h(kVar, null);
            this.f79251r = 1;
            if (m0.f0(viewLifecycleOwner, rVar, hVar, this) == aVar) {
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
