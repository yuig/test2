package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k42 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o42 f7101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.ad f7102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wi.b0 f7103c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k42(wi.b0 b0Var, o42 o42Var, a.ad adVar, bl2.c cVar) {
        super(2, cVar);
        this.f7101a = o42Var;
        this.f7102b = adVar;
        this.f7103c = b0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k42(this.f7103c, this.f7101a, this.f7102b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k42) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        o42 o42Var = this.f7101a;
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(o42Var.f9134s.getValue(o42Var, o42.f9125u[0]));
        return Unit.f80348a;
    }
}
