package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u70 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f80 f11870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wi.o f11871b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(bl2.c cVar, f80 f80Var, wi.o oVar) {
        super(2, cVar);
        this.f11870a = f80Var;
        this.f11871b = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u70(cVar, this.f11870a, this.f11871b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u70((bl2.c) obj2, this.f11870a, this.f11871b).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        if (this.f11870a.a() != null) {
            wi.o fullScreenContentError = this.f11871b;
            Intrinsics.checkNotNullParameter(fullScreenContentError, "fullScreenContentError");
        }
        return Unit.f80348a;
    }
}
