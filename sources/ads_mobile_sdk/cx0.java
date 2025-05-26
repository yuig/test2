package ads_mobile_sdk;

import a.j4;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class cx0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4053b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4054c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi.k f4056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx0(String str, String str2, Object obj, bl2.c cVar, wi.k kVar) {
        super(2, cVar);
        this.f4053b = str;
        this.f4054c = str2;
        this.f4055d = obj;
        this.f4056e = kVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new cx0(this.f4053b, this.f4054c, this.f4055d, cVar, this.f4056e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cx0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f4052a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f4053b, "] on listener [", this.f4054c, "]");
            j4 j4Var = (j4) this.f4055d;
            wi.k kVar = this.f4056e;
            this.f4052a = 1;
            if (j4Var.a(kVar, this) == aVar) {
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
