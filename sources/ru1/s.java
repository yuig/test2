package ru1;

import android.content.Context;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import df.j1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110080i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoFloatingBottomNavBar f110081j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(LegoFloatingBottomNavBar legoFloatingBottomNavBar, int i13) {
        super(0);
        this.f110080i = i13;
        this.f110081j = legoFloatingBottomNavBar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f110080i;
        LegoFloatingBottomNavBar legoFloatingBottomNavBar = this.f110081j;
        switch (i13) {
            case 0:
                b20.c cVar = legoFloatingBottomNavBar.F;
                if (cVar == null) {
                    Intrinsics.r("bottomNavBarDisplayStateProvider");
                    throw null;
                }
                boolean E1 = j1.E1();
                boolean z13 = legoFloatingBottomNavBar.f49966n;
                Context context = legoFloatingBottomNavBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return cVar.v(E1, z13, dl2.b.T1(context));
            case 1:
                return Integer.valueOf(j1.E1() ? bs1.c.W(legoFloatingBottomNavBar, eo1.c.space_0) : bs1.c.W(legoFloatingBottomNavBar, r0.lego_floating_nav_bottom_screen_offset));
            case 2:
                Context context2 = legoFloatingBottomNavBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return Boolean.valueOf(dl2.b.T1(context2));
            case 3:
                switch (i13) {
                    case 3:
                        return bs1.c.f0(legoFloatingBottomNavBar, cz1.b.background_lego_bottom_nav, null, null, 6);
                    default:
                        return bs1.c.f0(legoFloatingBottomNavBar, ks1.b.background_lego_bottom_nav_vr, null, null, 6);
                }
            default:
                switch (i13) {
                    case 3:
                        return bs1.c.f0(legoFloatingBottomNavBar, cz1.b.background_lego_bottom_nav, null, null, 6);
                    default:
                        return bs1.c.f0(legoFloatingBottomNavBar, ks1.b.background_lego_bottom_nav_vr, null, null, 6);
                }
        }
    }
}
