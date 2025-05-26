package ou;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes3.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f97688r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f97689s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, bl2.c cVar) {
        super(2, cVar);
        this.f97689s = hVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f97689s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f97688r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = h.f97692z0;
            do2.i d2 = ((l) this.f97689s.f97693y0.getValue()).f97698d.d();
            e eVar = new e(2, null);
            this.f97688r = 1;
            if (l0.I(d2, eVar, this) == aVar) {
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
