package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j32 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.j8 f6668a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j32(a.j8 j8Var, bl2.c cVar) {
        super(2, cVar);
        this.f6668a = j8Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j32(this.f6668a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j32(this.f6668a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f6668a.a();
        return Unit.f80348a;
    }
}
