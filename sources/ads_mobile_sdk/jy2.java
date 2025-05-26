package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class jy2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hy2 f7022e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy2(String str, String str2, Object obj, bl2.c cVar, hy2 hy2Var) {
        super(2, cVar);
        this.f7019b = str;
        this.f7020c = str2;
        this.f7021d = obj;
        this.f7022e = hy2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new jy2(this.f7019b, this.f7020c, this.f7021d, cVar, this.f7022e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jy2) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f7018a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f7019b, "] on listener [", this.f7020c, "]");
            a.l8 l8Var = (a.l8) this.f7021d;
            hy2 hy2Var = this.f7022e;
            this.f7018a = 1;
            if (l8Var.a(hy2Var, this) == aVar) {
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
