package nl0;

import com.pinterest.api.model.e8;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tu.d0;
import u50.r;

/* loaded from: classes5.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f91243r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f91244s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f91245t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e8 f91246u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(d0 d0Var, e8 e8Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f91244s = d0Var;
        this.f91245t = rVar;
        this.f91246u = e8Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = this.f91245t;
        d dVar = new d(this.f91244s, this.f91246u, rVar, cVar);
        dVar.f91243r = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f30) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        f30 f30Var = (f30) this.f91243r;
        d0.k(this.f91244s, this.f91245t, this.f91246u, f30Var);
        return Unit.f80348a;
    }
}
