package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85317r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g2 f85318s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f85319t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(g2 g2Var, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f85318s = g2Var;
        this.f85319t = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d2(this.f85318s, this.f85319t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85317r;
        if (i13 == 0) {
            ue.c.H(obj);
            o2 o2Var = this.f85318s.C;
            k1.v1 v1Var = k1.v1.UserInput;
            c2 c2Var = new c2(this.f85319t, null);
            this.f85317r = 1;
            if (o2Var.e(v1Var, c2Var, this) == aVar) {
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
