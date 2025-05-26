package a6;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f876r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f877s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f878t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f878t = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        s sVar = new s(this.f878t, cVar);
        sVar.f877s = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((p) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f876r;
        if (i13 == 0) {
            ue.c.H(obj);
            p pVar = (p) this.f877s;
            boolean z13 = pVar instanceof n;
            j0 j0Var = this.f878t;
            if (z13) {
                this.f876r = 1;
                if (j0.b(j0Var, (n) pVar, this) == aVar) {
                    return aVar;
                }
            } else if (pVar instanceof o) {
                this.f876r = 2;
                if (j0.c(j0Var, (o) pVar, this) == aVar) {
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
