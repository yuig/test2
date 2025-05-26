package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4087c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi.o f4089e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(String str, String str2, Object obj, bl2.c cVar, wi.o oVar) {
        super(2, cVar);
        this.f4086b = str;
        this.f4087c = str2;
        this.f4088d = obj;
        this.f4089e = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d1(this.f4086b, this.f4087c, this.f4088d, cVar, this.f4089e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f4085a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f4086b, "] on listener [", this.f4087c, "]");
            a.q6 q6Var = (a.q6) this.f4088d;
            wi.o oVar = this.f4089e;
            this.f4085a = 1;
            if (q6Var.a(oVar, this) == aVar) {
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
