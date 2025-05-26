package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class qw1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rw1 f10298b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(rw1 rw1Var, bl2.c cVar) {
        super(2, cVar);
        this.f10298b = rw1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new qw1(this.f10298b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new qw1(this.f10298b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f10297a;
        if (i13 == 0) {
            ue.c.H(obj);
            rw1 rw1Var = this.f10298b;
            this.f10297a = 1;
            if (rw1.a(rw1Var, this) == aVar) {
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
