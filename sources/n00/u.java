package n00;

import kotlin.jvm.functions.Function0;
import lh0.a4;
import lh0.g1;
import lh0.g2;
import lh0.z3;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final u f88791j = new u(0);

    /* renamed from: k, reason: collision with root package name */
    public static final u f88792k = new u(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88793i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13) {
        super(0);
        this.f88793i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f88793i) {
            case 0:
                return g2.f83370b.d();
            default:
                g2 d2 = g2.f83370b.d();
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) d2.f83373a;
                return Boolean.valueOf(g1Var.o("android_premiere_video_quality", "enabled", z3Var) || g1Var.l("android_premiere_video_quality"));
        }
    }
}
