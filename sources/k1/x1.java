package k1;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f78083r;

    /* renamed from: s, reason: collision with root package name */
    public Object f78084s;

    /* renamed from: t, reason: collision with root package name */
    public z1 f78085t;

    /* renamed from: u, reason: collision with root package name */
    public int f78086u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f78087v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v1 f78088w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z1 f78089x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f78090y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(v1 v1Var, z1 z1Var, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f78088w = v1Var;
        this.f78089x = z1Var;
        this.f78090y = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        x1 x1Var = new x1(this.f78088w, this.f78089x, this.f78090y, cVar);
        x1Var.f78087v = obj;
        return x1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4, types: [mo2.a] */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        z1 z1Var;
        Function1 function1;
        w1 w1Var;
        mo2.c cVar;
        mo2.a aVar;
        w1 w1Var2;
        z1 z1Var2;
        Throwable th3;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        ?? r13 = this.f78086u;
        try {
            try {
                if (r13 == 0) {
                    ue.c.H(obj);
                    CoroutineContext.Element element = ((ao2.j0) this.f78087v).getCoroutineContext().get(ao2.g0.f20154b);
                    Intrinsics.f(element);
                    w1 w1Var3 = new w1(this.f78088w, (ao2.o1) element);
                    z1Var = this.f78089x;
                    z1.a(z1Var, w1Var3);
                    this.f78087v = w1Var3;
                    mo2.c cVar2 = z1Var.f78109b;
                    this.f78083r = cVar2;
                    Function1 function12 = this.f78090y;
                    this.f78084s = function12;
                    this.f78085t = z1Var;
                    this.f78086u = 1;
                    if (cVar2.f(null, this) == aVar2) {
                        return aVar2;
                    }
                    function1 = function12;
                    w1Var = w1Var3;
                    cVar = cVar2;
                } else {
                    if (r13 != 1) {
                        if (r13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z1Var2 = (z1) this.f78084s;
                        aVar = this.f78083r;
                        w1Var2 = (w1) this.f78087v;
                        try {
                            ue.c.H(obj);
                            atomicReference2 = z1Var2.f78108a;
                            while (!atomicReference2.compareAndSet(w1Var2, null) && atomicReference2.get() == w1Var2) {
                            }
                            ((mo2.c) aVar).i(null);
                            return obj;
                        } catch (Throwable th4) {
                            th3 = th4;
                            atomicReference = z1Var2.f78108a;
                            while (!atomicReference.compareAndSet(w1Var2, null)) {
                            }
                            throw th3;
                        }
                    }
                    z1 z1Var3 = this.f78085t;
                    function1 = (Function1) this.f78084s;
                    ?? r53 = this.f78083r;
                    w1Var = (w1) this.f78087v;
                    ue.c.H(obj);
                    z1Var = z1Var3;
                    cVar = r53;
                }
                this.f78087v = w1Var;
                this.f78083r = aVar;
                this.f78084s = z1Var;
                this.f78085t = null;
                this.f78086u = 2;
                Object invoke = function1.invoke(this);
                if (invoke == aVar2) {
                    return aVar2;
                }
                z1Var2 = z1Var;
                obj = invoke;
                w1Var2 = w1Var;
                atomicReference2 = z1Var2.f78108a;
                while (!atomicReference2.compareAndSet(w1Var2, null)) {
                }
                ((mo2.c) aVar).i(null);
                return obj;
            } catch (Throwable th5) {
                w1Var2 = w1Var;
                z1Var2 = z1Var;
                th3 = th5;
                atomicReference = z1Var2.f78108a;
                while (!atomicReference.compareAndSet(w1Var2, null) && atomicReference.get() == w1Var2) {
                }
                throw th3;
            }
            aVar = cVar;
        } catch (Throwable th6) {
            ((mo2.c) r13).i(null);
            throw th6;
        }
    }
}
