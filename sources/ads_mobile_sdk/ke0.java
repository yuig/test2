package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import wi.n;

/* loaded from: classes2.dex */
public final class ke0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oe0 f7251b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke0(oe0 oe0Var, bl2.c cVar) {
        super(2, cVar);
        this.f7251b = oe0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ke0(this.f7251b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ke0(this.f7251b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f7250a;
        if (i13 == 0) {
            ue.c.H(obj);
            oe0 oe0Var = this.f7251b;
            wi.o oVar = new wi.o(n.APP_NOT_FOREGROUND, "Fullscreen ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
            this.f7250a = 1;
            if (oe0Var.a(oVar, this) == aVar) {
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
