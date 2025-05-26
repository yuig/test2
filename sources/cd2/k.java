package cd2;

import androidx.lifecycle.r;
import androidx.lifecycle.z;
import ao2.j0;
import ao2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f27562r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f27563s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f27563s = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f27563s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f27562r;
        if (i13 == 0) {
            ue.c.H(obj);
            l lVar = this.f27563s;
            z viewLifecycleOwner = lVar.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            r rVar = r.STARTED;
            j jVar = new j(lVar, null);
            this.f27562r = 1;
            if (m0.f0(viewLifecycleOwner, rVar, jVar, this) == aVar) {
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
