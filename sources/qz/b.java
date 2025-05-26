package qz;

import kotlin.jvm.functions.Function0;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105368i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n1 f105369j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(n1 n1Var, int i13) {
        super(0);
        this.f105368i = i13;
        this.f105369j = n1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z13 = true;
        int i13 = this.f105368i;
        n1 n1Var = this.f105369j;
        switch (i13) {
            case 0:
                n1Var.getClass();
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) n1Var.f83439a;
                if (!g1Var.o("android_cronet_link_header", "enabled", z3Var) && !g1Var.l("android_cronet_link_header")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 1:
                n1Var.getClass();
                z3 z3Var2 = a4.f83297a;
                g1 g1Var2 = (g1) n1Var.f83439a;
                if (!g1Var2.o("android_related_pins_video_link_header", "enabled", z3Var2) && !g1Var2.l("android_related_pins_video_link_header")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                n1Var.getClass();
                z3 z3Var3 = a4.f83297a;
                g1 g1Var3 = (g1) n1Var.f83439a;
                if (!g1Var3.o("android_link_header_visual_search", "enabled", z3Var3) && !g1Var3.l("android_link_header_visual_search")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f105368i) {
        }
        return invoke();
    }
}
