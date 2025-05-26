package vc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;

/* loaded from: classes3.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f125583r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f125584s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f125585t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f125585t = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        x xVar = new x(this.f125585t, cVar);
        xVar.f125584s = obj;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f125583r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.j jVar = (do2.j) this.f125584s;
            Object obj2 = this.f125585t.f80434a;
            if (obj2 != null) {
                Intrinsics.f(obj2);
                this.f125583r = 1;
                if (jVar.emit(obj2, this) == aVar) {
                    return aVar;
                }
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
