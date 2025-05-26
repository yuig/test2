package w21;

import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class m0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127749r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127750s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(i2.q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f127750s = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m0(this.f127750s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127749r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f127749r = 1;
            if (lb.l0.S(200L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        TreeMap treeMap = e1.f127681a;
        i2.q1 q1Var = this.f127750s;
        q1Var.setValue(z1.a((z1) q1Var.getValue(), null, e.Initial, 1));
        return Unit.f80348a;
    }
}
