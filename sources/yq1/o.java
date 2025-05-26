package yq1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f139926r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f139927s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f139927s = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f139927s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f139926r;
        if (i13 == 0) {
            ue.c.H(obj);
            fr1.c cVar = this.f139927s.f139951h0;
            if (cVar == null) {
                Intrinsics.r("complianceManager");
                throw null;
            }
            this.f139926r = 1;
            if (cVar.b(this) == aVar) {
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
