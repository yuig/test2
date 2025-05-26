package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class e80 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f80 f4752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cj.a f4753b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e80(bl2.c cVar, f80 f80Var, cj.a aVar) {
        super(2, cVar);
        this.f4752a = f80Var;
        this.f4753b = aVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e80(cVar, this.f4752a, this.f4753b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new e80((bl2.c) obj2, this.f4752a, this.f4753b).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        synchronized (this.f4752a) {
        }
        return Unit.f80348a;
    }
}
