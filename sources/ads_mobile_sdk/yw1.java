package ads_mobile_sdk;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes2.dex */
public final class yw1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zw1 f14439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw1(zw1 zw1Var, bl2.c cVar) {
        super(2, cVar);
        this.f14439b = zw1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new yw1(this.f14439b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new yw1(this.f14439b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f14438a;
        if (i13 == 0) {
            ue.c.H(obj);
            oh0 oh0Var = this.f14439b.f14968c;
            oh0Var.getClass();
            zn2.a aVar2 = zn2.b.f142311b;
            long b13 = oh0Var.b(dl2.b.P2(RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP, zn2.d.SECONDS), "gads:play_prewarm_manager_connection_duration");
            this.f14438a = 1;
            if (l0.T(b13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        zw1 zw1Var = this.f14439b;
        this.f14438a = 2;
        if (zw1.a(zw1Var, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
