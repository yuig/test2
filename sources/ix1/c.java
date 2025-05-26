package ix1;

import ao2.j0;
import dl2.j;
import do2.i;
import jx1.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes4.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f73794r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f73795s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, bl2.c cVar) {
        super(2, cVar);
        this.f73795s = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f73795s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f73794r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = f.f73801m0;
            f fVar = this.f73795s;
            i d2 = ((t) fVar.f73802c0.getValue()).f77699e.d();
            b bVar = new b(fVar, null);
            this.f73794r = 1;
            if (l0.I(d2, bVar, this) == aVar) {
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
