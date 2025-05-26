package kb2;

import ao2.j0;
import bl2.c;
import dl2.j;
import do2.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import ni1.o2;
import ti1.f;

/* loaded from: classes4.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f79100r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o2 f79101s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f79102t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o2 o2Var, f fVar, c cVar) {
        super(2, cVar);
        this.f79101s = o2Var;
        this.f79102t = fVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new b(this.f79101s, this.f79102t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f79100r;
        if (i13 == 0) {
            ue.c.H(obj);
            i d2 = this.f79101s.f90763e.d();
            a aVar2 = new a(this.f79102t, null);
            this.f79100r = 1;
            if (l0.I(d2, aVar2, this) == aVar) {
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
