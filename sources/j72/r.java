package j72;

import ao2.j0;
import do2.b1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import w41.g0;

/* loaded from: classes4.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f74905r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f74906s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f74907t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(List list, s sVar, bl2.c cVar) {
        super(2, cVar);
        this.f74906s = list;
        this.f74907t = sVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r(this.f74906s, this.f74907t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74905r;
        if (i13 == 0) {
            ue.c.H(obj);
            g0 g0Var = new g0(new g0(new do2.l(this.f74906s, 0), 21), 20);
            o oVar = new o(this.f74907t, null);
            int i14 = b1.f55739a;
            eo2.j jVar = new eo2.j(new androidx.slidingpanelayout.widget.c(g0Var, oVar, 7));
            this.f74905r = 1;
            obj = kg.a.f0(jVar, new LinkedHashMap(), this);
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
