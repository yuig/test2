package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f18693r;

    /* renamed from: s, reason: collision with root package name */
    public Function2 f18694s;

    /* renamed from: t, reason: collision with root package name */
    public int f18695t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ mo2.a f18696u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function2 f18697v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(mo2.a aVar, Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f18696u = aVar;
        this.f18697v = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u0(this.f18696u, this.f18697v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [mo2.a] */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Function2 function2;
        mo2.c cVar;
        mo2.a aVar;
        Throwable th3;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f18695t;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                mo2.a aVar3 = this.f18696u;
                this.f18693r = aVar3;
                function2 = this.f18697v;
                this.f18694s = function2;
                this.f18695t = 1;
                cVar = (mo2.c) aVar3;
                if (cVar.f(null, this) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.f18693r;
                    try {
                        ue.c.H(obj);
                        Unit unit = Unit.f80348a;
                        ((mo2.c) aVar).i(null);
                        return Unit.f80348a;
                    } catch (Throwable th4) {
                        th3 = th4;
                        ((mo2.c) aVar).i(null);
                        throw th3;
                    }
                }
                function2 = this.f18694s;
                ?? r33 = this.f18693r;
                ue.c.H(obj);
                cVar = r33;
            }
            t0 t0Var = new t0(function2, null);
            this.f18693r = cVar;
            this.f18694s = null;
            this.f18695t = 2;
            if (dl2.b.O(t0Var, this) == aVar2) {
                return aVar2;
            }
            aVar = cVar;
            Unit unit2 = Unit.f80348a;
            ((mo2.c) aVar).i(null);
            return Unit.f80348a;
        } catch (Throwable th5) {
            aVar = cVar;
            th3 = th5;
            ((mo2.c) aVar).i(null);
            throw th3;
        }
    }
}
