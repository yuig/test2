package ac2;

import kotlin.jvm.functions.Function0;
import lh0.a4;
import lh0.k4;
import lh0.z3;

/* loaded from: classes2.dex */
public final class k1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1987i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o1 f1988j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(o1 o1Var, int i13) {
        super(0);
        this.f1987i = i13;
        this.f1988j = o1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z13 = true;
        int i13 = this.f1987i;
        o1 o1Var = this.f1988j;
        switch (i13) {
            case 0:
                k4 k4Var = o1Var.f2002e;
                k4Var.getClass();
                z3 z3Var = a4.f83298b;
                lh0.g1 g1Var = (lh0.g1) k4Var.f83410a;
                if (!g1Var.o("android_remove_video_width_cap", "enabled", z3Var) && !g1Var.l("android_remove_video_width_cap")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                k4 k4Var2 = o1Var.f2002e;
                k4Var2.getClass();
                z3 z3Var2 = a4.f83297a;
                lh0.g1 g1Var2 = (lh0.g1) k4Var2.f83410a;
                if (!g1Var2.o("android_video_mp4_track_selector_unpin", "enabled", z3Var2) && !g1Var2.l("android_video_mp4_track_selector_unpin")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f1987i) {
        }
        return invoke();
    }
}
