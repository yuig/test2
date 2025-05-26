package aa1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f1660r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f1661s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f1661s = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f1661s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f1660r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = q.f1664j0;
            q qVar = this.f1661s;
            do2.i d2 = qVar.Y7().f1684d.d();
            y1.b bVar = new y1.b(qVar, 13);
            this.f1660r = 1;
            if (d2.collect(bVar, this) == aVar) {
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
