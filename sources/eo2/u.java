package eo2;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class u extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f59828r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ do2.i[] f59829s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f59830t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f59831u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ co2.q f59832v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(do2.i[] iVarArr, int i13, AtomicInteger atomicInteger, co2.q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f59829s = iVarArr;
        this.f59830t = i13;
        this.f59831u = atomicInteger;
        this.f59832v = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u(this.f59829s, this.f59830t, this.f59831u, this.f59832v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f59828r;
        AtomicInteger atomicInteger = this.f59831u;
        co2.q qVar = this.f59832v;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                do2.i[] iVarArr = this.f59829s;
                int i14 = this.f59830t;
                do2.i iVar = iVarArr[i14];
                t tVar = new t(qVar, i14);
                this.f59828r = 1;
                if (iVar.collect(tVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                qVar.r(null);
            }
            return Unit.f80348a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                qVar.r(null);
            }
        }
    }
}
