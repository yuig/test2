package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d80 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f80 f4196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4197b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(bl2.c cVar, f80 f80Var, String str) {
        super(2, cVar);
        this.f4196a = f80Var;
        this.f4197b = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d80(cVar, this.f4196a, this.f4197b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d80((bl2.c) obj2, this.f4196a, this.f4197b).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        synchronized (this.f4196a) {
        }
        return Unit.f80348a;
    }
}
