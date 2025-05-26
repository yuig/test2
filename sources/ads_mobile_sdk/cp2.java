package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes2.dex */
public final class cp2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mp2 f3997b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp2(mp2 mp2Var, bl2.c cVar) {
        super(2, cVar);
        this.f3997b = mp2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new cp2(this.f3997b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new cp2(this.f3997b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f3996a;
        if (i13 == 0) {
            ue.c.H(obj);
            long j13 = this.f3997b.f8328b.T;
            this.f3996a = 1;
            if (l0.T(j13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        n1 n1Var = this.f3997b.f8329c;
        this.f3996a = 2;
        if (n1Var.o(this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
