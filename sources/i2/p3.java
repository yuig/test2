package i2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f71235r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f71236s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f71237t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ do2.i f71238u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(CoroutineContext coroutineContext, do2.i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f71237t = coroutineContext;
        this.f71238u = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        p3 p3Var = new p3(this.f71237t, this.f71238u, cVar);
        p3Var.f71236s = obj;
        return p3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p3) create((b2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f71235r;
        if (i13 == 0) {
            ue.c.H(obj);
            b2 b2Var = (b2) this.f71236s;
            kotlin.coroutines.j jVar = kotlin.coroutines.j.f80412a;
            CoroutineContext coroutineContext = this.f71237t;
            boolean d2 = Intrinsics.d(coroutineContext, jVar);
            do2.i iVar = this.f71238u;
            if (d2) {
                n3 n3Var = new n3(b2Var, 0);
                this.f71235r = 1;
                if (iVar.collect(n3Var, this) == aVar) {
                    return aVar;
                }
            } else {
                o3 o3Var = new o3(iVar, b2Var, null);
                this.f71235r = 2;
                if (kotlin.jvm.internal.j.M(this, coroutineContext, o3Var) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i13 != 1 && i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
