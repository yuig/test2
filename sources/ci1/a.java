package ci1;

import ao2.j0;
import bi1.w;
import bi1.y;
import bl2.c;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o1.f;
import tu.d0;
import ve.h;
import x02.i2;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f27756r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f27757s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f27758t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d0 d0Var, y yVar, c cVar) {
        super(2, cVar);
        this.f27757s = d0Var;
        this.f27758t = yVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new a(this.f27757s, this.f27758t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f27756r;
        if (i13 == 0) {
            ue.c.H(obj);
            d0 d0Var = this.f27757s;
            i2 i2Var = (i2) d0Var.f119281c;
            y yVar = this.f27758t;
            do2.c x13 = h.x(i2Var, ((w) yVar).f22882a);
            f fVar = new f(17, d0Var, yVar);
            this.f27756r = 1;
            if (x13.collect(fVar, this) == aVar) {
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
