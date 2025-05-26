package fn0;

import co2.y;
import co2.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f62645r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f62646s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f62647t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ in0.f f62648u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, in0.f fVar, bl2.c cVar) {
        super(2, cVar);
        this.f62647t = tVar;
        this.f62648u = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n nVar = new n(this.f62647t, this.f62648u, cVar);
        nVar.f62646s = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        z zVar;
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f62645r;
        if (i13 == 0) {
            ue.c.H(obj);
            zVar = (z) this.f62646s;
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            zVar = (z) this.f62646s;
            ue.c.H(obj);
        }
        while (!this.f62647t.f62673j.get()) {
            y yVar = (y) zVar;
            yVar.getClass();
            f fVar = f.f62617g;
            this.f62646s = zVar;
            this.f62645r = 1;
            if (yVar.f28359d.o(fVar, this) == obj2) {
                return obj2;
            }
        }
        y yVar2 = (y) zVar;
        yVar2.getClass();
        this.f62646s = null;
        this.f62645r = 2;
        in0.f fVar2 = this.f62648u;
        Object M = kotlin.jvm.internal.j.M(this, fVar2.f72814f, new in0.c(fVar2, yVar2, null));
        if (M != cl2.a.COROUTINE_SUSPENDED) {
            M = Unit.f80348a;
        }
        if (M == obj2) {
            return obj2;
        }
        return Unit.f80348a;
    }
}
