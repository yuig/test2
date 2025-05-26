package k1;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y1 extends dl2.j implements Function2 {
    public final /* synthetic */ Object A;

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f78093r;

    /* renamed from: s, reason: collision with root package name */
    public Object f78094s;

    /* renamed from: t, reason: collision with root package name */
    public Object f78095t;

    /* renamed from: u, reason: collision with root package name */
    public z1 f78096u;

    /* renamed from: v, reason: collision with root package name */
    public int f78097v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f78098w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v1 f78099x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z1 f78100y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Function2 f78101z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(v1 v1Var, z1 z1Var, Function2 function2, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f78099x = v1Var;
        this.f78100y = z1Var;
        this.f78101z = function2;
        this.A = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        y1 y1Var = new y1(this.f78099x, this.f78100y, this.f78101z, this.A, cVar);
        y1Var.f78098w = obj;
        return y1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        z1 z1Var;
        Object obj2;
        w1 w1Var;
        mo2.a aVar;
        Function2 function2;
        w1 w1Var2;
        z1 z1Var2;
        Throwable th3;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        ?? r13 = this.f78097v;
        try {
            try {
                if (r13 == 0) {
                    ue.c.H(obj);
                    CoroutineContext.Element element = ((ao2.j0) this.f78098w).getCoroutineContext().get(ao2.g0.f20154b);
                    Intrinsics.f(element);
                    w1 w1Var3 = new w1(this.f78099x, (ao2.o1) element);
                    z1Var = this.f78100y;
                    z1.a(z1Var, w1Var3);
                    this.f78098w = w1Var3;
                    mo2.c cVar = z1Var.f78109b;
                    this.f78093r = cVar;
                    Function2 function22 = this.f78101z;
                    this.f78094s = function22;
                    Object obj3 = this.A;
                    this.f78095t = obj3;
                    this.f78096u = z1Var;
                    this.f78097v = 1;
                    if (cVar.f(null, this) == aVar2) {
                        return aVar2;
                    }
                    obj2 = obj3;
                    w1Var = w1Var3;
                    aVar = cVar;
                    function2 = function22;
                } else {
                    if (r13 != 1) {
                        if (r13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z1Var2 = (z1) this.f78094s;
                        aVar = this.f78093r;
                        w1Var2 = (w1) this.f78098w;
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
                    z1 z1Var3 = this.f78096u;
                    obj2 = this.f78095t;
                    function2 = (Function2) this.f78094s;
                    mo2.a aVar3 = this.f78093r;
                    w1Var = (w1) this.f78098w;
                    ue.c.H(obj);
                    z1Var = z1Var3;
                    aVar = aVar3;
                }
                this.f78098w = w1Var;
                this.f78093r = aVar;
                this.f78094s = z1Var;
                this.f78095t = null;
                this.f78096u = null;
                this.f78097v = 2;
                Object invoke = function2.invoke(obj2, this);
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
        } catch (Throwable th6) {
            ((mo2.c) r13).i(null);
            throw th6;
        }
    }
}
