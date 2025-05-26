package tx0;

import com.pinterest.feature.newshub.feed.view.NewsHubEmptyStateView;
import i32.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f119659r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f119660s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, bl2.c cVar) {
        super(2, cVar);
        this.f119660s = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k kVar = new k(this.f119660s, cVar);
        kVar.f119659r = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((c) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        c cVar = (c) this.f119659r;
        int i13 = o.O0;
        o oVar = this.f119660s;
        oVar.getClass();
        if (cVar.f119646a) {
            kh2.j.x2((a0) oVar.K0.getValue(), d.f119649a);
            ur0.g.g(y0.ANDROID_NOTIFICATIONS_TAKEOVER, oVar, null);
        }
        ((NewsHubEmptyStateView) oVar.L0.getValue()).T(cVar.f119647b.f119637a);
        return Unit.f80348a;
    }
}
