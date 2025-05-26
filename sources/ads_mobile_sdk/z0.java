package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class z0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(String str, String str2, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f14478b = str;
        this.f14479c = str2;
        this.f14480d = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new z0(this.f14478b, this.f14479c, this.f14480d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f14477a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f14478b, "] on listener [", this.f14479c, "]");
            a.q6 q6Var = (a.q6) this.f14480d;
            this.f14477a = 1;
            if (q6Var.l(this) == aVar) {
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
