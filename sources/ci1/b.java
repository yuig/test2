package ci1;

import ao2.j0;
import bi1.t;
import bi1.y;
import bl2.c;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tu.d0;
import ve.h;
import x02.i2;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f27759r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f27760s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f27761t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d0 d0Var, y yVar, c cVar) {
        super(2, cVar);
        this.f27760s = d0Var;
        this.f27761t = yVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new b(this.f27760s, this.f27761t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f27759r;
        if (i13 == 0) {
            ue.c.H(obj);
            d0 d0Var = this.f27760s;
            do2.c x13 = h.x((i2) d0Var.f119281c, ((t) this.f27761t).f22879a);
            y1.b bVar = new y1.b(d0Var, 15);
            this.f27759r = 1;
            if (x13.collect(bVar, this) == aVar) {
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
