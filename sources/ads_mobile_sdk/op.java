package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class op extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wp f9389b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op(wp wpVar, bl2.c cVar) {
        super(2, cVar);
        this.f9389b = wpVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new op(this.f9389b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new op(this.f9389b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9388a;
        if (i13 == 0) {
            ue.c.H(obj);
            zr zrVar = this.f9389b.f13149p;
            this.f9388a = 1;
            if (zr.a(zrVar, true, (bl2.c) this, 2) == aVar) {
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
