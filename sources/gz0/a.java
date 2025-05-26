package gz0;

import ao2.j0;
import bl2.c;
import dl2.j;
import fz0.n;
import fz0.s;
import kk2.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tk2.e;
import u50.r;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ mb0.a f66358r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f66359s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f66360t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(mb0.a aVar, s sVar, r rVar, c cVar) {
        super(2, cVar);
        this.f66358r = aVar;
        this.f66359s = sVar;
        this.f66360t = rVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new a(this.f66358r, this.f66359s, this.f66360t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        t l13 = ((s20.a) this.f66358r.f86862b).d(((n) this.f66359s).f63143a, n00.b.a(n00.c.PEAR_QUIZ_V2)).r(e.f118017c).l(wj2.c.a());
        r rVar = this.f66360t;
        l13.o(new hx0.a(24, new p70.a(rVar, 13)), new hx0.a(25, new p70.a(rVar, 14)));
        return Unit.f80348a;
    }
}
