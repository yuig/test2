package c2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f25415r;

    /* renamed from: s, reason: collision with root package name */
    public Object f25416s;

    /* renamed from: t, reason: collision with root package name */
    public z2 f25417t;

    /* renamed from: u, reason: collision with root package name */
    public int f25418u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25419v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k1.v1 f25420w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z2 f25421x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f25422y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(k1.v1 v1Var, z2 z2Var, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f25420w = v1Var;
        this.f25421x = z2Var;
        this.f25422y = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        y2 y2Var = new y2(this.f25420w, this.f25421x, this.f25422y, cVar);
        y2Var.f25419v = obj;
        return y2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6, types: [mo2.a] */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        z2 z2Var;
        Function1 function1;
        x2 x2Var;
        mo2.c cVar;
        mo2.a aVar;
        x2 x2Var2;
        z2 z2Var2;
        Throwable th3;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        ?? r13 = this.f25418u;
        try {
            try {
                if (r13 == 0) {
                    ue.c.H(obj);
                    CoroutineContext.Element element = ((ao2.j0) this.f25419v).getCoroutineContext().get(ao2.g0.f20154b);
                    Intrinsics.f(element);
                    x2 x2Var3 = new x2(this.f25420w, (ao2.o1) element);
                    while (true) {
                        z2Var = this.f25421x;
                        AtomicReference atomicReference3 = z2Var.f25463a;
                        x2 x2Var4 = (x2) atomicReference3.get();
                        if (x2Var4 != null && x2Var3.f25369a.compareTo(x2Var4.f25369a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(x2Var4, x2Var3)) {
                            if (atomicReference3.get() != x2Var4) {
                                break;
                            }
                        }
                        if (x2Var4 != null) {
                            x2Var4.f25370b.cancel((CancellationException) null);
                        }
                        this.f25419v = x2Var3;
                        mo2.c cVar2 = z2Var.f25464b;
                        this.f25415r = cVar2;
                        Function1 function12 = this.f25422y;
                        this.f25416s = function12;
                        this.f25417t = z2Var;
                        this.f25418u = 1;
                        if (cVar2.f(null, this) == aVar2) {
                            return aVar2;
                        }
                        function1 = function12;
                        x2Var = x2Var3;
                        cVar = cVar2;
                    }
                } else {
                    if (r13 != 1) {
                        if (r13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z2Var2 = (z2) this.f25416s;
                        aVar = this.f25415r;
                        x2Var2 = (x2) this.f25419v;
                        try {
                            ue.c.H(obj);
                            atomicReference2 = z2Var2.f25463a;
                            while (!atomicReference2.compareAndSet(x2Var2, null) && atomicReference2.get() == x2Var2) {
                            }
                            ((mo2.c) aVar).i(null);
                            return obj;
                        } catch (Throwable th4) {
                            th3 = th4;
                            atomicReference = z2Var2.f25463a;
                            while (!atomicReference.compareAndSet(x2Var2, null)) {
                            }
                            throw th3;
                        }
                    }
                    z2 z2Var3 = this.f25417t;
                    function1 = (Function1) this.f25416s;
                    ?? r53 = this.f25415r;
                    x2Var = (x2) this.f25419v;
                    ue.c.H(obj);
                    z2Var = z2Var3;
                    cVar = r53;
                }
                this.f25419v = x2Var;
                this.f25415r = aVar;
                this.f25416s = z2Var;
                this.f25417t = null;
                this.f25418u = 2;
                Object invoke = function1.invoke(this);
                if (invoke == aVar2) {
                    return aVar2;
                }
                z2Var2 = z2Var;
                obj = invoke;
                x2Var2 = x2Var;
                atomicReference2 = z2Var2.f25463a;
                while (!atomicReference2.compareAndSet(x2Var2, null)) {
                }
                ((mo2.c) aVar).i(null);
                return obj;
            } catch (Throwable th5) {
                x2Var2 = x2Var;
                z2Var2 = z2Var;
                th3 = th5;
                atomicReference = z2Var2.f25463a;
                while (!atomicReference.compareAndSet(x2Var2, null) && atomicReference.get() == x2Var2) {
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
