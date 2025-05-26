package u2;

import ao2.j0;
import ao2.m0;
import ao2.o1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class w extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f120058r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f120059s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f120060t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f120061u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function2 f120062v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(AtomicReference atomicReference, bl2.c cVar, Function1 function1, Function2 function2) {
        super(2, cVar);
        this.f120060t = function1;
        this.f120061u = atomicReference;
        this.f120062v = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        w wVar = new w(this.f120061u, cVar, this.f120060t, this.f120062v);
        wVar.f120059s = obj;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        v vVar;
        o1 o1Var;
        v vVar2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f120058r;
        AtomicReference atomicReference = this.f120061u;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                j0 j0Var = (j0) this.f120059s;
                vVar = new v(m0.z(j0Var.getCoroutineContext()), this.f120060t.invoke(j0Var));
                v vVar3 = (v) atomicReference.getAndSet(vVar);
                if (vVar3 != null && (o1Var = vVar3.f120056a) != null) {
                    this.f120059s = vVar;
                    this.f120058r = 1;
                    if (m0.k(o1Var, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar2 = (v) this.f120059s;
                    try {
                        ue.c.H(obj);
                        while (!atomicReference.compareAndSet(vVar2, null) && atomicReference.get() == vVar2) {
                        }
                        return obj;
                    } catch (Throwable th3) {
                        th = th3;
                        while (!atomicReference.compareAndSet(vVar2, null) && atomicReference.get() == vVar2) {
                        }
                        throw th;
                    }
                }
                vVar = (v) this.f120059s;
                ue.c.H(obj);
            }
            Function2 function2 = this.f120062v;
            Object obj2 = vVar.f120057b;
            this.f120059s = vVar;
            this.f120058r = 2;
            obj = function2.invoke(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
            vVar2 = vVar;
            while (!atomicReference.compareAndSet(vVar2, null)) {
            }
            return obj;
        } catch (Throwable th4) {
            th = th4;
            vVar2 = vVar;
            while (!atomicReference.compareAndSet(vVar2, null)) {
            }
            throw th;
        }
    }
}
