package w82;

import androidx.lifecycle.r;
import androidx.lifecycle.z;
import ao2.j0;
import ao2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128471r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f128472s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f128472s = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f128472s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128471r;
        if (i13 == 0) {
            ue.c.H(obj);
            i iVar = this.f128472s;
            z viewLifecycleOwner = iVar.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            r rVar = r.STARTED;
            f fVar = new f(iVar, null);
            this.f128471r = 1;
            if (m0.f0(viewLifecycleOwner, rVar, fVar, this) == aVar) {
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
