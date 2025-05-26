package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class b3 extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public int f85298s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f85299t;

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b3 b3Var = new b3(2, cVar);
        b3Var.f85299t = obj;
        return b3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b3) create((n3.l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85298s;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.l0 l0Var = (n3.l0) this.f85299t;
            this.f85298s = 1;
            v0 v0Var = n3.f85477a;
            obj = n3.e(l0Var, n3.k.Main, this);
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
