package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes2.dex */
public final class b0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f2607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2608c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, int i13, bl2.c cVar) {
        super(2, cVar);
        this.f2607b = c0Var;
        this.f2608c = i13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b0(this.f2607b, this.f2608c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b0(this.f2607b, this.f2608c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f2606a;
        if (i13 == 0) {
            ue.c.H(obj);
            oh0 oh0Var = this.f2607b.f3667b;
            oh0Var.getClass();
            zn2.a aVar2 = zn2.b.f142311b;
            long b13 = oh0Var.b(dl2.b.P2(60, zn2.d.SECONDS), "gads:ad_activity_delegate_map_retain_duration");
            this.f2606a = 1;
            if (l0.T(b13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f2607b.f3669d.remove(new Integer(this.f2608c));
        return Unit.f80348a;
    }
}
