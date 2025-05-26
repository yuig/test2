package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class mt extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p03 f8368b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt(p03 p03Var, bl2.c cVar) {
        super(2, cVar);
        this.f8368b = p03Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        mt mtVar = new mt(this.f8368b, cVar);
        mtVar.f8367a = obj;
        return mtVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mt mtVar = new mt(this.f8368b, (bl2.c) obj2);
        mtVar.f8367a = (ym0) obj;
        return mtVar.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ((ym0) this.f8367a).a().f7409o = this.f8368b;
        return Unit.f80348a;
    }
}
