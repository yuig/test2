package mq;

import com.pinterest.navigation.Navigation;
import ey.o4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87997i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f87998j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(u uVar, int i13) {
        super(0);
        this.f87997i = i13;
        this.f87998j = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z13 = true;
        int i13 = this.f87997i;
        u uVar = this.f87998j;
        switch (i13) {
            case 0:
                lh0.a0 g83 = uVar.g8();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) g83.f83294a;
                if (!g1Var.o("android_pin_swipe_fragment_prefactor", "enabled", z3Var) && !g1Var.l("android_pin_swipe_fragment_prefactor")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                lh0.a0 g84 = uVar.g8();
                z3 z3Var2 = a4.f83298b;
                g1 g1Var2 = (g1) g84.f83294a;
                if (!g1Var2.o("android_sba_pin_swipe_fragment_logging", "enabled", z3Var2) && !g1Var2.l("android_sba_pin_swipe_fragment_logging")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f87997i) {
            case 0:
                return invoke();
            case 1:
                return invoke();
            default:
                Navigation navigation = this.f87998j.I;
                if (navigation != null) {
                    String f49940b = navigation.getF49940b();
                    Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
                    new jy.j(f49940b).i();
                    String f49940b2 = navigation.getF49940b();
                    Intrinsics.checkNotNullExpressionValue(f49940b2, "getId(...)");
                    new jy.u(f49940b2).i();
                    String f49940b3 = navigation.getF49940b();
                    Intrinsics.checkNotNullExpressionValue(f49940b3, "getId(...)");
                    new jy.u(f49940b3).i();
                    String f49940b4 = navigation.getF49940b();
                    Intrinsics.checkNotNullExpressionValue(f49940b4, "getId(...)");
                    new o4(f49940b4).i();
                }
                return Unit.f80348a;
        }
    }
}
