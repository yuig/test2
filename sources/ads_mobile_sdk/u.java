package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class u extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f11760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.ie f11761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a.ie ieVar, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f11761b = ieVar;
        this.f11762c = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u(this.f11761b, this.f11762c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u(this.f11761b, this.f11762c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11760a;
        if (i13 == 0) {
            ue.c.H(obj);
            a.ie ieVar = this.f11761b;
            long j13 = this.f11762c;
            this.f11760a = 1;
            if (ieVar.d(j13, this) == aVar) {
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
