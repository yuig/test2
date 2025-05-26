package fn0;

import ao2.j0;
import co2.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f62636r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f62637s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f62638t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ z f62639u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c cVar, t tVar, z zVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f62637s = cVar;
        this.f62638t = tVar;
        this.f62639u = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f62637s, this.f62638t, this.f62639u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f62636r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f62636r = 1;
            c cVar = this.f62637s;
            cVar.getClass();
            obj = l0.j0(new pb.k(new a(cVar, null)), cVar.f62609c);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        o1.f fVar = new o1.f(15, this.f62638t, this.f62639u);
        this.f62636r = 2;
        if (((do2.i) obj).collect(fVar, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
