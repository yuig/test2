package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class pf1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uf1 f9664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nm.u f9665c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if1 f9666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf1(if1 if1Var, uf1 uf1Var, nm.u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f9664b = uf1Var;
        this.f9665c = uVar;
        this.f9666d = if1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new pf1(this.f9666d, this.f9664b, this.f9665c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pf1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9663a;
        if (i13 == 0) {
            ue.c.H(obj);
            dj1 dj1Var = this.f9664b.f12064c;
            nm.u uVar = this.f9665c;
            this.f9663a = 1;
            obj = dj1Var.a(uVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        ym0 ym0Var = (ym0) obj;
        if (ym0Var != null) {
            if1 if1Var = this.f9666d;
            if1Var.f6377j = ym0Var;
            if1Var.f6378k = ym0Var;
            if1Var.f6379l = ym0Var.c();
            if1Var.f6380m = ym0Var.c();
        }
        return Unit.f80348a;
    }
}
