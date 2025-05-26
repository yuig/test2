package na1;

import ao2.j0;
import bl2.c;
import dl2.j;
import fa1.g;
import fk2.l;
import gx.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ma1.r;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f90093r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f90094s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f90095t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, r rVar, u50.r rVar2, c cVar) {
        super(2, cVar);
        this.f90093r = eVar;
        this.f90094s = rVar;
        this.f90095t = rVar2;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new a(this.f90093r, this.f90094s, this.f90095t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        l h10 = ((cr1.a) this.f90093r.f66246b).w(this.f90094s.f86810a).l(tk2.e.f118017c).h(wj2.c.a());
        u50.r rVar = this.f90095t;
        h10.i(new p70.c(rVar, 3), new fa1.c(20, new g(rVar, 9)));
        return Unit.f80348a;
    }
}
