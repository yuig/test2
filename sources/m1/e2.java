package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class e2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85328r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g2 f85329s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f85330t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f85331u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(g2 g2Var, float f13, float f14, bl2.c cVar) {
        super(2, cVar);
        this.f85329s = g2Var;
        this.f85330t = f13;
        this.f85331u = f14;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e2(this.f85329s, this.f85330t, this.f85331u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85328r;
        if (i13 == 0) {
            ue.c.H(obj);
            o2 o2Var = this.f85329s.C;
            long d2 = com.bumptech.glide.c.d(this.f85330t, this.f85331u);
            this.f85328r = 1;
            if (androidx.compose.foundation.gestures.a.a(o2Var, d2, this) == aVar) {
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
