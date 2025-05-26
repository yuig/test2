package ads_mobile_sdk;

import a.d3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class nd1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d3 f8759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8760b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd1(d3 d3Var, int i13, bl2.c cVar) {
        super(2, cVar);
        this.f8759a = d3Var;
        this.f8760b = i13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new nd1(this.f8759a, this.f8760b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new nd1(this.f8759a, this.f8760b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        wi0 wi0Var = (wi0) this.f8759a;
        wi0Var.a(this.f8760b);
        wi0Var.m();
        return Unit.f80348a;
    }
}
