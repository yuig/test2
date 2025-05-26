package ja;

import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f75190r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f75191s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f75192t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d0 f75193u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ do2.j f75194v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String[] f75195w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Callable f75196x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z13, d0 d0Var, do2.j jVar, String[] strArr, Callable callable, bl2.c cVar) {
        super(2, cVar);
        this.f75192t = z13;
        this.f75193u = d0Var;
        this.f75194v = jVar;
        this.f75195w = strArr;
        this.f75196x = callable;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e eVar = new e(this.f75192t, this.f75193u, this.f75194v, this.f75195w, this.f75196x, cVar);
        eVar.f75191s = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        ao2.f0 f0Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f75190r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f75191s;
            co2.m b13 = lb.l0.b(-1, null, 6);
            d dVar = new d(this.f75195w, b13);
            Object obj2 = Unit.f80348a;
            b13.g(obj2);
            boolean z13 = this.f75192t;
            d0 d0Var = this.f75193u;
            if (z13) {
                Map map = d0Var.f75188k;
                Object obj3 = map.get("TransactionDispatcher");
                if (obj3 == null) {
                    obj3 = dl2.b.o0(d0Var.k());
                    map.put("TransactionDispatcher", obj3);
                }
                f0Var = (ao2.f0) obj3;
            } else {
                Map map2 = d0Var.f75188k;
                Object obj4 = map2.get("QueryDispatcher");
                if (obj4 == null) {
                    obj4 = dl2.b.o0(d0Var.h());
                    map2.put("QueryDispatcher", obj4);
                }
                f0Var = (ao2.f0) obj4;
            }
            ao2.f0 f0Var2 = f0Var;
            co2.m b14 = lb.l0.b(0, null, 7);
            kotlin.jvm.internal.j.z(j0Var, f0Var2, null, new c(this.f75193u, dVar, b13, this.f75196x, b14, null), 2);
            this.f75190r = 1;
            Object i03 = bs1.c.i0(this.f75194v, b14, true, this);
            if (i03 == aVar) {
                obj2 = i03;
            }
            if (obj2 == aVar) {
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
