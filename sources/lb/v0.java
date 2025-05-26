package lb;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f82674r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a1 f82675s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(a1 a1Var, bl2.c cVar) {
        super(2, cVar);
        this.f82675s = a1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new v0(this.f82675s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f82674r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f82674r = 1;
            obj = a1.b(this.f82675s, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
