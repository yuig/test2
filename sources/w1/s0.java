package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class s0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127490r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f127491s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y1 f127492t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b2.t0 f127493u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(y1 y1Var, b2.t0 t0Var, bl2.c cVar) {
        super(2, cVar);
        this.f127492t = y1Var;
        this.f127493u = t0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        s0 s0Var = new s0(this.f127492t, this.f127493u, cVar);
        s0Var.f127491s = obj;
        return s0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127490r;
        if (i13 == 0) {
            ue.c.H(obj);
            r0 r0Var = new r0((n3.w) this.f127491s, this.f127492t, this.f127493u, null);
            this.f127490r = 1;
            if (dl2.b.O(r0Var, this) == aVar) {
                return aVar;
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
