package nl0;

import com.pinterest.api.model.e8;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tu.d0;
import u50.r;

/* loaded from: classes5.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f91247r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f91248s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f91249t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e8 f91250u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d0 d0Var, e8 e8Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f91248s = d0Var;
        this.f91249t = rVar;
        this.f91250u = e8Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = this.f91249t;
        e eVar = new e(this.f91248s, this.f91250u, rVar, cVar);
        eVar.f91247r = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f30) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        f30 f30Var = (f30) this.f91247r;
        d0.k(this.f91248s, this.f91249t, this.f91250u, f30Var);
        return Unit.f80348a;
    }
}
