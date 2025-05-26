package ha1;

import ao2.j0;
import da1.c;
import dl2.j;
import fa1.g;
import k22.m;
import kk2.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tk2.e;
import u50.r;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f68390r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f68391s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, r rVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f68390r = cVar;
        this.f68391s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f68390r, this.f68391s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        c cVar = this.f68390r;
        xj2.b bVar = (xj2.b) cVar.f54231d;
        t l13 = ((m) cVar.f54229b).D("").r(e.f118017c).l(wj2.c.a());
        r rVar = this.f68391s;
        bVar.a(l13.o(new fa1.c(15, new g(rVar, 6)), new fa1.c(16, new g(rVar, 7))));
        return Unit.f80348a;
    }
}
