package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class f2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85338r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ long f85339s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g2 f85340t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(g2 g2Var, bl2.c cVar) {
        super(2, cVar);
        this.f85340t = g2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f2 f2Var = new f2(this.f85340t, cVar);
        f2Var.f85339s = ((a3.c) obj).f482a;
        return f2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j13 = ((a3.c) obj).f482a;
        f2 f2Var = new f2(this.f85340t, (bl2.c) obj2);
        f2Var.f85339s = j13;
        return f2Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85338r;
        if (i13 == 0) {
            ue.c.H(obj);
            long j13 = this.f85339s;
            o2 o2Var = this.f85340t.C;
            this.f85338r = 1;
            obj = androidx.compose.foundation.gestures.a.a(o2Var, j13, this);
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
