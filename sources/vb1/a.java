package vb1;

import ab1.o;
import ao2.j0;
import dl2.j;
import fa1.g;
import kk2.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import rx0.f;
import tk2.e;
import u50.r;
import ub1.q;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f125492r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f125493s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f125494t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, r rVar, q qVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f125492r = cVar;
        this.f125493s = rVar;
        this.f125494t = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f125492r, this.f125493s, this.f125494t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        c cVar = this.f125492r;
        t l13 = cVar.f125498a.D("").r(e.f118017c).l(wj2.c.a());
        r rVar = this.f125493s;
        l13.o(new o(18, new f(rVar, this.f125494t, cVar, 26)), new o(19, new g(rVar, 15)));
        return Unit.f80348a;
    }
}
