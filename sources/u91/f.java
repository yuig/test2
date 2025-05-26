package u91;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f121217r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f121218s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, bl2.c cVar) {
        super(2, cVar);
        this.f121218s = hVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f121218s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f121217r;
        if (i13 == 0) {
            ue.c.H(obj);
            fr1.c cVar = this.f121218s.J0;
            if (cVar == null) {
                Intrinsics.r("complianceManager");
                throw null;
            }
            this.f121217r = 1;
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
