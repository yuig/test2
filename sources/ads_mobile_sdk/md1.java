package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class md1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od1 f8180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym0 f8181c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md1(od1 od1Var, ym0 ym0Var, bl2.c cVar) {
        super(2, cVar);
        this.f8180b = od1Var;
        this.f8181c = ym0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new md1(this.f8180b, this.f8181c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new md1(this.f8180b, this.f8181c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f8179a;
        if (i13 == 0) {
            ue.c.H(obj);
            ub1 ub1Var = this.f8180b.f9233a;
            ym0 ym0Var = this.f8181c;
            this.f8179a = 1;
            ub1Var.getClass();
            if (ub1.a(ym0Var, "setOrientationProperties is only valid for fullscreen or expanded webviews.", "setOrientationProperties", this) == aVar) {
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
