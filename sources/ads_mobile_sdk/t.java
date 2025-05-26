package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class t extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f11295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.ie f11296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a.ie ieVar, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f11296b = ieVar;
        this.f11297c = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new t(this.f11296b, this.f11297c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new t(this.f11296b, this.f11297c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11295a;
        if (i13 == 0) {
            ue.c.H(obj);
            a.ie ieVar = this.f11296b;
            long j13 = this.f11297c;
            this.f11295a = 1;
            if (ieVar.b(j13, this) == aVar) {
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
