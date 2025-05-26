package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ta2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f11466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11468c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj.a f11470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta2(String str, String str2, Object obj, bl2.c cVar, cj.a aVar) {
        super(2, cVar);
        this.f11467b = str;
        this.f11468c = str2;
        this.f11469d = obj;
        this.f11470e = aVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ta2(this.f11467b, this.f11468c, this.f11469d, cVar, this.f11470e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ta2) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11466a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f11467b, "] on listener [", this.f11468c, "]");
            a.bg bgVar = (a.bg) this.f11469d;
            cj.a aVar2 = this.f11470e;
            this.f11466a = 1;
            if (bgVar.a(aVar2, this) == aVar) {
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
