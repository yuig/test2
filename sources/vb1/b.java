package vb1;

import ab1.o;
import ao2.j0;
import dl2.j;
import fa1.g;
import fk2.l;
import java.util.HashMap;
import k22.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tk2.e;
import ub1.r;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f125495r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f125496s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f125497t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, r rVar, u50.r rVar2, bl2.c cVar2) {
        super(2, cVar2);
        this.f125495r = cVar;
        this.f125496s = rVar;
        this.f125497t = rVar2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f125495r, this.f125496s, this.f125497t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        m mVar = this.f125495r.f125498a;
        HashMap hashMap = new HashMap();
        hashMap.put("auto_tagging_status", String.valueOf(this.f125496s.f121738a.getValue()));
        Unit unit = Unit.f80348a;
        l h10 = mVar.f("", hashMap).l(e.f118017c).h(wj2.c.a());
        u50.r rVar = this.f125497t;
        h10.i(new p70.c(rVar, 4), new o(20, new g(rVar, 16)));
        return Unit.f80348a;
    }
}
