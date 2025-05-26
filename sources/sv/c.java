package sv;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes3.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f115262r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f115263s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f115263s = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f115263s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f115262r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = e.f115274q0;
            e eVar = this.f115263s;
            do2.i d2 = ((g) eVar.f115285m0.getValue()).f115292f.d();
            b bVar = new b(eVar, null);
            this.f115262r = 1;
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
