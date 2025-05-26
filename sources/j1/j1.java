package j1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f74118r;

    /* renamed from: s, reason: collision with root package name */
    public Object f74119s;

    /* renamed from: t, reason: collision with root package name */
    public k1 f74120t;

    /* renamed from: u, reason: collision with root package name */
    public int f74121u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f74122v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h1 f74123w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k1 f74124x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f74125y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(h1 h1Var, k1 k1Var, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f74123w = h1Var;
        this.f74124x = k1Var;
        this.f74125y = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j1 j1Var = new j1(this.f74123w, this.f74124x, this.f74125y, cVar);
        j1Var.f74122v = obj;
        return j1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5, types: [mo2.a] */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        k1 k1Var;
        Function1 function1;
        i1 i1Var;
        mo2.c cVar;
        mo2.a aVar;
        i1 i1Var2;
        k1 k1Var2;
        Throwable th3;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        ?? r13 = this.f74121u;
        try {
            try {
                if (r13 == 0) {
                    ue.c.H(obj);
                    CoroutineContext.Element element = ((ao2.j0) this.f74122v).getCoroutineContext().get(ao2.g0.f20154b);
                    Intrinsics.f(element);
                    i1 i1Var3 = new i1(this.f74123w, (ao2.o1) element);
                    while (true) {
                        k1Var = this.f74124x;
                        AtomicReference atomicReference3 = k1Var.f74131a;
                        i1 i1Var4 = (i1) atomicReference3.get();
                        if (i1Var4 != null && !i1Var3.a(i1Var4)) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(i1Var4, i1Var3)) {
                            if (atomicReference3.get() != i1Var4) {
                                break;
                            }
                        }
                        if (i1Var4 != null) {
                            i1Var4.b();
                        }
                        this.f74122v = i1Var3;
                        mo2.c cVar2 = k1Var.f74132b;
                        this.f74118r = cVar2;
                        Function1 function12 = this.f74125y;
                        this.f74119s = function12;
                        this.f74120t = k1Var;
                        this.f74121u = 1;
                        if (cVar2.f(null, this) == aVar2) {
                            return aVar2;
                        }
                        function1 = function12;
                        i1Var = i1Var3;
                        cVar = cVar2;
                    }
                } else {
                    if (r13 != 1) {
                        if (r13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k1Var2 = (k1) this.f74119s;
                        aVar = this.f74118r;
                        i1Var2 = (i1) this.f74122v;
                        try {
                            ue.c.H(obj);
                            atomicReference2 = k1Var2.f74131a;
                            while (!atomicReference2.compareAndSet(i1Var2, null) && atomicReference2.get() == i1Var2) {
                            }
                            ((mo2.c) aVar).i(null);
                            return obj;
                        } catch (Throwable th4) {
                            th3 = th4;
                            atomicReference = k1Var2.f74131a;
                            while (!atomicReference.compareAndSet(i1Var2, null) && atomicReference.get() == i1Var2) {
                            }
                            throw th3;
                        }
                    }
                    k1 k1Var3 = this.f74120t;
                    function1 = (Function1) this.f74119s;
                    ?? r53 = this.f74118r;
                    i1Var = (i1) this.f74122v;
                    ue.c.H(obj);
                    k1Var = k1Var3;
                    cVar = r53;
                }
                this.f74122v = i1Var;
                this.f74118r = aVar;
                this.f74119s = k1Var;
                this.f74120t = null;
                this.f74121u = 2;
                Object invoke = function1.invoke(this);
                if (invoke == aVar2) {
                    return aVar2;
                }
                k1Var2 = k1Var;
                obj = invoke;
                i1Var2 = i1Var;
                atomicReference2 = k1Var2.f74131a;
                while (!atomicReference2.compareAndSet(i1Var2, null)) {
                }
                ((mo2.c) aVar).i(null);
                return obj;
            } catch (Throwable th5) {
                i1Var2 = i1Var;
                k1Var2 = k1Var;
                th3 = th5;
                atomicReference = k1Var2.f74131a;
                while (!atomicReference.compareAndSet(i1Var2, null)) {
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
