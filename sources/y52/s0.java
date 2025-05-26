package y52;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class s0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f137844r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ boolean f137845s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0 f137846t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(x0 x0Var, bl2.c cVar) {
        super(2, cVar);
        this.f137846t = x0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        s0 s0Var = new s0(this.f137846t, cVar);
        s0Var.f137845s = ((Boolean) obj).booleanValue();
        return s0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((s0) create(bool, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f137844r;
        if (i13 == 0) {
            ue.c.H(obj);
            if (this.f137845s) {
                this.f137844r = 1;
                if (x0.d8(this.f137846t, this) == aVar) {
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
