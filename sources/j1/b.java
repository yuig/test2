package j1;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public o f73986r;

    /* renamed from: s, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f73987s;

    /* renamed from: t, reason: collision with root package name */
    public int f73988t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f73989u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f73990v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f73991w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f73992x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f73993y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Object obj, j jVar, long j13, Function1 function1, bl2.c cVar) {
        super(1, cVar);
        this.f73989u = dVar;
        this.f73990v = obj;
        this.f73991w = jVar;
        this.f73992x = j13;
        this.f73993y = function1;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new b(this.f73989u, this.f73990v, this.f73991w, this.f73992x, this.f73993y, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((b) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.f0 f0Var;
        o oVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f73988t;
        d dVar = this.f73989u;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                dVar.f74028c.f74170c = (t) dVar.f74026a.f74197a.invoke(this.f73990v);
                dVar.f74030e.setValue(this.f73991w.g());
                dVar.f74029d.setValue(Boolean.TRUE);
                o oVar2 = dVar.f74028c;
                o oVar3 = new o(oVar2.f74168a, oVar2.f74169b.getValue(), e.k(oVar2.f74170c), oVar2.f74171d, Long.MIN_VALUE, oVar2.f74173f);
                kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
                j jVar = this.f73991w;
                long j13 = this.f73992x;
                a aVar2 = new a(this.f73989u, oVar3, this.f73993y, f0Var2, 0);
                this.f73986r = oVar3;
                this.f73987s = f0Var2;
                this.f73988t = 1;
                if (e.d(oVar3, jVar, j13, aVar2, this) == aVar) {
                    return aVar;
                }
                f0Var = f0Var2;
                oVar = oVar3;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f0Var = this.f73987s;
                oVar = this.f73986r;
                ue.c.H(obj);
            }
            k kVar = f0Var.f80424a ? k.BoundReached : k.Finished;
            d.b(dVar);
            return new l(oVar, kVar);
        } catch (CancellationException e13) {
            d.b(dVar);
            throw e13;
        }
    }
}
