package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class x21 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ao2.v f13403b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x21(ao2.v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f13403b = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x21(this.f13403b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new x21(this.f13403b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f13402a;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.v vVar = this.f13403b;
            this.f13402a = 1;
            if (vVar.await(this) == aVar) {
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
