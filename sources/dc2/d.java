package dc2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.k4;
import lh0.z3;
import m7.y;

/* loaded from: classes4.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54391i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f54392j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(0);
        this.f54391i = i13;
        this.f54392j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f54391i;
        e eVar = this.f54392j;
        switch (i13) {
            case 0:
                k4 k4Var = eVar.f54398f;
                k4Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) k4Var.f83410a;
                return Boolean.valueOf(g1Var.o("android_video_dynamic_scheduling", "enabled", z3Var) || g1Var.l("android_video_dynamic_scheduling"));
            default:
                k4 k4Var2 = eVar.f54398f;
                k4Var2.getClass();
                z3 z3Var2 = a4.f83298b;
                g1 g1Var2 = (g1) k4Var2.f83410a;
                return (g1Var2.o("android_video_preload_configuration", "enabled", z3Var2) || g1Var2.l("android_video_preload_configuration")) ? new y(1000000L) : y.f86484b;
        }
    }
}
