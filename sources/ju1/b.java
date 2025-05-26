package ju1;

import ao2.j0;
import bl2.c;
import dl2.j;
import do2.h0;
import iu1.q;
import iu1.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;
import ve.h;
import vs.w;

/* loaded from: classes4.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f77615r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ hu1.j f77616s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f77617t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f77618u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hu1.j jVar, s sVar, r rVar, c cVar) {
        super(2, cVar);
        this.f77616s = jVar;
        this.f77617t = sVar;
        this.f77618u = rVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new b(this.f77616s, this.f77617t, this.f77618u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f77615r;
        if (i13 == 0) {
            ue.c.H(obj);
            r rVar = this.f77618u;
            do2.j0 j0Var = new do2.j0(new h0(new a(2, null), h.z(this.f77616s.f70426b, ((q) this.f77617t).f73716a)), new w(7, rVar, null));
            da0.b bVar = new da0.b(rVar, 6);
            this.f77615r = 1;
            if (j0Var.collect(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
