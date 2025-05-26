package w72;

import ao2.j0;
import dl2.j;
import do2.t2;
import do2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;
import v72.w;

/* loaded from: classes4.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f128205r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f128206s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f128207t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f128208u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, w wVar, e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f128206s = rVar;
        this.f128207t = wVar;
        this.f128208u = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f128206s, this.f128207t, this.f128208u, cVar);
        dVar.f128205r = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f128205r;
        t2 a13 = u2.a(Boolean.FALSE);
        kotlin.jvm.internal.j.z(j0Var, null, null, new b(a13, this.f128206s, null), 3);
        kotlin.jvm.internal.j.z(j0Var, null, null, new c(a13, this.f128207t, this.f128208u, null), 3);
        return Unit.f80348a;
    }
}
