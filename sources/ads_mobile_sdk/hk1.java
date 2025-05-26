package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class hk1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym0 f6004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nm.u f6005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk1(ym0 ym0Var, nm.u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f6004b = ym0Var;
        this.f6005c = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new hk1(this.f6004b, this.f6005c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new hk1(this.f6004b, this.f6005c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f6003a;
        if (i13 == 0) {
            ue.c.H(obj);
            ym0 ym0Var = this.f6004b;
            nm.u uVar = this.f6005c;
            this.f6003a = 1;
            if (ym0Var.b(uVar, "google.afma.nativeAds.renderVideo", this) == aVar) {
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
