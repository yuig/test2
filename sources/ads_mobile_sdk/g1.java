package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5348c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(String str, String str2, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f5347b = str;
        this.f5348c = str2;
        this.f5349d = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g1(this.f5347b, this.f5348c, this.f5349d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f5346a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f5347b, "] on listener [", this.f5348c, "]");
            a.q6 q6Var = (a.q6) this.f5349d;
            this.f5346a = 1;
            if (q6Var.m(this) == aVar) {
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
