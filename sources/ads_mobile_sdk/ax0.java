package ads_mobile_sdk;

import a.j4;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ax0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2586c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cf2 f2588e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax0(String str, String str2, Object obj, bl2.c cVar, cf2 cf2Var) {
        super(2, cVar);
        this.f2585b = str;
        this.f2586c = str2;
        this.f2587d = obj;
        this.f2588e = cf2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ax0(this.f2585b, this.f2586c, this.f2587d, cVar, this.f2588e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ax0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f2584a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f2585b, "] on listener [", this.f2586c, "]");
            j4 j4Var = (j4) this.f2587d;
            cf2 cf2Var = this.f2588e;
            this.f2584a = 1;
            if (j4Var.a(cf2Var, this) == aVar) {
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
