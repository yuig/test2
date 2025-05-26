package eo2;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class f implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f59758a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59759b;

    /* renamed from: c, reason: collision with root package name */
    public final co2.a f59760c;

    public f(CoroutineContext coroutineContext, int i13, co2.a aVar) {
        this.f59758a = coroutineContext;
        this.f59759b = i13;
        this.f59760c = aVar;
    }

    @Override // eo2.g0
    public final do2.i a(CoroutineContext coroutineContext, int i13, co2.a aVar) {
        CoroutineContext coroutineContext2 = this.f59758a;
        CoroutineContext plus = coroutineContext.plus(coroutineContext2);
        co2.a aVar2 = co2.a.SUSPEND;
        co2.a aVar3 = this.f59760c;
        int i14 = this.f59759b;
        if (aVar == aVar2) {
            if (i14 != -3) {
                if (i13 != -3) {
                    if (i14 != -2) {
                        if (i13 != -2) {
                            i13 += i14;
                            if (i13 < 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i13 = i14;
            }
            aVar = aVar3;
        }
        return (Intrinsics.d(plus, coroutineContext2) && i13 == i14 && aVar == aVar3) ? this : e(plus, i13, aVar);
    }

    public String c() {
        return null;
    }

    @Override // do2.i
    public Object collect(do2.j jVar, bl2.c cVar) {
        Object O = dl2.b.O(new d(null, jVar, this), cVar);
        return O == cl2.a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }

    public abstract Object d(co2.z zVar, bl2.c cVar);

    public abstract f e(CoroutineContext coroutineContext, int i13, co2.a aVar);

    public do2.i f() {
        return null;
    }

    public co2.b0 g(ao2.j0 j0Var) {
        int i13 = this.f59759b;
        if (i13 == -3) {
            i13 = -2;
        }
        ao2.l0 l0Var = ao2.l0.ATOMIC;
        e eVar = new e(this, null);
        co2.y yVar = new co2.y(ao2.d0.c(j0Var, this.f59758a), lb.l0.b(i13, this.f59760c, 4));
        l0Var.invoke(eVar, yVar, yVar);
        return yVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c13 = c();
        if (c13 != null) {
            arrayList.add(c13);
        }
        kotlin.coroutines.j jVar = kotlin.coroutines.j.f80412a;
        CoroutineContext coroutineContext = this.f59758a;
        if (coroutineContext != jVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i13 = this.f59759b;
        if (i13 != -3) {
            arrayList.add("capacity=" + i13);
        }
        co2.a aVar = co2.a.SUSPEND;
        co2.a aVar2 = this.f59760c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getClass().getSimpleName());
        sb3.append('[');
        return ep.b.k(sb3, CollectionsKt.Z(arrayList, ", ", null, null, 0, null, null, 62), ']');
    }
}
