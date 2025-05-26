package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class wb1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb1 f12974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym0 f12975c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb1(yb1 yb1Var, ym0 ym0Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f12974b = yb1Var;
        this.f12975c = ym0Var;
        this.f12976d = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new wb1(this.f12974b, this.f12975c, this.f12976d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wb1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f12973a;
        if (i13 == 0) {
            ue.c.H(obj);
            ub1 ub1Var = this.f12974b.f14184b;
            ym0 ym0Var = this.f12975c;
            String str = this.f12976d;
            this.f12973a = 1;
            ub1Var.getClass();
            if (ub1.a(ym0Var, str, "createCalendarEvent", this) == aVar) {
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
