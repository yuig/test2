package mq;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import x02.i2;

/* loaded from: classes3.dex */
public final class t extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88017r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f88018s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f88018s = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new t(this.f88018s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88017r;
        u uVar = this.f88018s;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                i2 i2Var = uVar.f88035w0;
                if (i2Var == null) {
                    Intrinsics.r("pinRepository");
                    throw null;
                }
                do2.c a13 = kotlin.jvm.internal.j.a(i2Var.z());
                s sVar = new s(uVar, null);
                this.f88017r = 1;
                if (l0.I(a13, sVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
        } catch (Exception e13) {
            int i14 = u.P0;
            uVar.j8("Error in startPinModelDeletionObservation", e13);
        }
        return Unit.f80348a;
    }
}
