package cp1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;

/* loaded from: classes2.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f52995i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f52996j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(p pVar, int i13) {
        super(0);
        this.f52995i = i13;
        this.f52996j = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f52995i;
        p pVar = this.f52996j;
        switch (i13) {
            case 0:
                return new d();
            case 1:
                return new l(pVar);
            case 2:
                return ((nx.m) pVar.getPinalyticsFactory()).a(pVar);
            default:
                n1 hairballExperiments = pVar.getHairballExperiments();
                hairballExperiments.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) hairballExperiments.f83439a;
                return Boolean.valueOf(g1Var.o("android_base_activity_background_analytics", "enabled", z3Var) || g1Var.l("android_base_activity_background_analytics"));
        }
    }
}
