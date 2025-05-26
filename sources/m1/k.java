package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85405i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f85406j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f85407k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f85408l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f85409m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        super(1);
        this.f85405i = i13;
        this.f85406j = obj;
        this.f85407k = obj2;
        this.f85408l = obj3;
        this.f85409m = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f85405i;
        Object obj2 = this.f85409m;
        Object obj3 = this.f85408l;
        Object obj4 = this.f85406j;
        switch (i13) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                o oVar = (o) obj4;
                float f13 = oVar.f85480p ? 1.0f : -1.0f;
                o2 o2Var = oVar.f85479o;
                long d2 = o2Var.d(o2Var.g(f13 * floatValue));
                o2 o2Var2 = ((l2) obj2).f85439a;
                float f14 = o2Var.f(o2Var.d(o2.a(o2Var2, o2Var2.f85500h, d2, 1))) * f13;
                if (Math.abs(f14) < Math.abs(floatValue)) {
                    ((ao2.o1) obj3).cancel(kh2.u2.c("Scroll animation cancelled because scroll was not consumed (" + f14 + " < " + floatValue + ')', null));
                }
                break;
            default:
                j1.m mVar = (j1.m) obj;
                kotlin.jvm.internal.g0 g0Var = (kotlin.jvm.internal.g0) obj4;
                float floatValue2 = ((Number) mVar.f74148e.getValue()).floatValue() - g0Var.f80425a;
                float a13 = ((m1) this.f85407k).a(floatValue2);
                g0Var.f80425a = ((Number) mVar.f74148e.getValue()).floatValue();
                ((kotlin.jvm.internal.g0) obj3).f80425a = ((Number) mVar.f74144a.f74198b.invoke(mVar.f74149f)).floatValue();
                if (Math.abs(floatValue2 - a13) > 0.5f) {
                    mVar.a();
                }
                ((q) obj2).getClass();
                break;
        }
        return Unit.f80348a;
    }
}
